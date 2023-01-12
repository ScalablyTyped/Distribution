package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-pseudo-class`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedPseudoClassNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  @JSName("name")
  var name_NestedPseudoClassNode: String
  
  var nodes: js.Array[SelectorNode]
  
  var `type`: `nested-pseudo-class`
}
object NestedPseudoClassNode {
  
  inline def apply(name: String, nodes: js.Array[SelectorNode]): NestedPseudoClassNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nested-pseudo-class")
    __obj.asInstanceOf[NestedPseudoClassNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestedPseudoClassNode] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[SelectorNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: SelectorNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setType(value: `nested-pseudo-class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
