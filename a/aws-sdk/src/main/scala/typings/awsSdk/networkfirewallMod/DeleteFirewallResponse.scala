package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFirewallResponse extends StObject {
  
  var Firewall: js.UndefOr[typings.awsSdk.networkfirewallMod.Firewall] = js.native
  
  var FirewallStatus: js.UndefOr[typings.awsSdk.networkfirewallMod.FirewallStatus] = js.native
}
object DeleteFirewallResponse {
  
  @scala.inline
  def apply(): DeleteFirewallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallResponse]
  }
  
  @scala.inline
  implicit class DeleteFirewallResponseMutableBuilder[Self <: DeleteFirewallResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewall(value: Firewall): Self = StObject.set(x, "Firewall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallStatus(value: FirewallStatus): Self = StObject.set(x, "FirewallStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallStatusUndefined: Self = StObject.set(x, "FirewallStatus", js.undefined)
    
    @scala.inline
    def setFirewallUndefined: Self = StObject.set(x, "Firewall", js.undefined)
  }
}
