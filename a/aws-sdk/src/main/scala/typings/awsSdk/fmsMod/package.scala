package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fmsMod {
  type AWSAccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.PENDING_DELETION
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type AccountRoleStatus = typings.awsSdk.fmsMod._AccountRoleStatus | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.fmsMod.ClientApiVersions
  type ComplianceViolators = js.Array[typings.awsSdk.fmsMod.ComplianceViolator]
  type CustomerPolicyScopeId = java.lang.String
  type CustomerPolicyScopeIdList = js.Array[typings.awsSdk.fmsMod.CustomerPolicyScopeId]
  type CustomerPolicyScopeIdType = typings.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  type CustomerPolicyScopeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.fmsMod.CustomerPolicyScopeIdList]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWSCONFIG
    - typings.awsSdk.awsSdkStrings.AWSWAF
    - typings.awsSdk.awsSdkStrings.AWSSHIELD_ADVANCED
    - typings.awsSdk.awsSdkStrings.AWSVPC
    - java.lang.String
  */
  type DependentServiceName = typings.awsSdk.fmsMod._DependentServiceName | java.lang.String
  type DetailedInfo = java.lang.String
  type EvaluationResults = js.Array[typings.awsSdk.fmsMod.EvaluationResult]
  type IssueInfoMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.fmsMod.DetailedInfo]
  type ManagedServiceData = java.lang.String
  type MemberAccounts = js.Array[typings.awsSdk.fmsMod.AWSAccountId]
  type PaginationMaxResults = scala.Double
  type PaginationToken = java.lang.String
  type PolicyComplianceStatusList = js.Array[typings.awsSdk.fmsMod.PolicyComplianceStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLIANT
    - typings.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type PolicyComplianceStatusType = typings.awsSdk.fmsMod._PolicyComplianceStatusType | java.lang.String
  type PolicyId = java.lang.String
  type PolicySummaryList = js.Array[typings.awsSdk.fmsMod.PolicySummary]
  type PolicyUpdateToken = java.lang.String
  type ProtectionData = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceCount = scala.Double
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourceTagKey = java.lang.String
  type ResourceTagValue = java.lang.String
  type ResourceTags = js.Array[typings.awsSdk.fmsMod.ResourceTag]
  type ResourceType = java.lang.String
  type ResourceTypeList = js.Array[typings.awsSdk.fmsMod.ResourceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WAF
    - typings.awsSdk.awsSdkStrings.SHIELD_ADVANCED
    - typings.awsSdk.awsSdkStrings.SECURITY_GROUPS_COMMON
    - typings.awsSdk.awsSdkStrings.SECURITY_GROUPS_CONTENT_AUDIT
    - typings.awsSdk.awsSdkStrings.SECURITY_GROUPS_USAGE_AUDIT
    - java.lang.String
  */
  type SecurityServiceType = typings.awsSdk.fmsMod._SecurityServiceType | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.fmsMod.TagKey]
  type TagList = js.Array[typings.awsSdk.fmsMod.Tag]
  type TagValue = java.lang.String
  type TimeStamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WEB_ACL_MISSING_RULE_GROUP
    - typings.awsSdk.awsSdkStrings.RESOURCE_MISSING_WEB_ACL
    - typings.awsSdk.awsSdkStrings.RESOURCE_INCORRECT_WEB_ACL
    - typings.awsSdk.awsSdkStrings.RESOURCE_MISSING_SHIELD_PROTECTION
    - typings.awsSdk.awsSdkStrings.RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION
    - typings.awsSdk.awsSdkStrings.RESOURCE_MISSING_SECURITY_GROUP
    - typings.awsSdk.awsSdkStrings.RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP
    - typings.awsSdk.awsSdkStrings.SECURITY_GROUP_UNUSED
    - typings.awsSdk.awsSdkStrings.SECURITY_GROUP_REDUNDANT
    - java.lang.String
  */
  type ViolationReason = typings.awsSdk.fmsMod._ViolationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-01-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.fmsMod._apiVersion | java.lang.String
}
