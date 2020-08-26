package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfileSummary extends js.Object {
  /**
    * The display name of a user in AWS CodeStar. For example, this could be set to both first and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that appears after the space will be used as the second character in the user initial icon. The initial icon displays a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.native
  /**
    * The email address associated with the user.
    */
  var emailAddress: js.UndefOr[Email] = js.native
  /**
    * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: js.UndefOr[UserArn] = js.native
}

object UserProfileSummary {
  @scala.inline
  def apply(): UserProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfileSummary]
  }
  @scala.inline
  implicit class UserProfileSummaryOps[Self <: UserProfileSummary] (val x: Self) extends AnyVal {
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
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmailAddress(value: Email): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setSshPublicKey(value: SshPublicKey): Self = this.set("sshPublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshPublicKey: Self = this.set("sshPublicKey", js.undefined)
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserArn: Self = this.set("userArn", js.undefined)
  }
  
}

