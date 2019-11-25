package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedThirdPartyVPNProperties extends js.Object {
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: ManagedDOMString
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[String] = js.undefined
}

object ManagedThirdPartyVPNProperties {
  @scala.inline
  def apply(ExtensionID: ManagedDOMString, ProviderName: String = null): ManagedThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal(ExtensionID = ExtensionID.asInstanceOf[js.Any])
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedThirdPartyVPNProperties]
  }
}

