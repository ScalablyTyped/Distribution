package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroundOverlayOptions extends ICustomOverlayOptions {
  /** A background color that fills the bounding box area beneath the ground overlay. */
  var backgroundColor: js.UndefOr[String | Color] = js.undefined
  /** The bounding box to anchor the ground overlay to. This is required when creating a ground overlay. */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  /** The URL to the image to anchor to the map as a ground overlay. This is required when creating a ground overlay. */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** The opacity of the ground overlay image. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** An angle in degrees to rotate the overlay in a counter-clockwise direction where 0 = north, 90 = west, 180 = south, 270 = east */
  var rotation: js.UndefOr[Double] = js.undefined
  /** A boolean value indicating if the ground overlay is visible or not. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IGroundOverlayOptions {
  @scala.inline
  def apply(
    backgroundColor: String | Color = null,
    beneathLabels: js.UndefOr[Boolean] = js.undefined,
    bounds: LocationRect = null,
    imageUrl: String = null,
    opacity: Int | Double = null,
    rotation: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IGroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(beneathLabels)) __obj.updateDynamic("beneathLabels")(beneathLabels)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IGroundOverlayOptions]
  }
}

