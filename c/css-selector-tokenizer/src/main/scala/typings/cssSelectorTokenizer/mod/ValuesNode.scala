package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValuesNode
  extends BaseNode
     with AnyValueNode {
  var nodes: js.Array[ValueNode] = js.native
  var `type`: values = js.native
}

object ValuesNode {
  @scala.inline
  def apply(nodes: js.Array[ValueNode], `type`: values): ValuesNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesNode]
  }
  @scala.inline
  implicit class ValuesNodeOps[Self <: ValuesNode] (val x: Self) extends AnyVal {
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
    def setNodesVarargs(value: ValueNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[ValueNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: values): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

