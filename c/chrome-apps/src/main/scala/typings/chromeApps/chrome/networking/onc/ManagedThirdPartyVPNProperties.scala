package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedThirdPartyVPNProperties extends StObject {
  
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: ManagedDOMString
  
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[String] = js.undefined
}
object ManagedThirdPartyVPNProperties {
  
  inline def apply(ExtensionID: ManagedDOMString): ManagedThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal(ExtensionID = ExtensionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedThirdPartyVPNProperties]
  }
  
  extension [Self <: ManagedThirdPartyVPNProperties](x: Self) {
    
    inline def setExtensionID(value: ManagedDOMString): Self = StObject.set(x, "ExtensionID", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
  }
}
