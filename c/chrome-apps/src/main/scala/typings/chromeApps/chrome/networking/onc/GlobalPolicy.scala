package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalPolicy extends js.Object {
  
  /**
    * If true, only policy networks may auto connect.
    * @default false
    */
  var AllowOnlyPolicyNetworksToAutoconnect: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, only policy networks may be connected to
    * and no new networks may be added or configured.
    * @default false
    */
  var AllowOnlyPolicyNetworksToConnect: js.UndefOr[Boolean] = js.native
  
  /**
    * List of blacklisted networks.
    * Connections to blacklisted networks are prohibited.
    * Networks can be whitelisted again by specifying an explicit network configuration.
    * @default []
    */
  var BlacklistedHexSSIDs: js.UndefOr[js.Array[String]] = js.native
}
object GlobalPolicy {
  
  @scala.inline
  def apply(): GlobalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPolicy]
  }
  
  @scala.inline
  implicit class GlobalPolicyOps[Self <: GlobalPolicy] (val x: Self) extends AnyVal {
    
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
    def setAllowOnlyPolicyNetworksToAutoconnect(value: Boolean): Self = this.set("AllowOnlyPolicyNetworksToAutoconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOnlyPolicyNetworksToAutoconnect: Self = this.set("AllowOnlyPolicyNetworksToAutoconnect", js.undefined)
    
    @scala.inline
    def setAllowOnlyPolicyNetworksToConnect(value: Boolean): Self = this.set("AllowOnlyPolicyNetworksToConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOnlyPolicyNetworksToConnect: Self = this.set("AllowOnlyPolicyNetworksToConnect", js.undefined)
    
    @scala.inline
    def setBlacklistedHexSSIDsVarargs(value: String*): Self = this.set("BlacklistedHexSSIDs", js.Array(value :_*))
    
    @scala.inline
    def setBlacklistedHexSSIDs(value: js.Array[String]): Self = this.set("BlacklistedHexSSIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklistedHexSSIDs: Self = this.set("BlacklistedHexSSIDs", js.undefined)
  }
}
