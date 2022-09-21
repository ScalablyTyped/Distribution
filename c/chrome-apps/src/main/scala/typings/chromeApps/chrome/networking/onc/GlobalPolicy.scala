package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalPolicy extends StObject {
  
  /**
    * If true, only policy networks may auto connect.
    * @default false
    */
  var AllowOnlyPolicyNetworksToAutoconnect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, only policy networks may be connected to
    * and no new networks may be added or configured.
    * @default false
    */
  var AllowOnlyPolicyNetworksToConnect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of blacklisted networks.
    * Connections to blacklisted networks are prohibited.
    * Networks can be whitelisted again by specifying an explicit network configuration.
    * @default []
    */
  var BlacklistedHexSSIDs: js.UndefOr[js.Array[String]] = js.undefined
}
object GlobalPolicy {
  
  inline def apply(): GlobalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPolicy]
  }
  
  extension [Self <: GlobalPolicy](x: Self) {
    
    inline def setAllowOnlyPolicyNetworksToAutoconnect(value: Boolean): Self = StObject.set(x, "AllowOnlyPolicyNetworksToAutoconnect", value.asInstanceOf[js.Any])
    
    inline def setAllowOnlyPolicyNetworksToAutoconnectUndefined: Self = StObject.set(x, "AllowOnlyPolicyNetworksToAutoconnect", js.undefined)
    
    inline def setAllowOnlyPolicyNetworksToConnect(value: Boolean): Self = StObject.set(x, "AllowOnlyPolicyNetworksToConnect", value.asInstanceOf[js.Any])
    
    inline def setAllowOnlyPolicyNetworksToConnectUndefined: Self = StObject.set(x, "AllowOnlyPolicyNetworksToConnect", js.undefined)
    
    inline def setBlacklistedHexSSIDs(value: js.Array[String]): Self = StObject.set(x, "BlacklistedHexSSIDs", value.asInstanceOf[js.Any])
    
    inline def setBlacklistedHexSSIDsUndefined: Self = StObject.set(x, "BlacklistedHexSSIDs", js.undefined)
    
    inline def setBlacklistedHexSSIDsVarargs(value: String*): Self = StObject.set(x, "BlacklistedHexSSIDs", js.Array(value*))
  }
}
