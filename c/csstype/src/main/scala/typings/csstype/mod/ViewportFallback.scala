package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportFallback[TLength] extends js.Object {
  var OOrientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.undefined
  var height: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.undefined
  var maxHeight: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.undefined
  var maxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.undefined
  var maxZoom: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.undefined
  var minHeight: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.undefined
  var minWidth: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.undefined
  var minZoom: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.undefined
  var msHeight: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.undefined
  var msMaxHeight: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.undefined
  var msMaxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.undefined
  var msMaxZoom: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.undefined
  var msMinHeight: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.undefined
  var msMinWidth: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.undefined
  var msMinZoom: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.undefined
  var msOrientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.undefined
  var msUserZoom: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.undefined
  var msWidth: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.undefined
  var msZoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.undefined
  var orientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.undefined
  var userZoom: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.undefined
  var width: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.undefined
  var zoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.undefined
}

object ViewportFallback {
  @scala.inline
  def apply[TLength](
    OOrientation: ViewportOrientationProperty | js.Array[ViewportOrientationProperty] = null,
    height: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]] = null,
    maxHeight: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]] = null,
    maxWidth: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]] = null,
    maxZoom: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty] = null,
    minHeight: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]] = null,
    minWidth: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]] = null,
    minZoom: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty] = null,
    msHeight: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]] = null,
    msMaxHeight: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]] = null,
    msMaxWidth: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]] = null,
    msMaxZoom: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty] = null,
    msMinHeight: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]] = null,
    msMinWidth: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]] = null,
    msMinZoom: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty] = null,
    msOrientation: ViewportOrientationProperty | js.Array[ViewportOrientationProperty] = null,
    msUserZoom: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty] = null,
    msWidth: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]] = null,
    msZoom: ViewportZoomProperty | js.Array[ViewportZoomProperty] = null,
    orientation: ViewportOrientationProperty | js.Array[ViewportOrientationProperty] = null,
    userZoom: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty] = null,
    width: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]] = null,
    zoom: ViewportZoomProperty | js.Array[ViewportZoomProperty] = null
  ): ViewportFallback[TLength] = {
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
    __obj.asInstanceOf[ViewportFallback[TLength]]
  }
}

