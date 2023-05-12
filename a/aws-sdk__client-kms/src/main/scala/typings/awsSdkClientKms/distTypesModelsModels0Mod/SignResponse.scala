package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignResponse extends StObject {
  
  /**
    * <p>The Amazon Resource Name (<a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the asymmetric KMS key that was used to sign the message.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The cryptographic signature that was generated for the message. </p>
    *          <ul>
    *             <li>
    *                <p>When used with the supported RSA signing algorithms, the encoding of this value is
    *           defined by <a href="https://tools.ietf.org/html/rfc8017">PKCS #1 in RFC
    *           8017</a>.</p>
    *             </li>
    *             <li>
    *                <p>When used with the <code>ECDSA_SHA_256</code>, <code>ECDSA_SHA_384</code>, or
    *             <code>ECDSA_SHA_512</code> signing algorithms, this value is a DER-encoded object as
    *           defined by ANS X9.62–2005 and <a href="https://tools.ietf.org/html/rfc3279#section-2.2.3">RFC 3279 Section 2.2.3</a>.
    *           This is the most commonly used signature format and is appropriate for most uses.
    *           </p>
    *             </li>
    *          </ul>
    *          <p>When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.</p>
    */
  var Signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The signing algorithm that was used to sign the message.</p>
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec | String] = js.undefined
}
object SignResponse {
  
  inline def apply(): SignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    inline def setSigningAlgorithm(value: SigningAlgorithmSpec | String): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
  }
}
