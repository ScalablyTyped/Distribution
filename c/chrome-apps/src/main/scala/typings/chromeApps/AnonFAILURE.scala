package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.failure_
import typings.chromeApps.chromeAppsStrings.in_use_
import typings.chromeApps.chromeAppsStrings.no_such_device_
import typings.chromeApps.chromeAppsStrings.success_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFAILURE extends js.Object {
  var FAILURE: failure_
  var IN_USE: in_use_
  var NO_SUCH_DEVICE: no_such_device_
  var SUCCESS: success_
}

object AnonFAILURE {
  @scala.inline
  def apply(FAILURE: failure_, IN_USE: in_use_, NO_SUCH_DEVICE: no_such_device_, SUCCESS: success_): AnonFAILURE = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], IN_USE = IN_USE.asInstanceOf[js.Any], NO_SUCH_DEVICE = NO_SUCH_DEVICE.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFAILURE]
  }
}

