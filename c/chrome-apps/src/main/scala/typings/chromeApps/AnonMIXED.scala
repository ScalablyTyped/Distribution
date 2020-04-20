package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.mixed
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMIXED extends js.Object {
  var MIXED: mixed
  var NORMAL: normal_
  var OFF: off
}

object AnonMIXED {
  @scala.inline
  def apply(MIXED: mixed, NORMAL: normal_, OFF: off): AnonMIXED = {
    val __obj = js.Dynamic.literal(MIXED = MIXED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMIXED]
  }
}

