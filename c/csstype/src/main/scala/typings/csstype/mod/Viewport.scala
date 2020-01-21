package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport[TLength] extends js.Object {
  var OOrientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  var height: js.UndefOr[ViewportHeightProperty[TLength]] = js.undefined
  var maxHeight: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.undefined
  var maxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.undefined
  var maxZoom: js.UndefOr[ViewportMaxZoomProperty] = js.undefined
  var minHeight: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.undefined
  var minWidth: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.undefined
  var minZoom: js.UndefOr[ViewportMinZoomProperty] = js.undefined
  var msHeight: js.UndefOr[ViewportHeightProperty[TLength]] = js.undefined
  var msMaxHeight: js.UndefOr[ViewportMaxHeightProperty[TLength]] = js.undefined
  var msMaxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength]] = js.undefined
  var msMaxZoom: js.UndefOr[ViewportMaxZoomProperty] = js.undefined
  var msMinHeight: js.UndefOr[ViewportMinHeightProperty[TLength]] = js.undefined
  var msMinWidth: js.UndefOr[ViewportMinWidthProperty[TLength]] = js.undefined
  var msMinZoom: js.UndefOr[ViewportMinZoomProperty] = js.undefined
  var msOrientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  var msUserZoom: js.UndefOr[ViewportUserZoomProperty] = js.undefined
  var msWidth: js.UndefOr[ViewportWidthProperty[TLength]] = js.undefined
  var msZoom: js.UndefOr[ViewportZoomProperty] = js.undefined
  var orientation: js.UndefOr[ViewportOrientationProperty] = js.undefined
  var userZoom: js.UndefOr[ViewportUserZoomProperty] = js.undefined
  var width: js.UndefOr[ViewportWidthProperty[TLength]] = js.undefined
  var zoom: js.UndefOr[ViewportZoomProperty] = js.undefined
}

object Viewport {
  @scala.inline
  def apply[TLength](
    OOrientation: ViewportOrientationProperty = null,
    height: ViewportHeightProperty[TLength] = null,
    maxHeight: ViewportMaxHeightProperty[TLength] = null,
    maxWidth: ViewportMaxWidthProperty[TLength] = null,
    maxZoom: ViewportMaxZoomProperty = null,
    minHeight: ViewportMinHeightProperty[TLength] = null,
    minWidth: ViewportMinWidthProperty[TLength] = null,
    minZoom: ViewportMinZoomProperty = null,
    msHeight: ViewportHeightProperty[TLength] = null,
    msMaxHeight: ViewportMaxHeightProperty[TLength] = null,
    msMaxWidth: ViewportMaxWidthProperty[TLength] = null,
    msMaxZoom: ViewportMaxZoomProperty = null,
    msMinHeight: ViewportMinHeightProperty[TLength] = null,
    msMinWidth: ViewportMinWidthProperty[TLength] = null,
    msMinZoom: ViewportMinZoomProperty = null,
    msOrientation: ViewportOrientationProperty = null,
    msUserZoom: ViewportUserZoomProperty = null,
    msWidth: ViewportWidthProperty[TLength] = null,
    msZoom: ViewportZoomProperty = null,
    orientation: ViewportOrientationProperty = null,
    userZoom: ViewportUserZoomProperty = null,
    width: ViewportWidthProperty[TLength] = null,
    zoom: ViewportZoomProperty = null
  ): Viewport[TLength] = {
    val __obj = js.Dynamic.literal()
    if (OOrientation != null) __obj.updateDynamic("OOrientation")(OOrientation.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (msHeight != null) __obj.updateDynamic("msHeight")(msHeight.asInstanceOf[js.Any])
    if (msMaxHeight != null) __obj.updateDynamic("msMaxHeight")(msMaxHeight.asInstanceOf[js.Any])
    if (msMaxWidth != null) __obj.updateDynamic("msMaxWidth")(msMaxWidth.asInstanceOf[js.Any])
    if (msMaxZoom != null) __obj.updateDynamic("msMaxZoom")(msMaxZoom.asInstanceOf[js.Any])
    if (msMinHeight != null) __obj.updateDynamic("msMinHeight")(msMinHeight.asInstanceOf[js.Any])
    if (msMinWidth != null) __obj.updateDynamic("msMinWidth")(msMinWidth.asInstanceOf[js.Any])
    if (msMinZoom != null) __obj.updateDynamic("msMinZoom")(msMinZoom.asInstanceOf[js.Any])
    if (msOrientation != null) __obj.updateDynamic("msOrientation")(msOrientation.asInstanceOf[js.Any])
    if (msUserZoom != null) __obj.updateDynamic("msUserZoom")(msUserZoom.asInstanceOf[js.Any])
    if (msWidth != null) __obj.updateDynamic("msWidth")(msWidth.asInstanceOf[js.Any])
    if (msZoom != null) __obj.updateDynamic("msZoom")(msZoom.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (userZoom != null) __obj.updateDynamic("userZoom")(userZoom.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport[TLength]]
  }
}

