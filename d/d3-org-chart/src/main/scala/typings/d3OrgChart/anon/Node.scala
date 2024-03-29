package typings.d3OrgChart.anon

import typings.d3Hierarchy.mod.HierarchyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node[Datum] extends StObject {
  
  var node: HierarchyNode[Datum]
  
  var state: typings.d3OrgChart.mod.State[Datum]
}
object Node {
  
  inline def apply[Datum](node: HierarchyNode[Datum], state: typings.d3OrgChart.mod.State[Datum]): Node[Datum] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node[?], Datum] (val x: Self & Node[Datum]) extends AnyVal {
    
    inline def setNode(value: HierarchyNode[Datum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setState(value: typings.d3OrgChart.mod.State[Datum]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
