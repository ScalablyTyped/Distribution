package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubnetChangeProtectionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall.
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it.
    */
  var FirewallName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A setting indicating whether the firewall is protected against changes to the subnet associations. Use this setting to protect against accidentally modifying the subnet associations for a firewall that is in use. When you create a firewall, the operation initializes this setting to TRUE.
    */
  var SubnetChangeProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that access the firewall. The token marks the state of the firewall resource at the time of the request.  To make an unconditional change to the firewall, omit the token in your update request. Without the token, Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved it. To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: js.UndefOr[typings.awsSdk.networkfirewallMod.UpdateToken] = js.undefined
}
object UpdateSubnetChangeProtectionResponse {
  
  @scala.inline
  def apply(): UpdateSubnetChangeProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubnetChangeProtectionResponse]
  }
  
  @scala.inline
  implicit class UpdateSubnetChangeProtectionResponseMutableBuilder[Self <: UpdateSubnetChangeProtectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirewallArn(value: ResourceArn): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    @scala.inline
    def setFirewallName(value: ResourceName): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallNameUndefined: Self = StObject.set(x, "FirewallName", js.undefined)
    
    @scala.inline
    def setSubnetChangeProtection(value: Boolean): Self = StObject.set(x, "SubnetChangeProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetChangeProtectionUndefined: Self = StObject.set(x, "SubnetChangeProtection", js.undefined)
    
    @scala.inline
    def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTokenUndefined: Self = StObject.set(x, "UpdateToken", js.undefined)
  }
}
