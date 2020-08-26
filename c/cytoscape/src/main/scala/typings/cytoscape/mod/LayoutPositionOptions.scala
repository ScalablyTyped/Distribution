package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
@js.native
trait LayoutPositionOptions extends js.Object {
  // whether to animate changes to the layout
  var animate: js.UndefOr[Boolean] = js.native
  // duration of animation in ms, if enabled
  var animationDuration: js.UndefOr[Double] = js.native
  // easing of animation, if enabled
  var animationEasing: js.UndefOr[Double] = js.native
  // collection of elements involved in the layout; set by cy.layout() or eles.layout(s)
  var eles: CollectionArgument = js.native
  // whether to fit the viewport to the graph
  var fit: js.UndefOr[Boolean] = js.native
  // padding to leave between graph and viewport
  var padding: js.UndefOr[Double] = js.native
  // pan the graph to the provided position, given as { x, y }
  var pan: js.UndefOr[Position] = js.native
  // callback for the layoutready event
  var ready: js.UndefOr[scala.Nothing] = js.native
  // a positive value which adjusts spacing between nodes (>1 means greater than usual spacing)
  var spacingFactor: js.UndefOr[Double] = js.native
  // callback for the layoutstop event
  var stop: js.UndefOr[scala.Nothing] = js.native
  // zoom level as a positive number to set after animation
  var zoom: js.UndefOr[Double] = js.native
}

object LayoutPositionOptions {
  @scala.inline
  def apply(eles: CollectionArgument): LayoutPositionOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutPositionOptions]
  }
  @scala.inline
  implicit class LayoutPositionOptionsOps[Self <: LayoutPositionOptions] (val x: Self) extends AnyVal {
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
    def setEles(value: CollectionArgument): Self = this.set("eles", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationEasing(value: Double): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPan(value: Position): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    @scala.inline
    def setSpacingFactor(value: Double): Self = this.set("spacingFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacingFactor: Self = this.set("spacingFactor", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

