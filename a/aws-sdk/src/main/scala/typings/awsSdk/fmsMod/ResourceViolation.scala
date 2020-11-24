package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceViolation extends js.Object {
  
  /**
    * Violation details for an EC2 instance.
    */
  var AwsEc2InstanceViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsEc2InstanceViolation] = js.native
  
  /**
    * Violation details for network interface.
    */
  var AwsEc2NetworkInterfaceViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsEc2NetworkInterfaceViolation] = js.native
  
  /**
    * Violation details for security groups.
    */
  var AwsVPCSecurityGroupViolation: js.UndefOr[typings.awsSdk.fmsMod.AwsVPCSecurityGroupViolation] = js.native
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a subnet is not associated with the expected Firewall Manager managed route table. 
    */
  var NetworkFirewallMissingExpectedRTViolation: js.UndefOr[typings.awsSdk.fmsMod.NetworkFirewallMissingExpectedRTViolation] = js.native
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a subnet has no Firewall Manager managed firewall in its VPC. 
    */
  var NetworkFirewallMissingFirewallViolation: js.UndefOr[typings.awsSdk.fmsMod.NetworkFirewallMissingFirewallViolation] = js.native
  
  /**
    * Violation detail for an Network Firewall policy that indicates that an Availability Zone is missing the expected Firewall Manager managed subnet.
    */
  var NetworkFirewallMissingSubnetViolation: js.UndefOr[typings.awsSdk.fmsMod.NetworkFirewallMissingSubnetViolation] = js.native
  
  /**
    * Violation detail for an Network Firewall policy that indicates that a firewall policy in an individual account has been modified in a way that makes it noncompliant. For example, the individual account owner might have deleted a rule group, changed the priority of a stateless rule group, or changed a policy default action.
    */
  var NetworkFirewallPolicyModifiedViolation: js.UndefOr[typings.awsSdk.fmsMod.NetworkFirewallPolicyModifiedViolation] = js.native
}
object ResourceViolation {
  
  @scala.inline
  def apply(): ResourceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceViolation]
  }
  
  @scala.inline
  implicit class ResourceViolationOps[Self <: ResourceViolation] (val x: Self) extends AnyVal {
    
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
    def setAwsEc2InstanceViolation(value: AwsEc2InstanceViolation): Self = this.set("AwsEc2InstanceViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsEc2InstanceViolation: Self = this.set("AwsEc2InstanceViolation", js.undefined)
    
    @scala.inline
    def setAwsEc2NetworkInterfaceViolation(value: AwsEc2NetworkInterfaceViolation): Self = this.set("AwsEc2NetworkInterfaceViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsEc2NetworkInterfaceViolation: Self = this.set("AwsEc2NetworkInterfaceViolation", js.undefined)
    
    @scala.inline
    def setAwsVPCSecurityGroupViolation(value: AwsVPCSecurityGroupViolation): Self = this.set("AwsVPCSecurityGroupViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsVPCSecurityGroupViolation: Self = this.set("AwsVPCSecurityGroupViolation", js.undefined)
    
    @scala.inline
    def setNetworkFirewallMissingExpectedRTViolation(value: NetworkFirewallMissingExpectedRTViolation): Self = this.set("NetworkFirewallMissingExpectedRTViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkFirewallMissingExpectedRTViolation: Self = this.set("NetworkFirewallMissingExpectedRTViolation", js.undefined)
    
    @scala.inline
    def setNetworkFirewallMissingFirewallViolation(value: NetworkFirewallMissingFirewallViolation): Self = this.set("NetworkFirewallMissingFirewallViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkFirewallMissingFirewallViolation: Self = this.set("NetworkFirewallMissingFirewallViolation", js.undefined)
    
    @scala.inline
    def setNetworkFirewallMissingSubnetViolation(value: NetworkFirewallMissingSubnetViolation): Self = this.set("NetworkFirewallMissingSubnetViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkFirewallMissingSubnetViolation: Self = this.set("NetworkFirewallMissingSubnetViolation", js.undefined)
    
    @scala.inline
    def setNetworkFirewallPolicyModifiedViolation(value: NetworkFirewallPolicyModifiedViolation): Self = this.set("NetworkFirewallPolicyModifiedViolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkFirewallPolicyModifiedViolation: Self = this.set("NetworkFirewallPolicyModifiedViolation", js.undefined)
  }
}
