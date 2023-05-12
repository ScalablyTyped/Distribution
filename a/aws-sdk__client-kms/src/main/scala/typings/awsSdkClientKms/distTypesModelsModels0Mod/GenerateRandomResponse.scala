package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateRandomResponse extends StObject {
  
  /**
    * <p>The plaintext random bytes encrypted with the public key from the Nitro enclave. This ciphertext can
    *       be decrypted only by using a private key in the Nitro enclave. </p>
    *          <p>This field is included in the response only when the <code>Recipient</code> parameter in
    *       the request includes a valid attestation document from an Amazon Web Services Nitro enclave.
    *       For information about the interaction between KMS and Amazon Web Services Nitro Enclaves, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services Nitro Enclaves uses KMS</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var CiphertextForRecipient: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The random byte string. When you use the HTTP API or the Amazon Web Services CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.</p>
    *          <p>If the response includes the <code>CiphertextForRecipient</code> field, the
    *       <code>Plaintext</code> field is null or empty.</p>
    */
  var Plaintext: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object GenerateRandomResponse {
  
  inline def apply(): GenerateRandomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateRandomResponse] (val x: Self) extends AnyVal {
    
    inline def setCiphertextForRecipient(value: js.typedarray.Uint8Array): Self = StObject.set(x, "CiphertextForRecipient", value.asInstanceOf[js.Any])
    
    inline def setCiphertextForRecipientUndefined: Self = StObject.set(x, "CiphertextForRecipient", js.undefined)
    
    inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "Plaintext", js.undefined)
  }
}
