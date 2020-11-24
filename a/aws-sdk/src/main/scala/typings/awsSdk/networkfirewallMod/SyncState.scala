package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncState extends js.Object {
  
  /**
    * The attachment status of the firewall's association with a single VPC subnet. For each configured subnet, Network Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's ready to take traffic. This is part of the FirewallStatus.
    */
  var Attachment: js.UndefOr[typings.awsSdk.networkfirewallMod.Attachment] = js.native
  
  /**
    * The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each endpoint with the rules that are configured in the firewall policy. Each time you add a subnet or modify the associated firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can properly filter network traffic. This is part of the FirewallStatus.
    */
  var Config: js.UndefOr[SyncStateConfig] = js.native
}
object SyncState {
  
  @scala.inline
  def apply(): SyncState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncState]
  }
  
  @scala.inline
  implicit class SyncStateOps[Self <: SyncState] (val x: Self) extends AnyVal {
    
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
    def setAttachment(value: Attachment): Self = this.set("Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("Attachment", js.undefined)
    
    @scala.inline
    def setConfig(value: SyncStateConfig): Self = this.set("Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("Config", js.undefined)
  }
}
