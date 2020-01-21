package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chromeAppsBooleans.`false`
import typings.chromeApps.chromeAppsStrings.setter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.onc.createNetwork")
@js.native
object createNetwork extends js.Object {
  /**
    * Creates a new network configuration from properties.
    * If a matching configured network already exists, this will fail.
    * Otherwise returns the GUID of the new network.
    * @param shared If true, share this network configuration with other users.
    *               Note: This option is exposed only to Chrome's Web UI.
    *               When called by apps, false is the only allowed value.
    * @param properties The properties to configure the new network with.
    * @param [callback] Called with the GUID for the new network configuration once the network has been created.
    */
  def apply(shared: `false`, properties: NetworkConfigProperties[setter]): Unit = js.native
  def apply(shared: `false`, properties: NetworkConfigProperties[setter], callback: js.Function0[Unit]): Unit = js.native
}

