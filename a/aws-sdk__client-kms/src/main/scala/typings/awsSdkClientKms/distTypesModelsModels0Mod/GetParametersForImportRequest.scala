package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersForImportRequest extends StObject {
  
  /**
    * <p>The identifier of the symmetric encryption KMS key into which you will import key
    *       material. The <code>Origin</code> of the KMS key must be <code>EXTERNAL</code>.</p>
    *          <p>Specify the key ID or key ARN of the KMS key.</p>
    *          <p>For example:</p>
    *          <ul>
    *             <li>
    *                <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The algorithm you will use to encrypt the key material before using the <a>ImportKeyMaterial</a> operation to import it. For more information, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys-encrypt-key-material.html">Encrypt the
    *         key material</a> in the <i>Key Management Service Developer Guide</i>.</p>
    *          <important>
    *             <p>The <code>RSAES_PKCS1_V1_5</code> wrapping algorithm is deprecated. We recommend that
    *         you begin using a different wrapping algorithm immediately. KMS will end support for
    *           <code>RSAES_PKCS1_V1_5</code> by October 1, 2023 pursuant to <a href="https://nvlpubs.nist.gov/nistpubs/SpecialPublications/NIST.SP.800-131Ar2.pdf">cryptographic key management guidance</a> from the National Institute of Standards
    *         and Technology (NIST).</p>
    *          </important>
    */
  var WrappingAlgorithm: js.UndefOr[AlgorithmSpec | String] = js.undefined
  
  /**
    * <p>The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public
    *       keys are supported.</p>
    */
  var WrappingKeySpec: js.UndefOr[typings.awsSdkClientKms.distTypesModelsModels0Mod.WrappingKeySpec | String] = js.undefined
}
object GetParametersForImportRequest {
  
  inline def apply(): GetParametersForImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParametersForImportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersForImportRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setWrappingAlgorithm(value: AlgorithmSpec | String): Self = StObject.set(x, "WrappingAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setWrappingAlgorithmUndefined: Self = StObject.set(x, "WrappingAlgorithm", js.undefined)
    
    inline def setWrappingKeySpec(value: WrappingKeySpec | String): Self = StObject.set(x, "WrappingKeySpec", value.asInstanceOf[js.Any])
    
    inline def setWrappingKeySpecUndefined: Self = StObject.set(x, "WrappingKeySpec", js.undefined)
  }
}
