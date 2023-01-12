package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptResult extends StObject {
  
  /**
    * The {@link EncryptionAlgorithm} used to decrypt the encrypted data.
    */
  var algorithm: EncryptionAlgorithm
  
  /**
    * The ID of the Key Vault Key used to decrypt the encrypted data.
    */
  var keyID: js.UndefOr[String] = js.undefined
  
  /**
    * Result of the {@link decrypt} operation in bytes.
    */
  var result: js.typedarray.Uint8Array
}
object DecryptResult {
  
  inline def apply(algorithm: EncryptionAlgorithm, result: js.typedarray.Uint8Array): DecryptResult = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecryptResult] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: EncryptionAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
    
    inline def setKeyIDUndefined: Self = StObject.set(x, "keyID", js.undefined)
    
    inline def setResult(value: js.typedarray.Uint8Array): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
