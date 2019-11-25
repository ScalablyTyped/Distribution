package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.device_
import typings.chromeDashApps.chromeDashAppsStrings.endpoint
import typings.chromeDashApps.chromeDashAppsStrings.interface
import typings.chromeDashApps.chromeDashAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DEVICE extends js.Object {
  var DEVICE: device_
  var ENDPOINT: endpoint
  var INTERFACE: interface
  var OTHER: other_
}

object Anon_DEVICE {
  @scala.inline
  def apply(DEVICE: device_, ENDPOINT: endpoint, INTERFACE: interface, OTHER: other_): Anon_DEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = DEVICE.asInstanceOf[js.Any], ENDPOINT = ENDPOINT.asInstanceOf[js.Any], INTERFACE = INTERFACE.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DEVICE]
  }
}

