package typings.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  /**
    * This plugin provides an API for taking pictures and for choosing images from the system's image library.
    */
  var camera: Camera
}

object Navigator {
  @scala.inline
  def apply(camera: Camera): Navigator = {
    val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
}

