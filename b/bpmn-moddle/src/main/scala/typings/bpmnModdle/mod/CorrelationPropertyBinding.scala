package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorrelationPropertyBinding extends BaseElement {
  
  var correlationPropertyRef: CorrelationProperty = js.native
  
  var dataPath: FormalExpression = js.native
}
object CorrelationPropertyBinding {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationPropertyRef: CorrelationProperty,
    dataPath: FormalExpression,
    id: String
  ): CorrelationPropertyBinding = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationPropertyRef = correlationPropertyRef.asInstanceOf[js.Any], dataPath = dataPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationPropertyBinding]
  }
  
  @scala.inline
  implicit class CorrelationPropertyBindingOps[Self <: CorrelationPropertyBinding] (val x: Self) extends AnyVal {
    
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
    def setCorrelationPropertyRef(value: CorrelationProperty): Self = this.set("correlationPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPath(value: FormalExpression): Self = this.set("dataPath", value.asInstanceOf[js.Any])
  }
}
