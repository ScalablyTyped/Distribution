package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueNode
  extends BaseNode
     with AnyValueNode {
  
  var nodes: js.Array[ValueNodeType] = js.native
  
  var `type`: value = js.native
}
object ValueNode {
  
  @scala.inline
  def apply(nodes: js.Array[ValueNodeType], `type`: value): ValueNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  
  @scala.inline
  implicit class ValueNodeOps[Self <: ValueNode] (val x: Self) extends AnyVal {
    
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
    def setNodesVarargs(value: ValueNodeType*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[ValueNodeType]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: value): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
