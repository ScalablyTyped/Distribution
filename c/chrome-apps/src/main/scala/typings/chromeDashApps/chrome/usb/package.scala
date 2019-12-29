package typings.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object usb {
  import typings.chromeDashApps.chrome.events.Event

  type DeviceEvent = Event[js.Function1[/* device */ Device, Unit]]
}
