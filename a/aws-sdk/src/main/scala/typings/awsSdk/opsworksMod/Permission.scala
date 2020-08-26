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
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
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
    def setAllowSsh(value: Boolean): Self = this.set("AllowSsh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSsh: Self = this.set("AllowSsh", js.undefined)
    @scala.inline
    def setAllowSudo(value: Boolean): Self = this.set("AllowSudo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSudo: Self = this.set("AllowSudo", js.undefined)
    @scala.inline
    def setIamUserArn(value: String): Self = this.set("IamUserArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamUserArn: Self = this.set("IamUserArn", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("Level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("Level", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

