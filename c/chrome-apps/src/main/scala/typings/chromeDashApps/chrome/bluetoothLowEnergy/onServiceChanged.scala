package typings.chromeDashApps.chrome.bluetoothLowEnergy

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the state of a remote GATT service changes.
  * This involves any characteristics and/or descriptors
  *   that get added or removed from the service, as well as
  *   'ServiceChanged' notifications from the remote device.
  */
@JSGlobal("chrome.bluetoothLowEnergy.onServiceChanged")
@js.native
object onServiceChanged
  extends TopLevel[Event[js.Function1[/* service */ Service, Unit]]]

