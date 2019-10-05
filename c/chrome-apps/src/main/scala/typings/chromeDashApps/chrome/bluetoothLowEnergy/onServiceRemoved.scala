package typings.chromeDashApps.chrome.bluetoothLowEnergy

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when a GATT service that was previously discovered on a remote device has been removed. */
@JSGlobal("chrome.bluetoothLowEnergy.onServiceRemoved")
@js.native
object onServiceRemoved
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* service */ Service, Unit]]
    ]

