package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceViolation extends StObject {
  
  /**
    * Violation details for an EC2 instance.
    */
  var AwsEc2InstanceViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsEc2InstanceViolation] = js.undefined
  
  /**
    * Violation details for network interface.
    */
  var AwsEc2NetworkInterfaceViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsEc2NetworkInterfaceViolation] = js.undefined
  
  /**
    * Violation details for security groups.
    */
  var AwsVPCSecurityGroupViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsVPCSecurityGroupViolation] = js.undefined
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the expected Firewall Manager managed route table. 
    */
  var NetworkFirewallMissingExpectedRTViolation: js.UndefOr[typings.awsSdk.fmsMod.NetworkFirewallMissingExpectedRTViolation] = js.undefined
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager managed firewall in its VPC. 
    */
  var NetworkFirewallMissingFirewallViolation: js.UndefOr[typings.awsSdk.fmsMod.NetworkFirewallMissingFirewallViolation] = js.undefined
  
  /**
    * Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the expected Firewall Manager managed subnet.
    */
  var NetworkFirewallMissingSubnetViolation: js.UndefOr[typings.awsSdk.fmsMod.NetworkFirewallMissingSubnetViolation] = js.undefined
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual account has been modified in a way that makes it noncompliant. For example, the individual account owner might have deleted a rule group, changed the priority of a stateless rule group, or changed a policy default action.
    */
  var NetworkFirewallPolicyModifiedViolation: js.UndefOr[typings.awsSdk.fmsMod.NetworkFirewallPolicyModifiedViolation] = js.undefined
}
object ResourceViolation {
  
  inline def apply(): ResourceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceViolation]
  }
  
  extension [Self <: ResourceViolation](x: Self) {
    
    inline def setAwsEc2InstanceViolation(value: AwsEc2InstanceViolation): Self = StObject.set(x, "AwsEc2InstanceViolation", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2InstanceViolationUndefined: Self = StObject.set(x, "AwsEc2InstanceViolation", js.undefined)
    
    inline def setAwsEc2NetworkInterfaceViolation(value: AwsEc2NetworkInterfaceViolation): Self = StObject.set(x, "AwsEc2NetworkInterfaceViolation", value.asInstanceOf[js.Any])
    
    inline def setAwsEc2NetworkInterfaceViolationUndefined: Self = StObject.set(x, "AwsEc2NetworkInterfaceViolation", js.undefined)
    
    inline def setAwsVPCSecurityGroupViolation(value: AwsVPCSecurityGroupViolation): Self = StObject.set(x, "AwsVPCSecurityGroupViolation", value.asInstanceOf[js.Any])
    
    inline def setAwsVPCSecurityGroupViolationUndefined: Self = StObject.set(x, "AwsVPCSecurityGroupViolation", js.undefined)
    
    inline def setNetworkFirewallMissingExpectedRTViolation(value: NetworkFirewallMissingExpectedRTViolation): Self = StObject.set(x, "NetworkFirewallMissingExpectedRTViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallMissingExpectedRTViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingExpectedRTViolation", js.undefined)
    
    inline def setNetworkFirewallMissingFirewallViolation(value: NetworkFirewallMissingFirewallViolation): Self = StObject.set(x, "NetworkFirewallMissingFirewallViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallMissingFirewallViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingFirewallViolation", js.undefined)
    
    inline def setNetworkFirewallMissingSubnetViolation(value: NetworkFirewallMissingSubnetViolation): Self = StObject.set(x, "NetworkFirewallMissingSubnetViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallMissingSubnetViolationUndefined: Self = StObject.set(x, "NetworkFirewallMissingSubnetViolation", js.undefined)
    
    inline def setNetworkFirewallPolicyModifiedViolation(value: NetworkFirewallPolicyModifiedViolation): Self = StObject.set(x, "NetworkFirewallPolicyModifiedViolation", value.asInstanceOf[js.Any])
    
    inline def setNetworkFirewallPolicyModifiedViolationUndefined: Self = StObject.set(x, "NetworkFirewallPolicyModifiedViolation", js.undefined)
  }
}
