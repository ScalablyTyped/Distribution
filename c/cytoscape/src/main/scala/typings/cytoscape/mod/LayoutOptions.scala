package typings.cytoscape.mod

import typings.cytoscape.anon.Col
import typings.cytoscape.anon.Degree
import typings.cytoscape.anon.MaxDegree
import typings.cytoscape.cytoscapeBooleans.`false`
import typings.cytoscape.cytoscapeNumbers.`10`
import typings.cytoscape.cytoscapeStrings.`null`
import typings.cytoscape.cytoscapeStrings.breadthfirst
import typings.cytoscape.cytoscapeStrings.circle
import typings.cytoscape.cytoscapeStrings.concentric
import typings.cytoscape.cytoscapeStrings.cose
import typings.cytoscape.cytoscapeStrings.grid
import typings.cytoscape.cytoscapeStrings.preset
import typings.cytoscape.cytoscapeStrings.random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def BaseLayoutOptions(name: String): typings.cytoscape.mod.BaseLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.BaseLayoutOptions]
  }
  
  @scala.inline
  def BreadthFirstLayoutOptions(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    name: breadthfirst,
    nodeDimensionsIncludeLabels: Boolean
  ): typings.cytoscape.mod.BreadthFirstLayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], maximalAdjustments = maximalAdjustments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.BreadthFirstLayoutOptions]
  }
  
  @scala.inline
  def CircleLayoutOptions(fit: Boolean, name: circle, nodeDimensionsIncludeLabels: Boolean, startAngle: Double): typings.cytoscape.mod.CircleLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.CircleLayoutOptions]
  }
  
  @scala.inline
  def ConcentricLayoutOptions(
    concentric: Degree => Double,
    equidistant: `false`,
    fit: Boolean,
    levelWidth: MaxDegree => Double,
    minNodeSpacing: `10`,
    name: concentric,
    nodeDimensionsIncludeLabels: Boolean,
    startAngle: Double
  ): typings.cytoscape.mod.ConcentricLayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = equidistant.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = minNodeSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.ConcentricLayoutOptions]
  }
  
  @scala.inline
  def CoseLayoutOptions(
    componentSpacing: Double,
    coolingFactor: Double,
    edgeElasticity: js.Any => Double,
    fit: Boolean,
    gravity: Double,
    idealEdgeLength: js.Any => Double,
    initialTemp: Double,
    minTemp: Double,
    name: cose,
    nestingFactor: Double,
    nodeDimensionsIncludeLabels: Boolean,
    nodeOverlap: Double,
    nodeRepulsion: js.Any => Double,
    numIter: Double,
    randomize: Boolean,
    refresh: Double,
    weaver: Boolean
  ): typings.cytoscape.mod.CoseLayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing.asInstanceOf[js.Any], coolingFactor = coolingFactor.asInstanceOf[js.Any], edgeElasticity = js.Any.fromFunction1(edgeElasticity), fit = fit.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], idealEdgeLength = js.Any.fromFunction1(idealEdgeLength), initialTemp = initialTemp.asInstanceOf[js.Any], minTemp = minTemp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestingFactor = nestingFactor.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], nodeOverlap = nodeOverlap.asInstanceOf[js.Any], nodeRepulsion = js.Any.fromFunction1(nodeRepulsion), numIter = numIter.asInstanceOf[js.Any], randomize = randomize.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], weaver = weaver.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.CoseLayoutOptions]
  }
  
  @scala.inline
  def GridLayoutOptions(
    condense: Boolean,
    fit: Boolean,
    name: grid,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => Col
  ): typings.cytoscape.mod.GridLayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], position = js.Any.fromFunction1(position))
    __obj.asInstanceOf[typings.cytoscape.mod.GridLayoutOptions]
  }
  
  @scala.inline
  def NullLayoutOptions(name: `null`): typings.cytoscape.mod.NullLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.NullLayoutOptions]
  }
  
  @scala.inline
  def PresetLayoutOptions(name: preset): typings.cytoscape.mod.PresetLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.PresetLayoutOptions]
  }
  
  @scala.inline
  def RandomLayoutOptions(fit: Boolean, name: random): typings.cytoscape.mod.RandomLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cytoscape.mod.RandomLayoutOptions]
  }
}
