package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportHyphen[TLength] extends js.Object {
  var `-ms-height`: js.UndefOr[csstypeLib.ViewportHeightProperty[TLength]] = js.undefined
  var `-ms-max-height`: js.UndefOr[csstypeLib.ViewportMaxHeightProperty[TLength]] = js.undefined
  var `-ms-max-width`: js.UndefOr[csstypeLib.ViewportMaxWidthProperty[TLength]] = js.undefined
  var `-ms-max-zoom`: js.UndefOr[csstypeLib.ViewportMaxZoomProperty] = js.undefined
  var `-ms-min-height`: js.UndefOr[csstypeLib.ViewportMinHeightProperty[TLength]] = js.undefined
  var `-ms-min-width`: js.UndefOr[csstypeLib.ViewportMinWidthProperty[TLength]] = js.undefined
  var `-ms-min-zoom`: js.UndefOr[csstypeLib.ViewportMinZoomProperty] = js.undefined
  var `-ms-orientation`: js.UndefOr[csstypeLib.ViewportOrientationProperty] = js.undefined
  var `-ms-user-zoom`: js.UndefOr[csstypeLib.ViewportUserZoomProperty] = js.undefined
  var `-ms-width`: js.UndefOr[csstypeLib.ViewportWidthProperty[TLength]] = js.undefined
  var `-ms-zoom`: js.UndefOr[csstypeLib.ViewportZoomProperty] = js.undefined
  var `-o-orientation`: js.UndefOr[csstypeLib.ViewportOrientationProperty] = js.undefined
  var height: js.UndefOr[csstypeLib.ViewportHeightProperty[TLength]] = js.undefined
  var `max-height`: js.UndefOr[csstypeLib.ViewportMaxHeightProperty[TLength]] = js.undefined
  var `max-width`: js.UndefOr[csstypeLib.ViewportMaxWidthProperty[TLength]] = js.undefined
  var `max-zoom`: js.UndefOr[csstypeLib.ViewportMaxZoomProperty] = js.undefined
  var `min-height`: js.UndefOr[csstypeLib.ViewportMinHeightProperty[TLength]] = js.undefined
  var `min-width`: js.UndefOr[csstypeLib.ViewportMinWidthProperty[TLength]] = js.undefined
  var `min-zoom`: js.UndefOr[csstypeLib.ViewportMinZoomProperty] = js.undefined
  var orientation: js.UndefOr[csstypeLib.ViewportOrientationProperty] = js.undefined
  var `user-zoom`: js.UndefOr[csstypeLib.ViewportUserZoomProperty] = js.undefined
  var width: js.UndefOr[csstypeLib.ViewportWidthProperty[TLength]] = js.undefined
  var zoom: js.UndefOr[csstypeLib.ViewportZoomProperty] = js.undefined
}

object ViewportHyphen {
  @scala.inline
  def apply[TLength](
    `-ms-height`: csstypeLib.ViewportHeightProperty[TLength] = null,
    `-ms-max-height`: csstypeLib.ViewportMaxHeightProperty[TLength] = null,
    `-ms-max-width`: csstypeLib.ViewportMaxWidthProperty[TLength] = null,
    `-ms-max-zoom`: csstypeLib.ViewportMaxZoomProperty = null,
    `-ms-min-height`: csstypeLib.ViewportMinHeightProperty[TLength] = null,
    `-ms-min-width`: csstypeLib.ViewportMinWidthProperty[TLength] = null,
    `-ms-min-zoom`: csstypeLib.ViewportMinZoomProperty = null,
    `-ms-orientation`: csstypeLib.ViewportOrientationProperty = null,
    `-ms-user-zoom`: csstypeLib.ViewportUserZoomProperty = null,
    `-ms-width`: csstypeLib.ViewportWidthProperty[TLength] = null,
    `-ms-zoom`: csstypeLib.ViewportZoomProperty = null,
    `-o-orientation`: csstypeLib.ViewportOrientationProperty = null,
    height: csstypeLib.ViewportHeightProperty[TLength] = null,
    `max-height`: csstypeLib.ViewportMaxHeightProperty[TLength] = null,
    `max-width`: csstypeLib.ViewportMaxWidthProperty[TLength] = null,
    `max-zoom`: csstypeLib.ViewportMaxZoomProperty = null,
    `min-height`: csstypeLib.ViewportMinHeightProperty[TLength] = null,
    `min-width`: csstypeLib.ViewportMinWidthProperty[TLength] = null,
    `min-zoom`: csstypeLib.ViewportMinZoomProperty = null,
    orientation: csstypeLib.ViewportOrientationProperty = null,
    `user-zoom`: csstypeLib.ViewportUserZoomProperty = null,
    width: csstypeLib.ViewportWidthProperty[TLength] = null,
    zoom: csstypeLib.ViewportZoomProperty = null
  ): ViewportHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    if (`-ms-height` != null) __obj.updateDynamic("-ms-height")(`-ms-height`.asInstanceOf[js.Any])
    if (`-ms-max-height` != null) __obj.updateDynamic("-ms-max-height")(`-ms-max-height`.asInstanceOf[js.Any])
    if (`-ms-max-width` != null) __obj.updateDynamic("-ms-max-width")(`-ms-max-width`.asInstanceOf[js.Any])
    if (`-ms-max-zoom` != null) __obj.updateDynamic("-ms-max-zoom")(`-ms-max-zoom`.asInstanceOf[js.Any])
    if (`-ms-min-height` != null) __obj.updateDynamic("-ms-min-height")(`-ms-min-height`.asInstanceOf[js.Any])
    if (`-ms-min-width` != null) __obj.updateDynamic("-ms-min-width")(`-ms-min-width`.asInstanceOf[js.Any])
    if (`-ms-min-zoom` != null) __obj.updateDynamic("-ms-min-zoom")(`-ms-min-zoom`.asInstanceOf[js.Any])
    if (`-ms-orientation` != null) __obj.updateDynamic("-ms-orientation")(`-ms-orientation`)
    if (`-ms-user-zoom` != null) __obj.updateDynamic("-ms-user-zoom")(`-ms-user-zoom`)
    if (`-ms-width` != null) __obj.updateDynamic("-ms-width")(`-ms-width`.asInstanceOf[js.Any])
    if (`-ms-zoom` != null) __obj.updateDynamic("-ms-zoom")(`-ms-zoom`.asInstanceOf[js.Any])
    if (`-o-orientation` != null) __obj.updateDynamic("-o-orientation")(`-o-orientation`)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`max-height` != null) __obj.updateDynamic("max-height")(`max-height`.asInstanceOf[js.Any])
    if (`max-width` != null) __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    if (`max-zoom` != null) __obj.updateDynamic("max-zoom")(`max-zoom`.asInstanceOf[js.Any])
    if (`min-height` != null) __obj.updateDynamic("min-height")(`min-height`.asInstanceOf[js.Any])
    if (`min-width` != null) __obj.updateDynamic("min-width")(`min-width`.asInstanceOf[js.Any])
    if (`min-zoom` != null) __obj.updateDynamic("min-zoom")(`min-zoom`.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (`user-zoom` != null) __obj.updateDynamic("user-zoom")(`user-zoom`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportHyphen[TLength]]
  }
}

