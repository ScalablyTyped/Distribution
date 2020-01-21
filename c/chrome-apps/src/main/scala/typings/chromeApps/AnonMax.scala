package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.tls1
import typings.chromeApps.chromeAppsStrings.tls1Dot1
import typings.chromeApps.chromeAppsStrings.tls1Dot2
import typings.chromeApps.chromeAppsStrings.tls1Dot3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  var max: js.UndefOr[tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3] = js.undefined
  var min: js.UndefOr[tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3] = js.undefined
}

object AnonMax {
  @scala.inline
  def apply(
    max: tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3 = null,
    min: tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3 = null
  ): AnonMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMax]
  }
}

