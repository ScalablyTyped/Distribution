package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/circle
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.LayoutOptions because Already inherited */ trait CircleLayoutOptions extends ShapedLayoutOptions {
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("name")
  var name_CircleLayoutOptions: cytoscapeLib.cytoscapeLibStrings.circle
  // the radius of the circle
  var radius: js.UndefOr[scala.Double] = js.undefined
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: scala.Double
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[scala.Double] = js.undefined
}

object CircleLayoutOptions {
  @scala.inline
  def apply(
    fit: scala.Boolean,
    name: cytoscapeLib.cytoscapeLibStrings.circle,
    nodeDimensionsIncludeLabels: scala.Boolean,
    startAngle: scala.Double,
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: js.UndefOr[scala.Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    clockwise: js.UndefOr[scala.Boolean] = js.undefined,
    padding: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    ready: LayoutHandler = null,
    sort: SortingFunction = null,
    spacingFactor: scala.Int | scala.Double = null,
    stop: LayoutHandler = null,
    sweep: scala.Int | scala.Double = null
  ): CircleLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fit")(fit)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nodeDimensionsIncludeLabels")(nodeDimensionsIncludeLabels)
    __obj.updateDynamic("startAngle")(startAngle)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap)
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (sweep != null) __obj.updateDynamic("sweep")(sweep.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLayoutOptions]
  }
}

