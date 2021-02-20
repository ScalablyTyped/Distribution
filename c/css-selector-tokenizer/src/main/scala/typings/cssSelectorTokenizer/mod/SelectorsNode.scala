package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorsNode
  extends BaseNode
     with AnySelectorNode {
  
  var nodes: js.Array[SelectorNode] = js.native
  
  var `type`: selectors = js.native
}
object SelectorsNode {
  
  @scala.inline
  def apply(nodes: js.Array[SelectorNode], `type`: selectors): SelectorsNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorsNode]
  }
  
  @scala.inline
  implicit class SelectorsNodeMutableBuilder[Self <: SelectorsNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[SelectorNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: SelectorNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: selectors): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
