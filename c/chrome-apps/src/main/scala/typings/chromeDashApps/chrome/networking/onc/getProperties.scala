package typings.chromeDashApps.chrome.networking.onc

import typings.chromeDashApps.chromeDashAppsStrings.full
import typings.chromeDashApps.chromeDashAppsStrings.unmanaged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.onc.getProperties")
@js.native
object getProperties extends js.Object {
  /**
    * Gets all the properties of the network with id *networkGuid*.
    * Includes all properties of the network (read-only and read/write values).
    * @param networkGuid The GUID of the network to get properties for.
    * @param callback Called with the network properties when received.
    */
  def apply(networkGuid: String, callback: js.Function1[/* result */ NetworkProperties[unmanaged, full], Unit]): Unit = js.native
}

