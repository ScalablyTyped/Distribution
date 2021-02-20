package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddResourcePermissionsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The notification options.
    */
  var NotificationOptions: js.UndefOr[typings.awsSdk.workdocsMod.NotificationOptions] = js.native
  
  /**
    * The users, groups, or organization being granted permission.
    */
  var Principals: SharePrincipalList = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
}
object AddResourcePermissionsRequest {
  
  @scala.inline
  def apply(Principals: SharePrincipalList, ResourceId: ResourceIdType): AddResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(Principals = Principals.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResourcePermissionsRequest]
  }
  
  @scala.inline
  implicit class AddResourcePermissionsRequestMutableBuilder[Self <: AddResourcePermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setNotificationOptions(value: NotificationOptions): Self = StObject.set(x, "NotificationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationOptionsUndefined: Self = StObject.set(x, "NotificationOptions", js.undefined)
    
    @scala.inline
    def setPrincipals(value: SharePrincipalList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsVarargs(value: SharePrincipal*): Self = StObject.set(x, "Principals", js.Array(value :_*))
    
    @scala.inline
    def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
