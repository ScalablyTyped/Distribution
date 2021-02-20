package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFirewallPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallPolicyArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallPolicyName: js.UndefOr[ResourceName] = js.native
}
object DeleteFirewallPolicyRequest {
  
  @scala.inline
  def apply(): DeleteFirewallPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteFirewallPolicyRequestMutableBuilder[Self <: DeleteFirewallPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewallPolicyArn(value: ResourceArn): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyArnUndefined: Self = StObject.set(x, "FirewallPolicyArn", js.undefined)
    
    @scala.inline
    def setFirewallPolicyName(value: ResourceName): Self = StObject.set(x, "FirewallPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallPolicyNameUndefined: Self = StObject.set(x, "FirewallPolicyName", js.undefined)
  }
}
