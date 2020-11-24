package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPNProperties[M /* <: ManagedObject */, B, S] extends js.Object {
  
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
  implicit class VPNPropertiesOps[Self <: VPNProperties[_, _, _], M /* <: ManagedObject */, B, S] (val x: Self with (VPNProperties[M, B, S])) extends AnyVal {
    
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
    def setAutoConnect(value: B): Self = this.set("AutoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("AutoConnect", js.undefined)
    
    @scala.inline
    def setHost(value: S): Self = this.set("Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
    
    @scala.inline
    def setType(value: S): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
