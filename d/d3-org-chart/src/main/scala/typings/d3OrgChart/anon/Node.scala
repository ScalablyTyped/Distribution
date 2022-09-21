package typings.d3OrgChart.anon

import typings.d3Hierarchy.mod.HierarchyNode
import typings.d3OrgChart.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node[Datum] extends StObject {
  
  var node: HierarchyNode[Datum]
  
  var state: State[Datum]
}
object Node {
  
  inline def apply[Datum](node: HierarchyNode[Datum], state: State[Datum]): Node[Datum] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[Datum]]
  }
  
  extension [Self <: Node[?], Datum](x: Self & Node[Datum]) {
    
    inline def setNode(value: HierarchyNode[Datum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setState(value: State[Datum]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
