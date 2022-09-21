package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsNetworkFirewallFirewallPolicyDetails extends StObject {
  
  /**
    * A description of the firewall policy.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The firewall policy configuration.
    */
  var FirewallPolicy: js.UndefOr[FirewallPolicyDetails] = js.undefined
  
  /**
    * The ARN of the firewall policy.
    */
  var FirewallPolicyArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the firewall policy.
    */
  var FirewallPolicyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the firewall policy.
    */
  var FirewallPolicyName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsNetworkFirewallFirewallPolicyDetails {
  
  inline def apply(): AwsNetworkFirewallFirewallPolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsNetworkFirewallFirewallPolicyDetails]
  }
  
  extension [Self <: AwsNetworkFirewallFirewallPolicyDetails](x: Self) {
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFirewallPolicy(value: FirewallPolicyDetails): Self = StObject.set(x, "FirewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyArn(value: NonEmptyString): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyArnUndefined: Self = StObject.set(x, "FirewallPolicyArn", js.undefined)
    
    inline def setFirewallPolicyId(value: NonEmptyString): Self = StObject.set(x, "FirewallPolicyId", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyIdUndefined: Self = StObject.set(x, "FirewallPolicyId", js.undefined)
    
    inline def setFirewallPolicyName(value: NonEmptyString): Self = StObject.set(x, "FirewallPolicyName", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyNameUndefined: Self = StObject.set(x, "FirewallPolicyName", js.undefined)
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "FirewallPolicy", js.undefined)
  }
}
