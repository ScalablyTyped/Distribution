package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EVENT_TIME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionsList = js.Array[Action]

type Arn = java.lang.String

type AutomationExecutionSet = js.Array[AutomationExecution]

type Boolean = scala.Boolean

type ChatbotSnsConfigurationSet = js.Array[SnsArn]

type ClientToken = java.lang.String

type DedupeString = java.lang.String

type DynamicSsmParameters = StringDictionary[DynamicSsmParameterValue]

type DynamicSsmParametersKeyString = java.lang.String

type EngagementSet = js.Array[SsmContactsArn]

type EventData = java.lang.String

type EventSummaryList = js.Array[EventSummary]

type FilterKeyString = java.lang.String

type FilterList = js.Array[Filter]

type Impact = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OPEN
  - typings.awsSdk.awsSdkStrings.RESOLVED
  - java.lang.String
*/
type IncidentRecordStatus = _IncidentRecordStatus | java.lang.String

type IncidentRecordSummaryList = js.Array[IncidentRecordSummary]

type IncidentSource = java.lang.String

type IncidentSummary = java.lang.String

type IncidentTitle = java.lang.String

type Integer = Double

type IntegerList = js.Array[Integer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ANALYSIS
  - typings.awsSdk.awsSdkStrings.INCIDENT
  - typings.awsSdk.awsSdkStrings.METRIC
  - typings.awsSdk.awsSdkStrings.PARENT
  - typings.awsSdk.awsSdkStrings.ATTACHMENT
  - typings.awsSdk.awsSdkStrings.OTHER
  - typings.awsSdk.awsSdkStrings.AUTOMATION
  - typings.awsSdk.awsSdkStrings.INVOLVED_RESOURCE
  - java.lang.String
*/
type ItemType = _ItemType | java.lang.String

type MaxResults = Double

type MetricDefinition = java.lang.String

type NextToken = java.lang.String

type NotificationTargetSet = js.Array[NotificationTargetItem]

type Policy = java.lang.String

type PolicyId = java.lang.String

type RawData = java.lang.String

type RegionInfoMap = StringDictionary[RegionInfo]

type RegionMapInput = StringDictionary[RegionMapInputValue]

type RegionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RegionStatus = _RegionStatus | java.lang.String

type RelatedItemList = js.Array[RelatedItem]

type RelatedItemTitleString = java.lang.String

type ReplicationSetArnList = js.Array[Arn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ReplicationSetStatus = _ReplicationSetStatus | java.lang.String

type ResourcePolicyList = js.Array[ResourcePolicy]

type ResponsePlanDisplayName = java.lang.String

type ResponsePlanName = java.lang.String

type ResponsePlanSummaryList = js.Array[ResponsePlanSummary]

type RoleArn = java.lang.String

type ServicePrincipal = java.lang.String

type SnsArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SseKmsKey = java.lang.String

type SsmAutomationDocumentNameString = java.lang.String

type SsmAutomationDocumentVersionString = java.lang.String

type SsmContactsArn = java.lang.String

type SsmParameterValues = js.Array[SsmParameterValuesMemberString]

type SsmParameterValuesMemberString = java.lang.String

type SsmParameters = StringDictionary[SsmParameterValues]

type SsmParametersKeyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RESPONSE_PLAN_OWNER_ACCOUNT
  - typings.awsSdk.awsSdkStrings.IMPACTED_ACCOUNT
  - java.lang.String
*/
type SsmTargetAccount = _SsmTargetAccount | java.lang.String

type String = java.lang.String

type StringList = js.Array[StringListMemberString]

type StringListMemberString = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagMapUpdate = StringDictionary[TagValue]

type TagValue = java.lang.String

type TimelineEventSort = EVENT_TIME | java.lang.String

type TimelineEventType = java.lang.String

type Timestamp = js.Date

type UUID = java.lang.String

type UpdateReplicationSetInputActionsList = js.Array[UpdateReplicationSetAction]

type Url = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCIDENT_RECORD_ARN
  - typings.awsSdk.awsSdkStrings.INVOLVED_RESOURCES
  - java.lang.String
*/
type VariableType = _VariableType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-05-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
