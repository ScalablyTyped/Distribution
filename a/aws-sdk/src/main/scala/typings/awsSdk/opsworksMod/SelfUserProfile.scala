package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfUserProfile extends js.Object {
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

object SelfUserProfile {
  @scala.inline
  def apply(): SelfUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfUserProfile]
  }
  @scala.inline
  implicit class SelfUserProfileOps[Self <: SelfUserProfile] (val x: Self) extends AnyVal {
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
    def setIamUserArn(value: String): Self = this.set("IamUserArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamUserArn: Self = this.set("IamUserArn", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSshPublicKey(value: String): Self = this.set("SshPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshPublicKey: Self = this.set("SshPublicKey", js.undefined)
    @scala.inline
    def setSshUsername(value: String): Self = this.set("SshUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshUsername: Self = this.set("SshUsername", js.undefined)
  }
  
}

