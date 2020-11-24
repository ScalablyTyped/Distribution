package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedItemNode
  extends ValueNodeType
     with BaseNode {
  
  @JSName("name")
  var name_NestedItemNode: String = js.native
  
  var nodes: js.Array[ValueNode] = js.native
  
  var `type`: `nested-item` = js.native
}
object NestedItemNode {
  
  @scala.inline
  def apply(name: String, nodes: js.Array[ValueNode], `type`: `nested-item`): NestedItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedItemNode]
  }
  
  @scala.inline
  implicit class NestedItemNodeOps[Self <: NestedItemNode] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: ValueNode*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[ValueNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `nested-item`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
