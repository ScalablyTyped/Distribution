package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorsNode
  extends StObject
     with BaseNode
     with AnySelectorNode {
  
  var nodes: js.Array[SelectorNode]
  
  var `type`: selectors
}
object SelectorsNode {
  
  inline def apply(nodes: js.Array[SelectorNode]): SelectorsNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selectors")
    __obj.asInstanceOf[SelectorsNode]
  }
  
  extension [Self <: SelectorsNode](x: Self) {
    
    inline def setNodes(value: js.Array[SelectorNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: SelectorNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setType(value: selectors): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
