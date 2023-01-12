package typings.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleRules extends StObject {
  
  /** Array of Errors. Errors collected during parsing when option silent is true. */
  var parsingErrors: js.UndefOr[js.Array[ParserError]] = js.undefined
  
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.Array[Rule | Comment | AtRule]
}
object StyleRules {
  
  inline def apply(rules: js.Array[Rule | Comment | AtRule]): StyleRules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleRules] (val x: Self) extends AnyVal {
    
    inline def setParsingErrors(value: js.Array[ParserError]): Self = StObject.set(x, "parsingErrors", value.asInstanceOf[js.Any])
    
    inline def setParsingErrorsUndefined: Self = StObject.set(x, "parsingErrors", js.undefined)
    
    inline def setParsingErrorsVarargs(value: ParserError*): Self = StObject.set(x, "parsingErrors", js.Array(value*))
    
    inline def setRules(value: js.Array[Rule | Comment | AtRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: (Rule | Comment | AtRule)*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
