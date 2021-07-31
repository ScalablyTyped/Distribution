package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxySettings[M, S, SL] extends StObject {
  
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
  def apply[M, S, SL](Type: ProxySettingsType | ManagedType[ProxySettingsType]): ProxySettings[M, S, SL] = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySettings[M, S, SL]]
  }
  
  @scala.inline
  implicit class ProxySettingsMutableBuilder[Self <: ProxySettings[?, ?, ?], M, S, SL] (val x: Self & (ProxySettings[M, S, SL])) extends AnyVal {
    
    @scala.inline
    def setExcludeDomains(value: SL): Self = StObject.set(x, "ExcludeDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDomainsUndefined: Self = StObject.set(x, "ExcludeDomains", js.undefined)
    
    @scala.inline
    def setManual(value: ManualProxySettings[M, ProxyLocation | ManagedProxyLocation]): Self = StObject.set(x, "Manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualUndefined: Self = StObject.set(x, "Manual", js.undefined)
    
    @scala.inline
    def setPAC(value: S): Self = StObject.set(x, "PAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPACUndefined: Self = StObject.set(x, "PAC", js.undefined)
    
    @scala.inline
    def setType(value: ProxySettingsType | ManagedType[ProxySettingsType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
