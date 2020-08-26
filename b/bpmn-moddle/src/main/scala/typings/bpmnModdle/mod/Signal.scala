package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signal extends BaseElement {
  var name: String = js.native
  var structureRef: ItemDefinition = js.native
}

object Signal {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, name: String, structureRef: ItemDefinition): Signal = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  @scala.inline
  implicit class SignalOps[Self <: Signal] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructureRef(value: ItemDefinition): Self = this.set("structureRef", value.asInstanceOf[js.Any])
  }
  
}

