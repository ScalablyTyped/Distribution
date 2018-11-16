package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGroundOverlayOptions extends ICustomOverlayOptions {
  /** A background color that fills the bounding box area beneath the ground overlay. */
  var backgroundColor: js.UndefOr[java.lang.String | Color] = js.undefined
  /** The bounding box to anchor the ground overlay to. This is required when creating a ground overlay. */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  /** The URL to the image to anchor to the map as a ground overlay. This is required when creating a ground overlay. */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The opacity of the ground overlay image. */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** An angle in degrees to rotate the overlay in a counter-clockwise direction where 0 = north, 90 = west, 180 = south, 270 = east */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /** A boolean value indicating if the ground overlay is visible or not. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

