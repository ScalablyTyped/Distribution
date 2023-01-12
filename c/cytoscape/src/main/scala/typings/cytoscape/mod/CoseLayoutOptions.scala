package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.cose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/cose
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait CoseLayoutOptions
  extends StObject
     with ShapedLayoutOptions {
  
  // The layout animates only after this many milliseconds for animate:true
  // (prevents flashing on fast runs)
  var animationThreshold: js.UndefOr[Double] = js.undefined
  
  // Extra spacing between components in non-compound graphs
  var componentSpacing: js.UndefOr[Double] = js.undefined
  
  // Cooling factor (how the temperature is reduced between consecutive iterations
  var coolingFactor: js.UndefOr[Double] = js.undefined
  
  // Divisor to compute edge forces
  var edgeElasticity: js.UndefOr[js.Function1[/* edge */ Any, Double]] = js.undefined
  
  // Gravity force (constant)
  var gravity: js.UndefOr[Double] = js.undefined
  
  // Ideal edge (non nested) length
  var idealEdgeLength: js.UndefOr[js.Function1[/* edge */ Any, Double]] = js.undefined
  
  // Initial temperature (maximum node displacement)
  var initialTemp: js.UndefOr[Double] = js.undefined
  
  // Lower temperature threshold (below this point the layout will end)
  var minTemp: js.UndefOr[Double] = js.undefined
  
  @JSName("name")
  var name_CoseLayoutOptions: cose
  
  // Nesting factor (multiplier) to compute ideal edge length for nested edges
  var nestingFactor: js.UndefOr[Double] = js.undefined
  
  // Node repulsion (overlapping) multiplier
  var nodeOverlap: js.UndefOr[Double] = js.undefined
  
  // Node repulsion (non overlapping) multiplier
  var nodeRepulsion: js.UndefOr[js.Function1[/* node */ Any, Double]] = js.undefined
  
  // Maximum number of iterations to perform
  var numIter: js.UndefOr[Double] = js.undefined
  
  // Randomize the initial positions of the nodes (true) or use existing positions (false)
  var randomize: js.UndefOr[Boolean] = js.undefined
  
  // Number of iterations between consecutive screen positions update
  // (0 -> only updated on the end)
  var refresh: js.UndefOr[Double] = js.undefined
  
  // Deprecated: Pass a reference to weaver to use threads for calculations
  var weaver: js.UndefOr[Boolean] = js.undefined
}
object CoseLayoutOptions {
  
  inline def apply(): CoseLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "cose")
    __obj.asInstanceOf[CoseLayoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoseLayoutOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimationThreshold(value: Double): Self = StObject.set(x, "animationThreshold", value.asInstanceOf[js.Any])
    
    inline def setAnimationThresholdUndefined: Self = StObject.set(x, "animationThreshold", js.undefined)
    
    inline def setComponentSpacing(value: Double): Self = StObject.set(x, "componentSpacing", value.asInstanceOf[js.Any])
    
    inline def setComponentSpacingUndefined: Self = StObject.set(x, "componentSpacing", js.undefined)
    
    inline def setCoolingFactor(value: Double): Self = StObject.set(x, "coolingFactor", value.asInstanceOf[js.Any])
    
    inline def setCoolingFactorUndefined: Self = StObject.set(x, "coolingFactor", js.undefined)
    
    inline def setEdgeElasticity(value: /* edge */ Any => Double): Self = StObject.set(x, "edgeElasticity", js.Any.fromFunction1(value))
    
    inline def setEdgeElasticityUndefined: Self = StObject.set(x, "edgeElasticity", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setIdealEdgeLength(value: /* edge */ Any => Double): Self = StObject.set(x, "idealEdgeLength", js.Any.fromFunction1(value))
    
    inline def setIdealEdgeLengthUndefined: Self = StObject.set(x, "idealEdgeLength", js.undefined)
    
    inline def setInitialTemp(value: Double): Self = StObject.set(x, "initialTemp", value.asInstanceOf[js.Any])
    
    inline def setInitialTempUndefined: Self = StObject.set(x, "initialTemp", js.undefined)
    
    inline def setMinTemp(value: Double): Self = StObject.set(x, "minTemp", value.asInstanceOf[js.Any])
    
    inline def setMinTempUndefined: Self = StObject.set(x, "minTemp", js.undefined)
    
    inline def setName(value: cose): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNestingFactor(value: Double): Self = StObject.set(x, "nestingFactor", value.asInstanceOf[js.Any])
    
    inline def setNestingFactorUndefined: Self = StObject.set(x, "nestingFactor", js.undefined)
    
    inline def setNodeOverlap(value: Double): Self = StObject.set(x, "nodeOverlap", value.asInstanceOf[js.Any])
    
    inline def setNodeOverlapUndefined: Self = StObject.set(x, "nodeOverlap", js.undefined)
    
    inline def setNodeRepulsion(value: /* node */ Any => Double): Self = StObject.set(x, "nodeRepulsion", js.Any.fromFunction1(value))
    
    inline def setNodeRepulsionUndefined: Self = StObject.set(x, "nodeRepulsion", js.undefined)
    
    inline def setNumIter(value: Double): Self = StObject.set(x, "numIter", value.asInstanceOf[js.Any])
    
    inline def setNumIterUndefined: Self = StObject.set(x, "numIter", js.undefined)
    
    inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
    
    inline def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setWeaver(value: Boolean): Self = StObject.set(x, "weaver", value.asInstanceOf[js.Any])
    
    inline def setWeaverUndefined: Self = StObject.set(x, "weaver", js.undefined)
  }
}
