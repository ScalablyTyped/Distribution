package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrapResult extends StObject {
  
  /**
    * The {@link EncryptionAlgorithm} used to wrap the data.
    */
  var algorithm: KeyWrapAlgorithm
  
  /**
    * The ID of the Key Vault Key used to wrap the data.
    */
  var keyID: js.UndefOr[String] = js.undefined
  
  /**
    * Result of the {@link wrap} operation in bytes.
    */
  var result: js.typedarray.Uint8Array
}
object WrapResult {
  
  inline def apply(algorithm: KeyWrapAlgorithm, result: js.typedarray.Uint8Array): WrapResult = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapResult]
  }
  
  extension [Self <: WrapResult](x: Self) {
    
    inline def setAlgorithm(value: KeyWrapAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
    
    inline def setKeyIDUndefined: Self = StObject.set(x, "keyID", js.undefined)
    
    inline def setResult(value: js.typedarray.Uint8Array): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
