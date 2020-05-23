package typings.cordovaPluginCanvascamera

import typings.cordovaPluginCanvascamera.anon.Height
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.back
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.data
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.file
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.front
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasCameraOptions extends js.Object {
  /**
    * String, optional, default: file, file to use files for rendering (lower CPU / higher storage) or data to use base64 jpg data for rendering (higher cpu / lower storage).
    */
  var cameraFacing: js.UndefOr[front | back] = js.undefined
  var canvas: js.UndefOr[Height] = js.undefined
  var capture: js.UndefOr[Height] = js.undefined
  /**
    * Boolean, optional, default: false, a boolean to set flash mode on/off.
    */
  var flashMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Number, optional, default: 30, desired number of frames per second.
    */
  var fps: js.UndefOr[Double] = js.undefined
  /**
    * Number, optional, default: 288, height in pixels of the video to capture and the output canvas height in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Function, optional, default : null, callback executed after a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onAfterDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.undefined
  /**
    * Function, optional, default : null, callback executed before a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onBeforeDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.undefined
  /**
    * Number, optional, default: 1/6, a ratio used to scale down the thumbnail.
    */
  var thumbnailRatio: js.UndefOr[Double] = js.undefined
  /**
    * String, optional, default: 'front', 'front' or 'back'.
    */
  var use: js.UndefOr[file | data] = js.undefined
  /**
    * Number, optional, default: 352, width in pixels of the video to capture and the output canvas width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CanvasCameraOptions {
  @scala.inline
  def apply(
    cameraFacing: front | back = null,
    canvas: Height = null,
    capture: Height = null,
    flashMode: js.UndefOr[Boolean] = js.undefined,
    fps: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    onAfterDraw: /* frame */ js.UndefOr[Frame] => Unit = null,
    onBeforeDraw: /* frame */ js.UndefOr[Frame] => Unit = null,
    thumbnailRatio: js.UndefOr[Double] = js.undefined,
    use: file | data = null,
    width: js.UndefOr[Double] = js.undefined
  ): CanvasCameraOptions = {
    val __obj = js.Dynamic.literal()
    if (cameraFacing != null) __obj.updateDynamic("cameraFacing")(cameraFacing.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(flashMode)) __obj.updateDynamic("flashMode")(flashMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fps)) __obj.updateDynamic("fps")(fps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (onAfterDraw != null) __obj.updateDynamic("onAfterDraw")(js.Any.fromFunction1(onAfterDraw))
    if (onBeforeDraw != null) __obj.updateDynamic("onBeforeDraw")(js.Any.fromFunction1(onBeforeDraw))
    if (!js.isUndefined(thumbnailRatio)) __obj.updateDynamic("thumbnailRatio")(thumbnailRatio.get.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCameraOptions]
  }
}

