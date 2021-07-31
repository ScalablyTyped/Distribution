package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignResponse extends StObject {
  
  /**
    * The Amazon Resource Name (key ARN) of the asymmetric CMK that was used to sign the message.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
  
  /**
    * The cryptographic signature that was generated for the message.    When used with the supported RSA signing algorithms, the encoding of this value is defined by PKCS #1 in RFC 8017.   When used with the ECDSA_SHA_256, ECDSA_SHA_384, or ECDSA_SHA_512 signing algorithms, this value is a DER-encoded object as defined by ANS X9.62–2005 and RFC 3279 Section 2.2.3. This is the most commonly used signature format and is appropriate for most uses.    When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var Signature: js.UndefOr[CiphertextType] = js.undefined
  
  /**
    * The signing algorithm that was used to sign the message.
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec] = js.undefined
}
object SignResponse {
  
  @scala.inline
  def apply(): SignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignResponse]
  }
  
  @scala.inline
  implicit class SignResponseMutableBuilder[Self <: SignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setSignature(value: CiphertextType): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    @scala.inline
    def setSigningAlgorithm(value: SigningAlgorithmSpec): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
  }
}
