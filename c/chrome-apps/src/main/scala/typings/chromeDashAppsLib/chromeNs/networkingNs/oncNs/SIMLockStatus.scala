package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SIMLockStatus extends js.Object {
  /** Whether SIM lock is enabled. */
  var LockEnabled: scala.Boolean
  /** The status of SIM lock - possible values are 'sim-pin', 'sim-puk' and ''. */
  var LockType: chromeDashAppsLib.chromeDashAppsLibStrings.`sim-pin` | chromeDashAppsLib.chromeDashAppsLibStrings.`sim-puk` | chromeDashAppsLib.chromeDashAppsLibStrings.Empty
  /** Number of PIN lock tries allowed before PUK is required to unlock the SIM. */
  var RetriesLeft: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

