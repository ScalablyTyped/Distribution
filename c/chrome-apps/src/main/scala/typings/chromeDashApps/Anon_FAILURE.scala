package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.failure
import typings.chromeDashApps.chromeDashAppsStrings.in_use
import typings.chromeDashApps.chromeDashAppsStrings.no_such_device
import typings.chromeDashApps.chromeDashAppsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FAILURE extends js.Object {
  var FAILURE: failure
  var IN_USE: in_use
  var NO_SUCH_DEVICE: no_such_device
  var SUCCESS: success
}

object Anon_FAILURE {
  @scala.inline
  def apply(FAILURE: failure, IN_USE: in_use, NO_SUCH_DEVICE: no_such_device, SUCCESS: success): Anon_FAILURE = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE, IN_USE = IN_USE, NO_SUCH_DEVICE = NO_SUCH_DEVICE, SUCCESS = SUCCESS)
  
    __obj.asInstanceOf[Anon_FAILURE]
  }
}

