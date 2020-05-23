package typings.chrome.anon

import typings.chrome.chrome.privacy.Network
import typings.chrome.chrome.privacy.Services
import typings.chrome.chrome.privacy.Websites
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
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprivacy]
  }
}

