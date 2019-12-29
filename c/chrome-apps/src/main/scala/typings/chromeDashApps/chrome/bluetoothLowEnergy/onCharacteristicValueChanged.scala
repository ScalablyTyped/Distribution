package typings.chromeDashApps.chrome.bluetoothLowEnergy

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the value of a remote GATT characteristic changes,
  *   either as a result of a read request,
  *   or a value change notification/indication.
  * This event will only be sent if the app has enabled notifications
  *   by calling startCharacteristicNotifications.
  */
@JSGlobal("chrome.bluetoothLowEnergy.onCharacteristicValueChanged")
@js.native
object onCharacteristicValueChanged
  extends TopLevel[Event[js.Function1[/* characteristic */ Characteristic, Unit]]]

