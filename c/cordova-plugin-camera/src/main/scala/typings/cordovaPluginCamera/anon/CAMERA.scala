package typings.cordovaPluginCamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CAMERA extends js.Object {
  var CAMERA: Double
  var PHOTOLIBRARY: Double
  var SAVEDPHOTOALBUM: Double
}

object CAMERA {
  @scala.inline
  def apply(CAMERA: Double, PHOTOLIBRARY: Double, SAVEDPHOTOALBUM: Double): CAMERA = {
    val __obj = js.Dynamic.literal(CAMERA = CAMERA.asInstanceOf[js.Any], PHOTOLIBRARY = PHOTOLIBRARY.asInstanceOf[js.Any], SAVEDPHOTOALBUM = SAVEDPHOTOALBUM.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAMERA]
  }
}

