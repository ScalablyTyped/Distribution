package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuesNode
  extends StObject
     with BaseNode
     with AnyValueNode {
  
  var nodes: js.Array[ValueNode]
  
  var `type`: values
}
object ValuesNode {
  
  inline def apply(nodes: js.Array[ValueNode]): ValuesNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("values")
    __obj.asInstanceOf[ValuesNode]
  }
  
  extension [Self <: ValuesNode](x: Self) {
    
    inline def setNodes(value: js.Array[ValueNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: ValueNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setType(value: values): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
