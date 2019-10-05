package typings.chromeDashApps.chrome.gcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.gcm.unregister")
@js.native
object unregister extends js.Object {
  /**
    * Unregisters the application from GCM.
    * @param callback A function called after the unregistration completes. Unregistration was successful if runtime.lastError is not set.
    * The callback parameter should be a function that looks like this:
    * function() {...};
    */
  def apply(callback: js.Function0[Unit]): Unit = js.native
}

