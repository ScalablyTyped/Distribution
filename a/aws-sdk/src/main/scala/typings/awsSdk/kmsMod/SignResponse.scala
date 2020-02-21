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
    * The cryptographic signature that was generated for the message.    When used with the supported RSA signing algorithms, the encoding of this value is defined by PKCS #1 in RFC 8017.   When used with the ECDSA_SHA_256, ECDSA_SHA_384, or ECDSA_SHA_512 signing algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and RFC 3279 Section 2.2.3. This is the most commonly used signature format and is appropriate for most uses.    When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
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

