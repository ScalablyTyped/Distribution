package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.device_
import typings.chromeApps.chromeAppsStrings.endpoint
import typings.chromeApps.chromeAppsStrings.interface
import typings.chromeApps.chromeAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDEVICE extends js.Object {
  var DEVICE: device_
  var ENDPOINT: endpoint
  var INTERFACE: interface
  var OTHER: other_
}

object AnonDEVICE {
  @scala.inline
  def apply(DEVICE: device_, ENDPOINT: endpoint, INTERFACE: interface, OTHER: other_): AnonDEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = DEVICE.asInstanceOf[js.Any], ENDPOINT = ENDPOINT.asInstanceOf[js.Any], INTERFACE = INTERFACE.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDEVICE]
  }
}

