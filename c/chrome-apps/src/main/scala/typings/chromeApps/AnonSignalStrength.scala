package typings.chromeApps

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSignalStrength extends js.Object {
  var SignalStrength: js.UndefOr[integer] = js.undefined
}

object AnonSignalStrength {
  @scala.inline
  def apply(SignalStrength: Int | Double = null): AnonSignalStrength = {
    val __obj = js.Dynamic.literal()
    if (SignalStrength != null) __obj.updateDynamic("SignalStrength")(SignalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSignalStrength]
  }
}

