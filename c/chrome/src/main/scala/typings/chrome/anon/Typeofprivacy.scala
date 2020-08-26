package typings.chrome.anon

import typings.chrome.chrome.privacy.Network
import typings.chrome.chrome.privacy.Services
import typings.chrome.chrome.privacy.Websites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofprivacy extends js.Object {
  var network: Network = js.native
  var services: Services = js.native
  var websites: Websites = js.native
}

object Typeofprivacy {
  @scala.inline
  def apply(network: Network, services: Services, websites: Websites): Typeofprivacy = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], websites = websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofprivacy]
  }
  @scala.inline
  implicit class TypeofprivacyOps[Self <: Typeofprivacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def setServices(value: Services): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsites(value: Websites): Self = this.set("websites", value.asInstanceOf[js.Any])
  }
  
}

