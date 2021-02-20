package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLabelsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * Flag to request removal of all labels from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.native
  
  /**
    * List of labels to delete from the resource.
    */
  var Labels: js.UndefOr[SharedLabels] = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}
object DeleteLabelsRequest {
  
  @scala.inline
  def apply(ResourceId: ResourceIdType): DeleteLabelsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLabelsRequest]
  }
  
  @scala.inline
  implicit class DeleteLabelsRequestMutableBuilder[Self <: DeleteLabelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setDeleteAll(value: BooleanType): Self = StObject.set(x, "DeleteAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAllUndefined: Self = StObject.set(x, "DeleteAll", js.undefined)
    
    @scala.inline
    def setLabels(value: SharedLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SharedLabel*): Self = StObject.set(x, "Labels", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
