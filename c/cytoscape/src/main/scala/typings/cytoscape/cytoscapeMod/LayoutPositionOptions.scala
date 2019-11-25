package typings.cytoscape.cytoscapeMod

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
    animationDuration: Int | Double = null,
    animationEasing: Int | Double = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    padding: Int | Double = null,
    pan: Position = null,
    ready: js.UndefOr[scala.Nothing] = js.undefined,
    spacingFactor: Int | Double = null,
    stop: js.UndefOr[scala.Nothing] = js.undefined,
    zoom: Int | Double = null
  ): LayoutPositionOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    if (spacingFactor != null) __obj.updateDynamic("spacingFactor")(spacingFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(stop)) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutPositionOptions]
  }
}

