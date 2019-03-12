package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/concentric
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.LayoutOptions because Already inherited */ trait ConcentricLayoutOptions extends ShapedLayoutOptions {
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[scala.Boolean] = js.undefined
  // whether levels have an equal radial distance betwen them, may cause bounding box overflow
  var equidistant: cytoscapeLib.cytoscapeLibNumbers.`false`
   // min spacing between outside of nodes (used for radius adjustment)
  // height of layout area (overrides container height)
  var height: js.UndefOr[scala.Nothing]
  var minNodeSpacing: cytoscapeLib.cytoscapeLibNumbers.`10`
  @JSName("name")
  var name_ConcentricLayoutOptions: cytoscapeLib.cytoscapeLibStrings.concentric
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  @JSName("spacingFactor")
  var spacingFactor_ConcentricLayoutOptions: js.UndefOr[scala.Nothing]
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: scala.Double
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[scala.Double] = js.undefined
  // width of layout area (overrides container width)
  var width: js.UndefOr[scala.Nothing]
  // returns numeric value for each node, placing higher nodes in levels towards the centre
  def concentric(node: cytoscapeLib.Anon_Degree): scala.Double
  // the variation of concentric values in each level
  def levelWidth(node: cytoscapeLib.Anon_MaxDegree): scala.Double
}

object ConcentricLayoutOptions {
  @scala.inline
  def apply(
    concentric: cytoscapeLib.Anon_Degree => scala.Double,
    equidistant: cytoscapeLib.cytoscapeLibNumbers.`false`,
    fit: scala.Boolean,
    levelWidth: cytoscapeLib.Anon_MaxDegree => scala.Double,
    minNodeSpacing: cytoscapeLib.cytoscapeLibNumbers.`10`,
    name: cytoscapeLib.cytoscapeLibStrings.concentric,
    nodeDimensionsIncludeLabels: scala.Boolean,
    startAngle: scala.Double,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: js.UndefOr[scala.Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    clockwise: js.UndefOr[scala.Boolean] = js.undefined,
    height: js.UndefOr[scala.Nothing] = js.undefined,
    padding: scala.Int | scala.Double = null,
    ready: LayoutHandler = null,
    sort: SortingFunction = null,
    spacingFactor: js.UndefOr[scala.Nothing] = js.undefined,
    stop: LayoutHandler = null,
    sweep: scala.Int | scala.Double = null,
    width: js.UndefOr[scala.Nothing] = js.undefined
  ): ConcentricLayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = equidistant, fit = fit, levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = minNodeSpacing, name = name, nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels, startAngle = startAngle)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap)
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(spacingFactor)) __obj.updateDynamic("spacingFactor")(spacingFactor)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (sweep != null) __obj.updateDynamic("sweep")(sweep.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ConcentricLayoutOptions]
  }
}

