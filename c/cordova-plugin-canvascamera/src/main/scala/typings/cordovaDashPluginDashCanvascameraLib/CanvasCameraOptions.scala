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

