package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bookmark extends js.Object {
  var collapsed: Boolean = js.native
  var endNode: node | String = js.native
  var serializable: Boolean = js.native
  var startNode: node | String = js.native
}

object bookmark {
  @scala.inline
  def apply(collapsed: Boolean, endNode: node | String, serializable: Boolean, startNode: node | String): bookmark = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], endNode = endNode.asInstanceOf[js.Any], serializable = serializable.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[bookmark]
  }
  @scala.inline
  implicit class bookmarkOps[Self <: bookmark] (val x: Self) extends AnyVal {
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndNode(value: node | String): Self = this.set("endNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerializable(value: Boolean): Self = this.set("serializable", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartNode(value: node | String): Self = this.set("startNode", value.asInstanceOf[js.Any])
  }
  
}

