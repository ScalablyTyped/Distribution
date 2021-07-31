package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallDescriptionRequest extends StObject {
  
  /**
    * The new description for the firewall. If you omit this setting, Network Firewall removes the description for the firewall.
    */
  var Description: js.UndefOr[typings.awsSdk.networkfirewallMod.Description] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the firewall. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that access the firewall. The token marks the state of the firewall resource at the time of the request.  To make an unconditional change to the firewall, omit the token in your update request. Without the token, Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved it. To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: js.UndefOr[typings.awsSdk.networkfirewallMod.UpdateToken] = js.undefined
}
object UpdateFirewallDescriptionRequest {
  
  @scala.inline
  def apply(): UpdateFirewallDescriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFirewallDescriptionRequest]
  }
  
  @scala.inline
  implicit class UpdateFirewallDescriptionRequestMutableBuilder[Self <: UpdateFirewallDescriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFirewallArn(value: ResourceArn): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    @scala.inline
    def setFirewallName(value: ResourceName): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirewallNameUndefined: Self = StObject.set(x, "FirewallName", js.undefined)
    
    @scala.inline
    def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTokenUndefined: Self = StObject.set(x, "UpdateToken", js.undefined)
  }
}
