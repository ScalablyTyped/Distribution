package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterUserRequest extends StObject {
  
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user. Customized permissions allows you to control a user's access by restricting access the following operations:   Create and update data sources   Create and update datasets   Create and update email reports   Subscribe to email reports   To add custom permissions to an existing user, use  UpdateUser  instead. A set of custom permissions includes any combination of these restrictions. Currently, you need to create the profile names for custom permission sets by using the QuickSight console. Then, you use the RegisterUser API operation to assign the named set of permissions to a QuickSight user.  QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight (admin, author, reader). This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based Federation for Single Sign-On (SSO).
    */
  var CustomPermissionsName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * The email address of the user that you want to register.
    */
  var Email: String
  
  /**
    * The ARN of the IAM user or role that you are registering with Amazon QuickSight. 
    */
  var IamArn: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two values:    IAM: A user whose identity maps to an existing IAM user or role.     QUICKSIGHT: A user whose identity is owned and managed internally by Amazon QuickSight.   
    */
  var IdentityType: typings.awsSdk.quicksightMod.IdentityType
  
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace
  
  /**
    * You need to use this parameter only when you register one or more users using an assumed IAM role. You don't need to provide the session name for other scenarios, for example when you are registering an IAM user or an Amazon QuickSight user. You can register multiple users using the same IAM role if each user has a different session name. For more information on assuming IAM roles, see  assume-role  in the AWS CLI Reference. 
    */
  var SessionName: js.UndefOr[RoleSessionName] = js.undefined
  
  /**
    * The Amazon QuickSight user name that you want to create for the user you are registering.
    */
  var UserName: js.UndefOr[UserName_] = js.undefined
  
  /**
    * The Amazon QuickSight role for the user. The user role can be one of the following:    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, datasets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.    RESTRICTED_READER: This role isn't currently available for use.    RESTRICTED_AUTHOR: This role isn't currently available for use.  
    */
  var UserRole: typings.awsSdk.quicksightMod.UserRole
}
object RegisterUserRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    Email: String,
    IdentityType: IdentityType,
    Namespace: Namespace,
    UserRole: UserRole
  ): RegisterUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], IdentityType = IdentityType.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], UserRole = UserRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUserRequest]
  }
  
  extension [Self <: RegisterUserRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setCustomPermissionsName(value: RoleName): Self = StObject.set(x, "CustomPermissionsName", value.asInstanceOf[js.Any])
    
    inline def setCustomPermissionsNameUndefined: Self = StObject.set(x, "CustomPermissionsName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setIamArn(value: String): Self = StObject.set(x, "IamArn", value.asInstanceOf[js.Any])
    
    inline def setIamArnUndefined: Self = StObject.set(x, "IamArn", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setSessionName(value: RoleSessionName): Self = StObject.set(x, "SessionName", value.asInstanceOf[js.Any])
    
    inline def setSessionNameUndefined: Self = StObject.set(x, "SessionName", js.undefined)
    
    inline def setUserName(value: UserName_): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setUserRole(value: UserRole): Self = StObject.set(x, "UserRole", value.asInstanceOf[js.Any])
  }
}
