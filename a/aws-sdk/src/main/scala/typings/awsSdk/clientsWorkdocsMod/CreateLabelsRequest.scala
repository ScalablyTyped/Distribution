package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * List of labels to add to the resource.
    */
  var Labels: SharedLabels
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}
object CreateLabelsRequest {
  
  inline def apply(Labels: SharedLabels, ResourceId: ResourceIdType): CreateLabelsRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelsRequest]
  }
  
  extension [Self <: CreateLabelsRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setLabels(value: SharedLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: SharedLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
