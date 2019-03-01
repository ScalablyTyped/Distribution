package typings
package cordovaDashPluginDashCanvascameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasCameraOptions extends js.Object {
  /**
    * String, optional, default: file, file to use files for rendering (lower CPU / higher storage) or data to use base64 jpg data for rendering (higher cpu / lower storage).
    */
  var cameraFacing: js.UndefOr[
    cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.front | cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.back
  ] = js.undefined
  var canvas: js.UndefOr[Anon_HeightWidth] = js.undefined
  var capture: js.UndefOr[Anon_HeightWidth] = js.undefined
  /**
    * Boolean, optional, default: false, a boolean to set flash mode on/off.
    */
  var flashMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number, optional, default: 30, desired number of frames per second.
    */
  var fps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number, optional, default: 288, height in pixels of the video to capture and the output canvas height in pixels.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function, optional, default : null, callback executed after a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onAfterDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], scala.Unit]] = js.undefined
  /**
    * Function, optional, default : null, callback executed before a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onBeforeDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], scala.Unit]] = js.undefined
  /**
    * Number, optional, default: 1/6, a ratio used to scale down the thumbnail.
    */
  var thumbnailRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * String, optional, default: 'front', 'front' or 'back'.
    */
  var use: js.UndefOr[
    cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.file | cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.data
  ] = js.undefined
  /**
    * Number, optional, default: 352, width in pixels of the video to capture and the output canvas width in pixels.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CanvasCameraOptions {
  @scala.inline
  def apply(
    cameraFacing: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.front | cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.back = null,
    canvas: Anon_HeightWidth = null,
    capture: Anon_HeightWidth = null,
    flashMode: js.UndefOr[scala.Boolean] = js.undefined,
    fps: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    onAfterDraw: js.Function1[/* frame */ js.UndefOr[Frame], scala.Unit] = null,
    onBeforeDraw: js.Function1[/* frame */ js.UndefOr[Frame], scala.Unit] = null,
    thumbnailRatio: scala.Int | scala.Double = null,
    use: cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.file | cordovaDashPluginDashCanvascameraLib.cordovaDashPluginDashCanvascameraLibStrings.data = null,
    width: scala.Int | scala.Double = null
  ): CanvasCameraOptions = {
    val __obj = js.Dynamic.literal()
    if (cameraFacing != null) __obj.updateDynamic("cameraFacing")(cameraFacing.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (capture != null) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(flashMode)) __obj.updateDynamic("flashMode")(flashMode)
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onAfterDraw != null) __obj.updateDynamic("onAfterDraw")(onAfterDraw)
    if (onBeforeDraw != null) __obj.updateDynamic("onBeforeDraw")(onBeforeDraw)
    if (thumbnailRatio != null) __obj.updateDynamic("thumbnailRatio")(thumbnailRatio.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCameraOptions]
  }
}

