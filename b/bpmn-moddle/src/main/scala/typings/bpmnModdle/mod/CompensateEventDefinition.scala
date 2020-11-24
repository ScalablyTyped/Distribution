package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensateEventDefinition extends BaseElement {
  
  var activityRef: Activity = js.native
  
  var waitForCompletion: Boolean = js.native
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
  implicit class CompensateEventDefinitionOps[Self <: CompensateEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivityRef(value: Activity): Self = this.set("activityRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForCompletion(value: Boolean): Self = this.set("waitForCompletion", value.asInstanceOf[js.Any])
  }
}
