package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interface extends BaseElement {
  var implementationRef: String = js.native
  var name: String = js.native
  var operations: js.Array[Operation] = js.native
}

object Interface {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    implementationRef: String,
    name: String,
    operations: js.Array[Operation]
  ): Interface = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementationRef = implementationRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interface]
  }
  @scala.inline
  implicit class InterfaceOps[Self <: Interface] (val x: Self) extends AnyVal {
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
    def setImplementationRef(value: String): Self = this.set("implementationRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[Operation]): Self = this.set("operations", value.asInstanceOf[js.Any])
  }
  
}

