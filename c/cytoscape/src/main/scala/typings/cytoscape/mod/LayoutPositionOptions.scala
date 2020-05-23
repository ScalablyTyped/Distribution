package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait LayoutPositionOptions extends js.Object {
  // whether to animate changes to the layout
  var animate: js.UndefOr[Boolean] = js.undefined
  // duration of animation in ms, if enabled
  var animationDuration: js.UndefOr[Double] = js.undefined
  // easing of animation, if enabled
  var animationEasing: js.UndefOr[Double] = js.undefined
  // collection of elements involved in the layout; set by cy.layout() or eles.layout(s)
  var eles: CollectionArgument
  // whether to fit the viewport to the graph
  var fit: js.UndefOr[Boolean] = js.undefined
  // padding to leave between graph and viewport
  var padding: js.UndefOr[Double] = js.undefined
  // pan the graph to the provided position, given as { x, y }
  var pan: js.UndefOr[Position] = js.undefined
  // callback for the layoutready event
  var ready: js.UndefOr[scala.Nothing] = js.undefined
  // a positive value which adjusts spacing between nodes (>1 means greater than usual spacing)
  var spacingFactor: js.UndefOr[Double] = js.undefined
  // callback for the layoutstop event
  var stop: js.UndefOr[scala.Nothing] = js.undefined
  // zoom level as a positive number to set after animation
  var zoom: js.UndefOr[Double] = js.undefined
}

object LayoutPositionOptions {
  @scala.inline
  def apply(
    eles: CollectionArgument,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: js.UndefOr[Double] = js.undefined,
    fit: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    pan: Position = null,
    spacingFactor: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): LayoutPositionOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (!js.isUndefined(spacingFactor)) __obj.updateDynamic("spacingFactor")(spacingFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutPositionOptions]
  }
}

