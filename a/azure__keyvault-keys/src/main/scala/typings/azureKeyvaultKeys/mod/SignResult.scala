package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignResult extends StObject {
  
  /**
    * The {@link EncryptionAlgorithm} used to sign the data.
    */
  var algorithm: SignatureAlgorithm
  
  /**
    * The ID of the Key Vault Key used to sign the data.
    */
  var keyID: js.UndefOr[String] = js.undefined
  
  /**
    * Result of the {@link sign} operation in bytes.
    */
  var result: js.typedarray.Uint8Array
}
object SignResult {
  
  inline def apply(algorithm: SignatureAlgorithm, result: js.typedarray.Uint8Array): SignResult = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignResult]
  }
  
  extension [Self <: SignResult](x: Self) {
    
    inline def setAlgorithm(value: SignatureAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
    
    inline def setKeyIDUndefined: Self = StObject.set(x, "keyID", js.undefined)
    
    inline def setResult(value: js.typedarray.Uint8Array): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
