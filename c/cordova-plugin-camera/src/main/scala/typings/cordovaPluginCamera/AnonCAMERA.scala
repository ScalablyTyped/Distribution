package typings.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCAMERA extends js.Object {
  var CAMERA: Double
  var PHOTOLIBRARY: Double
  var SAVEDPHOTOALBUM: Double
}

object AnonCAMERA {
  @scala.inline
  def apply(CAMERA: Double, PHOTOLIBRARY: Double, SAVEDPHOTOALBUM: Double): AnonCAMERA = {
    val __obj = js.Dynamic.literal(CAMERA = CAMERA.asInstanceOf[js.Any], PHOTOLIBRARY = PHOTOLIBRARY.asInstanceOf[js.Any], SAVEDPHOTOALBUM = SAVEDPHOTOALBUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCAMERA]
  }
}

