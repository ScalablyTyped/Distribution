package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.failure
import typings.chromeApps.chromeAppsStrings.in_use_
import typings.chromeApps.chromeAppsStrings.no_such_device
import typings.chromeApps.chromeAppsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFAILURE extends js.Object {
  var FAILURE: failure
  var IN_USE: in_use_
  var NO_SUCH_DEVICE: no_such_device
  var SUCCESS: success
}

object AnonFAILURE {
  @scala.inline
  def apply(FAILURE: failure, IN_USE: in_use_, NO_SUCH_DEVICE: no_such_device, SUCCESS: success): AnonFAILURE = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], IN_USE = IN_USE.asInstanceOf[js.Any], NO_SUCH_DEVICE = NO_SUCH_DEVICE.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFAILURE]
  }
}

