package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalOptionScopes extends StObject {
  
  var additionalOptionScopes: js.UndefOr[js.Array[String]] = js.undefined
  
  var id: String
}
object AdditionalOptionScopes {
  
  inline def apply(id: String): AdditionalOptionScopes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalOptionScopes]
  }
  
  extension [Self <: AdditionalOptionScopes](x: Self) {
    
    inline def setAdditionalOptionScopes(value: js.Array[String]): Self = StObject.set(x, "additionalOptionScopes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionScopesUndefined: Self = StObject.set(x, "additionalOptionScopes", js.undefined)
    
    inline def setAdditionalOptionScopesVarargs(value: String*): Self = StObject.set(x, "additionalOptionScopes", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
