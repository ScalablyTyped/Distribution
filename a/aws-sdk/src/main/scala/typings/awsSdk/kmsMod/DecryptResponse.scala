package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecryptResponse extends js.Object {
  /**
    * The encryption algorithm that was used to decrypt the ciphertext.
    */
  var EncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  /**
    * The ARN of the customer master key that was used to perform the decryption.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.native
}

object DecryptResponse {
  @scala.inline
  def apply(
    EncryptionAlgorithm: EncryptionAlgorithmSpec = null,
    KeyId: KeyIdType = null,
    Plaintext: PlaintextType = null
  ): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    if (EncryptionAlgorithm != null) __obj.updateDynamic("EncryptionAlgorithm")(EncryptionAlgorithm.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (Plaintext != null) __obj.updateDynamic("Plaintext")(Plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResponse]
  }
}

