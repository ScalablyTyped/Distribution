package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetPermissionRequest extends js.Object {
  /**
    * The user is allowed to use SSH to communicate with the instance.
    */
  var AllowSsh: js.UndefOr[Boolean] = js.native
  /**
    * The user is allowed to use sudo to elevate privileges.
    */
  var AllowSudo: js.UndefOr[Boolean] = js.native
  /**
    * The user's IAM ARN. This can also be a federated user's ARN.
    */
  var IamUserArn: String = js.native
  /**
    * The user's permission level, which must be set to one of the following strings. You cannot set your own permissions level.    deny     show     deploy     manage     iam_only    For more information about the permissions associated with these levels, see Managing User Permissions.
    */
  var Level: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object SetPermissionRequest {
  @scala.inline
  def apply(
    IamUserArn: String,
    StackId: String,
    AllowSsh: js.UndefOr[Boolean] = js.undefined,
    AllowSudo: js.UndefOr[Boolean] = js.undefined,
    Level: String = null
  ): SetPermissionRequest = {
    val __obj = js.Dynamic.literal(IamUserArn = IamUserArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowSsh)) __obj.updateDynamic("AllowSsh")(AllowSsh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowSudo)) __obj.updateDynamic("AllowSudo")(AllowSudo.get.asInstanceOf[js.Any])
    if (Level != null) __obj.updateDynamic("Level")(Level.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPermissionRequest]
  }
}

