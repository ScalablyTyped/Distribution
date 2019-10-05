package typings.chromeDashApps

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SignalStrength extends js.Object {
  var SignalStrength: js.UndefOr[integer] = js.undefined
}

object Anon_SignalStrength {
  @scala.inline
  def apply(SignalStrength: Int | Double = null): Anon_SignalStrength = {
    val __obj = js.Dynamic.literal()
    if (SignalStrength != null) __obj.updateDynamic("SignalStrength")(SignalStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SignalStrength]
  }
}

