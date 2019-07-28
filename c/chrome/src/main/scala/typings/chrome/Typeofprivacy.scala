package typings.chrome

import typings.chrome.chromeNs.privacyNs.Network
import typings.chrome.chromeNs.privacyNs.Services
import typings.chrome.chromeNs.privacyNs.Websites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofprivacy extends js.Object {
  var network: Network
  var services: Services
  var websites: Websites
}

object Typeofprivacy {
  @scala.inline
  def apply(network: Network, services: Services, websites: Websites): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network, services = services, websites = websites)
  
    __obj.asInstanceOf[Typeofprivacy]
  }
}

