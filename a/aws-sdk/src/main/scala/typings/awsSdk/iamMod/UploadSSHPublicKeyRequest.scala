package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSSHPublicKeyRequest extends js.Object {
  /**
    * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format. The minimum bit-length of the public key is 2048 bits. For example, you can generate a 2048-bit key, and the resulting PEM file is 1679 bytes long. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var SSHPublicKeyBody: publicKeyMaterialType = js.native
  /**
    * The name of the IAM user to associate the SSH public key with. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}

object UploadSSHPublicKeyRequest {
  @scala.inline
  def apply(SSHPublicKeyBody: publicKeyMaterialType, UserName: userNameType): UploadSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(SSHPublicKeyBody = SSHPublicKeyBody.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSSHPublicKeyRequest]
  }
}

