package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rules extends StObject {
  
  var rules: js.Array[Rule]
}
object Rules {
  
  inline def apply(rules: js.Array[Rule]): Rules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
    
    inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
