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
  
  // Extra spacing between components in non-compound graphs
  var componentSpacing: Double
  
  // Cooling factor (how the temperature is reduced between consecutive iterations
  var coolingFactor: Double
  
  // Divisor to compute edge forces
  def edgeElasticity(edge: js.Any): Double
  
  // Gravity force (constant)
  var gravity: Double
  
  // Ideal edge (non nested) length
  def idealEdgeLength(edge: js.Any): Double
  
  // Initial temperature (maximum node displacement)
  var initialTemp: Double
  
  // Lower temperature threshold (below this point the layout will end)
  var minTemp: Double
  
  @JSName("name")
  var name_CoseLayoutOptions: cose
  
  // Nesting factor (multiplier) to compute ideal edge length for nested edges
  var nestingFactor: Double
  
  // Node repulsion (overlapping) multiplier
  var nodeOverlap: Double
  
  // Node repulsion (non overlapping) multiplier
  def nodeRepulsion(node: js.Any): Double
  
  // Maximum number of iterations to perform
  var numIter: Double
  
  // Randomize the initial positions of the nodes (true) or use existing positions (false)
  var randomize: Boolean
  
  // Number of iterations between consecutive screen positions update
  // (0 -> only updated on the end)
  var refresh: Double
  
  // Pass a reference to weaver to use threads for calculations
  var weaver: Boolean
}
object CoseLayoutOptions {
  
  inline def apply(
    componentSpacing: Double,
    coolingFactor: Double,
    edgeElasticity: js.Any => Double,
    fit: Boolean,
    gravity: Double,
    idealEdgeLength: js.Any => Double,
    initialTemp: Double,
    minTemp: Double,
    nestingFactor: Double,
    nodeDimensionsIncludeLabels: Boolean,
    nodeOverlap: Double,
    nodeRepulsion: js.Any => Double,
    numIter: Double,
    randomize: Boolean,
    refresh: Double,
    weaver: Boolean
  ): CoseLayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing.asInstanceOf[js.Any], coolingFactor = coolingFactor.asInstanceOf[js.Any], edgeElasticity = js.Any.fromFunction1(edgeElasticity), fit = fit.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], idealEdgeLength = js.Any.fromFunction1(idealEdgeLength), initialTemp = initialTemp.asInstanceOf[js.Any], minTemp = minTemp.asInstanceOf[js.Any], name = "cose", nestingFactor = nestingFactor.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], nodeOverlap = nodeOverlap.asInstanceOf[js.Any], nodeRepulsion = js.Any.fromFunction1(nodeRepulsion), numIter = numIter.asInstanceOf[js.Any], randomize = randomize.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], weaver = weaver.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoseLayoutOptions]
  }
  
  extension [Self <: CoseLayoutOptions](x: Self) {
    
    inline def setComponentSpacing(value: Double): Self = StObject.set(x, "componentSpacing", value.asInstanceOf[js.Any])
    
    inline def setCoolingFactor(value: Double): Self = StObject.set(x, "coolingFactor", value.asInstanceOf[js.Any])
    
    inline def setEdgeElasticity(value: js.Any => Double): Self = StObject.set(x, "edgeElasticity", js.Any.fromFunction1(value))
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setIdealEdgeLength(value: js.Any => Double): Self = StObject.set(x, "idealEdgeLength", js.Any.fromFunction1(value))
    
    inline def setInitialTemp(value: Double): Self = StObject.set(x, "initialTemp", value.asInstanceOf[js.Any])
    
    inline def setMinTemp(value: Double): Self = StObject.set(x, "minTemp", value.asInstanceOf[js.Any])
    
    inline def setName(value: cose): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNestingFactor(value: Double): Self = StObject.set(x, "nestingFactor", value.asInstanceOf[js.Any])
    
    inline def setNodeOverlap(value: Double): Self = StObject.set(x, "nodeOverlap", value.asInstanceOf[js.Any])
    
    inline def setNodeRepulsion(value: js.Any => Double): Self = StObject.set(x, "nodeRepulsion", js.Any.fromFunction1(value))
    
    inline def setNumIter(value: Double): Self = StObject.set(x, "numIter", value.asInstanceOf[js.Any])
    
    inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setWeaver(value: Boolean): Self = StObject.set(x, "weaver", value.asInstanceOf[js.Any])
  }
}
