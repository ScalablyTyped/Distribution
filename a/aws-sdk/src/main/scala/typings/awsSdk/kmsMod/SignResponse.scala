package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the asymmetric CMK that was used to sign the message.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The cryptographic signature that was generated for the message.
    */
  var Signature: js.UndefOr[CiphertextType] = js.native
  /**
    * The signing algorithm that was used to sign the message.
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec] = js.native
}

object SignResponse {
  @scala.inline
  def apply(
    KeyId: KeyIdType = null,
    Signature: CiphertextType = null,
    SigningAlgorithm: SigningAlgorithmSpec = null
  ): SignResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature.asInstanceOf[js.Any])
    if (SigningAlgorithm != null) __obj.updateDynamic("SigningAlgorithm")(SigningAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignResponse]
  }
}

