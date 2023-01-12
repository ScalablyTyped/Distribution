package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesGcmEncryptParameters
  extends StObject
     with EncryptParameters {
  
  /**
    * Optional data that is authenticated but not encrypted.
    */
  var additionalAuthenticatedData: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * The encryption algorithm to use.
    */
  var algorithm: AesGcmEncryptionAlgorithm
  
  /**
    * The plain text to encrypt.
    */
  var plaintext: js.typedarray.Uint8Array
}
object AesGcmEncryptParameters {
  
  inline def apply(algorithm: AesGcmEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): AesGcmEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGcmEncryptParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AesGcmEncryptParameters] (val x: Self) extends AnyVal {
    
    inline def setAdditionalAuthenticatedData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
    
    inline def setAlgorithm(value: AesGcmEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
  }
}
