package typings.cordovaPluginCanvascamera

import typings.cordovaPluginCanvascamera.anon.Height
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.back
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.data
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.file
import typings.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.front
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasCameraOptions extends js.Object {
  /**
    * String, optional, default: file, file to use files for rendering (lower CPU / higher storage) or data to use base64 jpg data for rendering (higher cpu / lower storage).
    */
  var cameraFacing: js.UndefOr[front | back] = js.native
  var canvas: js.UndefOr[Height] = js.native
  var capture: js.UndefOr[Height] = js.native
  /**
    * Boolean, optional, default: false, a boolean to set flash mode on/off.
    */
  var flashMode: js.UndefOr[Boolean] = js.native
  /**
    * Number, optional, default: 30, desired number of frames per second.
    */
  var fps: js.UndefOr[Double] = js.native
  /**
    * Number, optional, default: 288, height in pixels of the video to capture and the output canvas height in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Function, optional, default : null, callback executed after a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onAfterDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.native
  /**
    * Function, optional, default : null, callback executed before a frame has been drawn. frame contains the canvas element, the image element, the tracking data.
    */
  // tslint:disable-next-line:prefer-method-signature
  var onBeforeDraw: js.UndefOr[js.Function1[/* frame */ js.UndefOr[Frame], Unit]] = js.native
  /**
    * Number, optional, default: 1/6, a ratio used to scale down the thumbnail.
    */
  var thumbnailRatio: js.UndefOr[Double] = js.native
  /**
    * String, optional, default: 'front', 'front' or 'back'.
    */
  var use: js.UndefOr[file | data] = js.native
  /**
    * Number, optional, default: 352, width in pixels of the video to capture and the output canvas width in pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object CanvasCameraOptions {
  @scala.inline
  def apply(): CanvasCameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasCameraOptions]
  }
  @scala.inline
  implicit class CanvasCameraOptionsOps[Self <: CanvasCameraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCameraFacing(value: front | back): Self = this.set("cameraFacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraFacing: Self = this.set("cameraFacing", js.undefined)
    @scala.inline
    def setCanvas(value: Height): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    @scala.inline
    def setCapture(value: Height): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setFlashMode(value: Boolean): Self = this.set("flashMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashMode: Self = this.set("flashMode", js.undefined)
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOnAfterDraw(value: /* frame */ js.UndefOr[Frame] => Unit): Self = this.set("onAfterDraw", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterDraw: Self = this.set("onAfterDraw", js.undefined)
    @scala.inline
    def setOnBeforeDraw(value: /* frame */ js.UndefOr[Frame] => Unit): Self = this.set("onBeforeDraw", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeDraw: Self = this.set("onBeforeDraw", js.undefined)
    @scala.inline
    def setThumbnailRatio(value: Double): Self = this.set("thumbnailRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailRatio: Self = this.set("thumbnailRatio", js.undefined)
    @scala.inline
    def setUse(value: file | data): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

