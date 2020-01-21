package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.WiFi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWIFI extends js.Object {
  var WI_FI: WiFi
}

object AnonWIFI {
  @scala.inline
  def apply(WI_FI: WiFi): AnonWIFI = {
    val __obj = js.Dynamic.literal(WI_FI = WI_FI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWIFI]
  }
}

