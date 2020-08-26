package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfileResult extends js.Object {
  /**
    * The date and time when the user profile was created in AWS CodeStar, in timestamp format.
    */
  var createdTimestamp: CreatedTimestamp = js.native
  /**
    * The display name shown for the user in AWS CodeStar projects. For example, this could be set to both first and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that appears after the space will be used as the second character in the user initial icon. The initial icon displays a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.native
  /**
    * The email address for the user. Optional.
    */
  var emailAddress: js.UndefOr[Email] = js.native
  /**
    * The date and time when the user profile was last modified, in timestamp format.
    */
  var lastModifiedTimestamp: LastModifiedTimestamp = js.native
  /**
    * The SSH public key associated with the user. This SSH public key is associated with the user profile, and can be used in conjunction with the associated private key for access to project resources, such as Amazon EC2 instances, if a project owner grants remote access to those resources.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: UserArn = js.native
}

object DescribeUserProfileResult {
  @scala.inline
  def apply(createdTimestamp: CreatedTimestamp, lastModifiedTimestamp: LastModifiedTimestamp, userArn: UserArn): DescribeUserProfileResult = {
    val __obj = js.Dynamic.literal(createdTimestamp = createdTimestamp.asInstanceOf[js.Any], lastModifiedTimestamp = lastModifiedTimestamp.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfileResult]
  }
  @scala.inline
  implicit class DescribeUserProfileResultOps[Self <: DescribeUserProfileResult] (val x: Self) extends AnyVal {
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
    def setCreatedTimestamp(value: CreatedTimestamp): Self = this.set("createdTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTimestamp(value: LastModifiedTimestamp): Self = this.set("lastModifiedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserArn(value: UserArn): Self = this.set("userArn", value.asInstanceOf[js.Any])
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
  }
  
}

