package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxySettings[M, S, SL] extends js.Object {
  /** Domains and hosts for which manual proxy settings are excluded. */
  var ExcludeDomains: js.UndefOr[SL] = js.undefined
  /** Manual proxy settings - used only for *Manual* proxy settings. */
  var Manual: js.UndefOr[ManualProxySettings[M, ProxyLocation | ManagedProxyLocation]] = js.undefined
  /** URL for proxy auto-configuration file. */
  var PAC: js.UndefOr[S] = js.undefined
  /** The type of proxy settings. */
  var Type: ProxySettingsType | ManagedType[ProxySettingsType]
}

object ProxySettings {
  @scala.inline
  def apply[M, S, SL](
    Type: ProxySettingsType | ManagedType[ProxySettingsType],
    ExcludeDomains: SL = null,
    Manual: ManualProxySettings[M, ProxyLocation | ManagedProxyLocation] = null,
    PAC: S = null
  ): ProxySettings[M, S, SL] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (ExcludeDomains != null) __obj.updateDynamic("ExcludeDomains")(ExcludeDomains.asInstanceOf[js.Any])
    if (Manual != null) __obj.updateDynamic("Manual")(Manual)
    if (PAC != null) __obj.updateDynamic("PAC")(PAC.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySettings[M, S, SL]]
  }
}

