package typings
package cordovaDashPluginDashCanvascameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova-plugin-device-name interface
    */
  var CanvasCamera: cordovaDashPluginDashCanvascameraLib.CanvasCamera
}

object CordovaPlugins {
  @scala.inline
  def apply(CanvasCamera: CanvasCamera): CordovaPlugins = {
    val __obj = js.Dynamic.literal(CanvasCamera = CanvasCamera)
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

