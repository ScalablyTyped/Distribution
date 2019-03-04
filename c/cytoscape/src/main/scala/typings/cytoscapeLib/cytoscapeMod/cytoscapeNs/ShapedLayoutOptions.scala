package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapedLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // prevents node overlap, may overflow boundingBox if not enough space
  var avoidOverlap: js.UndefOr[scala.Boolean] = js.undefined
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH] = js.undefined
  // whether to fit to viewport
  var fit: scala.Boolean
  // Excludes the label when calculating node bounding boxes for the layout algorithm
  var nodeDimensionsIncludeLabels: scala.Boolean
  // padding used on fit
  var padding: js.UndefOr[scala.Double] = js.undefined
  // a sorting function to order the nodes
  var sort: js.UndefOr[SortingFunction] = js.undefined
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  var spacingFactor: js.UndefOr[scala.Double] = js.undefined
}

object ShapedLayoutOptions {
  @scala.inline
  def apply(
    fit: scala.Boolean,
    name: java.lang.String,
    nodeDimensionsIncludeLabels: scala.Boolean,
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
  ): ShapedLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit, name = name, nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels)
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
    __obj.asInstanceOf[ShapedLayoutOptions]
  }
}

