package typings.cytoscape.mod

import typings.cytoscape.anon.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableNode extends js.Object {
  var data: Weight = js.native
}

object SortableNode {
  @scala.inline
  def apply(data: Weight): SortableNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableNode]
  }
  @scala.inline
  implicit class SortableNodeOps[Self <: SortableNode] (val x: Self) extends AnyVal {
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
    def setData(value: Weight): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

