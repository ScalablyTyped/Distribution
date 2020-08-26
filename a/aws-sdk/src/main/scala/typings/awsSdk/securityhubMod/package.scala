package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object securityhubMod {
  type AccountDetailsList = js.Array[typings.awsSdk.securityhubMod.AccountDetails]
  type AccountId = java.lang.String
  type AccountIdList = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  type ActionTargetList = js.Array[typings.awsSdk.securityhubMod.ActionTarget]
  type ArnList = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  type AvailabilityZones = js.Array[typings.awsSdk.securityhubMod.AvailabilityZone]
  type AwsCloudFrontDistributionOriginItemList = js.Array[typings.awsSdk.securityhubMod.AwsCloudFrontDistributionOriginItem]
  type AwsEc2NetworkInterfaceSecurityGroupList = js.Array[typings.awsSdk.securityhubMod.AwsEc2NetworkInterfaceSecurityGroup]
  type AwsEc2SecurityGroupIpPermissionList = js.Array[typings.awsSdk.securityhubMod.AwsEc2SecurityGroupIpPermission]
  type AwsEc2SecurityGroupIpRangeList = js.Array[typings.awsSdk.securityhubMod.AwsEc2SecurityGroupIpRange]
  type AwsEc2SecurityGroupIpv6RangeList = js.Array[typings.awsSdk.securityhubMod.AwsEc2SecurityGroupIpv6Range]
  type AwsEc2SecurityGroupPrefixListIdList = js.Array[typings.awsSdk.securityhubMod.AwsEc2SecurityGroupPrefixListId]
  type AwsEc2SecurityGroupUserIdGroupPairList = js.Array[typings.awsSdk.securityhubMod.AwsEc2SecurityGroupUserIdGroupPair]
  type AwsEc2VolumeAttachmentList = js.Array[typings.awsSdk.securityhubMod.AwsEc2VolumeAttachment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type AwsIamAccessKeyStatus = typings.awsSdk.securityhubMod._AwsIamAccessKeyStatus | java.lang.String
  type AwsIamRoleAssumeRolePolicyDocument = java.lang.String
  type AwsLambdaFunctionLayerList = js.Array[typings.awsSdk.securityhubMod.AwsLambdaFunctionLayer]
  type AwsLambdaLayerVersionNumber = scala.Double
  type AwsRdsDbInstanceAssociatedRoles = js.Array[typings.awsSdk.securityhubMod.AwsRdsDbInstanceAssociatedRole]
  type AwsRdsDbInstanceVpcSecurityGroups = js.Array[typings.awsSdk.securityhubMod.AwsRdsDbInstanceVpcSecurityGroup]
  type AwsS3BucketServerSideEncryptionRules = js.Array[typings.awsSdk.securityhubMod.AwsS3BucketServerSideEncryptionRule]
  type AwsSecurityFindingIdentifierList = js.Array[typings.awsSdk.securityhubMod.AwsSecurityFindingIdentifier]
  type AwsSecurityFindingList = js.Array[typings.awsSdk.securityhubMod.AwsSecurityFinding]
  type AwsSnsTopicSubscriptionList = js.Array[typings.awsSdk.securityhubMod.AwsSnsTopicSubscription]
  type AwsWafWebAclRuleList = js.Array[typings.awsSdk.securityhubMod.AwsWafWebAclRule]
  type BatchUpdateFindingsUnprocessedFindingsList = js.Array[typings.awsSdk.securityhubMod.BatchUpdateFindingsUnprocessedFinding]
  type Boolean = scala.Boolean
  type CategoryList = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  type CidrBlockAssociationList = js.Array[typings.awsSdk.securityhubMod.CidrBlockAssociation]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.securityhubMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PASSED
    - typings.awsSdk.awsSdkStrings.WARNING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.NOT_AVAILABLE
    - java.lang.String
  */
  type ComplianceStatus = typings.awsSdk.securityhubMod._ComplianceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ControlStatus = typings.awsSdk.securityhubMod._ControlStatus | java.lang.String
  type CvssList = js.Array[typings.awsSdk.securityhubMod.Cvss]
  type DateFilterList = js.Array[typings.awsSdk.securityhubMod.DateFilter]
  type DateRangeUnit = typings.awsSdk.awsSdkStrings.DAYS | java.lang.String
  type Double = scala.Double
  type FieldMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.securityhubMod.NonEmptyString]
  type ImportFindingsErrorList = js.Array[typings.awsSdk.securityhubMod.ImportFindingsError]
  type InsightList = js.Array[typings.awsSdk.securityhubMod.Insight]
  type InsightResultValueList = js.Array[typings.awsSdk.securityhubMod.InsightResultValue]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SEND_FINDINGS_TO_SECURITY_HUB
    - typings.awsSdk.awsSdkStrings.RECEIVE_FINDINGS_FROM_SECURITY_HUB
    - java.lang.String
  */
  type IntegrationType = typings.awsSdk.securityhubMod._IntegrationType | java.lang.String
  type IntegrationTypeList = js.Array[typings.awsSdk.securityhubMod.IntegrationType]
  type InvitationList = js.Array[typings.awsSdk.securityhubMod.Invitation]
  type IpFilterList = js.Array[typings.awsSdk.securityhubMod.IpFilter]
  type Ipv6CidrBlockAssociationList = js.Array[typings.awsSdk.securityhubMod.Ipv6CidrBlockAssociation]
  type KeywordFilterList = js.Array[typings.awsSdk.securityhubMod.KeywordFilter]
  type MalwareList = js.Array[typings.awsSdk.securityhubMod.Malware]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OBSERVED
    - typings.awsSdk.awsSdkStrings.REMOVAL_FAILED
    - typings.awsSdk.awsSdkStrings.REMOVED
    - java.lang.String
  */
  type MalwareState = typings.awsSdk.securityhubMod._MalwareState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ADWARE
    - typings.awsSdk.awsSdkStrings.BLENDED_THREAT
    - typings.awsSdk.awsSdkStrings.BOTNET_AGENT
    - typings.awsSdk.awsSdkStrings.COIN_MINER
    - typings.awsSdk.awsSdkStrings.EXPLOIT_KIT
    - typings.awsSdk.awsSdkStrings.KEYLOGGER
    - typings.awsSdk.awsSdkStrings.MACRO
    - typings.awsSdk.awsSdkStrings.POTENTIALLY_UNWANTED
    - typings.awsSdk.awsSdkStrings.SPYWARE
    - typings.awsSdk.awsSdkStrings.RANSOMWARE
    - typings.awsSdk.awsSdkStrings.REMOTE_ACCESS
    - typings.awsSdk.awsSdkStrings.ROOTKIT
    - typings.awsSdk.awsSdkStrings.TROJAN
    - typings.awsSdk.awsSdkStrings.VIRUS
    - typings.awsSdk.awsSdkStrings.WORM
    - java.lang.String
  */
  type MalwareType = typings.awsSdk.securityhubMod._MalwareType | java.lang.String
  type MapFilterComparison = typings.awsSdk.awsSdkStrings.EQUALS | java.lang.String
  type MapFilterList = js.Array[typings.awsSdk.securityhubMod.MapFilter]
  type MaxResults = scala.Double
  type MemberList = js.Array[typings.awsSdk.securityhubMod.Member]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN
    - typings.awsSdk.awsSdkStrings.OUT
    - java.lang.String
  */
  type NetworkDirection = typings.awsSdk.securityhubMod._NetworkDirection | java.lang.String
  type NetworkPathList = js.Array[typings.awsSdk.securityhubMod.NetworkPathComponent]
  type NextToken = java.lang.String
  type NonEmptyString = java.lang.String
  type NonEmptyStringList = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  type NumberFilterList = js.Array[typings.awsSdk.securityhubMod.NumberFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.aws_
    - typings.awsSdk.awsSdkStrings.`aws-cn`
    - typings.awsSdk.awsSdkStrings.`aws-us-gov`
    - java.lang.String
  */
  type Partition = typings.awsSdk.securityhubMod._Partition | java.lang.String
  type PortRangeList = js.Array[typings.awsSdk.securityhubMod.PortRange]
  type ProductSubscriptionArnList = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  type ProductsList = js.Array[typings.awsSdk.securityhubMod.Product]
  type RatioScale = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type RecordState = typings.awsSdk.securityhubMod._RecordState | java.lang.String
  type RelatedFindingList = js.Array[typings.awsSdk.securityhubMod.RelatedFinding]
  type RelatedRequirementsList = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  type ResourceArn = java.lang.String
  type ResourceList = js.Array[typings.awsSdk.securityhubMod.Resource]
  type ResultList = js.Array[typings.awsSdk.securityhubMod.Result]
  type SecurityGroups = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INFORMATIONAL
    - typings.awsSdk.awsSdkStrings.LOW
    - typings.awsSdk.awsSdkStrings.MEDIUM
    - typings.awsSdk.awsSdkStrings.HIGH
    - typings.awsSdk.awsSdkStrings.CRITICAL
    - java.lang.String
  */
  type SeverityLabel = typings.awsSdk.securityhubMod._SeverityLabel | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LOW
    - typings.awsSdk.awsSdkStrings.MEDIUM
    - typings.awsSdk.awsSdkStrings.HIGH
    - typings.awsSdk.awsSdkStrings.CRITICAL
    - java.lang.String
  */
  type SeverityRating = typings.awsSdk.securityhubMod._SeverityRating | java.lang.String
  type SoftwarePackageList = js.Array[typings.awsSdk.securityhubMod.SoftwarePackage]
  type SortCriteria = js.Array[typings.awsSdk.securityhubMod.SortCriterion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.asc_
    - typings.awsSdk.awsSdkStrings.desc_
    - java.lang.String
  */
  type SortOrder = typings.awsSdk.securityhubMod._SortOrder | java.lang.String
  type Standards = js.Array[typings.awsSdk.securityhubMod.Standard]
  type StandardsControls = js.Array[typings.awsSdk.securityhubMod.StandardsControl]
  type StandardsInputParameterMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.securityhubMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.INCOMPLETE
    - java.lang.String
  */
  type StandardsStatus = typings.awsSdk.securityhubMod._StandardsStatus | java.lang.String
  type StandardsSubscriptionArns = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  type StandardsSubscriptionRequests = js.Array[typings.awsSdk.securityhubMod.StandardsSubscriptionRequest]
  type StandardsSubscriptions = js.Array[typings.awsSdk.securityhubMod.StandardsSubscription]
  type StatusReasonsList = js.Array[typings.awsSdk.securityhubMod.StatusReason]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQUALS
    - typings.awsSdk.awsSdkStrings.PREFIX
    - java.lang.String
  */
  type StringFilterComparison = typings.awsSdk.securityhubMod._StringFilterComparison | java.lang.String
  type StringFilterList = js.Array[typings.awsSdk.securityhubMod.StringFilter]
  type StringList = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.securityhubMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.securityhubMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BACKDOOR
    - typings.awsSdk.awsSdkStrings.CARD_STEALER
    - typings.awsSdk.awsSdkStrings.COMMAND_AND_CONTROL
    - typings.awsSdk.awsSdkStrings.DROP_SITE
    - typings.awsSdk.awsSdkStrings.EXPLOIT_SITE
    - typings.awsSdk.awsSdkStrings.KEYLOGGER
    - java.lang.String
  */
  type ThreatIntelIndicatorCategory = typings.awsSdk.securityhubMod._ThreatIntelIndicatorCategory | java.lang.String
  type ThreatIntelIndicatorList = js.Array[typings.awsSdk.securityhubMod.ThreatIntelIndicator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DOMAIN
    - typings.awsSdk.awsSdkStrings.EMAIL_ADDRESS
    - typings.awsSdk.awsSdkStrings.HASH_MD5
    - typings.awsSdk.awsSdkStrings.HASH_SHA1
    - typings.awsSdk.awsSdkStrings.HASH_SHA256
    - typings.awsSdk.awsSdkStrings.HASH_SHA512
    - typings.awsSdk.awsSdkStrings.IPV4_ADDRESS
    - typings.awsSdk.awsSdkStrings.IPV6_ADDRESS
    - typings.awsSdk.awsSdkStrings.MUTEX
    - typings.awsSdk.awsSdkStrings.PROCESS
    - typings.awsSdk.awsSdkStrings.URL
    - java.lang.String
  */
  type ThreatIntelIndicatorType = typings.awsSdk.securityhubMod._ThreatIntelIndicatorType | java.lang.String
  type Timestamp = typings.std.Date
  type TypeList = js.Array[typings.awsSdk.securityhubMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - typings.awsSdk.awsSdkStrings.TRUE_POSITIVE
    - typings.awsSdk.awsSdkStrings.FALSE_POSITIVE
    - typings.awsSdk.awsSdkStrings.BENIGN_POSITIVE
    - java.lang.String
  */
  type VerificationState = typings.awsSdk.securityhubMod._VerificationState | java.lang.String
  type VulnerabilityList = js.Array[typings.awsSdk.securityhubMod.Vulnerability]
  type WafExcludedRuleList = js.Array[typings.awsSdk.securityhubMod.WafExcludedRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEW
    - typings.awsSdk.awsSdkStrings.ASSIGNED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.DEFERRED
    - typings.awsSdk.awsSdkStrings.RESOLVED
    - java.lang.String
  */
  type WorkflowState = typings.awsSdk.securityhubMod._WorkflowState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEW
    - typings.awsSdk.awsSdkStrings.NOTIFIED
    - typings.awsSdk.awsSdkStrings.RESOLVED
    - typings.awsSdk.awsSdkStrings.SUPPRESSED
    - java.lang.String
  */
  type WorkflowStatus = typings.awsSdk.securityhubMod._WorkflowStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-10-26`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.securityhubMod._apiVersion | java.lang.String
}
