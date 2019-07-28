package typings.chromeDashApps.chromeNs.networkingNs.oncNs

import typings.chromeDashApps.chromeDashAppsStrings.Empty
import typings.chromeDashApps.chromeDashAppsStrings.`sim-pin`
import typings.chromeDashApps.chromeDashAppsStrings.`sim-puk`
import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SIMLockStatus extends js.Object {
  /** Whether SIM lock is enabled. */
  var LockEnabled: Boolean
  /** The status of SIM lock - possible values are 'sim-pin', 'sim-puk' and ''. */
  var LockType: `sim-pin` | `sim-puk` | Empty
  /** Number of PIN lock tries allowed before PUK is required to unlock the SIM. */
  var RetriesLeft: js.UndefOr[integer] = js.undefined
}

object SIMLockStatus {
  @scala.inline
  def apply(
    LockEnabled: Boolean,
    LockType: `sim-pin` | `sim-puk` | Empty,
    RetriesLeft: js.UndefOr[integer] = js.undefined
  ): SIMLockStatus = {
    val __obj = js.Dynamic.literal(LockEnabled = LockEnabled, LockType = LockType.asInstanceOf[js.Any])
    if (!js.isUndefined(RetriesLeft)) __obj.updateDynamic("RetriesLeft")(RetriesLeft)
    __obj.asInstanceOf[SIMLockStatus]
  }
}

