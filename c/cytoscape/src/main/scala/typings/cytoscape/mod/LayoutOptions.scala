package typings.cytoscape.mod

import typings.cytoscape.anon.Col
import typings.cytoscape.anon.Degree
import typings.cytoscape.anon.MaxDegree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.mod.NullLayoutOptions
  - typings.cytoscape.mod.RandomLayoutOptions
  - typings.cytoscape.mod.PresetLayoutOptions
  - typings.cytoscape.mod.GridLayoutOptions
  - typings.cytoscape.mod.CircleLayoutOptions
  - typings.cytoscape.mod.ConcentricLayoutOptions
  - typings.cytoscape.mod.BreadthFirstLayoutOptions
  - typings.cytoscape.mod.CoseLayoutOptions
  - typings.cytoscape.mod.BaseLayoutOptions
*/
trait LayoutOptions extends StObject
object LayoutOptions {
  
  inline def BaseLayoutOptions(name: String): typings.cytoscape.mod.BaseLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.BaseLayoutOptions]
  }
  
  inline def BreadthFirstLayoutOptions(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    nodeDimensionsIncludeLabels: Boolean
  ): typings.cytoscape.mod.BreadthFirstLayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], maximalAdjustments = maximalAdjustments.asInstanceOf[js.Any], name = "breadthfirst", nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.BreadthFirstLayoutOptions]
  }
  
  inline def CircleLayoutOptions(fit: Boolean, nodeDimensionsIncludeLabels: Boolean, startAngle: Double): typings.cytoscape.mod.CircleLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = "circle", nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.CircleLayoutOptions]
  }
  
  inline def ConcentricLayoutOptions(
    concentric: Degree => Double,
    fit: Boolean,
    height: Unit,
    levelWidth: MaxDegree => Double,
    nodeDimensionsIncludeLabels: Boolean,
    spacingFactor: Unit,
    startAngle: Double,
    width: Unit
  ): typings.cytoscape.mod.ConcentricLayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = false, fit = fit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = 10, name = "concentric", nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], spacingFactor = spacingFactor.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.ConcentricLayoutOptions]
  }
  
  inline def CoseLayoutOptions(
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
  ): typings.cytoscape.mod.CoseLayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing.asInstanceOf[js.Any], coolingFactor = coolingFactor.asInstanceOf[js.Any], edgeElasticity = js.Any.fromFunction1(edgeElasticity), fit = fit.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], idealEdgeLength = js.Any.fromFunction1(idealEdgeLength), initialTemp = initialTemp.asInstanceOf[js.Any], minTemp = minTemp.asInstanceOf[js.Any], name = "cose", nestingFactor = nestingFactor.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], nodeOverlap = nodeOverlap.asInstanceOf[js.Any], nodeRepulsion = js.Any.fromFunction1(nodeRepulsion), numIter = numIter.asInstanceOf[js.Any], randomize = randomize.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], weaver = weaver.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.CoseLayoutOptions]
  }
  
  inline def GridLayoutOptions(
    condense: Boolean,
    fit: Boolean,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => Col
  ): typings.cytoscape.mod.GridLayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = "grid", nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], position = js.Any.fromFunction1(position))
    __obj.asInstanceOf[typings.cytoscape.mod.GridLayoutOptions]
  }
  
  inline def NullLayoutOptions(): typings.cytoscape.mod.NullLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "null")
    __obj.asInstanceOf[typings.cytoscape.mod.NullLayoutOptions]
  }
  
  inline def PresetLayoutOptions(): typings.cytoscape.mod.PresetLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "preset")
    __obj.asInstanceOf[typings.cytoscape.mod.PresetLayoutOptions]
  }
  
  inline def RandomLayoutOptions(fit: Boolean): typings.cytoscape.mod.RandomLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = "random")
    __obj.asInstanceOf[typings.cytoscape.mod.RandomLayoutOptions]
  }
}
