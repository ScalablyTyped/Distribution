package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The friendly name of the specified policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.native
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the AWS Resource Types Reference. For AWS WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. 
    */
  var ResourceType: js.UndefOr[typings.awsSdk.fmsMod.ResourceType] = js.native
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either an AWS WAF policy, a Shield Advanced policy, or a security group policy.
    */
  var SecurityServiceType: js.UndefOr[typings.awsSdk.fmsMod.SecurityServiceType] = js.native
}

object PolicySummary {
  @scala.inline
  def apply(
    PolicyArn: ResourceArn = null,
    PolicyId: PolicyId = null,
    PolicyName: ResourceName = null,
    RemediationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ResourceType: ResourceType = null,
    SecurityServiceType: SecurityServiceType = null
  ): PolicySummary = {
    val __obj = js.Dynamic.literal()
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    if (!js.isUndefined(RemediationEnabled)) __obj.updateDynamic("RemediationEnabled")(RemediationEnabled.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (SecurityServiceType != null) __obj.updateDynamic("SecurityServiceType")(SecurityServiceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicySummary]
  }
}

