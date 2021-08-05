package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPNProperties[M /* <: ManagedObject */, B, S] extends StObject {
  
  /** Whether the VPN network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.undefined
  
  /** The VPN host. */
  var Host: js.UndefOr[S] = js.undefined
  
  /**
    * The VPN type.
    * This cannot be an enum because of 'L2TP-IPSec'.
    * This is optional for NetworkConfigProperties which is passed to
    * *setProperties* which may be used to set only specific properties.
    */
  var Type: js.UndefOr[S] = js.undefined
}
object VPNProperties {
  
  inline def apply[M /* <: ManagedObject */, B, S](): VPNProperties[M, B, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPNProperties[M, B, S]]
  }
  
  extension [Self <: VPNProperties[?, ?, ?], M /* <: ManagedObject */, B, S](x: Self & (VPNProperties[M, B, S])) {
    
    inline def setAutoConnect(value: B): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    inline def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    inline def setHost(value: S): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    inline def setType(value: S): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
