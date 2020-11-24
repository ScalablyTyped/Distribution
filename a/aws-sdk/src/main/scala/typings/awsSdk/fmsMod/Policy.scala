package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The name of the AWS Firewall Manager policy.
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
    * The type of resource protected by or in scope of the policy. This is in the format shown in the AWS Resource Types Reference. For AWS WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. For an AWS Network Firewall policy, the value is AWS::EC2::VPC.
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
    SecurityServicePolicyData: SecurityServicePolicyData
  ): Policy = {
    val __obj = js.Dynamic.literal(ExcludeResourceTags = ExcludeResourceTags.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], RemediationEnabled = RemediationEnabled.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SecurityServicePolicyData = SecurityServicePolicyData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
    
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
    def setExcludeResourceTags(value: Boolean): Self = this.set("ExcludeResourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyName(value: ResourceName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationEnabled(value: Boolean): Self = this.set("RemediationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityServicePolicyData(value: SecurityServicePolicyData): Self = this.set("SecurityServicePolicyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeMap(value: CustomerPolicyScopeMap): Self = this.set("ExcludeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeMap: Self = this.set("ExcludeMap", js.undefined)
    
    @scala.inline
    def setIncludeMap(value: CustomerPolicyScopeMap): Self = this.set("IncludeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeMap: Self = this.set("IncludeMap", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyUpdateToken(value: PolicyUpdateToken): Self = this.set("PolicyUpdateToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyUpdateToken: Self = this.set("PolicyUpdateToken", js.undefined)
    
    @scala.inline
    def setResourceTagsVarargs(value: ResourceTag*): Self = this.set("ResourceTags", js.Array(value :_*))
    
    @scala.inline
    def setResourceTags(value: ResourceTags): Self = this.set("ResourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTags: Self = this.set("ResourceTags", js.undefined)
    
    @scala.inline
    def setResourceTypeListVarargs(value: ResourceType*): Self = this.set("ResourceTypeList", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypeList(value: ResourceTypeList): Self = this.set("ResourceTypeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTypeList: Self = this.set("ResourceTypeList", js.undefined)
  }
}
