package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapedLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // prevents node overlap, may overflow boundingBox if not enough space
  var avoidOverlap: js.UndefOr[Boolean] = js.native
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH] = js.native
  // whether to fit to viewport
  var fit: Boolean = js.native
  // Excludes the label when calculating node bounding boxes for the layout algorithm
  var nodeDimensionsIncludeLabels: Boolean = js.native
  // padding used on fit
  var padding: js.UndefOr[Double] = js.native
  // a sorting function to order the nodes
  var sort: js.UndefOr[SortingFunction] = js.native
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  var spacingFactor: js.UndefOr[Double] = js.native
}

object ShapedLayoutOptions {
  @scala.inline
  def apply(fit: Boolean, name: String, nodeDimensionsIncludeLabels: Boolean): ShapedLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapedLayoutOptions]
  }
  @scala.inline
  implicit class ShapedLayoutOptionsOps[Self <: ShapedLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeDimensionsIncludeLabels(value: Boolean): Self = this.set("nodeDimensionsIncludeLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvoidOverlap(value: Boolean): Self = this.set("avoidOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidOverlap: Self = this.set("avoidOverlap", js.undefined)
    @scala.inline
    def setBoundingBox(value: BoundingBox12 | BoundingBoxWH): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingBox: Self = this.set("boundingBox", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSort(value: (/* a */ SortableNode, /* b */ SortableNode) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSpacingFactor(value: Double): Self = this.set("spacingFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacingFactor: Self = this.set("spacingFactor", js.undefined)
  }
  
}

