package typings.chromeDashApps.chrome.instanceID

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.instanceID.deleteID")
@js.native
object deleteID extends js.Object {
  /**
    * Fired when all the granted tokens need to be refreshed.
    * @param callback Function called when the deletion completes.
    *                 The instance identifier was revoked successfully if runtime.lastError is not set.
    */
  def apply(callback: js.Function0[Unit]): Unit = js.native
}

