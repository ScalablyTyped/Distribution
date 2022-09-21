package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptResult extends StObject {
  
  /**
    * Additional data that is authenticated during decryption but not encrypted.
    */
  var additionalAuthenticatedData: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * The {@link EncryptionAlgorithm} used to encrypt the data.
    */
  var algorithm: EncryptionAlgorithm
  
  /**
    * The authentication tag resulting from encryption with a symmetric key including A128GCM, A192GCM, and A256GCM.
    */
  var authenticationTag: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * The initialization vector used for encryption.
    */
  var iv: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * The ID of the Key Vault Key used to encrypt the data.
    */
  var keyID: js.UndefOr[String] = js.undefined
  
  /**
    * Result of the {@link encrypt} operation in bytes.
    */
  var result: js.typedarray.Uint8Array
}
object EncryptResult {
  
  inline def apply(algorithm: EncryptionAlgorithm, result: js.typedarray.Uint8Array): EncryptResult = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptResult]
  }
  
  extension [Self <: EncryptResult](x: Self) {
    
    inline def setAdditionalAuthenticatedData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
    
    inline def setAlgorithm(value: EncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTag(value: js.typedarray.Uint8Array): Self = StObject.set(x, "authenticationTag", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTagUndefined: Self = StObject.set(x, "authenticationTag", js.undefined)
    
    inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
    
    inline def setKeyIDUndefined: Self = StObject.set(x, "keyID", js.undefined)
    
    inline def setResult(value: js.typedarray.Uint8Array): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
