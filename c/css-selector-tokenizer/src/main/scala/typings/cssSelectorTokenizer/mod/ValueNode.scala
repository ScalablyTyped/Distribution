package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueNode
  extends StObject
     with BaseNode
     with AnyValueNode {
  
  var nodes: js.Array[ValueNodeType]
  
  var `type`: value
}
object ValueNode {
  
  @scala.inline
  def apply(nodes: js.Array[ValueNodeType]): ValueNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
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
