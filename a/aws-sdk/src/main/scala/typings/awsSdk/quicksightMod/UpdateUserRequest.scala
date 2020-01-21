package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The email address of the user that you want to update.
    */
  var Email: String = js.native
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The Amazon QuickSight role of the user. The user role can be one of the following:    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, datasets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.  
    */
  var Role: UserRole = js.native
  /**
    * The Amazon QuickSight user name that you want to update.
    */
  var UserName: UserName_ = js.native
}

object UpdateUserRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Email: String,
    Namespace: Namespace,
    Role: UserRole,
    UserName: UserName_
  ): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateUserRequest]
  }
}

