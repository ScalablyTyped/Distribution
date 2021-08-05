package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementsDefinition extends StObject {
  
  var edges: js.Array[EdgeDefinition]
  
  var nodes: js.Array[NodeDefinition]
}
object ElementsDefinition {
  
  inline def apply(edges: js.Array[EdgeDefinition], nodes: js.Array[NodeDefinition]): ElementsDefinition = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementsDefinition]
  }
  
  extension [Self <: ElementsDefinition](x: Self) {
    
    inline def setEdges(value: js.Array[EdgeDefinition]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: EdgeDefinition*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    inline def setNodes(value: js.Array[NodeDefinition]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: NodeDefinition*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
