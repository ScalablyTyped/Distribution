package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardLoopCharacteristics
  extends StObject
     with BaseElement {
  
  var loopCondition: Expression
  
  var loopMaximum: Expression
  
  var testBefore: Boolean
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
  implicit class StandardLoopCharacteristicsMutableBuilder[Self <: StandardLoopCharacteristics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoopCondition(value: Expression): Self = StObject.set(x, "loopCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopMaximum(value: Expression): Self = StObject.set(x, "loopMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestBefore(value: Boolean): Self = StObject.set(x, "testBefore", value.asInstanceOf[js.Any])
  }
}
