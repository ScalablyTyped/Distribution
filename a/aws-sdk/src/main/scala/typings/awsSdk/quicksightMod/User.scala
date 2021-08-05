package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active Directory user, that user is inactive until they sign in and provide a password.
    */
  var Active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the user.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The custom permissions profile associated with this user.
    */
  var CustomPermissionsName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * The user's email address.
    */
  var Email: js.UndefOr[String] = js.undefined
  
  /**
    * The type of identity authentication used by the user.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.quicksightMod.IdentityType] = js.undefined
  
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon QuickSight role for the user. The user role can be one of the following:.    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, datasets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.    RESTRICTED_READER: This role isn't currently available for use.    RESTRICTED_AUTHOR: This role isn't currently available for use.  
    */
  var Role: js.UndefOr[UserRole] = js.undefined
  
  /**
    * The user's user name.
    */
  var UserName: js.UndefOr[UserName_] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCustomPermissionsName(value: RoleName): Self = StObject.set(x, "CustomPermissionsName", value.asInstanceOf[js.Any])
    
    inline def setCustomPermissionsNameUndefined: Self = StObject.set(x, "CustomPermissionsName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setRole(value: UserRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setUserName(value: UserName_): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
