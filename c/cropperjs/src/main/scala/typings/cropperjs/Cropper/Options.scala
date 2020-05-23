package typings.cropperjs.Cropper

import typings.std.CustomEvent
import typings.std.Element
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var autoCrop: js.UndefOr[Boolean] = js.undefined
  var autoCropArea: js.UndefOr[Double] = js.undefined
  var background: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[Boolean] = js.undefined
  var checkCrossOrigin: js.UndefOr[Boolean] = js.undefined
  var checkOrientation: js.UndefOr[Boolean] = js.undefined
  var crop: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var cropBoxMovable: js.UndefOr[Boolean] = js.undefined
  var cropBoxResizable: js.UndefOr[Boolean] = js.undefined
  var cropend: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var cropmove: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var cropstart: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var data: js.UndefOr[Data] = js.undefined
  var dragMode: js.UndefOr[DragMode] = js.undefined
  var guides: js.UndefOr[Boolean] = js.undefined
  var highlight: js.UndefOr[Boolean] = js.undefined
  var initialAspectRatio: js.UndefOr[Double] = js.undefined
  var minCanvasHeight: js.UndefOr[Double] = js.undefined
  var minCanvasWidth: js.UndefOr[Double] = js.undefined
  var minContainerHeight: js.UndefOr[Double] = js.undefined
  var minContainerWidth: js.UndefOr[Double] = js.undefined
  var minCropBoxHeight: js.UndefOr[Double] = js.undefined
  var minCropBoxWidth: js.UndefOr[Double] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var movable: js.UndefOr[Boolean] = js.undefined
  var preview: js.UndefOr[Element | js.Array[Element] | NodeList | String] = js.undefined
  var ready: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var restore: js.UndefOr[Boolean] = js.undefined
  var rotatable: js.UndefOr[Boolean] = js.undefined
  var scalable: js.UndefOr[Boolean] = js.undefined
  var toggleDragModeOnDblclick: js.UndefOr[Boolean] = js.undefined
  var viewMode: js.UndefOr[ViewMode] = js.undefined
  var wheelZoomRatio: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var zoomOnTouch: js.UndefOr[Boolean] = js.undefined
  var zoomOnWheel: js.UndefOr[Boolean] = js.undefined
  var zoomable: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[Double] = js.undefined,
    autoCrop: js.UndefOr[Boolean] = js.undefined,
    autoCropArea: js.UndefOr[Double] = js.undefined,
    background: js.UndefOr[Boolean] = js.undefined,
    center: js.UndefOr[Boolean] = js.undefined,
    checkCrossOrigin: js.UndefOr[Boolean] = js.undefined,
    checkOrientation: js.UndefOr[Boolean] = js.undefined,
    crop: /* event */ CustomEvent[_] => Unit = null,
    cropBoxMovable: js.UndefOr[Boolean] = js.undefined,
    cropBoxResizable: js.UndefOr[Boolean] = js.undefined,
    cropend: /* event */ CustomEvent[_] => Unit = null,
    cropmove: /* event */ CustomEvent[_] => Unit = null,
    cropstart: /* event */ CustomEvent[_] => Unit = null,
    data: Data = null,
    dragMode: DragMode = null,
    guides: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    initialAspectRatio: js.UndefOr[Double] = js.undefined,
    minCanvasHeight: js.UndefOr[Double] = js.undefined,
    minCanvasWidth: js.UndefOr[Double] = js.undefined,
    minContainerHeight: js.UndefOr[Double] = js.undefined,
    minContainerWidth: js.UndefOr[Double] = js.undefined,
    minCropBoxHeight: js.UndefOr[Double] = js.undefined,
    minCropBoxWidth: js.UndefOr[Double] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    movable: js.UndefOr[Boolean] = js.undefined,
    preview: Element | js.Array[Element] | NodeList | String = null,
    ready: /* event */ CustomEvent[_] => Unit = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    restore: js.UndefOr[Boolean] = js.undefined,
    rotatable: js.UndefOr[Boolean] = js.undefined,
    scalable: js.UndefOr[Boolean] = js.undefined,
    toggleDragModeOnDblclick: js.UndefOr[Boolean] = js.undefined,
    viewMode: ViewMode = null,
    wheelZoomRatio: js.UndefOr[Double] = js.undefined,
    zoom: /* event */ CustomEvent[_] => Unit = null,
    zoomOnTouch: js.UndefOr[Boolean] = js.undefined,
    zoomOnWheel: js.UndefOr[Boolean] = js.undefined,
    zoomable: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCrop)) __obj.updateDynamic("autoCrop")(autoCrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCropArea)) __obj.updateDynamic("autoCropArea")(autoCropArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.get.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkCrossOrigin)) __obj.updateDynamic("checkCrossOrigin")(checkCrossOrigin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(checkOrientation)) __obj.updateDynamic("checkOrientation")(checkOrientation.get.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(js.Any.fromFunction1(crop))
    if (!js.isUndefined(cropBoxMovable)) __obj.updateDynamic("cropBoxMovable")(cropBoxMovable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cropBoxResizable)) __obj.updateDynamic("cropBoxResizable")(cropBoxResizable.get.asInstanceOf[js.Any])
    if (cropend != null) __obj.updateDynamic("cropend")(js.Any.fromFunction1(cropend))
    if (cropmove != null) __obj.updateDynamic("cropmove")(js.Any.fromFunction1(cropmove))
    if (cropstart != null) __obj.updateDynamic("cropstart")(js.Any.fromFunction1(cropstart))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dragMode != null) __obj.updateDynamic("dragMode")(dragMode.asInstanceOf[js.Any])
    if (!js.isUndefined(guides)) __obj.updateDynamic("guides")(guides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialAspectRatio)) __obj.updateDynamic("initialAspectRatio")(initialAspectRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCanvasHeight)) __obj.updateDynamic("minCanvasHeight")(minCanvasHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCanvasWidth)) __obj.updateDynamic("minCanvasWidth")(minCanvasWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minContainerHeight)) __obj.updateDynamic("minContainerHeight")(minContainerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minContainerWidth)) __obj.updateDynamic("minContainerWidth")(minContainerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCropBoxHeight)) __obj.updateDynamic("minCropBoxHeight")(minCropBoxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minCropBoxWidth)) __obj.updateDynamic("minCropBoxWidth")(minCropBoxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable.get.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleDragModeOnDblclick)) __obj.updateDynamic("toggleDragModeOnDblclick")(toggleDragModeOnDblclick.get.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelZoomRatio)) __obj.updateDynamic("wheelZoomRatio")(wheelZoomRatio.get.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (!js.isUndefined(zoomOnTouch)) __obj.updateDynamic("zoomOnTouch")(zoomOnTouch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomOnWheel)) __obj.updateDynamic("zoomOnWheel")(zoomOnWheel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

