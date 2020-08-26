package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserProfileRequest extends js.Object {
  /**
    * The name that will be displayed as the friendly name for the user in AWS CodeStar. 
    */
  var displayName: UserProfileDisplayName = js.native
  /**
    * The email address that will be displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: Email = js.native
  /**
    * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: UserArn = js.native
}

object CreateUserProfileRequest {
  @scala.inline
  def apply(displayName: UserProfileDisplayName, emailAddress: Email, userArn: UserArn): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
  @scala.inline
  implicit class CreateUserProfileRequestOps[Self <: CreateUserProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: UserProfileDisplayName): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailAddress(value: Email): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSshPublicKey(value: SshPublicKey): Self = this.set("sshPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshPublicKey: Self = this.set("sshPublicKey", js.undefined)
  }
  
}

