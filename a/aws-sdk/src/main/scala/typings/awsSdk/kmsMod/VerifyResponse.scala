package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyResponse extends js.Object {
  /**
    * The unique identifier for the asymmetric CMK that was used to verify the signature.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * A Boolean value that indicates whether the signature was verified. A value of True indicates that the Signature was produced by signing the Message with the specified KeyID and SigningAlgorithm. If the signature is not verified, the Verify operation fails with a KMSInvalidSignatureException exception. 
    */
  var SignatureValid: js.UndefOr[BooleanType] = js.native
  /**
    * The signing algorithm that was used to verify the signature.
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec] = js.native
}

object VerifyResponse {
  @scala.inline
  def apply(
    KeyId: KeyIdType = null,
    SignatureValid: js.UndefOr[Boolean] = js.undefined,
    SigningAlgorithm: SigningAlgorithmSpec = null
  ): VerifyResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(SignatureValid)) __obj.updateDynamic("SignatureValid")(SignatureValid.asInstanceOf[js.Any])
    if (SigningAlgorithm != null) __obj.updateDynamic("SigningAlgorithm")(SigningAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResponse]
  }
}

