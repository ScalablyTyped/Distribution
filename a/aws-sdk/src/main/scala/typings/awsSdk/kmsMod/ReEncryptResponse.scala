package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReEncryptResponse extends js.Object {
  /**
    * The reencrypted data. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var CiphertextBlob: js.UndefOr[CiphertextType] = js.native
  /**
    * The encryption algorithm that was used to reencrypt the data.
    */
  var DestinationEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  /**
    * The Amazon Resource Name (key ARN) of the CMK that was used to reencrypt the data.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The encryption algorithm that was used to decrypt the ciphertext before it was reencrypted.
    */
  var SourceEncryptionAlgorithm: js.UndefOr[EncryptionAlgorithmSpec] = js.native
  /**
    * Unique identifier of the CMK used to originally encrypt the data.
    */
  var SourceKeyId: js.UndefOr[KeyIdType] = js.native
}

object ReEncryptResponse {
  @scala.inline
  def apply(
    CiphertextBlob: CiphertextType = null,
    DestinationEncryptionAlgorithm: EncryptionAlgorithmSpec = null,
    KeyId: KeyIdType = null,
    SourceEncryptionAlgorithm: EncryptionAlgorithmSpec = null,
    SourceKeyId: KeyIdType = null
  ): ReEncryptResponse = {
    val __obj = js.Dynamic.literal()
    if (CiphertextBlob != null) __obj.updateDynamic("CiphertextBlob")(CiphertextBlob.asInstanceOf[js.Any])
    if (DestinationEncryptionAlgorithm != null) __obj.updateDynamic("DestinationEncryptionAlgorithm")(DestinationEncryptionAlgorithm.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (SourceEncryptionAlgorithm != null) __obj.updateDynamic("SourceEncryptionAlgorithm")(SourceEncryptionAlgorithm.asInstanceOf[js.Any])
    if (SourceKeyId != null) __obj.updateDynamic("SourceKeyId")(SourceKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReEncryptResponse]
  }
}

