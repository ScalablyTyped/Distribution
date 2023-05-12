package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyResponse extends StObject {
  
  /**
    * <p>The Amazon Resource Name (<a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the asymmetric KMS key that was used to verify the signature.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A Boolean value that indicates whether the signature was verified. A value of
    *         <code>True</code> indicates that the <code>Signature</code> was produced by signing the
    *         <code>Message</code> with the specified <code>KeyID</code> and
    *         <code>SigningAlgorithm.</code> If the signature is not verified, the <code>Verify</code>
    *       operation fails with a <code>KMSInvalidSignatureException</code> exception. </p>
    */
  var SignatureValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p>The signing algorithm that was used to verify the signature.</p>
    */
  var SigningAlgorithm: js.UndefOr[SigningAlgorithmSpec | String] = js.undefined
}
object VerifyResponse {
  
  inline def apply(): VerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setSignatureValid(value: Boolean): Self = StObject.set(x, "SignatureValid", value.asInstanceOf[js.Any])
    
    inline def setSignatureValidUndefined: Self = StObject.set(x, "SignatureValid", js.undefined)
    
    inline def setSigningAlgorithm(value: SigningAlgorithmSpec | String): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
  }
}
