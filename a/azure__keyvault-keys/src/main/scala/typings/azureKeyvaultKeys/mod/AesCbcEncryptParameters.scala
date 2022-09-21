package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCbcEncryptParameters
  extends StObject
     with EncryptParameters {
  
  /**
    * The encryption algorithm to use.
    */
  var algorithm: AesCbcEncryptionAlgorithm
  
  /**
    * The initialization vector used for encryption. If omitted we will attempt to generate an IV using crypto's `randomBytes` functionality.
    * An error will be thrown if creating an IV fails, and you may recover by passing in your own cryptographically secure IV.
    *
    * When passing your own IV, make sure you use a cryptographically random, non-repeating IV.
    */
  var iv: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /**
    * The plain text to encrypt.
    */
  var plaintext: js.typedarray.Uint8Array
}
object AesCbcEncryptParameters {
  
  inline def apply(algorithm: AesCbcEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): AesCbcEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCbcEncryptParameters]
  }
  
  extension [Self <: AesCbcEncryptParameters](x: Self) {
    
    inline def setAlgorithm(value: AesCbcEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
  }
}
