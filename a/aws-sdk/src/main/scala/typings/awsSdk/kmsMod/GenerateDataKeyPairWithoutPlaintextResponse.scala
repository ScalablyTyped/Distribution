package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateDataKeyPairWithoutPlaintextResponse extends js.Object {
  /**
    * The Amazon Resource Name (key ARN) of the CMK that encrypted the private key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The type of data key pair that was generated.
    */
  var KeyPairSpec: js.UndefOr[DataKeyPairSpec] = js.native
  /**
    * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyCiphertextBlob: js.UndefOr[CiphertextType] = js.native
  /**
    * The public key (in plaintext).
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
}

object GenerateDataKeyPairWithoutPlaintextResponse {
  @scala.inline
  def apply(
    KeyId: KeyIdType = null,
    KeyPairSpec: DataKeyPairSpec = null,
    PrivateKeyCiphertextBlob: CiphertextType = null,
    PublicKey: PublicKeyType = null
  ): GenerateDataKeyPairWithoutPlaintextResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (KeyPairSpec != null) __obj.updateDynamic("KeyPairSpec")(KeyPairSpec.asInstanceOf[js.Any])
    if (PrivateKeyCiphertextBlob != null) __obj.updateDynamic("PrivateKeyCiphertextBlob")(PrivateKeyCiphertextBlob.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataKeyPairWithoutPlaintextResponse]
  }
}

