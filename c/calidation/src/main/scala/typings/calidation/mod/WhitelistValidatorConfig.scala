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
  
  @scala.inline
  def apply[T /* <: js.Object */](message: String, whitelist: js.Array[String]): WhitelistValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistValidatorConfig[T]]
  }
  
  @scala.inline
  implicit class WhitelistValidatorConfigMutableBuilder[Self <: WhitelistValidatorConfig[?], T /* <: js.Object */] (val x: Self & WhitelistValidatorConfig[T]) extends AnyVal {
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
