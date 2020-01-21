package typings.cordovaPluginCanvascamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova-plugin-device-name interface
    */
  var CanvasCamera: typings.cordovaPluginCanvascamera.CanvasCamera
}

object CordovaPlugins {
  @scala.inline
  def apply(CanvasCamera: CanvasCamera): CordovaPlugins = {
    val __obj = js.Dynamic.literal(CanvasCamera = CanvasCamera.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

