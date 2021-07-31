package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedItemNode
  extends StObject
     with BaseNode
     with ValueNodeType {
  
  @JSName("name")
  var name_NestedItemNode: String
  
  var nodes: js.Array[ValueNode]
  
  var `type`: `nested-item`
}
object NestedItemNode {
  
  @scala.inline
  def apply(name: String, nodes: js.Array[ValueNode]): NestedItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nested-item")
    __obj.asInstanceOf[NestedItemNode]
  }
  
  @scala.inline
  implicit class NestedItemNodeMutableBuilder[Self <: NestedItemNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Array[ValueNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: ValueNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `nested-item`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
