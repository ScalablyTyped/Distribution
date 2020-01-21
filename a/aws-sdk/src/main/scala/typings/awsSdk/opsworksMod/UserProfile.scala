package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfile extends js.Object {
  /**
    * Whether users can specify their own SSH public key through the My Settings page. For more information, see Managing User Permissions.
    */
  var AllowSelfManagement: js.UndefOr[Boolean] = js.native
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.native
  /**
    * The user's name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.native
  /**
    * The user's SSH user name.
    */
  var SshUsername: js.UndefOr[String] = js.native
}

object UserProfile {
  @scala.inline
  def apply(
    AllowSelfManagement: js.UndefOr[scala.Boolean] = js.undefined,
    IamUserArn: String = null,
    Name: String = null,
    SshPublicKey: String = null,
    SshUsername: String = null
  ): UserProfile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowSelfManagement)) __obj.updateDynamic("AllowSelfManagement")(AllowSelfManagement.asInstanceOf[js.Any])
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SshPublicKey != null) __obj.updateDynamic("SshPublicKey")(SshPublicKey.asInstanceOf[js.Any])
    if (SshUsername != null) __obj.updateDynamic("SshUsername")(SshUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProfile]
  }
}

