package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.dom.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndNode extends js.Object {
  var endNode: node = js.native
  var startNode: node = js.native
}

object EndNode {
  @scala.inline
  def apply(endNode: node, startNode: node): EndNode = {
    val __obj = js.Dynamic.literal(endNode = endNode.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndNode]
  }
  @scala.inline
  implicit class EndNodeOps[Self <: EndNode] (val x: Self) extends AnyVal {
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
    def setEndNode(value: node): Self = this.set("endNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartNode(value: node): Self = this.set("startNode", value.asInstanceOf[js.Any])
  }
  
}

