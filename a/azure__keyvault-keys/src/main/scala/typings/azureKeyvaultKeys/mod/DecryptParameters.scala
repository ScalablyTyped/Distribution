package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.azureKeyvaultKeys.mod.RsaDecryptParameters
  - typings.azureKeyvaultKeys.mod.AesGcmDecryptParameters
  - typings.azureKeyvaultKeys.mod.AesCbcDecryptParameters
*/
trait DecryptParameters extends StObject
object DecryptParameters {
  
  inline def AesCbcDecryptParameters(
    algorithm: AesCbcEncryptionAlgorithm,
    ciphertext: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array
  ): typings.azureKeyvaultKeys.mod.AesCbcDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureKeyvaultKeys.mod.AesCbcDecryptParameters]
  }
  
  inline def AesGcmDecryptParameters(
    algorithm: AesGcmEncryptionAlgorithm,
    authenticationTag: js.typedarray.Uint8Array,
    ciphertext: js.typedarray.Uint8Array,
    iv: js.typedarray.Uint8Array
  ): typings.azureKeyvaultKeys.mod.AesGcmDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], authenticationTag = authenticationTag.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureKeyvaultKeys.mod.AesGcmDecryptParameters]
  }
  
  inline def RsaDecryptParameters(algorithm: RsaEncryptionAlgorithm, ciphertext: js.typedarray.Uint8Array): typings.azureKeyvaultKeys.mod.RsaDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureKeyvaultKeys.mod.RsaDecryptParameters]
  }
}
