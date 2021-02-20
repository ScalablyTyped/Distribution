package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.value
import org.scalablytyped.runtime.StObject
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
  implicit class ValueNodeMutableBuilder[Self <: ValueNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[ValueNodeType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: ValueNodeType*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
