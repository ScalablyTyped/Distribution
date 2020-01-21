package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.display
import typings.chromeApps.chromeAppsStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDISPLAY extends js.Object {
  var DISPLAY: display
  var SYSTEM: system
}

object AnonDISPLAY {
  @scala.inline
  def apply(DISPLAY: display, SYSTEM: system): AnonDISPLAY = {
    val __obj = js.Dynamic.literal(DISPLAY = DISPLAY.asInstanceOf[js.Any], SYSTEM = SYSTEM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDISPLAY]
  }
}

