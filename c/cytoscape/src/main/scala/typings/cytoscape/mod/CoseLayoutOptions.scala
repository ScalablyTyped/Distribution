package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.cose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/cose
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait CoseLayoutOptions extends ShapedLayoutOptions {
  // Extra spacing between components in non-compound graphs
  var componentSpacing: Double
  // Cooling factor (how the temperature is reduced between consecutive iterations
  var coolingFactor: Double
  // Gravity force (constant)
  var gravity: Double
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
  // Maximum number of iterations to perform
  var numIter: Double
  // Randomize the initial positions of the nodes (true) or use existing positions (false)
  var randomize: Boolean
  // Number of iterations between consecutive screen positions update
  // (0 -> only updated on the end)
  var refresh: Double
  // Pass a reference to weaver to use threads for calculations
  var weaver: Boolean
  // Divisor to compute edge forces
  def edgeElasticity(edge: js.Any): Double
  // Ideal edge (non nested) length
  def idealEdgeLength(edge: js.Any): Double
  // Node repulsion (non overlapping) multiplier
  def nodeRepulsion(node: js.Any): Double
}

object CoseLayoutOptions {
  @scala.inline
  def apply(
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
    weaver: Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: js.UndefOr[Double] = js.undefined,
    ready: /* e */ LayoutEventObject => Unit = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: js.UndefOr[Double] = js.undefined,
    stop: /* e */ LayoutEventObject => Unit = null
  ): CoseLayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing.asInstanceOf[js.Any], coolingFactor = coolingFactor.asInstanceOf[js.Any], edgeElasticity = js.Any.fromFunction1(edgeElasticity), fit = fit.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], idealEdgeLength = js.Any.fromFunction1(idealEdgeLength), initialTemp = initialTemp.asInstanceOf[js.Any], minTemp = minTemp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestingFactor = nestingFactor.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], nodeOverlap = nodeOverlap.asInstanceOf[js.Any], nodeRepulsion = js.Any.fromFunction1(nodeRepulsion), numIter = numIter.asInstanceOf[js.Any], randomize = randomize.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], weaver = weaver.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.get.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(spacingFactor)) __obj.updateDynamic("spacingFactor")(spacingFactor.get.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[CoseLayoutOptions]
  }
}

