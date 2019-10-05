package typings.cytoscape.cytoscapeMod

import typings.cytoscape.cytoscapeStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/circle
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.cytoscape.cytoscapeMod.LayoutOptions because Already inherited */ trait CircleLayoutOptions extends ShapedLayoutOptions {
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[Boolean] = js.undefined
  @JSName("name")
  var name_CircleLayoutOptions: circle
  // the radius of the circle
  var radius: js.UndefOr[Double] = js.undefined
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: Double
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.undefined
}

object CircleLayoutOptions {
  @scala.inline
  def apply(
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
  ): CircleLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit, name = name, nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels, startAngle = startAngle)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing)
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap)
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (sweep != null) __obj.updateDynamic("sweep")(sweep.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLayoutOptions]
  }
}

