package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAllResourcePermissionsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}
object RemoveAllResourcePermissionsRequest {
  
  @scala.inline
  def apply(ResourceId: ResourceIdType): RemoveAllResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAllResourcePermissionsRequest]
  }
  
  @scala.inline
  implicit class RemoveAllResourcePermissionsRequestMutableBuilder[Self <: RemoveAllResourcePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
