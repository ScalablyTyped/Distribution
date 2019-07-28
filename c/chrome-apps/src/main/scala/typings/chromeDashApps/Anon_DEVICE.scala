package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.device
import typings.chromeDashApps.chromeDashAppsStrings.endpoint
import typings.chromeDashApps.chromeDashAppsStrings.interface
import typings.chromeDashApps.chromeDashAppsStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DEVICE extends js.Object {
  var DEVICE: device
  var ENDPOINT: endpoint
  var INTERFACE: interface
  var OTHER: other
}

object Anon_DEVICE {
  @scala.inline
  def apply(DEVICE: device, ENDPOINT: endpoint, INTERFACE: interface, OTHER: other): Anon_DEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = DEVICE, ENDPOINT = ENDPOINT, INTERFACE = INTERFACE, OTHER = OTHER)
  
    __obj.asInstanceOf[Anon_DEVICE]
  }
}

