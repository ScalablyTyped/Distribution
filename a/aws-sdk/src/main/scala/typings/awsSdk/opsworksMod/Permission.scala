package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /**
    * Whether the user can use SSH.
    */
  var AllowSsh: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user can use sudo.
    */
  var AllowSudo: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information about IAM ARNs, see Using Identifiers.
    */
  var IamUserArn: js.UndefOr[String] = js.native
  /**
    * The user's permission level, which must be the following:    deny     show     deploy     manage     iam_only    For more information on the permissions associated with these levels, see Managing User Permissions 
    */
  var Level: js.UndefOr[String] = js.native
  /**
    * A stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object Permission {
  @scala.inline
  def apply(
    AllowSsh: js.UndefOr[Boolean] = js.undefined,
    AllowSudo: js.UndefOr[Boolean] = js.undefined,
    IamUserArn: String = null,
    Level: String = null,
    StackId: String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowSsh)) __obj.updateDynamic("AllowSsh")(AllowSsh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowSudo)) __obj.updateDynamic("AllowSudo")(AllowSudo.get.asInstanceOf[js.Any])
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn.asInstanceOf[js.Any])
    if (Level != null) __obj.updateDynamic("Level")(Level.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

