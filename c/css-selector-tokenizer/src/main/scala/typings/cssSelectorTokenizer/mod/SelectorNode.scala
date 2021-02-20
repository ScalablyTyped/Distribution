package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorNode
  extends BaseNode
     with AnySelectorNode {
  
  var nodes: js.Array[SelectorNodeType] = js.native
  
  var `type`: selector = js.native
}
object SelectorNode {
  
  @scala.inline
  def apply(nodes: js.Array[SelectorNodeType], `type`: selector): SelectorNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorNode]
  }
  
  @scala.inline
  implicit class SelectorNodeMutableBuilder[Self <: SelectorNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[SelectorNodeType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: SelectorNodeType*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
