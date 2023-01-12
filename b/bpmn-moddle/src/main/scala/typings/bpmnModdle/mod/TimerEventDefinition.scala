package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerEventDefinition
  extends StObject
     with BaseElement {
  
  var timeCycle: Expression
  
  var timeDate: Expression
  
  var timeDuration: Expression
}
object TimerEventDefinition {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    timeCycle: Expression,
    timeDate: Expression,
    timeDuration: Expression
  ): TimerEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], timeCycle = timeCycle.asInstanceOf[js.Any], timeDate = timeDate.asInstanceOf[js.Any], timeDuration = timeDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerEventDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimerEventDefinition] (val x: Self) extends AnyVal {
    
    inline def setTimeCycle(value: Expression): Self = StObject.set(x, "timeCycle", value.asInstanceOf[js.Any])
    
    inline def setTimeDate(value: Expression): Self = StObject.set(x, "timeDate", value.asInstanceOf[js.Any])
    
    inline def setTimeDuration(value: Expression): Self = StObject.set(x, "timeDuration", value.asInstanceOf[js.Any])
  }
}
