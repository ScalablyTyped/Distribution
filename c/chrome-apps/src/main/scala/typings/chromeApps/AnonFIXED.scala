package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.fixed_
import typings.chromeApps.chromeAppsStrings.removable_
import typings.chromeApps.chromeAppsStrings.unknown__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFIXED extends js.Object {
  var FIXED: fixed_
  var REMOVABLE: removable_
  var UNKNOWN: unknown__
}

object AnonFIXED {
  @scala.inline
  def apply(FIXED: fixed_, REMOVABLE: removable_, UNKNOWN: unknown__): AnonFIXED = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], REMOVABLE = REMOVABLE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFIXED]
  }
}

