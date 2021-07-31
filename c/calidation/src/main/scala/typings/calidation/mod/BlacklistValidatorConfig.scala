package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlacklistValidatorConfig[T /* <: js.Object */]
  extends StObject
     with SimpleValidatorConfig[T] {
  
  var blacklist: js.Array[String]
}
object BlacklistValidatorConfig {
  
  @scala.inline
  def apply[T /* <: js.Object */](blacklist: js.Array[String], message: String): BlacklistValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(blacklist = blacklist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlacklistValidatorConfig[T]]
  }
  
  @scala.inline
  implicit class BlacklistValidatorConfigMutableBuilder[Self <: BlacklistValidatorConfig[?], T /* <: js.Object */] (val x: Self & BlacklistValidatorConfig[T]) extends AnyVal {
    
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
  }
}
