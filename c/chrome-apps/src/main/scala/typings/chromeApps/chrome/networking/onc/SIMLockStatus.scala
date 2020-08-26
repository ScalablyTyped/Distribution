package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings._empty
import typings.chromeApps.chromeAppsStrings.`sim-pin`
import typings.chromeApps.chromeAppsStrings.`sim-puk`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SIMLockStatus extends js.Object {
  /** Whether SIM lock is enabled. */
  var LockEnabled: Boolean = js.native
  /** The status of SIM lock - possible values are 'sim-pin', 'sim-puk' and ''. */
  var LockType: `sim-pin` | `sim-puk` | _empty = js.native
  /** Number of PIN lock tries allowed before PUK is required to unlock the SIM. */
  var RetriesLeft: js.UndefOr[integer] = js.native
}

object SIMLockStatus {
  @scala.inline
  def apply(LockEnabled: Boolean, LockType: `sim-pin` | `sim-puk` | _empty): SIMLockStatus = {
    val __obj = js.Dynamic.literal(LockEnabled = LockEnabled.asInstanceOf[js.Any], LockType = LockType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SIMLockStatus]
  }
  @scala.inline
  implicit class SIMLockStatusOps[Self <: SIMLockStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLockEnabled(value: Boolean): Self = this.set("LockEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockType(value: `sim-pin` | `sim-puk` | _empty): Self = this.set("LockType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetriesLeft(value: integer): Self = this.set("RetriesLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetriesLeft: Self = this.set("RetriesLeft", js.undefined)
  }
  
}

