package typings.chromeApps.chrome.mdns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary
  * [key in ValidServiceTypes]: string
  */
/* Inlined std.Record<chrome-apps.chrome.mdns.ValidServiceTypes, string> */
trait ServiceTypes extends js.Object {
  var serviceType: String
}

object ServiceTypes {
  @scala.inline
  def apply(serviceType: String): ServiceTypes = {
    val __obj = js.Dynamic.literal(serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceTypes]
  }
}

