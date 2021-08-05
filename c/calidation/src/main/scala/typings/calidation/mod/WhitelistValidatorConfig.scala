package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhitelistValidatorConfig[T /* <: js.Object */]
  extends StObject
     with SimpleValidatorConfig[T] {
  
  var whitelist: js.Array[String]
}
object WhitelistValidatorConfig {
  
  inline def apply[T /* <: js.Object */](message: String, whitelist: js.Array[String]): WhitelistValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistValidatorConfig[T]]
  }
  
  extension [Self <: WhitelistValidatorConfig[?], T /* <: js.Object */](x: Self & WhitelistValidatorConfig[T]) {
    
    inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
