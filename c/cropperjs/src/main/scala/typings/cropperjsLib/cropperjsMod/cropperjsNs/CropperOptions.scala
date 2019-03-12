package typings
package cropperjsLib.cropperjsMod.cropperjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropperOptions extends js.Object {
  /**
    * Set the aspect ratio of the crop box. By default, the crop box is free ratio.
    * @default Nan
    */
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable to crop the image automatically when initialize.
    * @default true
    */
  var autoCrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A number between 0 and 1. Define the automatic cropping area size (percentage).
    * @default 0.8 (80% of the image)
    */
  var autoCropArea: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show the grid background of the container.
    * @default true
    */
  var background: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This function will be called when a cropper instance starts to load an image.
    * Return false to prevent to build
    * @default null
    */
  var build: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /**
    * This function will be called when a cropper instance has built completely.
    * @default null
    */
  var built: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Show the center indicator above the crop box.
    * @default true
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, the plugin will check the image origin, and if it is a cross-origin image,
    * a crossOrigin attribute will be added to the image element and a timestamp will be added to the image url to reload the image for "getCroppedCanvas".
    * By adding crossOrigin attribute to image will stop adding timestamp to image url, and stop reload of image.
    * @default true
    */
  var checkCrossOrigin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Check the current image's Exif Orientation information.
    * More exactly, read the Orientation value for rotating or flipping the image, and then override the Orientation
    * value with 1 (the default value) to avoid some issues (1, 2) on iOS devices.
    * Requires to set both the rotatable and scalable options to true at the same time.
    * Note: Don't trust this all the time as some JPG images have incorrect (not standard) Orientation values.
    * @default true
    */
  var checkOrientation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function called when crop box is moved or resized
    */
  var crop: js.UndefOr[js.Function1[/* event */ CropperCropEvent, scala.Unit]] = js.undefined
  /**
    * Enable to move the crop box.
    * @default true
    */
  var cropBoxMovable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable to resize the crop box.
    * @default true
    */
  var cropBoxResizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function called when crop box is finished being moved or resized
    */
  var cropend: js.UndefOr[js.Function1[/* event */ CropperCropStepEvent, scala.Unit]] = js.undefined
  /**
    * Function called when crop box is moved
    */
  var cropmove: js.UndefOr[js.Function1[/* event */ CropperCropStepEvent, scala.Unit]] = js.undefined
  /**
    * Function called at start of crop box being moved or resized
    */
  var cropstart: js.UndefOr[js.Function1[/* event */ CropperCropStepEvent, scala.Unit]] = js.undefined
  /**
    * The previous cropped data if you had stored, will be passed to setData method automatically.
    * @default null
    */
  var data: js.UndefOr[js.Object] = js.undefined
  /**
    * Define the dragging mode of the cropper.
    * 'crop': create a new crop box
    * 'move': move the canvas
    * 'none': do nothing
    */
  var dragMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Show the dashed lines above the crop box.
    * @default true
    */
  var guides: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show the white modal above the crop box (highlight the crop box).
    * @default true
    */
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The minimum height of the canvas (image wrapper).
    * @default 0
    */
  var minCanvasHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum width of the canvas (image wrapper).
    * @default 0
    */
  var minCanvasWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum height of the container.
    * @default 100
    */
  var minContainerHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum width of the container
    * @default 200
    */
  var minContainerWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum height of the crop box.
    * @default 0
    */
  var minCropBoxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum width of the crop box.
    * @default 0
    */
  var minCropBoxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show the black modal above the image and under the crop box.
    * @default true
    */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable to move the image.
    * @default true
    */
  var movable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add extra elements (containers) for previewing.
    * Valid selector for Document.querySelectorAll
    * @default ''
    */
  var preview: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function called when crop box is ready
    */
  var ready: js.UndefOr[js.Function1[/* event */ CropperReadyEvent, scala.Unit]] = js.undefined
  /**
    * Rebuild the cropper when resize the window.
    * @default true
    */
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable to restore the cropped area after resizing the window.
    * @default true
    */
  var restore: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable to rotate the image.
    * @default true
    */
  var rotatable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable to scale the image.
    * @default true
    */
  var scalable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable to toggle drag mode between "crop" and "move" when click twice on the cropper.
    * @default true
    */
  var toggleDragModeOnDblclick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Define the view mode of the cropper.
    * @default 0
    */
  var viewMode: js.UndefOr[CropperViewMods] = js.undefined
  /**
    * Define zoom ratio when zoom the image by wheeling mouse.
    * @default 0.1
    */
  var wheelZoomRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function called when a cropper instance starts to zoom in or zoom out its canvas (image wrapper).
    */
  var zoom: js.UndefOr[js.Function1[/* event */ CropperZoomEvent, scala.Unit]] = js.undefined
  /**
    * Enable to zoom the image by dragging touch.
    * @default true
    */
  var zoomOnTouch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable to zoom the image by wheeling mouse.
    * @default true
    */
  var zoomOnWheel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable to zoom the image.
    * @default true
    */
  var zoomable: js.UndefOr[scala.Boolean] = js.undefined
}

object CropperOptions {
  @scala.inline
  def apply(
    aspectRatio: scala.Int | scala.Double = null,
    autoCrop: js.UndefOr[scala.Boolean] = js.undefined,
    autoCropArea: scala.Int | scala.Double = null,
    background: js.UndefOr[scala.Boolean] = js.undefined,
    build: () => scala.Boolean = null,
    built: () => scala.Unit = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    checkCrossOrigin: js.UndefOr[scala.Boolean] = js.undefined,
    checkOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    crop: /* event */ CropperCropEvent => scala.Unit = null,
    cropBoxMovable: js.UndefOr[scala.Boolean] = js.undefined,
    cropBoxResizable: js.UndefOr[scala.Boolean] = js.undefined,
    cropend: /* event */ CropperCropStepEvent => scala.Unit = null,
    cropmove: /* event */ CropperCropStepEvent => scala.Unit = null,
    cropstart: /* event */ CropperCropStepEvent => scala.Unit = null,
    data: js.Object = null,
    dragMode: java.lang.String = null,
    guides: js.UndefOr[scala.Boolean] = js.undefined,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    minCanvasHeight: scala.Int | scala.Double = null,
    minCanvasWidth: scala.Int | scala.Double = null,
    minContainerHeight: scala.Int | scala.Double = null,
    minContainerWidth: scala.Int | scala.Double = null,
    minCropBoxHeight: scala.Int | scala.Double = null,
    minCropBoxWidth: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    movable: js.UndefOr[scala.Boolean] = js.undefined,
    preview: java.lang.String = null,
    ready: /* event */ CropperReadyEvent => scala.Unit = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    restore: js.UndefOr[scala.Boolean] = js.undefined,
    rotatable: js.UndefOr[scala.Boolean] = js.undefined,
    scalable: js.UndefOr[scala.Boolean] = js.undefined,
    toggleDragModeOnDblclick: js.UndefOr[scala.Boolean] = js.undefined,
    viewMode: CropperViewMods = null,
    wheelZoomRatio: scala.Int | scala.Double = null,
    zoom: /* event */ CropperZoomEvent => scala.Unit = null,
    zoomOnTouch: js.UndefOr[scala.Boolean] = js.undefined,
    zoomOnWheel: js.UndefOr[scala.Boolean] = js.undefined,
    zoomable: js.UndefOr[scala.Boolean] = js.undefined
  ): CropperOptions = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCrop)) __obj.updateDynamic("autoCrop")(autoCrop)
    if (autoCropArea != null) __obj.updateDynamic("autoCropArea")(autoCropArea.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (build != null) __obj.updateDynamic("build")(js.Any.fromFunction0(build))
    if (built != null) __obj.updateDynamic("built")(js.Any.fromFunction0(built))
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(checkCrossOrigin)) __obj.updateDynamic("checkCrossOrigin")(checkCrossOrigin)
    if (!js.isUndefined(checkOrientation)) __obj.updateDynamic("checkOrientation")(checkOrientation)
    if (crop != null) __obj.updateDynamic("crop")(js.Any.fromFunction1(crop))
    if (!js.isUndefined(cropBoxMovable)) __obj.updateDynamic("cropBoxMovable")(cropBoxMovable)
    if (!js.isUndefined(cropBoxResizable)) __obj.updateDynamic("cropBoxResizable")(cropBoxResizable)
    if (cropend != null) __obj.updateDynamic("cropend")(js.Any.fromFunction1(cropend))
    if (cropmove != null) __obj.updateDynamic("cropmove")(js.Any.fromFunction1(cropmove))
    if (cropstart != null) __obj.updateDynamic("cropstart")(js.Any.fromFunction1(cropstart))
    if (data != null) __obj.updateDynamic("data")(data)
    if (dragMode != null) __obj.updateDynamic("dragMode")(dragMode)
    if (!js.isUndefined(guides)) __obj.updateDynamic("guides")(guides)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (minCanvasHeight != null) __obj.updateDynamic("minCanvasHeight")(minCanvasHeight.asInstanceOf[js.Any])
    if (minCanvasWidth != null) __obj.updateDynamic("minCanvasWidth")(minCanvasWidth.asInstanceOf[js.Any])
    if (minContainerHeight != null) __obj.updateDynamic("minContainerHeight")(minContainerHeight.asInstanceOf[js.Any])
    if (minContainerWidth != null) __obj.updateDynamic("minContainerWidth")(minContainerWidth.asInstanceOf[js.Any])
    if (minCropBoxHeight != null) __obj.updateDynamic("minCropBoxHeight")(minCropBoxHeight.asInstanceOf[js.Any])
    if (minCropBoxWidth != null) __obj.updateDynamic("minCropBoxWidth")(minCropBoxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable)
    if (preview != null) __obj.updateDynamic("preview")(preview)
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore)
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable)
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable)
    if (!js.isUndefined(toggleDragModeOnDblclick)) __obj.updateDynamic("toggleDragModeOnDblclick")(toggleDragModeOnDblclick)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    if (wheelZoomRatio != null) __obj.updateDynamic("wheelZoomRatio")(wheelZoomRatio.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (!js.isUndefined(zoomOnTouch)) __obj.updateDynamic("zoomOnTouch")(zoomOnTouch)
    if (!js.isUndefined(zoomOnWheel)) __obj.updateDynamic("zoomOnWheel")(zoomOnWheel)
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable)
    __obj.asInstanceOf[CropperOptions]
  }
}

