package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyVPNProperties extends StObject {
  
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: String
  
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[String] = js.undefined
}
object ThirdPartyVPNProperties {
  
  inline def apply(ExtensionID: String): ThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal(ExtensionID = ExtensionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyVPNProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThirdPartyVPNProperties] (val x: Self) extends AnyVal {
    
    inline def setExtensionID(value: String): Self = StObject.set(x, "ExtensionID", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
  }
}
