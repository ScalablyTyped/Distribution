package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (key ARN) of the asymmetric CMK that was used to sign the message.
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
  def apply(): SignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignResponse]
  }
  
  @scala.inline
  implicit class SignResponseOps[Self <: SignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    
    @scala.inline
    def setSignature(value: CiphertextType): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("Signature", js.undefined)
    
    @scala.inline
    def setSigningAlgorithm(value: SigningAlgorithmSpec): Self = this.set("SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningAlgorithm: Self = this.set("SigningAlgorithm", js.undefined)
  }
}
