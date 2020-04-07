package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXrstandardthumbstick extends js.Object {
  var `xr-standard-thumbstick`: AnonXaxis
  var `xr-standard-touchpad`: AnonXaxis
}

object AnonXrstandardthumbstick {
  @scala.inline
  def apply(`xr-standard-thumbstick`: AnonXaxis, `xr-standard-touchpad`: AnonXaxis): AnonXrstandardthumbstick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXrstandardthumbstick]
  }
}

