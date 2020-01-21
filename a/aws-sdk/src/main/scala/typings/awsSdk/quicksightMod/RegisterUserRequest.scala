package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterUserRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
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
    UserRole: UserRole,
    IamArn: String = null,
    SessionName: RoleSessionName = null,
    UserName: UserName_ = null
  ): RegisterUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], IdentityType = IdentityType.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], UserRole = UserRole.asInstanceOf[js.Any])
    if (IamArn != null) __obj.updateDynamic("IamArn")(IamArn.asInstanceOf[js.Any])
    if (SessionName != null) __obj.updateDynamic("SessionName")(SessionName.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterUserRequest]
  }
}

