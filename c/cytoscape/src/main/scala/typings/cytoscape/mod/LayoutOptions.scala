package typings.cytoscape.mod

import typings.cytoscape.AnonCol
import typings.cytoscape.AnonDegree
import typings.cytoscape.AnonMaxDegree
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait LayoutOptions extends js.Object

object LayoutOptions {
  @scala.inline
  def CircleLayoutOptions(
    fit: Boolean,
    name: circle,
    nodeDimensionsIncludeLabels: Boolean,
    startAngle: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    clockwise: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    radius: Int | Double = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Unit = null,
    sweep: Int | Double = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (sweep != null) __obj.updateDynamic("sweep")(sweep.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def ConcentricLayoutOptions(
    concentric: AnonDegree => Double,
    equidistant: `false`,
    fit: Boolean,
    levelWidth: AnonMaxDegree => Double,
    minNodeSpacing: `10`,
    name: concentric,
    nodeDimensionsIncludeLabels: Boolean,
    startAngle: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    clockwise: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[scala.Nothing] = js.undefined,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: js.UndefOr[scala.Nothing] = js.undefined,
    stop: /* e */ LayoutEventObject => Unit = null,
    sweep: Int | Double = null,
    width: js.UndefOr[scala.Nothing] = js.undefined
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = equidistant.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = minNodeSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(spacingFactor)) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (sweep != null) __obj.updateDynamic("sweep")(sweep.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def NullLayoutOptions(name: `null`): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def BaseLayoutOptions(
    name: String,
    ready: /* e */ LayoutEventObject => Unit = null,
    stop: /* e */ LayoutEventObject => Unit = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def PresetLayoutOptions(
    name: preset,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    fit: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    pan: Int | Double = null,
    positions: NodePositionMap | NodePositionFunction = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    stop: /* e */ LayoutEventObject => Unit = null,
    zoom: Int | Double = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
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
    weaver: Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Unit = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing.asInstanceOf[js.Any], coolingFactor = coolingFactor.asInstanceOf[js.Any], edgeElasticity = js.Any.fromFunction1(edgeElasticity), fit = fit.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], idealEdgeLength = js.Any.fromFunction1(idealEdgeLength), initialTemp = initialTemp.asInstanceOf[js.Any], minTemp = minTemp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestingFactor = nestingFactor.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], nodeOverlap = nodeOverlap.asInstanceOf[js.Any], nodeRepulsion = js.Any.fromFunction1(nodeRepulsion), numIter = numIter.asInstanceOf[js.Any], randomize = randomize.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], weaver = weaver.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def RandomLayoutOptions(
    fit: Boolean,
    name: random,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    stop: /* e */ LayoutEventObject => Unit = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def BreadthFirstLayoutOptions(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    name: breadthfirst,
    nodeDimensionsIncludeLabels: Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    roots: String = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Unit = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], maximalAdjustments = maximalAdjustments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (roots != null) __obj.updateDynamic("roots")(roots.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def GridLayoutOptions(
    condense: Boolean,
    fit: Boolean,
    name: grid,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => AnonCol,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    avoidOverlapPadding: Int | Double = null,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    cols: Int | Double = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Unit = null,
    rows: Int | Double = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: Int | Double = null,
    stop: /* e */ LayoutEventObject => Unit = null
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], position = js.Any.fromFunction1(position))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.asInstanceOf[js.Any])
    if (avoidOverlapPadding != null) __obj.updateDynamic("avoidOverlapPadding")(avoidOverlapPadding.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[LayoutOptions]
  }
}

