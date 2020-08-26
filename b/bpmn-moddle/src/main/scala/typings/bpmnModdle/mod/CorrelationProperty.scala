package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorrelationProperty extends BaseElement {
  var correlationPropertyRetrievalExpression: CorrelationPropertyRetrievalExpression = js.native
  var name: String = js.native
  var `type`: ItemDefinition = js.native
}

object CorrelationProperty {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationPropertyRetrievalExpression: CorrelationPropertyRetrievalExpression,
    id: String,
    name: String,
    `type`: ItemDefinition
  ): CorrelationProperty = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationPropertyRetrievalExpression = correlationPropertyRetrievalExpression.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationProperty]
  }
  @scala.inline
  implicit class CorrelationPropertyOps[Self <: CorrelationProperty] (val x: Self) extends AnyVal {
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
    def setCorrelationPropertyRetrievalExpression(value: CorrelationPropertyRetrievalExpression): Self = this.set("correlationPropertyRetrievalExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ItemDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

