package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDefinition extends ElementDefinition {
  @JSName("data")
  var data_NodeDefinition: NodeDataDefinition = js.native
}

object NodeDefinition {
  @scala.inline
  def apply(data: NodeDataDefinition): NodeDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDefinition]
  }
  @scala.inline
  implicit class NodeDefinitionOps[Self <: NodeDefinition] (val x: Self) extends AnyVal {
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
    def setData(value: NodeDataDefinition): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

