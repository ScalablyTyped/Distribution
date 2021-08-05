package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorNode
  extends StObject
     with BaseNode
     with AnySelectorNode {
  
  var nodes: js.Array[SelectorNodeType]
  
  var `type`: selector
}
object SelectorNode {
  
  inline def apply(nodes: js.Array[SelectorNodeType]): SelectorNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selector")
    __obj.asInstanceOf[SelectorNode]
  }
  
  extension [Self <: SelectorNode](x: Self) {
    
    inline def setNodes(value: js.Array[SelectorNodeType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: SelectorNodeType*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setType(value: selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
