package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.azureKeyvaultKeys.mod.RsaEncryptParameters
  - typings.azureKeyvaultKeys.mod.AesGcmEncryptParameters
  - typings.azureKeyvaultKeys.mod.AesCbcEncryptParameters
*/
trait EncryptParameters extends StObject
object EncryptParameters {
  
  inline def AesCbcEncryptParameters(algorithm: AesCbcEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): typings.azureKeyvaultKeys.mod.AesCbcEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureKeyvaultKeys.mod.AesCbcEncryptParameters]
  }
  
  inline def AesGcmEncryptParameters(algorithm: AesGcmEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): typings.azureKeyvaultKeys.mod.AesGcmEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureKeyvaultKeys.mod.AesGcmEncryptParameters]
  }
  
  inline def RsaEncryptParameters(algorithm: RsaEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): typings.azureKeyvaultKeys.mod.RsaEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.azureKeyvaultKeys.mod.RsaEncryptParameters]
  }
}
