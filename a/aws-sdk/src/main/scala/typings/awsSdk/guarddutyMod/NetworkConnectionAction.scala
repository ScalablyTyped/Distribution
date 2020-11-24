package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkConnectionAction extends js.Object {
  
  /**
    * Indicates whether EC2 blocked the network connection to your instance.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  
  /**
    * The network connection direction.
    */
  var ConnectionDirection: js.UndefOr[String] = js.native
  
  /**
    * The local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalIpDetails] = js.native
  
  /**
    * The local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalPortDetails] = js.native
  
  /**
    * The network connection protocol.
    */
  var Protocol: js.UndefOr[String] = js.native
  
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
  
  /**
    * The remote port information of the connection.
    */
  var RemotePortDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemotePortDetails] = js.native
}
object NetworkConnectionAction {
  
  @scala.inline
  def apply(): NetworkConnectionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnectionAction]
  }
  
  @scala.inline
  implicit class NetworkConnectionActionOps[Self <: NetworkConnectionAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlocked(value: Boolean): Self = this.set("Blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocked: Self = this.set("Blocked", js.undefined)
    
    @scala.inline
    def setConnectionDirection(value: String): Self = this.set("ConnectionDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionDirection: Self = this.set("ConnectionDirection", js.undefined)
    
    @scala.inline
    def setLocalIpDetails(value: LocalIpDetails): Self = this.set("LocalIpDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalIpDetails: Self = this.set("LocalIpDetails", js.undefined)
    
    @scala.inline
    def setLocalPortDetails(value: LocalPortDetails): Self = this.set("LocalPortDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalPortDetails: Self = this.set("LocalPortDetails", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
    
    @scala.inline
    def setRemoteIpDetails(value: RemoteIpDetails): Self = this.set("RemoteIpDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteIpDetails: Self = this.set("RemoteIpDetails", js.undefined)
    
    @scala.inline
    def setRemotePortDetails(value: RemotePortDetails): Self = this.set("RemotePortDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemotePortDetails: Self = this.set("RemotePortDetails", js.undefined)
  }
}
