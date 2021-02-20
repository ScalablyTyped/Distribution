package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveResourcePermissionRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The principal ID of the resource.
    */
  var PrincipalId: IdType = js.native
  
  /**
    * The principal type of the resource.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.workdocsMod.PrincipalType] = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}
object RemoveResourcePermissionRequest {
  
  @scala.inline
  def apply(PrincipalId: IdType, ResourceId: ResourceIdType): RemoveResourcePermissionRequest = {
    val __obj = js.Dynamic.literal(PrincipalId = PrincipalId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResourcePermissionRequest]
  }
  
  @scala.inline
  implicit class RemoveResourcePermissionRequestMutableBuilder[Self <: RemoveResourcePermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: IdType): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
