package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-pseudo-class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedPseudoClassNode
  extends SelectorNodeType
     with BaseNode {
  @JSName("name")
  var name_NestedPseudoClassNode: String = js.native
  var nodes: js.Array[SelectorNode] = js.native
  var `type`: `nested-pseudo-class` = js.native
}

object NestedPseudoClassNode {
  @scala.inline
  def apply(name: String, nodes: js.Array[SelectorNode], `type`: `nested-pseudo-class`): NestedPseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedPseudoClassNode]
  }
  @scala.inline
  implicit class NestedPseudoClassNodeOps[Self <: NestedPseudoClassNode] (val x: Self) extends AnyVal {
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
    def setNodesVarargs(value: SelectorNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[SelectorNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `nested-pseudo-class`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

