package typings.chromeApps.global.chrome.networking.onc

import typings.chromeApps.chrome.networking.onc.ManagedProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.onc.getManagedProperties")
@js.native
object getManagedProperties extends js.Object {
  /**
    * Gets the merged properties of the network with id networkGuid from the sources:
    * User settings, shared settings, user policy, device policy and the currently active settings.
    * @param networkGuid The GUID of the network to get properties for.
    * @param callback Called with the managed network properties when received.
    */
  def apply(networkGuid: String, callback: js.Function1[/* result */ ManagedProperties, Unit]): Unit = js.native
}

