package typings
package cordovaDashPluginDashCameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DATAURL extends js.Object {
  var DATA_URL: scala.Double
  var FILE_URI: scala.Double
  var NATIVE_URI: scala.Double
}

object Anon_DATAURL {
  @scala.inline
  def apply(DATA_URL: scala.Double, FILE_URI: scala.Double, NATIVE_URI: scala.Double): Anon_DATAURL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DATA_URL")(DATA_URL)
    __obj.updateDynamic("FILE_URI")(FILE_URI)
    __obj.updateDynamic("NATIVE_URI")(NATIVE_URI)
    __obj.asInstanceOf[Anon_DATAURL]
  }
}

