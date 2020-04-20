package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSSHPublicKeyRequest extends js.Object {
  /**
    * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use SSH. To retrieve the public key in PEM format, use PEM.
    */
  var Encoding: encodingType = js.native
  /**
    * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var SSHPublicKeyId: publicKeyIdType = js.native
  /**
    * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType = js.native
}

object GetSSHPublicKeyRequest {
  @scala.inline
  def apply(Encoding: encodingType, SSHPublicKeyId: publicKeyIdType, UserName: userNameType): GetSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(Encoding = Encoding.asInstanceOf[js.Any], SSHPublicKeyId = SSHPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSSHPublicKeyRequest]
  }
}

