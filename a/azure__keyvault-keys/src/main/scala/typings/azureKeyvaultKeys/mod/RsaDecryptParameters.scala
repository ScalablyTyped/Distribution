package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaDecryptParameters
  extends StObject
     with DecryptParameters {
  
  /**
    * The encryption algorithm to use.
    */
  var algorithm: RsaEncryptionAlgorithm
  
  /**
    * The ciphertext to decrypt.
    */
  var ciphertext: js.typedarray.Uint8Array
}
object RsaDecryptParameters {
  
  inline def apply(algorithm: RsaEncryptionAlgorithm, ciphertext: js.typedarray.Uint8Array): RsaDecryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaDecryptParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RsaDecryptParameters] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: RsaEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setCiphertext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
  }
}
