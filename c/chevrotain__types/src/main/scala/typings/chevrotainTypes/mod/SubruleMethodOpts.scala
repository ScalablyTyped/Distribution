package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubruleMethodOpts[ARGS] extends StObject {
  
  /**
    * The arguments to parameterized rules, see:
    * https://github.com/chevrotain/chevrotain/blob/master/examples/parser/parametrized_rules/parametrized.js
    */
  var ARGS: js.UndefOr[ARGS] = js.undefined
  
  /**
    * A label to be used instead of the subrule's name in the created CST.
    */
  var LABEL: js.UndefOr[String] = js.undefined
}
object SubruleMethodOpts {
  
  inline def apply[ARGS](): SubruleMethodOpts[ARGS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubruleMethodOpts[ARGS]]
  }
  
  extension [Self <: SubruleMethodOpts[?], ARGS](x: Self & SubruleMethodOpts[ARGS]) {
    
    inline def setARGS(value: ARGS): Self = StObject.set(x, "ARGS", value.asInstanceOf[js.Any])
    
    inline def setARGSUndefined: Self = StObject.set(x, "ARGS", js.undefined)
    
    inline def setLABEL(value: String): Self = StObject.set(x, "LABEL", value.asInstanceOf[js.Any])
    
    inline def setLABELUndefined: Self = StObject.set(x, "LABEL", js.undefined)
  }
}
