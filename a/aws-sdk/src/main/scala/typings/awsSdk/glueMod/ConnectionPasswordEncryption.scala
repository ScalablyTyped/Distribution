package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPasswordEncryption extends js.Object {
  /**
    * An AWS KMS key that is used to encrypt the connection password.  If connection password protection is enabled, the caller of CreateConnection and UpdateConnection needs at least kms:Encrypt permission on the specified AWS KMS key, to encrypt passwords before storing them in the Data Catalog.  You can set the decrypt permission to enable or restrict access on the password key according to your security requirements.
    */
  var AwsKmsKeyId: js.UndefOr[NameString] = js.native
  /**
    * When the ReturnConnectionPasswordEncrypted flag is set to "true", passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently from catalog encryption. 
    */
  var ReturnConnectionPasswordEncrypted: Boolean = js.native
}

object ConnectionPasswordEncryption {
  @scala.inline
  def apply(ReturnConnectionPasswordEncrypted: Boolean, AwsKmsKeyId: NameString = null): ConnectionPasswordEncryption = {
    val __obj = js.Dynamic.literal(ReturnConnectionPasswordEncrypted = ReturnConnectionPasswordEncrypted.asInstanceOf[js.Any])
    if (AwsKmsKeyId != null) __obj.updateDynamic("AwsKmsKeyId")(AwsKmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPasswordEncryption]
  }
}

