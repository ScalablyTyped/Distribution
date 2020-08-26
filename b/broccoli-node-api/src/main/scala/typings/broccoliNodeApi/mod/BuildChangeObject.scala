package typings.broccoliNodeApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildChangeObject extends js.Object {
  var changedNodes: js.Array[Boolean] = js.native
}

object BuildChangeObject {
  @scala.inline
  def apply(changedNodes: js.Array[Boolean]): BuildChangeObject = {
    val __obj = js.Dynamic.literal(changedNodes = changedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildChangeObject]
  }
  @scala.inline
  implicit class BuildChangeObjectOps[Self <: BuildChangeObject] (val x: Self) extends AnyVal {
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
    def setChangedNodesVarargs(value: Boolean*): Self = this.set("changedNodes", js.Array(value :_*))
    @scala.inline
    def setChangedNodes(value: js.Array[Boolean]): Self = this.set("changedNodes", value.asInstanceOf[js.Any])
  }
  
}

