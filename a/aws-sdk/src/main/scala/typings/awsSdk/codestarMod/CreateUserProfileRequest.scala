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
  def apply(
    displayName: UserProfileDisplayName,
    emailAddress: Email,
    userArn: UserArn,
    sshPublicKey: SshPublicKey = null
  ): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
}

