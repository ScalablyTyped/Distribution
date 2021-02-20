package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings._empty
import typings.chromeApps.chromeAppsStrings.`sim-pin`
import typings.chromeApps.chromeAppsStrings.`sim-puk`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SIMLockStatus extends StObject {
  
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
  implicit class SIMLockStatusMutableBuilder[Self <: SIMLockStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLockEnabled(value: Boolean): Self = StObject.set(x, "LockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockType(value: `sim-pin` | `sim-puk` | _empty): Self = StObject.set(x, "LockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriesLeft(value: integer): Self = StObject.set(x, "RetriesLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetriesLeftUndefined: Self = StObject.set(x, "RetriesLeft", js.undefined)
  }
}
