package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryption extends js.Object {
  /**
    * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is disabled for the bucket or object, this value is NONE.
    */
  var encryptionType: js.UndefOr[EncryptionType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) master key that's used to encrypt the bucket or object. This value is null if KMS isn't used to encrypt the bucket or object.
    */
  var kmsMasterKeyId: js.UndefOr[string] = js.native
}

object ServerSideEncryption {
  @scala.inline
  def apply(encryptionType: EncryptionType = null, kmsMasterKeyId: string = null): ServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    if (encryptionType != null) __obj.updateDynamic("encryptionType")(encryptionType.asInstanceOf[js.Any])
    if (kmsMasterKeyId != null) __obj.updateDynamic("kmsMasterKeyId")(kmsMasterKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryption]
  }
}

