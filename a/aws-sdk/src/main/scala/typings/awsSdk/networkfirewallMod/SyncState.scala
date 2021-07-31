package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncState extends StObject {
  
  /**
    * The attachment status of the firewall's association with a single VPC subnet. For each configured subnet, Network Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's ready to take traffic. This is part of the FirewallStatus.
    */
  var Attachment: js.UndefOr[typings.awsSdk.networkfirewallMod.Attachment] = js.undefined
  
  /**
    * The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each endpoint with the rules that are configured in the firewall policy. Each time you add a subnet or modify the associated firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can properly filter network traffic. This is part of the FirewallStatus.
    */
  var Config: js.UndefOr[SyncStateConfig] = js.undefined
}
object SyncState {
  
  @scala.inline
  def apply(): SyncState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncState]
  }
  
  @scala.inline
  implicit class SyncStateMutableBuilder[Self <: SyncState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    @scala.inline
    def setConfig(value: SyncStateConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
  }
}
