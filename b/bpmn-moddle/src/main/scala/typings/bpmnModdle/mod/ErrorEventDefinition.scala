package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEventDefinition extends BaseElement {
  var errorRef: ErrorElement = js.native
}

object ErrorEventDefinition {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, errorRef: ErrorElement, id: String): ErrorEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorRef = errorRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventDefinition]
  }
  @scala.inline
  implicit class ErrorEventDefinitionOps[Self <: ErrorEventDefinition] (val x: Self) extends AnyVal {
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
    def setErrorRef(value: ErrorElement): Self = this.set("errorRef", value.asInstanceOf[js.Any])
  }
  
}

