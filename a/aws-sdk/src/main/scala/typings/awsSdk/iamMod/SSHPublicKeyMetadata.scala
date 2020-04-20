package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSHPublicKeyMetadata extends js.Object {
  /**
    * The unique identifier for the SSH public key.
    */
  var SSHPublicKeyId: publicKeyIdType = js.native
  /**
    * The status of the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the SSH public key was uploaded.
    */
  var UploadDate: dateType = js.native
  /**
    * The name of the IAM user associated with the SSH public key.
    */
  var UserName: userNameType = js.native
}

object SSHPublicKeyMetadata {
  @scala.inline
  def apply(SSHPublicKeyId: publicKeyIdType, Status: statusType, UploadDate: dateType, UserName: userNameType): SSHPublicKeyMetadata = {
    val __obj = js.Dynamic.literal(SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UploadDate = UploadDate.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSHPublicKeyMetadata]
  }
}

