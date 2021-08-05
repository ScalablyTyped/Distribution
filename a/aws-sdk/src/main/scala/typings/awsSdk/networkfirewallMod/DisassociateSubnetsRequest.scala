package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateSubnetsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the firewall. You can't change the name of a firewall after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var FirewallName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The unique identifiers for the subnets that you want to disassociate. 
    */
  var SubnetIds: AzSubnets
  
  /**
    * An optional token that you can use for optimistic locking. Network Firewall returns a token to your requests that access the firewall. The token marks the state of the firewall resource at the time of the request.  To make an unconditional change to the firewall, omit the token in your update request. Without the token, Network Firewall performs your updates regardless of whether the firewall has changed since you last retrieved it. To make a conditional change to the firewall, provide the token in your update request. Network Firewall uses the token to ensure that the firewall hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the firewall again to get a current copy of it with a new token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: js.UndefOr[typings.awsSdk.networkfirewallMod.UpdateToken] = js.undefined
}
object DisassociateSubnetsRequest {
  
  inline def apply(SubnetIds: AzSubnets): DisassociateSubnetsRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSubnetsRequest]
  }
  
  extension [Self <: DisassociateSubnetsRequest](x: Self) {
    
    inline def setFirewallArn(value: ResourceArn): Self = StObject.set(x, "FirewallArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallArnUndefined: Self = StObject.set(x, "FirewallArn", js.undefined)
    
    inline def setFirewallName(value: ResourceName): Self = StObject.set(x, "FirewallName", value.asInstanceOf[js.Any])
    
    inline def setFirewallNameUndefined: Self = StObject.set(x, "FirewallName", js.undefined)
    
    inline def setSubnetIds(value: AzSubnets): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: AzSubnet*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
    
    inline def setUpdateTokenUndefined: Self = StObject.set(x, "UpdateToken", js.undefined)
  }
}
