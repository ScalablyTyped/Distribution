package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterUserRequest extends js.Object {
  
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * (Enterprise edition only) The name of the custom permissions profile that you want to assign to this user. Customized permissions allows you to control a user's access by restricting access the following operations:   Create and update data sources   Create and update datasets   Create and update email reports   Subscribe to email reports   To add custom permissions to an existing user, use  UpdateUser  instead. A set of custom permissions includes any combination of these restrictions. Currently, you need to create the profile names for custom permission sets by using the QuickSight console. Then, you use the RegisterUser API operation to assign the named set of permissions to a QuickSight user.  QuickSight custom permissions are applied through IAM policies. Therefore, they override the permissions typically granted by assigning QuickSight users to one of the default security cohorts in QuickSight (admin, author, reader). This feature is available only to QuickSight Enterprise edition subscriptions that use SAML 2.0-Based Federation for Single Sign-On (SSO).
    */
  var CustomPermissionsName: js.UndefOr[RoleName] = js.native
  
  /**
    * The email address of the user that you want to register.
    */
  var Email: String = js.native
  
  /**
    * The ARN of the IAM user or role that you are registering with Amazon QuickSight. 
    */
  var IamArn: js.UndefOr[String] = js.native
  
  /**
    * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts two values:    IAM: A user whose identity maps to an existing IAM user or role.     QUICKSIGHT: A user whose identity is owned and managed internally by Amazon QuickSight.   
    */
  var IdentityType: typings.awsSdk.quicksightMod.IdentityType = js.native
  
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
  
  /**
    * You need to use this parameter only when you register one or more users using an assumed IAM role. You don't need to provide the session name for other scenarios, for example when you are registering an IAM user or an Amazon QuickSight user. You can register multiple users using the same IAM role if each user has a different session name. For more information on assuming IAM roles, see  assume-role  in the AWS CLI Reference. 
    */
  var SessionName: js.UndefOr[RoleSessionName] = js.native
  
  /**
    * The Amazon QuickSight user name that you want to create for the user you are registering.
    */
  var UserName: js.UndefOr[UserName_] = js.native
  
  /**
    * The Amazon QuickSight role for the user. The user role can be one of the following:    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, datasets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.    RESTRICTED_READER: This role isn't currently available for use.    RESTRICTED_AUTHOR: This role isn't currently available for use.  
    */
  var UserRole: typings.awsSdk.quicksightMod.UserRole = js.native
}
object RegisterUserRequest {
  
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Email: String,
    IdentityType: IdentityType,
    Namespace: Namespace,
    UserRole: UserRole
  ): RegisterUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], IdentityType = IdentityType.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], UserRole = UserRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUserRequest]
  }
  
  @scala.inline
  implicit class RegisterUserRequestOps[Self <: RegisterUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityType(value: IdentityType): Self = this.set("IdentityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRole(value: UserRole): Self = this.set("UserRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPermissionsName(value: RoleName): Self = this.set("CustomPermissionsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomPermissionsName: Self = this.set("CustomPermissionsName", js.undefined)
    
    @scala.inline
    def setIamArn(value: String): Self = this.set("IamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamArn: Self = this.set("IamArn", js.undefined)
    
    @scala.inline
    def setSessionName(value: RoleSessionName): Self = this.set("SessionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionName: Self = this.set("SessionName", js.undefined)
    
    @scala.inline
    def setUserName(value: UserName_): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
}
