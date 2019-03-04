package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DEVICE extends js.Object {
  var DEVICE: chromeDashAppsLib.chromeDashAppsLibStrings.device
  var ENDPOINT: chromeDashAppsLib.chromeDashAppsLibStrings.endpoint
  var INTERFACE: chromeDashAppsLib.chromeDashAppsLibStrings.interface
  var OTHER: chromeDashAppsLib.chromeDashAppsLibStrings.other
}

object Anon_DEVICE {
  @scala.inline
  def apply(
    DEVICE: chromeDashAppsLib.chromeDashAppsLibStrings.device,
    ENDPOINT: chromeDashAppsLib.chromeDashAppsLibStrings.endpoint,
    INTERFACE: chromeDashAppsLib.chromeDashAppsLibStrings.interface,
    OTHER: chromeDashAppsLib.chromeDashAppsLibStrings.other
  ): Anon_DEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = DEVICE, ENDPOINT = ENDPOINT, INTERFACE = INTERFACE, OTHER = OTHER)
  
    __obj.asInstanceOf[Anon_DEVICE]
  }
}

