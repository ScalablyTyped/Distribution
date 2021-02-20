package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPNProperties[M /* <: ManagedObject */, B, S] extends StObject {
  
  /** Whether the VPN network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.native
  
  /** The VPN host. */
  var Host: js.UndefOr[S] = js.native
  
  /**
    * The VPN type.
    * This cannot be an enum because of 'L2TP-IPSec'.
    * This is optional for NetworkConfigProperties which is passed to
    * *setProperties* which may be used to set only specific properties.
    */
  var Type: js.UndefOr[S] = js.native
}
object VPNProperties {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, B, S](): VPNProperties[M, B, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPNProperties[M, B, S]]
  }
  
  @scala.inline
  implicit class VPNPropertiesMutableBuilder[Self <: VPNProperties[_, _, _], M /* <: ManagedObject */, B, S] (val x: Self with (VPNProperties[M, B, S])) extends AnyVal {
    
    @scala.inline
    def setAutoConnect(value: B): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    @scala.inline
    def setHost(value: S): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    @scala.inline
    def setType(value: S): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
