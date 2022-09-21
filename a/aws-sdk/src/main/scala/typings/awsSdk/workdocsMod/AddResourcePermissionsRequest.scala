package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddResourcePermissionsRequest extends StObject {
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The notification options.
    */
  var NotificationOptions: js.UndefOr[typings.awsSdk.workdocsMod.NotificationOptions] = js.undefined
  
  /**
    * The users, groups, or organization being granted permission.
    */
  var Principals: SharePrincipalList
  
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}
object AddResourcePermissionsRequest {
  
  inline def apply(Principals: SharePrincipalList, ResourceId: ResourceIdType): AddResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(Principals = Principals.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddResourcePermissionsRequest]
  }
  
  extension [Self <: AddResourcePermissionsRequest](x: Self) {
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setNotificationOptions(value: NotificationOptions): Self = StObject.set(x, "NotificationOptions", value.asInstanceOf[js.Any])
    
    inline def setNotificationOptionsUndefined: Self = StObject.set(x, "NotificationOptions", js.undefined)
    
    inline def setPrincipals(value: SharePrincipalList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsVarargs(value: SharePrincipal*): Self = StObject.set(x, "Principals", js.Array(value*))
    
    inline def setResourceId(value: ResourceIdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
