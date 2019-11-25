package typings.chromeDashApps.chrome.system.cpu

import typings.chromeDashApps.chrome.double
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorUsage extends js.Object {
  /** The cumulative time spent idle by this processor. */
  var idle: double
  /** The cumulative time used by kernel programs on this processor. */
  var kernel: double
  /** The total cumulative time for this processor. This value is equal to user + kernel + idle. */
  var total: double
  /** The cumulative time used by userspace programs on this processor. */
  var user: double
}

object ProcessorUsage {
  @scala.inline
  def apply(idle: double, kernel: double, total: double, user: double): ProcessorUsage = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProcessorUsage]
  }
}

