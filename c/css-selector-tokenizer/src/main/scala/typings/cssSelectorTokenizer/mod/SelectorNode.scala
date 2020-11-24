package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorNode
  extends BaseNode
     with AnySelectorNode {
  
  var nodes: js.Array[SelectorNodeType] = js.native
  
  var `type`: selector = js.native
}
object SelectorNode {
  
  @scala.inline
  def apply(nodes: js.Array[SelectorNodeType], `type`: selector): SelectorNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNode]
  }
  
  @scala.inline
  implicit class SelectorNodeOps[Self <: SelectorNode] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: SelectorNodeType*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[SelectorNodeType]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: selector): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
