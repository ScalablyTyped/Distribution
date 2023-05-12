package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateRandomRequest extends StObject {
  
  /**
    * <p>Generates the random byte string in the CloudHSM cluster that is associated with the
    *       specified CloudHSM key store. To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
    *          <p>External key store IDs are not valid for this parameter. If you specify the ID of an
    *       external key store, <code>GenerateRandom</code> throws an
    *       <code>UnsupportedOperationException</code>.</p>
    */
  var CustomKeyStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The length of the random byte string. This parameter is required.</p>
    */
  var NumberOfBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>A signed <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitro-enclave-how.html#term-attestdoc">attestation document</a> from
    *       an Amazon Web Services Nitro enclave and the encryption algorithm to use with the enclave's public key.
    *       The only valid encryption algorithm is <code>RSAES_OAEP_SHA_256</code>. </p>
    *          <p>This parameter only supports attestation documents for Amazon Web Services Nitro Enclaves. To include this
    *       parameter, use the <a href="https://docs.aws.amazon.com/enclaves/latest/user/developing-applications.html#sdk">Amazon Web Services Nitro Enclaves SDK</a> or any Amazon Web Services SDK.</p>
    *          <p>When you use this parameter, instead of returning plaintext bytes, KMS encrypts the
    *       plaintext bytes under the public key in the attestation document, and returns the resulting
    *       ciphertext in the <code>CiphertextForRecipient</code> field in the response. This ciphertext
    *       can be decrypted only with the private key in the enclave. The <code>Plaintext</code> field in
    *       the response is null or empty.</p>
    *          <p>For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var Recipient: js.UndefOr[RecipientInfo] = js.undefined
}
object GenerateRandomRequest {
  
  inline def apply(): GenerateRandomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateRandomRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomKeyStoreId(value: String): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setNumberOfBytes(value: Double): Self = StObject.set(x, "NumberOfBytes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBytesUndefined: Self = StObject.set(x, "NumberOfBytes", js.undefined)
    
    inline def setRecipient(value: RecipientInfo): Self = StObject.set(x, "Recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "Recipient", js.undefined)
  }
}
