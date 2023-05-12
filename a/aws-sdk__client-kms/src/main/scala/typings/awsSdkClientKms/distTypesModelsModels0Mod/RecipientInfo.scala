package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientInfo extends StObject {
  
  /**
    * <p>The attestation document for an Amazon Web Services Nitro Enclave. This document includes the enclave's public
    *       key.</p>
    */
  var AttestationDocument: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * <p>The encryption algorithm that KMS should use with the public key for an Amazon Web Services Nitro Enclave to encrypt plaintext
    *       values for the response. The only valid value is <code>RSAES_OAEP_SHA_256</code>.</p>
    */
  var KeyEncryptionAlgorithm: js.UndefOr[KeyEncryptionMechanism | String] = js.undefined
}
object RecipientInfo {
  
  inline def apply(): RecipientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientInfo] (val x: Self) extends AnyVal {
    
    inline def setAttestationDocument(value: js.typedarray.Uint8Array): Self = StObject.set(x, "AttestationDocument", value.asInstanceOf[js.Any])
    
    inline def setAttestationDocumentUndefined: Self = StObject.set(x, "AttestationDocument", js.undefined)
    
    inline def setKeyEncryptionAlgorithm(value: KeyEncryptionMechanism | String): Self = StObject.set(x, "KeyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "KeyEncryptionAlgorithm", js.undefined)
  }
}
