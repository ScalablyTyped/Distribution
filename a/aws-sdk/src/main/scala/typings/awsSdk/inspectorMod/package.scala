package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object inspectorMod {
  
  type AddRemoveAttributesFindingArnList = js.Array[typings.awsSdk.inspectorMod.Arn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HEALTHY
    - typings.awsSdk.awsSdkStrings.UNHEALTHY
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealth = typings.awsSdk.inspectorMod._AgentHealth | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IDLE
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SHUTDOWN
    - typings.awsSdk.awsSdkStrings.UNHEALTHY
    - typings.awsSdk.awsSdkStrings.THROTTLED
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type AgentHealthCode = typings.awsSdk.inspectorMod._AgentHealthCode | java.lang.String
  
  type AgentHealthCodeList = js.Array[typings.awsSdk.inspectorMod.AgentHealthCode]
  
  type AgentHealthList = js.Array[typings.awsSdk.inspectorMod.AgentHealth]
  
  type AgentId = java.lang.String
  
  type AgentIdList = js.Array[typings.awsSdk.inspectorMod.AgentId]
  
  type AgentPreviewList = js.Array[typings.awsSdk.inspectorMod.AgentPreview]
  
  type AgentVersion = java.lang.String
  
  type AmiId = java.lang.String
  
  type Arn = java.lang.String
  
  type ArnCount = scala.Double
  
  type AssessmentRulesPackageArnList = js.Array[typings.awsSdk.inspectorMod.Arn]
  
  type AssessmentRunAgentList = js.Array[typings.awsSdk.inspectorMod.AssessmentRunAgent]
  
  type AssessmentRunDuration = scala.Double
  
  type AssessmentRunFindingCounts = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.inspectorMod.FindingCount]
  
  type AssessmentRunList = js.Array[typings.awsSdk.inspectorMod.AssessmentRun]
  
  type AssessmentRunName = java.lang.String
  
  type AssessmentRunNotificationList = js.Array[typings.awsSdk.inspectorMod.AssessmentRunNotification]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.TOPIC_DOES_NOT_EXIST
    - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type AssessmentRunNotificationSnsStatusCode = typings.awsSdk.inspectorMod._AssessmentRunNotificationSnsStatusCode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.START_DATA_COLLECTION_PENDING
    - typings.awsSdk.awsSdkStrings.START_DATA_COLLECTION_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COLLECTING_DATA
    - typings.awsSdk.awsSdkStrings.STOP_DATA_COLLECTION_PENDING
    - typings.awsSdk.awsSdkStrings.DATA_COLLECTED
    - typings.awsSdk.awsSdkStrings.START_EVALUATING_RULES_PENDING
    - typings.awsSdk.awsSdkStrings.EVALUATING_RULES
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
    - typings.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type AssessmentRunState = typings.awsSdk.inspectorMod._AssessmentRunState | java.lang.String
  
  type AssessmentRunStateChangeList = js.Array[typings.awsSdk.inspectorMod.AssessmentRunStateChange]
  
  type AssessmentRunStateList = js.Array[typings.awsSdk.inspectorMod.AssessmentRunState]
  
  type AssessmentTargetList = js.Array[typings.awsSdk.inspectorMod.AssessmentTarget]
  
  type AssessmentTargetName = java.lang.String
  
  type AssessmentTemplateList = js.Array[typings.awsSdk.inspectorMod.AssessmentTemplate]
  
  type AssessmentTemplateName = java.lang.String
  
  type AssessmentTemplateRulesPackageArnList = js.Array[typings.awsSdk.inspectorMod.Arn]
  
  type AssetType = typings.awsSdk.awsSdkStrings.`ec2-instance` | java.lang.String
  
  type AttributeKey = java.lang.String
  
  type AttributeList = js.Array[typings.awsSdk.inspectorMod.Attribute]
  
  type AttributeValue = java.lang.String
  
  type AutoScalingGroup = java.lang.String
  
  type AutoScalingGroupList = js.Array[typings.awsSdk.inspectorMod.AutoScalingGroup]
  
  type BatchDescribeArnList = js.Array[typings.awsSdk.inspectorMod.Arn]
  
  type BatchDescribeExclusionsArnList = js.Array[typings.awsSdk.inspectorMod.Arn]
  
  type Bool = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.inspectorMod.ClientApiVersions
  
  type EventSubscriptionList = js.Array[typings.awsSdk.inspectorMod.EventSubscription]
  
  type ExclusionMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.inspectorMod.Exclusion]
  
  type ExclusionPreviewList = js.Array[typings.awsSdk.inspectorMod.ExclusionPreview]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INVALID_ARN
    - typings.awsSdk.awsSdkStrings.DUPLICATE_ARN
    - typings.awsSdk.awsSdkStrings.ITEM_DOES_NOT_EXIST
    - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
    - typings.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type FailedItemErrorCode = typings.awsSdk.inspectorMod._FailedItemErrorCode | java.lang.String
  
  type FailedItems = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.inspectorMod.FailedItemDetails]
  
  type FilterRulesPackageArnList = js.Array[typings.awsSdk.inspectorMod.Arn]
  
  type FindingCount = scala.Double
  
  type FindingId = java.lang.String
  
  type FindingList = js.Array[typings.awsSdk.inspectorMod.Finding]
  
  type Hostname = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STARTED
    - typings.awsSdk.awsSdkStrings.ASSESSMENT_RUN_COMPLETED
    - typings.awsSdk.awsSdkStrings.ASSESSMENT_RUN_STATE_CHANGED
    - typings.awsSdk.awsSdkStrings.FINDING_REPORTED
    - typings.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type InspectorEvent = typings.awsSdk.inspectorMod._InspectorEvent | java.lang.String
  
  type IocConfidence = scala.Double
  
  type Ipv4Address = java.lang.String
  
  type Ipv4AddressList = js.Array[typings.awsSdk.inspectorMod.Ipv4Address]
  
  type Ipv6Addresses = js.Array[typings.awsSdk.inspectorMod.Text]
  
  type KernelVersion = java.lang.String
  
  type ListEventSubscriptionsMaxResults = scala.Double
  
  type ListMaxResults = scala.Double
  
  type ListParentArnList = js.Array[typings.awsSdk.inspectorMod.Arn]
  
  type ListReturnedArnList = js.Array[typings.awsSdk.inspectorMod.Arn]
  
  type Locale = typings.awsSdk.awsSdkStrings.EN_US | java.lang.String
  
  type Long = scala.Double
  
  type Message = java.lang.String
  
  type MessageType = java.lang.String
  
  type NamePattern = java.lang.String
  
  type NetworkInterfaces = js.Array[typings.awsSdk.inspectorMod.NetworkInterface]
  
  type NumericSeverity = scala.Double
  
  type NumericVersion = scala.Double
  
  type OperatingSystem = java.lang.String
  
  type PaginationToken = java.lang.String
  
  type PreviewAgentsMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type PreviewStatus = typings.awsSdk.inspectorMod._PreviewStatus | java.lang.String
  
  type PrivateIpAddresses = js.Array[typings.awsSdk.inspectorMod.PrivateIp]
  
  type ProviderName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HTML
    - typings.awsSdk.awsSdkStrings.PDF
    - java.lang.String
  */
  type ReportFileFormat = typings.awsSdk.inspectorMod._ReportFileFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WORK_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type ReportStatus = typings.awsSdk.inspectorMod._ReportStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FINDING
    - typings.awsSdk.awsSdkStrings.FULL
    - java.lang.String
  */
  type ReportType = typings.awsSdk.inspectorMod._ReportType | java.lang.String
  
  type ResourceGroupList = js.Array[typings.awsSdk.inspectorMod.ResourceGroup]
  
  type ResourceGroupTags = js.Array[typings.awsSdk.inspectorMod.ResourceGroupTag]
  
  type RuleName = java.lang.String
  
  type RuleNameList = js.Array[typings.awsSdk.inspectorMod.RuleName]
  
  type RulesPackageList = js.Array[typings.awsSdk.inspectorMod.RulesPackage]
  
  type RulesPackageName = java.lang.String
  
  type ScopeList = js.Array[typings.awsSdk.inspectorMod.Scope]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INSTANCE_ID
    - typings.awsSdk.awsSdkStrings.RULES_PACKAGE_ARN
    - java.lang.String
  */
  type ScopeType = typings.awsSdk.inspectorMod._ScopeType | java.lang.String
  
  type ScopeValue = java.lang.String
  
  type SecurityGroups = js.Array[typings.awsSdk.inspectorMod.SecurityGroup]
  
  type ServiceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Low_
    - typings.awsSdk.awsSdkStrings.Medium_
    - typings.awsSdk.awsSdkStrings.High_
    - typings.awsSdk.awsSdkStrings.Informational_
    - typings.awsSdk.awsSdkStrings.Undefined_
    - java.lang.String
  */
  type Severity = typings.awsSdk.inspectorMod._Severity | java.lang.String
  
  type SeverityList = js.Array[typings.awsSdk.inspectorMod.Severity]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.START_EVALUATION
    - typings.awsSdk.awsSdkStrings.SKIP_EVALUATION
    - java.lang.String
  */
  type StopAction = typings.awsSdk.inspectorMod._StopAction | java.lang.String
  
  type SubscriptionList = js.Array[typings.awsSdk.inspectorMod.Subscription]
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typings.awsSdk.inspectorMod.Tag]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.inspectorMod.Tag]
  
  type TelemetryMetadataList = js.Array[typings.awsSdk.inspectorMod.TelemetryMetadata]
  
  type Text = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type UUID = java.lang.String
  
  type Url = java.lang.String
  
  type UserAttributeKeyList = js.Array[typings.awsSdk.inspectorMod.AttributeKey]
  
  type UserAttributeList = js.Array[typings.awsSdk.inspectorMod.Attribute]
  
  type Version = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-08-18`
    - typings.awsSdk.awsSdkStrings.`2016-02-16`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.inspectorMod._apiVersion | java.lang.String
}
