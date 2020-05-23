package typings.cordovaPluginCamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DATAURL extends js.Object {
  var DATA_URL: Double
  var FILE_URI: Double
  var NATIVE_URI: Double
}

object DATAURL {
  @scala.inline
  def apply(DATA_URL: Double, FILE_URI: Double, NATIVE_URI: Double): DATAURL = {
    val __obj = js.Dynamic.literal(DATA_URL = DATA_URL.asInstanceOf[js.Any], FILE_URI = FILE_URI.asInstanceOf[js.Any], NATIVE_URI = NATIVE_URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATAURL]
  }
}

