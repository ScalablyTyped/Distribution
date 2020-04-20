package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.failed_
import typings.chromeApps.chromeAppsStrings.rejected_
import typings.chromeApps.chromeAppsStrings.succeeded_
import typings.chromeApps.chromeAppsStrings.unhandled_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFAILED extends js.Object {
  var FAILED: failed_
  var REJECTED: rejected_
  var SUCCEEDED: succeeded_
  var UNHANDLED: unhandled_
}

object AnonFAILED {
  @scala.inline
  def apply(FAILED: failed_, REJECTED: rejected_, SUCCEEDED: succeeded_, UNHANDLED: unhandled_): AnonFAILED = {
    val __obj = js.Dynamic.literal(FAILED = FAILED.asInstanceOf[js.Any], REJECTED = REJECTED.asInstanceOf[js.Any], SUCCEEDED = SUCCEEDED.asInstanceOf[js.Any], UNHANDLED = UNHANDLED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFAILED]
  }
}

