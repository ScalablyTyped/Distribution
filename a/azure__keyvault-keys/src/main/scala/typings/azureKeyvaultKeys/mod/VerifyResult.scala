package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyResult extends StObject {
  
  /**
    * The ID of the Key Vault Key used to verify the data.
    */
  var keyID: js.UndefOr[String] = js.undefined
  
  /**
    * Result of the {@link verify} operation in bytes.
    */
  var result: Boolean
}
object VerifyResult {
  
  inline def apply(result: Boolean): VerifyResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResult]
  }
  
  extension [Self <: VerifyResult](x: Self) {
    
    inline def setKeyID(value: String): Self = StObject.set(x, "keyID", value.asInstanceOf[js.Any])
    
    inline def setKeyIDUndefined: Self = StObject.set(x, "keyID", js.undefined)
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
