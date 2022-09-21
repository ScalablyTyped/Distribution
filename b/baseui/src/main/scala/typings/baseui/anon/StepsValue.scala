package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepsValue extends StObject {
  
  var steps: js.Array[Any]
  
  var value: Any
}
object StepsValue {
  
  inline def apply(steps: js.Array[Any], value: Any): StepsValue = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsValue]
  }
  
  extension [Self <: StepsValue](x: Self) {
    
    inline def setSteps(value: js.Array[Any]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: Any*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
