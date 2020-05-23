package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xrstandardthumbstick extends js.Object {
  var `xr-standard-thumbstick`: Xaxis
  var `xr-standard-touchpad`: Xaxis
}

object Xrstandardthumbstick {
  @scala.inline
  def apply(`xr-standard-thumbstick`: Xaxis, `xr-standard-touchpad`: Xaxis): Xrstandardthumbstick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xrstandardthumbstick]
  }
}

