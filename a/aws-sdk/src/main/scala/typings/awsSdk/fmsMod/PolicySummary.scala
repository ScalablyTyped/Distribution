package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicySummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the specified policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.native
  
  /**
    * The ID of the specified policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.fmsMod.PolicyId] = js.native
  
  /**
    * The name of the specified policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.native
  
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the AWS Resource Types Reference. For AWS WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. For an AWS Network Firewall policy, the value is AWS::EC2::VPC.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.fmsMod.ResourceType] = js.native
  
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy.
    */
  var SecurityServiceType: js.UndefOr[typings.awsSdk.fmsMod.SecurityServiceType] = js.native
}
object PolicySummary {
  
  @scala.inline
  def apply(): PolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicySummary]
  }
  
  @scala.inline
  implicit class PolicySummaryOps[Self <: PolicySummary] (val x: Self) extends AnyVal {
    
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
    def setPolicyArn(value: ResourceArn): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyName(value: ResourceName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
    
    @scala.inline
    def setRemediationEnabled(value: Boolean): Self = this.set("RemediationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemediationEnabled: Self = this.set("RemediationEnabled", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setSecurityServiceType(value: SecurityServiceType): Self = this.set("SecurityServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityServiceType: Self = this.set("SecurityServiceType", js.undefined)
  }
}
