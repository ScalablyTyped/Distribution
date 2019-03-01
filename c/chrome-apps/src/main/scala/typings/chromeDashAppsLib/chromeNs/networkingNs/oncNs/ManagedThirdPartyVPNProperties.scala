package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedThirdPartyVPNProperties extends js.Object {
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: ManagedDOMString
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedThirdPartyVPNProperties {
  @scala.inline
  def apply(ExtensionID: ManagedDOMString, ProviderName: java.lang.String = null): ManagedThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ExtensionID")(ExtensionID)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    __obj.asInstanceOf[ManagedThirdPartyVPNProperties]
  }
}

