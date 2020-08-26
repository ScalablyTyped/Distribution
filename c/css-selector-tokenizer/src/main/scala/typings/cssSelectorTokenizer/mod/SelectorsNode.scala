package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorsNode
  extends BaseNode
     with AnySelectorNode {
  var nodes: js.Array[SelectorNode] = js.native
  var `type`: selectors = js.native
}

object SelectorsNode {
  @scala.inline
  def apply(nodes: js.Array[SelectorNode], `type`: selectors): SelectorsNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorsNode]
  }
  @scala.inline
  implicit class SelectorsNodeOps[Self <: SelectorsNode] (val x: Self) extends AnyVal {
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
    def setNodesVarargs(value: SelectorNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[SelectorNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: selectors): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

