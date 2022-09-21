package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AesCbcDecryptParameters
  extends StObject
     with DecryptParameters {
  
  /**
    * The encryption algorithm to use.
    */
  var algorithm: AesCbcEncryptionAlgorithm
  
  /**
    * The initialization vector used during encryption.
    */
  /**
    * The ciphertext to decrypt. Microsoft recommends you not use CBC without first ensuring the integrity of the ciphertext using an HMAC, for example.
    * See https://docs.microsoft.com/dotnet/standard/security/vulnerabilities-cbc-mode for more information.
    */
  var ciphertext: js.typedarray.Uint8Array
  
  /**
    * The initialization vector generated during encryption.
    */
  var iv: js.typedarray.Uint8Array
}
object AesCbcDecryptParameters {
  
  inline def apply(
    algorithm: AesCbcEncryptionAlgorithm,
    ciphertext: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array
  ): AesCbcDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCbcDecryptParameters]
  }
  
  extension [Self <: AesCbcDecryptParameters](x: Self) {
    
    inline def setAlgorithm(value: AesCbcEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setCiphertext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
  }
}
