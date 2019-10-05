package typings.chromeDashApps.chrome.bluetoothLowEnergy

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the value of a remote GATT characteristic descriptor changes,
  *   usually as a result of a read request.
  * This event exists mostly for convenience and will always be sent after
  *   a successful call to readDescriptorValue.
  */
@JSGlobal("chrome.bluetoothLowEnergy.onDescriptorValueChanged")
@js.native
object onDescriptorValueChanged
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[js.Function1[/* descriptor */ Descriptor, Unit]]
    ]

