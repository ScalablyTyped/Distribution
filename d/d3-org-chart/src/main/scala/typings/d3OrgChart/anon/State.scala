package typings.d3OrgChart.anon

import typings.d3Hierarchy.mod.HierarchyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State[T] extends StObject {
  
  var node: HierarchyNode[T]
  
  var state: typings.d3OrgChart.mod.State[T]
}
object State {
  
  inline def apply[T](node: HierarchyNode[T], state: typings.d3OrgChart.mod.State[T]): State[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State[?], T] (val x: Self & State[T]) extends AnyVal {
    
    inline def setNode(value: HierarchyNode[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setState(value: typings.d3OrgChart.mod.State[T]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
