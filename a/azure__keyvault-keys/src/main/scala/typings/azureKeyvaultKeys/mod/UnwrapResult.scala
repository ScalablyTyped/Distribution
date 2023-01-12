package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnwrapResult extends StObject {
  
  /**
    * The {@link KeyWrapAlgorithm} used to unwrap the data.
    */
  var algorithm: KeyWrapAlgorithm
  
  /**
    * The ID of the Key Vault Key used to unwrap the data.
    */
  var keyID: js.UndefOr[String] = js.undefined
  
  /**
    * Result of the {@link unwrap} operation in bytes.
    */
  var result: js.typedarray.Uint8Array
}
object UnwrapResult {
  
  inline def apply(algorithm: KeyWrapAlgorithm, result: js.typedarray.Uint8Array): UnwrapResult = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnwrapResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnwrapResult] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: KeyWrapAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
    
    inline def setKeyIDUndefined: Self = StObject.set(x, "keyID", js.undefined)
    
    inline def setResult(value: js.typedarray.Uint8Array): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
