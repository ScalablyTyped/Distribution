package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementsDefinition extends StObject {
  
  var edges: js.Array[EdgeDefinition] = js.native
  
  var nodes: js.Array[NodeDefinition] = js.native
}
object ElementsDefinition {
  
  @scala.inline
  def apply(edges: js.Array[EdgeDefinition], nodes: js.Array[NodeDefinition]): ElementsDefinition = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementsDefinition]
  }
  
  @scala.inline
  implicit class ElementsDefinitionMutableBuilder[Self <: ElementsDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: js.Array[EdgeDefinition]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: EdgeDefinition*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[NodeDefinition]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: NodeDefinition*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
