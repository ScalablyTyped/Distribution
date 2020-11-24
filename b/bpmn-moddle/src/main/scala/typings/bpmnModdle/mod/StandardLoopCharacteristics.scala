package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardLoopCharacteristics extends BaseElement {
  
  var loopCondition: Expression = js.native
  
  var loopMaximum: Expression = js.native
  
  var testBefore: Boolean = js.native
}
object StandardLoopCharacteristics {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    loopCondition: Expression,
    loopMaximum: Expression,
    testBefore: Boolean
  ): StandardLoopCharacteristics = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loopCondition = loopCondition.asInstanceOf[js.Any], loopMaximum = loopMaximum.asInstanceOf[js.Any], testBefore = testBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardLoopCharacteristics]
  }
  
  @scala.inline
  implicit class StandardLoopCharacteristicsOps[Self <: StandardLoopCharacteristics] (val x: Self) extends AnyVal {
    
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
    def setLoopCondition(value: Expression): Self = this.set("loopCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopMaximum(value: Expression): Self = this.set("loopMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestBefore(value: Boolean): Self = this.set("testBefore", value.asInstanceOf[js.Any])
  }
}
