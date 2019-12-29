package typings.chromeDashApps.chrome.bluetoothLowEnergy

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a connected central device requests to read the value of
  *   a characteristic registered on the local GATT server.
  * Not responding to this request for a long time may lead to a disconnection.
  * This event is only available if the app has both the bluetooth:low_energy
  *   and the bluetooth:peripheral permissions set to true.
  * The peripheral permission may not be available to all apps.
  * @since Chrome 52.
  */
@JSGlobal("chrome.bluetoothLowEnergy.onCharacteristicReadRequest")
@js.native
object onCharacteristicReadRequest
  extends TopLevel[Event[js.Function1[/* characteristic */ Characteristic, Unit]]]

