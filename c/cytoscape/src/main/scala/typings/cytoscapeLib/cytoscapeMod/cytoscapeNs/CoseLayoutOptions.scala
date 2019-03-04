package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/cose
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.LayoutOptions because Already inherited */ trait CoseLayoutOptions extends ShapedLayoutOptions {
  // Extra spacing between components in non-compound graphs
  var componentSpacing: scala.Double
  // Cooling factor (how the temperature is reduced between consecutive iterations
  var coolingFactor: scala.Double
  // Gravity force (constant)
  var gravity: scala.Double
  // Initial temperature (maximum node displacement)
  var initialTemp: scala.Double
  // Lower temperature threshold (below this point the layout will end)
  var minTemp: scala.Double
  @JSName("name")
  var name_CoseLayoutOptions: cytoscapeLib.cytoscapeLibStrings.cose
  // Nesting factor (multiplier) to compute ideal edge length for nested edges
  var nestingFactor: scala.Double
  // Node repulsion (overlapping) multiplier
  var nodeOverlap: scala.Double
  // Maximum number of iterations to perform
  var numIter: scala.Double
  // Randomize the initial positions of the nodes (true) or use existing positions (false)
  var randomize: scala.Boolean
  // Number of iterations between consecutive screen positions update
  // (0 -> only updated on the end)
  var refresh: scala.Double
  // Pass a reference to weaver to use threads for calculations
  var weaver: scala.Boolean
  // Divisor to compute edge forces
  def edgeElasticity(edge: js.Any): scala.Double
  // Ideal edge (non nested) length
  def idealEdgeLength(edge: js.Any): scala.Double
  // Node repulsion (non overlapping) multiplier
  def nodeRepulsion(node: js.Any): scala.Double
}

object CoseLayoutOptions {
  @scala.inline
  def apply(
    componentSpacing: scala.Double,
    coolingFactor: scala.Double,
    edgeElasticity: js.Function1[js.Any, scala.Double],
    fit: scala.Boolean,
    gravity: scala.Double,
    idealEdgeLength: js.Function1[js.Any, scala.Double],
    initialTemp: scala.Double,
    minTemp: scala.Double,
    name: cytoscapeLib.cytoscapeLibStrings.cose,
    nestingFactor: scala.Double,
    nodeDimensionsIncludeLabels: scala.Boolean,
    nodeOverlap: scala.Double,
    nodeRepulsion: js.Function1[js.Any, scala.Double],
    numIter: scala.Double,
    randomize: scala.Boolean,
    refresh: scala.Double,
    weaver: scala.Boolean,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: js.UndefOr[scala.Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: scala.Int | scala.Double = null,
    ready: LayoutHandler = null,
    sort: SortingFunction = null,
    spacingFactor: scala.Int | scala.Double = null,
    stop: LayoutHandler = null
  ): CoseLayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing, coolingFactor = coolingFactor, edgeElasticity = edgeElasticity, fit = fit, gravity = gravity, idealEdgeLength = idealEdgeLength, initialTemp = initialTemp, minTemp = minTemp, name = name, nestingFactor = nestingFactor, nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels, nodeOverlap = nodeOverlap, nodeRepulsion = nodeRepulsion, numIter = numIter, randomize = randomize, refresh = refresh, weaver = weaver)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap)
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[CoseLayoutOptions]
  }
}

