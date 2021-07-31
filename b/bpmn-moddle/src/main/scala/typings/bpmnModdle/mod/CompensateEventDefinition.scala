package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompensateEventDefinition
  extends StObject
     with BaseElement {
  
  var activityRef: Activity
  
  var waitForCompletion: Boolean
}
object CompensateEventDefinition {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    activityRef: Activity,
    id: String,
    waitForCompletion: Boolean
  ): CompensateEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], activityRef = activityRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], waitForCompletion = waitForCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompensateEventDefinition]
  }
  
  @scala.inline
  implicit class CompensateEventDefinitionMutableBuilder[Self <: CompensateEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityRef(value: Activity): Self = StObject.set(x, "activityRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = StObject.set(x, "waitForCompletion", value.asInstanceOf[js.Any])
  }
}
