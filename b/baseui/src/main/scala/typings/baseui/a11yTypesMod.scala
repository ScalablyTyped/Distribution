package typings.baseui

import typings.axeCore.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object a11yTypesMod {
  
  trait ViolationProps extends StObject {
    
    var target: String
    
    var violations: js.Array[Result]
  }
  object ViolationProps {
    
    inline def apply(target: String, violations: js.Array[Result]): ViolationProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViolationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViolationProps] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setViolations(value: js.Array[Result]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
      
      inline def setViolationsVarargs(value: Result*): Self = StObject.set(x, "violations", js.Array(value*))
    }
  }
}
