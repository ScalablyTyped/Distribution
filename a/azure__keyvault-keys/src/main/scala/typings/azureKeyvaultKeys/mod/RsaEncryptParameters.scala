package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaEncryptParameters
  extends StObject
     with EncryptParameters {
  
  /**
    * The encryption algorithm to use.
    */
  var algorithm: RsaEncryptionAlgorithm
  
  /**
    * The plain text to encrypt.
    */
  var plaintext: js.typedarray.Uint8Array
}
object RsaEncryptParameters {
  
  inline def apply(algorithm: RsaEncryptionAlgorithm, plaintext: js.typedarray.Uint8Array): RsaEncryptParameters = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaEncryptParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RsaEncryptParameters] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: RsaEncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
  }
}
