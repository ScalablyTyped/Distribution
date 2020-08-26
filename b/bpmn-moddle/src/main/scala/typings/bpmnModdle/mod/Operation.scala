package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends BaseElement {
  var errorRef: ErrorElement = js.native
  var implementationRef: String = js.native
  var inMessageRef: Message = js.native
  var name: String = js.native
  var outMessageRef: Message = js.native
}

object Operation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    errorRef: ErrorElement,
    id: String,
    implementationRef: String,
    inMessageRef: Message,
    name: String,
    outMessageRef: Message
  ): Operation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], errorRef = errorRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementationRef = implementationRef.asInstanceOf[js.Any], inMessageRef = inMessageRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outMessageRef = outMessageRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setImplementationRef(value: String): Self = this.set("implementationRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setInMessageRef(value: Message): Self = this.set("inMessageRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutMessageRef(value: Message): Self = this.set("outMessageRef", value.asInstanceOf[js.Any])
  }
  
}

