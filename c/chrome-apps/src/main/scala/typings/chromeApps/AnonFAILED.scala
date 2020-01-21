package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.failed_
import typings.chromeApps.chromeAppsStrings.rejected
import typings.chromeApps.chromeAppsStrings.succeeded
import typings.chromeApps.chromeAppsStrings.unhandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFAILED extends js.Object {
  var FAILED: failed_
  var REJECTED: rejected
  var SUCCEEDED: succeeded
  var UNHANDLED: unhandled
}

object AnonFAILED {
  @scala.inline
  def apply(FAILED: failed_, REJECTED: rejected, SUCCEEDED: succeeded, UNHANDLED: unhandled): AnonFAILED = {
    val __obj = js.Dynamic.literal(FAILED = FAILED.asInstanceOf[js.Any], REJECTED = REJECTED.asInstanceOf[js.Any], SUCCEEDED = SUCCEEDED.asInstanceOf[js.Any], UNHANDLED = UNHANDLED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFAILED]
  }
}

