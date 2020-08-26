package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedThirdPartyVPNProperties extends js.Object {
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: ManagedDOMString = js.native
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[String] = js.native
}

object ManagedThirdPartyVPNProperties {
  @scala.inline
  def apply(ExtensionID: ManagedDOMString): ManagedThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal(ExtensionID = ExtensionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedThirdPartyVPNProperties]
  }
  @scala.inline
  implicit class ManagedThirdPartyVPNPropertiesOps[Self <: ManagedThirdPartyVPNProperties] (val x: Self) extends AnyVal {
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
    def setExtensionID(value: ManagedDOMString): Self = this.set("ExtensionID", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderName(value: String): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderName: Self = this.set("ProviderName", js.undefined)
  }
  
}

