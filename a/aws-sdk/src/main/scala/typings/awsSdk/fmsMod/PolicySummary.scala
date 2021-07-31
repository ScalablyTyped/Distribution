package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicySummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the specified policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the specified policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.fmsMod.PolicyId] = js.undefined
  
  /**
    * The name of the specified policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the AWS Resource Types Reference. For AWS WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. For an AWS Network Firewall policy, the value is AWS::EC2::VPC.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.fmsMod.ResourceType] = js.undefined
  
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy.
    */
  var SecurityServiceType: js.UndefOr[typings.awsSdk.fmsMod.SecurityServiceType] = js.undefined
}
object PolicySummary {
  
  @scala.inline
  def apply(): PolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicySummary]
  }
  
  @scala.inline
  implicit class PolicySummaryMutableBuilder[Self <: PolicySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyArn(value: ResourceArn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyName(value: ResourceName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    @scala.inline
    def setRemediationEnabled(value: Boolean): Self = StObject.set(x, "RemediationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationEnabledUndefined: Self = StObject.set(x, "RemediationEnabled", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setSecurityServiceType(value: SecurityServiceType): Self = StObject.set(x, "SecurityServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityServiceTypeUndefined: Self = StObject.set(x, "SecurityServiceType", js.undefined)
  }
}
