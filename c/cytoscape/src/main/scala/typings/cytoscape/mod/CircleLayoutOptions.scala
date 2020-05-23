package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/circle
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait CircleLayoutOptions extends ShapedLayoutOptions {
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
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    clockwise: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    ready: /* e */ LayoutEventObject => Unit = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: js.UndefOr[Double] = js.undefined,
    stop: /* e */ LayoutEventObject => Unit = null,
    sweep: js.UndefOr[Double] = js.undefined
  ): CircleLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.get.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(spacingFactor)) __obj.updateDynamic("spacingFactor")(spacingFactor.get.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (!js.isUndefined(sweep)) __obj.updateDynamic("sweep")(sweep.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLayoutOptions]
  }
}

