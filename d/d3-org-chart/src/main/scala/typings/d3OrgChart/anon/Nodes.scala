package typings.d3OrgChart.anon

import typings.d3Hierarchy.mod.HierarchyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes[Datum] extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var nodes: js.UndefOr[js.Iterable[HierarchyNode[Datum]]] = js.undefined
  
  var scale: js.UndefOr[Boolean] = js.undefined
}
object Nodes {
  
  inline def apply[Datum](): Nodes[Datum] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nodes[Datum]]
  }
  
  extension [Self <: Nodes[?], Datum](x: Self & Nodes[Datum]) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setNodes(value: js.Iterable[HierarchyNode[Datum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
