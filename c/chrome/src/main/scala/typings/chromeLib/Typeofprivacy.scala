package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofprivacy extends js.Object {
  var network: chromeLib.chromeNs.privacyNs.Network
  var services: chromeLib.chromeNs.privacyNs.Services
  var websites: chromeLib.chromeNs.privacyNs.Websites
}

object Typeofprivacy {
  @scala.inline
  def apply(
    network: chromeLib.chromeNs.privacyNs.Network,
    services: chromeLib.chromeNs.privacyNs.Services,
    websites: chromeLib.chromeNs.privacyNs.Websites
  ): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network, services = services, websites = websites)
  
    __obj.asInstanceOf[Typeofprivacy]
  }
}

