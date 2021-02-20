package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerEventDefinition extends BaseElement {
  
  var timeCycle: Expression = js.native
  
  var timeDate: Expression = js.native
  
  var timeDuration: Expression = js.native
}
object TimerEventDefinition {
  
  @scala.inline
  def apply(
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
  implicit class TimerEventDefinitionMutableBuilder[Self <: TimerEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeCycle(value: Expression): Self = StObject.set(x, "timeCycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDate(value: Expression): Self = StObject.set(x, "timeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDuration(value: Expression): Self = StObject.set(x, "timeDuration", value.asInstanceOf[js.Any])
  }
}
