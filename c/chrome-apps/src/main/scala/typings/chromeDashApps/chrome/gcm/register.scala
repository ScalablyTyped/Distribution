package typings.chromeDashApps.chrome.gcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.gcm.register")
@js.native
object register extends js.Object {
  /**
    * Registers the application with GCM. The registration ID will be returned by the callback. If register is called again with the same list of senderIds, the same registration ID will be returned.
    * @param senderIds A list of server IDs that are allowed to send messages to the application. It should contain at least one and no more than 100 sender IDs.
    * @param callback Function called when registration completes. It should check runtime.lastError for error when registrationId is empty.
    * The callback parameter should be a function that looks like this:
    * function(string registrationId) {...};
    * Parameter registrationId: A registration ID assigned to the application by the GCM.
    */
  def apply(senderIds: js.Array[String], callback: js.Function1[/* registrationId */ String, Unit]): Unit = js.native
}

