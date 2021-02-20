package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ValuesNodeMutableBuilder[Self <: ValuesNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[ValueNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: ValueNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: values): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
