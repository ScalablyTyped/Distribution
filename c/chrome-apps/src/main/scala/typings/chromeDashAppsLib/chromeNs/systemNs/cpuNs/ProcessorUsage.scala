package typings
package chromeDashAppsLib.chromeNs.systemNs.cpuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessorUsage extends js.Object {
  /** The cumulative time spent idle by this processor. */
  var idle: chromeDashAppsLib.chromeNs.double
  /** The cumulative time used by kernel programs on this processor. */
  var kernel: chromeDashAppsLib.chromeNs.double
  /** The total cumulative time for this processor. This value is equal to user + kernel + idle. */
  var total: chromeDashAppsLib.chromeNs.double
  /** The cumulative time used by userspace programs on this processor. */
  var user: chromeDashAppsLib.chromeNs.double
}

