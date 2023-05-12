package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLabelsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * Flag to request removal of all labels from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * List of labels to delete from the resource.
    */
  var Labels: js.UndefOr[SharedLabels] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}
object DeleteLabelsRequest {
  
  inline def apply(ResourceId: ResourceIdType): DeleteLabelsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLabelsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLabelsRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setDeleteAll(value: BooleanType): Self = StObject.set(x, "DeleteAll", value.asInstanceOf[js.Any])
    
    inline def setDeleteAllUndefined: Self = StObject.set(x, "DeleteAll", js.undefined)
    
    inline def setLabels(value: SharedLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: SharedLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
