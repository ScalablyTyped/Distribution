package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.device__
import typings.chromeApps.chromeAppsStrings.endpoint_
import typings.chromeApps.chromeAppsStrings.interface_
import typings.chromeApps.chromeAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDEVICE extends js.Object {
  var DEVICE: device__
  var ENDPOINT: endpoint_
  var INTERFACE: interface_
  var OTHER: other_
}

object AnonDEVICE {
  @scala.inline
  def apply(DEVICE: device__, ENDPOINT: endpoint_, INTERFACE: interface_, OTHER: other_): AnonDEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = DEVICE.asInstanceOf[js.Any], ENDPOINT = ENDPOINT.asInstanceOf[js.Any], INTERFACE = INTERFACE.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDEVICE]
  }
}

