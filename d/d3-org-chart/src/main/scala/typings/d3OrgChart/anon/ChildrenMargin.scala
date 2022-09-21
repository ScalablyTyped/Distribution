package typings.d3OrgChart.anon

import typings.d3Hierarchy.mod.HierarchyNode
import typings.d3OrgChart.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenMargin[Datum] extends StObject {
  
  var childrenMargin: Double
  
  var height: Double
  
  var node: HierarchyNode[Datum]
  
  var siblingsMargin: Double
  
  var state: State[Datum]
  
  var width: Double
}
object ChildrenMargin {
  
  inline def apply[Datum](
    childrenMargin: Double,
    height: Double,
    node: HierarchyNode[Datum],
    siblingsMargin: Double,
    state: State[Datum],
    width: Double
  ): ChildrenMargin[Datum] = {
    val __obj = js.Dynamic.literal(childrenMargin = childrenMargin.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], siblingsMargin = siblingsMargin.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenMargin[Datum]]
  }
  
  extension [Self <: ChildrenMargin[?], Datum](x: Self & ChildrenMargin[Datum]) {
    
    inline def setChildrenMargin(value: Double): Self = StObject.set(x, "childrenMargin", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setNode(value: HierarchyNode[Datum]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSiblingsMargin(value: Double): Self = StObject.set(x, "siblingsMargin", value.asInstanceOf[js.Any])
    
    inline def setState(value: State[Datum]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
