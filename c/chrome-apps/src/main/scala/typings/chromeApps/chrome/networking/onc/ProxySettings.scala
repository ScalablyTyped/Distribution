package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxySettings[M, S, SL] extends js.Object {
  
  /** Domains and hosts for which manual proxy settings are excluded. */
  var ExcludeDomains: js.UndefOr[SL] = js.native
  
  /** Manual proxy settings - used only for *Manual* proxy settings. */
  var Manual: js.UndefOr[ManualProxySettings[M, ProxyLocation | ManagedProxyLocation]] = js.native
  
  /** URL for proxy auto-configuration file. */
  var PAC: js.UndefOr[S] = js.native
  
  /** The type of proxy settings. */
  var Type: ProxySettingsType | ManagedType[ProxySettingsType] = js.native
}
object ProxySettings {
  
  @scala.inline
  def apply[M, S, SL](Type: ProxySettingsType | ManagedType[ProxySettingsType]): ProxySettings[M, S, SL] = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySettings[M, S, SL]]
  }
  
  @scala.inline
  implicit class ProxySettingsOps[Self <: ProxySettings[_, _, _], M, S, SL] (val x: Self with (ProxySettings[M, S, SL])) extends AnyVal {
    
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
    def setType(value: ProxySettingsType | ManagedType[ProxySettingsType]): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDomains(value: SL): Self = this.set("ExcludeDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeDomains: Self = this.set("ExcludeDomains", js.undefined)
    
    @scala.inline
    def setManual(value: ManualProxySettings[M, ProxyLocation | ManagedProxyLocation]): Self = this.set("Manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManual: Self = this.set("Manual", js.undefined)
    
    @scala.inline
    def setPAC(value: S): Self = this.set("PAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePAC: Self = this.set("PAC", js.undefined)
  }
}
