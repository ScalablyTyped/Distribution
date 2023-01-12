package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.breadthfirst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/breadthfirst
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait BreadthFirstLayoutOptions
  extends StObject
     with ShapedLayoutOptions {
  
  // put depths in concentric circles if true, put depths top down if false
  var circle: js.UndefOr[Boolean] = js.undefined
  
  // a sorting function to order nodes at equal depth. e.g. function(a, b){ return a.data('weight') - b.data('weight') }
  var depthSort: js.UndefOr[js.Function2[/* a */ NodeSingular, /* b */ NodeSingular, Double]] = js.undefined
  
  // whether the tree is directed downwards (or edges can point in any direction if false)
  var directed: js.UndefOr[Boolean] = js.undefined
  
  // whether to create an even grid into which the DAG is placed (circle:false only)
  var grid: js.UndefOr[Boolean] = js.undefined
  
  // whether to shift nodes down their natural BFS depths in order to avoid upwards edges (DAGS only)
  var maximal: js.UndefOr[Boolean] = js.undefined
  
  // Deprecated: how many times to try to position the nodes in a maximal way (i.e. no backtracking)
  var maximalAdjustments: js.UndefOr[Double] = js.undefined
  
  @JSName("name")
  var name_BreadthFirstLayoutOptions: breadthfirst
  
  // the roots of the trees
  var roots: js.UndefOr[js.Array[String]] = js.undefined
}
object BreadthFirstLayoutOptions {
  
  inline def apply(): BreadthFirstLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "breadthfirst")
    __obj.asInstanceOf[BreadthFirstLayoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreadthFirstLayoutOptions] (val x: Self) extends AnyVal {
    
    inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setDepthSort(value: (/* a */ NodeSingular, /* b */ NodeSingular) => Double): Self = StObject.set(x, "depthSort", js.Any.fromFunction2(value))
    
    inline def setDepthSortUndefined: Self = StObject.set(x, "depthSort", js.undefined)
    
    inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    inline def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setMaximal(value: Boolean): Self = StObject.set(x, "maximal", value.asInstanceOf[js.Any])
    
    inline def setMaximalAdjustments(value: Double): Self = StObject.set(x, "maximalAdjustments", value.asInstanceOf[js.Any])
    
    inline def setMaximalAdjustmentsUndefined: Self = StObject.set(x, "maximalAdjustments", js.undefined)
    
    inline def setMaximalUndefined: Self = StObject.set(x, "maximal", js.undefined)
    
    inline def setName(value: breadthfirst): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
    
    inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
  }
}
