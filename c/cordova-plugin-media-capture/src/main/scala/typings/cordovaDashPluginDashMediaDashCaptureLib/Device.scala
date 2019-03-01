package typings
package cordovaDashPluginDashMediaDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var capture: Capture
}

object Device {
  @scala.inline
  def apply(capture: Capture): Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capture")(capture)
    __obj.asInstanceOf[Device]
  }
}

