package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /**
    * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to exclude from the policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time. You can specify inclusions or exclusions, but not both. If you specify an IncludeMap, AWS Firewall Manager applies the policy to all accounts specified by the IncludeMap, and does not evaluate any ExcludeMap specifications. If you do not specify an IncludeMap, then Firewall Manager applies the policy to all accounts except for those specified by the ExcludeMap. You can specify account IDs, OUs, or a combination:    Specify account IDs by setting the key to ACCOUNT. For example, the following is a valid map: {“ACCOUNT” : [“accountID1”, “accountID2”]}.   Specify OUs by setting the key to ORG_UNIT. For example, the following is a valid map: {“ORG_UNIT” : [“ouid111”, “ouid112”]}.   Specify accounts and OUs together in a single map, separated with a comma. For example, the following is a valid map: {“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}.  
    */
  var ExcludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.native
  /**
    * If set to True, resources with the tags that are specified in the ResourceTag array are not in scope of the policy. If set to False, and the ResourceTag array is not null, only resources with the specified tags are in scope of the policy.
    */
  var ExcludeResourceTags: Boolean = js.native
  /**
    * Specifies the AWS account IDs and AWS Organizations organizational units (OUs) to include in the policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time. You can specify inclusions or exclusions, but not both. If you specify an IncludeMap, AWS Firewall Manager applies the policy to all accounts specified by the IncludeMap, and does not evaluate any ExcludeMap specifications. If you do not specify an IncludeMap, then Firewall Manager applies the policy to all accounts except for those specified by the ExcludeMap. You can specify account IDs, OUs, or a combination:    Specify account IDs by setting the key to ACCOUNT. For example, the following is a valid map: {“ACCOUNT” : [“accountID1”, “accountID2”]}.   Specify OUs by setting the key to ORG_UNIT. For example, the following is a valid map: {“ORG_UNIT” : [“ouid111”, “ouid112”]}.   Specify accounts and OUs together in a single map, separated with a comma. For example, the following is a valid map: {“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}.  
    */
  var IncludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.fmsMod.PolicyId] = js.native
  /**
    * The friendly name of the AWS Firewall Manager policy.
    */
  var PolicyName: ResourceName = js.native
  /**
    * A unique identifier for each update to the policy. When issuing a PutPolicy request, the PolicyUpdateToken in the request must match the PolicyUpdateToken of the current policy version. To get the PolicyUpdateToken of the current policy version, use a GetPolicy request.
    */
  var PolicyUpdateToken: js.UndefOr[typings.awsSdk.fmsMod.PolicyUpdateToken] = js.native
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: Boolean = js.native
  /**
    * An array of ResourceTag objects.
    */
  var ResourceTags: js.UndefOr[typings.awsSdk.fmsMod.ResourceTags] = js.native
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the AWS Resource Types Reference. For AWS WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. 
    */
  var ResourceType: typings.awsSdk.fmsMod.ResourceType = js.native
  /**
    * An array of ResourceType.
    */
  var ResourceTypeList: js.UndefOr[typings.awsSdk.fmsMod.ResourceTypeList] = js.native
  /**
    * Details about the security service that is being used to protect the resources.
    */
  var SecurityServicePolicyData: typings.awsSdk.fmsMod.SecurityServicePolicyData = js.native
}

object Policy {
  @scala.inline
  def apply(
    ExcludeResourceTags: Boolean,
    PolicyName: ResourceName,
    RemediationEnabled: Boolean,
    ResourceType: ResourceType,
    SecurityServicePolicyData: SecurityServicePolicyData,
    ExcludeMap: CustomerPolicyScopeMap = null,
    IncludeMap: CustomerPolicyScopeMap = null,
    PolicyId: PolicyId = null,
    PolicyUpdateToken: PolicyUpdateToken = null,
    ResourceTags: ResourceTags = null,
    ResourceTypeList: ResourceTypeList = null
  ): Policy = {
    val __obj = js.Dynamic.literal(ExcludeResourceTags = ExcludeResourceTags.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], RemediationEnabled = RemediationEnabled.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SecurityServicePolicyData = SecurityServicePolicyData.asInstanceOf[js.Any])
    if (ExcludeMap != null) __obj.updateDynamic("ExcludeMap")(ExcludeMap.asInstanceOf[js.Any])
    if (IncludeMap != null) __obj.updateDynamic("IncludeMap")(IncludeMap.asInstanceOf[js.Any])
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId.asInstanceOf[js.Any])
    if (PolicyUpdateToken != null) __obj.updateDynamic("PolicyUpdateToken")(PolicyUpdateToken.asInstanceOf[js.Any])
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags.asInstanceOf[js.Any])
    if (ResourceTypeList != null) __obj.updateDynamic("ResourceTypeList")(ResourceTypeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

