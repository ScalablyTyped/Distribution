package typings.chromeDashApps.chrome.bluetoothLowEnergy

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired whan a new GATT service has been discovered on a remote device. */
@JSGlobal("chrome.bluetoothLowEnergy.onServiceAdded")
@js.native
object onServiceAdded
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* service */ Service, Unit]]
    ]

