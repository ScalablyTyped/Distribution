package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesGcmDecryptParameters
  extends StObject
     with DecryptParameters {
  
  /**
    * Optional data that is authenticated but not encrypted.
    */
  var additionalAuthenticatedData: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * The encryption algorithm to use.
    */
  var algorithm: AesGcmEncryptionAlgorithm
  
  /**
    * The authentication tag generated during encryption.
    */
  var authenticationTag: js.typedarray.Uint8Array
  
  /**
    * The ciphertext to decrypt.
    */
  var ciphertext: js.typedarray.Uint8Array
  
  /**
    * The initialization vector (or nonce) generated during encryption.
    */
  var iv: js.typedarray.Uint8Array
}
object AesGcmDecryptParameters {
  
  inline def apply(
    algorithm: AesGcmEncryptionAlgorithm,
    authenticationTag: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array
  ): AesGcmDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], authenticationTag = authenticationTag.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGcmDecryptParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AesGcmDecryptParameters] (val x: Self) extends AnyVal {
    
    inline def setAdditionalAuthenticatedData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
    
    inline def setAlgorithm(value: AesGcmEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTag(value: js.typedarray.Uint8Array): Self = StObject.set(x, "authenticationTag", value.asInstanceOf[js.Any])
    
    inline def setCiphertext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
