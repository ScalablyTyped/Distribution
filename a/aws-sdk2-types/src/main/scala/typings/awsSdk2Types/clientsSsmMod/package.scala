package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk2Types.awsSdk2TypesStrings.ChangeRequest
import typings.awsSdk2Types.awsSdk2TypesStrings.Equal_
import typings.awsSdk2Types.awsSdk2TypesStrings.JsonSerDe
import typings.awsSdk2Types.awsSdk2TypesStrings.Sha256_
import typings.awsSdk2Types.awsSdk2TypesStrings.Share
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Account = java.lang.String

type AccountId = java.lang.String

type AccountIdList = js.Array[AccountId]

type AccountSharingInfoList = js.Array[AccountSharingInfo]

type Accounts = js.Array[Account]

type ActivationCode = java.lang.String

type ActivationDescription = java.lang.String

type ActivationId = java.lang.String

type ActivationList = js.Array[Activation]

type AgentErrorCode = java.lang.String

type AggregatorSchemaOnly = scala.Boolean

type AlarmList = js.Array[Alarm]

type AlarmName = java.lang.String

type AlarmStateInformationList = js.Array[AlarmStateInformation]

type AllowedPattern = java.lang.String

type ApplyOnlyAtCronInterval = scala.Boolean

type ApproveAfterDays = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CRITICAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.HIGH
  - typings.awsSdk2Types.awsSdk2TypesStrings.MEDIUM
  - typings.awsSdk2Types.awsSdk2TypesStrings.LOW
  - typings.awsSdk2Types.awsSdk2TypesStrings.UNSPECIFIED
  - java.lang.String
*/
type AssociationComplianceSeverity = _AssociationComplianceSeverity | java.lang.String

type AssociationDescriptionList = js.Array[AssociationDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ExecutionId
  - typings.awsSdk2Types.awsSdk2TypesStrings.Status
  - typings.awsSdk2Types.awsSdk2TypesStrings.CreatedTime
  - java.lang.String
*/
type AssociationExecutionFilterKey = _AssociationExecutionFilterKey | java.lang.String

type AssociationExecutionFilterList = js.Array[AssociationExecutionFilter]

type AssociationExecutionFilterValue = java.lang.String

type AssociationExecutionId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Status
  - typings.awsSdk2Types.awsSdk2TypesStrings.ResourceId
  - typings.awsSdk2Types.awsSdk2TypesStrings.ResourceType
  - java.lang.String
*/
type AssociationExecutionTargetsFilterKey = _AssociationExecutionTargetsFilterKey | java.lang.String

type AssociationExecutionTargetsFilterList = js.Array[AssociationExecutionTargetsFilter]

type AssociationExecutionTargetsFilterValue = java.lang.String

type AssociationExecutionTargetsList = js.Array[AssociationExecutionTarget]

type AssociationExecutionsList = js.Array[AssociationExecution]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.InstanceId
  - typings.awsSdk2Types.awsSdk2TypesStrings.Name_
  - typings.awsSdk2Types.awsSdk2TypesStrings.AssociationId
  - typings.awsSdk2Types.awsSdk2TypesStrings.AssociationStatusName
  - typings.awsSdk2Types.awsSdk2TypesStrings.LastExecutedBefore
  - typings.awsSdk2Types.awsSdk2TypesStrings.LastExecutedAfter
  - typings.awsSdk2Types.awsSdk2TypesStrings.AssociationName
  - typings.awsSdk2Types.awsSdk2TypesStrings.ResourceGroupName
  - java.lang.String
*/
type AssociationFilterKey = _AssociationFilterKey | java.lang.String

type AssociationFilterList = js.Array[AssociationFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.EQUAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.LESS_THAN
  - typings.awsSdk2Types.awsSdk2TypesStrings.GREATER_THAN
  - java.lang.String
*/
type AssociationFilterOperatorType = _AssociationFilterOperatorType | java.lang.String

type AssociationFilterValue = java.lang.String

type AssociationId = java.lang.String

type AssociationIdList = js.Array[AssociationId]

type AssociationList = js.Array[Association]

type AssociationName = java.lang.String

type AssociationResourceId = java.lang.String

type AssociationResourceType = java.lang.String

type AssociationStatusAggregatedCount = StringDictionary[InstanceCount]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Pending_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - java.lang.String
*/
type AssociationStatusName = _AssociationStatusName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.AUTO
  - typings.awsSdk2Types.awsSdk2TypesStrings.MANUAL
  - java.lang.String
*/
type AssociationSyncCompliance = _AssociationSyncCompliance | java.lang.String

type AssociationVersion = java.lang.String

type AssociationVersionList = js.Array[AssociationVersionInfo]

type AttachmentContentList = js.Array[AttachmentContent]

type AttachmentHash = java.lang.String

type AttachmentHashType = Sha256_ | java.lang.String

type AttachmentIdentifier = java.lang.String

type AttachmentInformationList = js.Array[AttachmentInformation]

type AttachmentName = java.lang.String

type AttachmentUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.SourceUrl
  - typings.awsSdk2Types.awsSdk2TypesStrings.S3FileUrl
  - typings.awsSdk2Types.awsSdk2TypesStrings.AttachmentReference
  - java.lang.String
*/
type AttachmentsSourceKey = _AttachmentsSourceKey | java.lang.String

type AttachmentsSourceList = js.Array[AttachmentsSource]

type AttachmentsSourceValue = java.lang.String

type AttachmentsSourceValues = js.Array[AttachmentsSourceValue]

type AttributeName = java.lang.String

type AttributeValue = java.lang.String

type AutomationActionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.DocumentNamePrefix
  - typings.awsSdk2Types.awsSdk2TypesStrings.ExecutionStatus
  - typings.awsSdk2Types.awsSdk2TypesStrings.ExecutionId
  - typings.awsSdk2Types.awsSdk2TypesStrings.ParentExecutionId
  - typings.awsSdk2Types.awsSdk2TypesStrings.CurrentAction
  - typings.awsSdk2Types.awsSdk2TypesStrings.StartTimeBefore
  - typings.awsSdk2Types.awsSdk2TypesStrings.StartTimeAfter
  - typings.awsSdk2Types.awsSdk2TypesStrings.AutomationType
  - typings.awsSdk2Types.awsSdk2TypesStrings.TagKey
  - typings.awsSdk2Types.awsSdk2TypesStrings.TargetResourceGroup
  - typings.awsSdk2Types.awsSdk2TypesStrings.AutomationSubtype
  - typings.awsSdk2Types.awsSdk2TypesStrings.OpsItemId
  - java.lang.String
*/
type AutomationExecutionFilterKey = _AutomationExecutionFilterKey | java.lang.String

type AutomationExecutionFilterList = js.Array[AutomationExecutionFilter]

type AutomationExecutionFilterValue = java.lang.String

type AutomationExecutionFilterValueList = js.Array[AutomationExecutionFilterValue]

type AutomationExecutionId = java.lang.String

type AutomationExecutionMetadataList = js.Array[AutomationExecutionMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Pending_
  - typings.awsSdk2Types.awsSdk2TypesStrings.InProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.Waiting
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.TimedOut
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelling_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - typings.awsSdk2Types.awsSdk2TypesStrings.PendingApproval
  - typings.awsSdk2Types.awsSdk2TypesStrings.Approved_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Rejected_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Scheduled
  - typings.awsSdk2Types.awsSdk2TypesStrings.RunbookInProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.PendingChangeCalendarOverride
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeCalendarOverrideApproved
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeCalendarOverrideRejected
  - typings.awsSdk2Types.awsSdk2TypesStrings.CompletedWithSuccess
  - typings.awsSdk2Types.awsSdk2TypesStrings.CompletedWithFailure
  - java.lang.String
*/
type AutomationExecutionStatus = _AutomationExecutionStatus | java.lang.String

type AutomationParameterKey = java.lang.String

type AutomationParameterMap = StringDictionary[AutomationParameterValueList]

type AutomationParameterValue = java.lang.String

type AutomationParameterValueList = js.Array[AutomationParameterValue]

type AutomationSubtype = ChangeRequest | java.lang.String

type AutomationTargetParameterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CrossAccount
  - typings.awsSdk2Types.awsSdk2TypesStrings.Local
  - java.lang.String
*/
type AutomationType = _AutomationType | java.lang.String

type BaselineDescription = java.lang.String

type BaselineId = java.lang.String

type BaselineName = java.lang.String

type BatchErrorMessage = java.lang.String

type Boolean = scala.Boolean

type CalendarNameOrARN = java.lang.String

type CalendarNameOrARNList = js.Array[CalendarNameOrARN]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.OPEN
  - typings.awsSdk2Types.awsSdk2TypesStrings.CLOSED
  - java.lang.String
*/
type CalendarState = _CalendarState | java.lang.String

type Category = java.lang.String

type CategoryEnumList = js.Array[Category]

type CategoryList = js.Array[Category]

type ChangeDetailsValue = java.lang.String

type ChangeRequestName = java.lang.String

type ClientToken = java.lang.String

type CloudWatchLogGroupName = java.lang.String

type CloudWatchOutputEnabled = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.InvokedAfter
  - typings.awsSdk2Types.awsSdk2TypesStrings.InvokedBefore
  - typings.awsSdk2Types.awsSdk2TypesStrings.Status
  - typings.awsSdk2Types.awsSdk2TypesStrings.ExecutionStage
  - typings.awsSdk2Types.awsSdk2TypesStrings.DocumentName
  - java.lang.String
*/
type CommandFilterKey = _CommandFilterKey | java.lang.String

type CommandFilterList = js.Array[CommandFilter]

type CommandFilterValue = java.lang.String

type CommandId = java.lang.String

type CommandInvocationList = js.Array[CommandInvocation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Pending_
  - typings.awsSdk2Types.awsSdk2TypesStrings.InProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.Delayed
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.TimedOut
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelling_
  - java.lang.String
*/
type CommandInvocationStatus = _CommandInvocationStatus | java.lang.String

type CommandList = js.Array[Command]

type CommandMaxResults = Double

type CommandPluginList = js.Array[CommandPlugin]

type CommandPluginName = java.lang.String

type CommandPluginOutput = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Pending_
  - typings.awsSdk2Types.awsSdk2TypesStrings.InProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.TimedOut
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - java.lang.String
*/
type CommandPluginStatus = _CommandPluginStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Pending_
  - typings.awsSdk2Types.awsSdk2TypesStrings.InProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - typings.awsSdk2Types.awsSdk2TypesStrings.TimedOut
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelling_
  - java.lang.String
*/
type CommandStatus = _CommandStatus | java.lang.String

type Comment = java.lang.String

type CompletedCount = Double

type ComplianceExecutionId = java.lang.String

type ComplianceExecutionType = java.lang.String

type ComplianceFilterValue = java.lang.String

type ComplianceItemContentHash = java.lang.String

type ComplianceItemDetails = StringDictionary[AttributeValue]

type ComplianceItemEntryList = js.Array[ComplianceItemEntry]

type ComplianceItemId = java.lang.String

type ComplianceItemList = js.Array[ComplianceItem]

type ComplianceItemTitle = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.EQUAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.NOT_EQUAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.BEGIN_WITH
  - typings.awsSdk2Types.awsSdk2TypesStrings.LESS_THAN
  - typings.awsSdk2Types.awsSdk2TypesStrings.GREATER_THAN
  - java.lang.String
*/
type ComplianceQueryOperatorType = _ComplianceQueryOperatorType | java.lang.String

type ComplianceResourceId = java.lang.String

type ComplianceResourceIdList = js.Array[ComplianceResourceId]

type ComplianceResourceType = java.lang.String

type ComplianceResourceTypeList = js.Array[ComplianceResourceType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CRITICAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.HIGH
  - typings.awsSdk2Types.awsSdk2TypesStrings.MEDIUM
  - typings.awsSdk2Types.awsSdk2TypesStrings.LOW
  - typings.awsSdk2Types.awsSdk2TypesStrings.INFORMATIONAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.UNSPECIFIED
  - java.lang.String
*/
type ComplianceSeverity = _ComplianceSeverity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.COMPLIANT
  - typings.awsSdk2Types.awsSdk2TypesStrings.NON_COMPLIANT
  - java.lang.String
*/
type ComplianceStatus = _ComplianceStatus | java.lang.String

type ComplianceStringFilterKey = java.lang.String

type ComplianceStringFilterList = js.Array[ComplianceStringFilter]

type ComplianceStringFilterValueList = js.Array[ComplianceFilterValue]

type ComplianceSummaryCount = Double

type ComplianceSummaryItemList = js.Array[ComplianceSummaryItem]

type ComplianceTypeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.COMPLETE
  - typings.awsSdk2Types.awsSdk2TypesStrings.PARTIAL
  - java.lang.String
*/
type ComplianceUploadType = _ComplianceUploadType | java.lang.String

type ComputerName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Connected
  - typings.awsSdk2Types.awsSdk2TypesStrings.NotConnected
  - java.lang.String
*/
type ConnectionStatus = _ConnectionStatus | java.lang.String

type ContentLength = Double

type CreateAssociationBatchRequestEntries = js.Array[CreateAssociationBatchRequestEntry]

type CreatedDate = js.Date

type DateTime = js.Date

type DefaultBaseline = scala.Boolean

type DefaultInstanceName = java.lang.String

type DeliveryTimedOutCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ActivationIds
  - typings.awsSdk2Types.awsSdk2TypesStrings.DefaultInstanceName
  - typings.awsSdk2Types.awsSdk2TypesStrings.IamRole
  - java.lang.String
*/
type DescribeActivationsFilterKeys = _DescribeActivationsFilterKeys | java.lang.String

type DescribeActivationsFilterList = js.Array[DescribeActivationsFilter]

type DescriptionInDocument = java.lang.String

type DocumentARN = java.lang.String

type DocumentAuthor = java.lang.String

type DocumentContent = java.lang.String

type DocumentDisplayName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Name_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Owner
  - typings.awsSdk2Types.awsSdk2TypesStrings.PlatformTypes
  - typings.awsSdk2Types.awsSdk2TypesStrings.DocumentType
  - java.lang.String
*/
type DocumentFilterKey = _DocumentFilterKey | java.lang.String

type DocumentFilterList = js.Array[DocumentFilter]

type DocumentFilterValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.YAML
  - typings.awsSdk2Types.awsSdk2TypesStrings.JSON
  - typings.awsSdk2Types.awsSdk2TypesStrings.TEXT
  - java.lang.String
*/
type DocumentFormat = _DocumentFormat | java.lang.String

type DocumentHash = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Sha256_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Sha1_
  - java.lang.String
*/
type DocumentHashType = _DocumentHashType | java.lang.String

type DocumentIdentifierList = js.Array[DocumentIdentifier]

type DocumentKeyValuesFilterKey = java.lang.String

type DocumentKeyValuesFilterList = js.Array[DocumentKeyValuesFilter]

type DocumentKeyValuesFilterValue = java.lang.String

type DocumentKeyValuesFilterValues = js.Array[DocumentKeyValuesFilterValue]

type DocumentMetadataEnum = typings.awsSdk2Types.awsSdk2TypesStrings.DocumentReviews | java.lang.String

type DocumentName = java.lang.String

type DocumentOwner = java.lang.String

type DocumentParameterDefaultValue = java.lang.String

type DocumentParameterDescrption = java.lang.String

type DocumentParameterList = js.Array[DocumentParameter]

type DocumentParameterName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.String_
  - typings.awsSdk2Types.awsSdk2TypesStrings.StringList
  - java.lang.String
*/
type DocumentParameterType = _DocumentParameterType | java.lang.String

type DocumentPermissionMaxResults = Double

type DocumentPermissionType = Share | java.lang.String

type DocumentRequiresList = js.Array[DocumentRequires]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.SendForReview
  - typings.awsSdk2Types.awsSdk2TypesStrings.UpdateReview
  - typings.awsSdk2Types.awsSdk2TypesStrings.Approve
  - typings.awsSdk2Types.awsSdk2TypesStrings.Reject
  - java.lang.String
*/
type DocumentReviewAction = _DocumentReviewAction | java.lang.String

type DocumentReviewComment = java.lang.String

type DocumentReviewCommentList = js.Array[DocumentReviewCommentSource]

type DocumentReviewCommentType = typings.awsSdk2Types.awsSdk2TypesStrings.Comment | java.lang.String

type DocumentReviewerResponseList = js.Array[DocumentReviewerResponseSource]

type DocumentSchemaVersion = java.lang.String

type DocumentSha1 = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Creating_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Active_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Updating_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Deleting_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - java.lang.String
*/
type DocumentStatus = _DocumentStatus | java.lang.String

type DocumentStatusInformation = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Command
  - typings.awsSdk2Types.awsSdk2TypesStrings.Policy
  - typings.awsSdk2Types.awsSdk2TypesStrings.Automation_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Session
  - typings.awsSdk2Types.awsSdk2TypesStrings.Package
  - typings.awsSdk2Types.awsSdk2TypesStrings.ApplicationConfiguration
  - typings.awsSdk2Types.awsSdk2TypesStrings.ApplicationConfigurationSchema
  - typings.awsSdk2Types.awsSdk2TypesStrings.DeploymentStrategy
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeCalendar
  - typings.awsSdk2Types.awsSdk2TypesStrings.AutomationDotChangeTemplate
  - typings.awsSdk2Types.awsSdk2TypesStrings.ProblemAnalysis
  - typings.awsSdk2Types.awsSdk2TypesStrings.ProblemAnalysisTemplate
  - typings.awsSdk2Types.awsSdk2TypesStrings.CloudFormation
  - typings.awsSdk2Types.awsSdk2TypesStrings.ConformancePackTemplate
  - typings.awsSdk2Types.awsSdk2TypesStrings.QuickSetup
  - java.lang.String
*/
type DocumentType = _DocumentType | java.lang.String

type DocumentVersion = java.lang.String

type DocumentVersionList = js.Array[DocumentVersionInfo]

type DocumentVersionName = java.lang.String

type DocumentVersionNumber = java.lang.String

type DryRun = scala.Boolean

type EffectiveInstanceAssociationMaxResults = Double

type EffectivePatchList = js.Array[EffectivePatch]

type ErrorCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Auto_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Interactive
  - java.lang.String
*/
type ExecutionMode = _ExecutionMode | java.lang.String

type ExecutionRoleName = java.lang.String

type ExpirationDate = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.UNKNOWN
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALARM
  - java.lang.String
*/
type ExternalAlarmState = _ExternalAlarmState | java.lang.String

type FailedCreateAssociationList = js.Array[FailedCreateAssociation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Client
  - typings.awsSdk2Types.awsSdk2TypesStrings.Server
  - typings.awsSdk2Types.awsSdk2TypesStrings.Unknown_
  - java.lang.String
*/
type Fault = _Fault | java.lang.String

type GetInventorySchemaMaxResults = Double

type GetOpsMetadataMaxResults = Double

type GetParametersByPathMaxResults = Double

type GetResourcePoliciesResponseEntries = js.Array[GetResourcePoliciesResponseEntry]

type IPAddress = java.lang.String

type ISO8601String = java.lang.String

type IamRole = java.lang.String

type IdempotencyToken = java.lang.String

type InstallOverrideList = java.lang.String

type InstanceAssociationExecutionSummary = java.lang.String

type InstanceAssociationList = js.Array[InstanceAssociation]

type InstanceAssociationStatusAggregatedCount = StringDictionary[InstanceCount]

type InstanceAssociationStatusInfos = js.Array[InstanceAssociationStatusInfo]

type InstanceCount = Double

type InstanceId = java.lang.String

type InstanceIdList = js.Array[InstanceId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.InstanceIds
  - typings.awsSdk2Types.awsSdk2TypesStrings.AgentVersion
  - typings.awsSdk2Types.awsSdk2TypesStrings.PingStatus
  - typings.awsSdk2Types.awsSdk2TypesStrings.PlatformTypes
  - typings.awsSdk2Types.awsSdk2TypesStrings.ActivationIds
  - typings.awsSdk2Types.awsSdk2TypesStrings.IamRole
  - typings.awsSdk2Types.awsSdk2TypesStrings.ResourceType
  - typings.awsSdk2Types.awsSdk2TypesStrings.AssociationStatus
  - java.lang.String
*/
type InstanceInformationFilterKey = _InstanceInformationFilterKey | java.lang.String

type InstanceInformationFilterList = js.Array[InstanceInformationFilter]

type InstanceInformationFilterValue = java.lang.String

type InstanceInformationFilterValueSet = js.Array[InstanceInformationFilterValue]

type InstanceInformationList = js.Array[InstanceInformation]

type InstanceInformationStringFilterKey = java.lang.String

type InstanceInformationStringFilterList = js.Array[InstanceInformationStringFilter]

type InstancePatchStateFilterKey = java.lang.String

type InstancePatchStateFilterList = js.Array[InstancePatchStateFilter]

type InstancePatchStateFilterValue = java.lang.String

type InstancePatchStateFilterValues = js.Array[InstancePatchStateFilterValue]

type InstancePatchStateList = js.Array[InstancePatchState]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Equal_
  - typings.awsSdk2Types.awsSdk2TypesStrings.NotEqual
  - typings.awsSdk2Types.awsSdk2TypesStrings.LessThan
  - typings.awsSdk2Types.awsSdk2TypesStrings.GreaterThan
  - java.lang.String
*/
type InstancePatchStateOperatorType = _InstancePatchStateOperatorType | java.lang.String

type InstancePatchStatesList = js.Array[InstancePatchState]

type InstanceTagName = java.lang.String

type InstancesCount = Double

type Integer = Double

type InventoryAggregatorExpression = java.lang.String

type InventoryAggregatorList = js.Array[InventoryAggregator]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.string__
  - typings.awsSdk2Types.awsSdk2TypesStrings.number_
  - java.lang.String
*/
type InventoryAttributeDataType = _InventoryAttributeDataType | java.lang.String

type InventoryDeletionLastStatusMessage = java.lang.String

type InventoryDeletionLastStatusUpdateTime = js.Date

type InventoryDeletionStartTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.InProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.Complete_
  - java.lang.String
*/
type InventoryDeletionStatus = _InventoryDeletionStatus | java.lang.String

type InventoryDeletionSummaryItems = js.Array[InventoryDeletionSummaryItem]

type InventoryDeletionsList = js.Array[InventoryDeletionStatusItem]

type InventoryFilterKey = java.lang.String

type InventoryFilterList = js.Array[InventoryFilter]

type InventoryFilterValue = java.lang.String

type InventoryFilterValueList = js.Array[InventoryFilterValue]

type InventoryGroupList = js.Array[InventoryGroup]

type InventoryGroupName = java.lang.String

type InventoryItemAttributeList = js.Array[InventoryItemAttribute]

type InventoryItemAttributeName = java.lang.String

type InventoryItemCaptureTime = java.lang.String

type InventoryItemContentContext = StringDictionary[AttributeValue]

type InventoryItemContentHash = java.lang.String

type InventoryItemEntry = StringDictionary[AttributeValue]

type InventoryItemEntryList = js.Array[InventoryItemEntry]

type InventoryItemList = js.Array[InventoryItem]

type InventoryItemSchemaResultList = js.Array[InventoryItemSchema]

type InventoryItemSchemaVersion = java.lang.String

type InventoryItemTypeName = java.lang.String

type InventoryItemTypeNameFilter = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Equal_
  - typings.awsSdk2Types.awsSdk2TypesStrings.NotEqual
  - typings.awsSdk2Types.awsSdk2TypesStrings.BeginWith
  - typings.awsSdk2Types.awsSdk2TypesStrings.LessThan
  - typings.awsSdk2Types.awsSdk2TypesStrings.GreaterThan
  - typings.awsSdk2Types.awsSdk2TypesStrings.Exists
  - java.lang.String
*/
type InventoryQueryOperatorType = _InventoryQueryOperatorType | java.lang.String

type InventoryResultEntityId = java.lang.String

type InventoryResultEntityList = js.Array[InventoryResultEntity]

type InventoryResultItemKey = java.lang.String

type InventoryResultItemMap = StringDictionary[InventoryResultItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.DisableSchema
  - typings.awsSdk2Types.awsSdk2TypesStrings.DeleteSchema
  - java.lang.String
*/
type InventorySchemaDeleteOption = _InventorySchemaDeleteOption | java.lang.String

type InventoryTypeDisplayName = java.lang.String

type InvocationTraceOutput = java.lang.String

type IsSubTypeSchema = scala.Boolean

type KeyList = js.Array[TagKey]

type LastResourceDataSyncMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Successful
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - typings.awsSdk2Types.awsSdk2TypesStrings.InProgress
  - java.lang.String
*/
type LastResourceDataSyncStatus = _LastResourceDataSyncStatus | java.lang.String

type LastResourceDataSyncTime = js.Date

type LastSuccessfulResourceDataSyncTime = js.Date

type ListOpsMetadataMaxResults = Double

type Long = Double

type MaintenanceWindowAllowUnassociatedTargets = scala.Boolean

type MaintenanceWindowCutoff = Double

type MaintenanceWindowDescription = java.lang.String

type MaintenanceWindowDurationHours = Double

type MaintenanceWindowEnabled = scala.Boolean

type MaintenanceWindowExecutionId = java.lang.String

type MaintenanceWindowExecutionList = js.Array[MaintenanceWindowExecution]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.PENDING
  - typings.awsSdk2Types.awsSdk2TypesStrings.IN_PROGRESS
  - typings.awsSdk2Types.awsSdk2TypesStrings.SUCCESS
  - typings.awsSdk2Types.awsSdk2TypesStrings.FAILED
  - typings.awsSdk2Types.awsSdk2TypesStrings.TIMED_OUT
  - typings.awsSdk2Types.awsSdk2TypesStrings.CANCELLING
  - typings.awsSdk2Types.awsSdk2TypesStrings.CANCELLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.SKIPPED_OVERLAPPING
  - java.lang.String
*/
type MaintenanceWindowExecutionStatus = _MaintenanceWindowExecutionStatus | java.lang.String

type MaintenanceWindowExecutionStatusDetails = java.lang.String

type MaintenanceWindowExecutionTaskExecutionId = java.lang.String

type MaintenanceWindowExecutionTaskId = java.lang.String

type MaintenanceWindowExecutionTaskIdList = js.Array[MaintenanceWindowExecutionTaskId]

type MaintenanceWindowExecutionTaskIdentityList = js.Array[MaintenanceWindowExecutionTaskIdentity]

type MaintenanceWindowExecutionTaskInvocationId = java.lang.String

type MaintenanceWindowExecutionTaskInvocationIdentityList = js.Array[MaintenanceWindowExecutionTaskInvocationIdentity]

type MaintenanceWindowExecutionTaskInvocationParameters = java.lang.String

type MaintenanceWindowFilterKey = java.lang.String

type MaintenanceWindowFilterList = js.Array[MaintenanceWindowFilter]

type MaintenanceWindowFilterValue = java.lang.String

type MaintenanceWindowFilterValues = js.Array[MaintenanceWindowFilterValue]

type MaintenanceWindowId = java.lang.String

type MaintenanceWindowIdentityList = js.Array[MaintenanceWindowIdentity]

type MaintenanceWindowLambdaClientContext = java.lang.String

type MaintenanceWindowLambdaPayload = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type MaintenanceWindowLambdaQualifier = java.lang.String

type MaintenanceWindowMaxResults = Double

type MaintenanceWindowName = java.lang.String

type MaintenanceWindowOffset = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.INSTANCE
  - typings.awsSdk2Types.awsSdk2TypesStrings.RESOURCE_GROUP
  - java.lang.String
*/
type MaintenanceWindowResourceType = _MaintenanceWindowResourceType | java.lang.String

type MaintenanceWindowSchedule = java.lang.String

type MaintenanceWindowSearchMaxResults = Double

type MaintenanceWindowStepFunctionsInput = java.lang.String

type MaintenanceWindowStepFunctionsName = java.lang.String

type MaintenanceWindowStringDateTime = java.lang.String

type MaintenanceWindowTargetId = java.lang.String

type MaintenanceWindowTargetList = js.Array[MaintenanceWindowTarget]

type MaintenanceWindowTaskArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CONTINUE_TASK
  - typings.awsSdk2Types.awsSdk2TypesStrings.CANCEL_TASK
  - java.lang.String
*/
type MaintenanceWindowTaskCutoffBehavior = _MaintenanceWindowTaskCutoffBehavior | java.lang.String

type MaintenanceWindowTaskId = java.lang.String

type MaintenanceWindowTaskList = js.Array[MaintenanceWindowTask]

type MaintenanceWindowTaskParameterName = java.lang.String

type MaintenanceWindowTaskParameterValue = java.lang.String

type MaintenanceWindowTaskParameterValueList = js.Array[MaintenanceWindowTaskParameterValue]

type MaintenanceWindowTaskParameters = StringDictionary[MaintenanceWindowTaskParameterValueExpression]

type MaintenanceWindowTaskParametersList = js.Array[MaintenanceWindowTaskParameters]

type MaintenanceWindowTaskPriority = Double

type MaintenanceWindowTaskTargetId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.RUN_COMMAND
  - typings.awsSdk2Types.awsSdk2TypesStrings.AUTOMATION
  - typings.awsSdk2Types.awsSdk2TypesStrings.STEP_FUNCTIONS
  - typings.awsSdk2Types.awsSdk2TypesStrings.LAMBDA
  - java.lang.String
*/
type MaintenanceWindowTaskType = _MaintenanceWindowTaskType | java.lang.String

type MaintenanceWindowTimezone = java.lang.String

type MaintenanceWindowsForTargetList = js.Array[MaintenanceWindowIdentityForTarget]

type ManagedInstanceId = java.lang.String

type MaxConcurrency = java.lang.String

type MaxErrors = java.lang.String

type MaxResults = Double

type MaxResultsEC2Compatible = Double

type MaxSessionDuration = java.lang.String

type MetadataKey = java.lang.String

type MetadataKeysToDeleteList = js.Array[MetadataKey]

type MetadataMap = StringDictionary[MetadataValue]

type MetadataValueString = java.lang.String

type NextToken = java.lang.String

type NormalStringMap = StringDictionary[String]

type NotificationArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.All_
  - typings.awsSdk2Types.awsSdk2TypesStrings.InProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.Success_
  - typings.awsSdk2Types.awsSdk2TypesStrings.TimedOut
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - java.lang.String
*/
type NotificationEvent = _NotificationEvent | java.lang.String

type NotificationEventList = js.Array[NotificationEvent]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Command
  - typings.awsSdk2Types.awsSdk2TypesStrings.Invocation
  - java.lang.String
*/
type NotificationType = _NotificationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.WINDOWS
  - typings.awsSdk2Types.awsSdk2TypesStrings.AMAZON_LINUX
  - typings.awsSdk2Types.awsSdk2TypesStrings.AMAZON_LINUX_2
  - typings.awsSdk2Types.awsSdk2TypesStrings.AMAZON_LINUX_2022
  - typings.awsSdk2Types.awsSdk2TypesStrings.UBUNTU
  - typings.awsSdk2Types.awsSdk2TypesStrings.REDHAT_ENTERPRISE_LINUX
  - typings.awsSdk2Types.awsSdk2TypesStrings.SUSE
  - typings.awsSdk2Types.awsSdk2TypesStrings.CENTOS
  - typings.awsSdk2Types.awsSdk2TypesStrings.ORACLE_LINUX
  - typings.awsSdk2Types.awsSdk2TypesStrings.DEBIAN
  - typings.awsSdk2Types.awsSdk2TypesStrings.MACOS
  - typings.awsSdk2Types.awsSdk2TypesStrings.RASPBIAN
  - typings.awsSdk2Types.awsSdk2TypesStrings.ROCKY_LINUX
  - java.lang.String
*/
type OperatingSystem = _OperatingSystem | java.lang.String

type OpsAggregatorList = js.Array[OpsAggregator]

type OpsAggregatorType = java.lang.String

type OpsAggregatorValue = java.lang.String

type OpsAggregatorValueKey = java.lang.String

type OpsAggregatorValueMap = StringDictionary[OpsAggregatorValue]

type OpsDataAttributeName = java.lang.String

type OpsDataTypeName = java.lang.String

type OpsEntityId = java.lang.String

type OpsEntityItemCaptureTime = java.lang.String

type OpsEntityItemEntry = StringDictionary[AttributeValue]

type OpsEntityItemEntryList = js.Array[OpsEntityItemEntry]

type OpsEntityItemKey = java.lang.String

type OpsEntityItemMap = StringDictionary[OpsEntityItem]

type OpsEntityList = js.Array[OpsEntity]

type OpsFilterKey = java.lang.String

type OpsFilterList = js.Array[OpsFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Equal_
  - typings.awsSdk2Types.awsSdk2TypesStrings.NotEqual
  - typings.awsSdk2Types.awsSdk2TypesStrings.BeginWith
  - typings.awsSdk2Types.awsSdk2TypesStrings.LessThan
  - typings.awsSdk2Types.awsSdk2TypesStrings.GreaterThan
  - typings.awsSdk2Types.awsSdk2TypesStrings.Exists
  - java.lang.String
*/
type OpsFilterOperatorType = _OpsFilterOperatorType | java.lang.String

type OpsFilterValue = java.lang.String

type OpsFilterValueList = js.Array[OpsFilterValue]

type OpsItemAccountId = java.lang.String

type OpsItemArn = java.lang.String

type OpsItemCategory = java.lang.String

type OpsItemDataKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.SearchableString
  - typings.awsSdk2Types.awsSdk2TypesStrings.String_
  - java.lang.String
*/
type OpsItemDataType = _OpsItemDataType | java.lang.String

type OpsItemDataValueString = java.lang.String

type OpsItemDescription = java.lang.String

type OpsItemEventFilterKey = typings.awsSdk2Types.awsSdk2TypesStrings.OpsItemId | java.lang.String

type OpsItemEventFilterOperator = Equal_ | java.lang.String

type OpsItemEventFilterValue = java.lang.String

type OpsItemEventFilterValues = js.Array[OpsItemEventFilterValue]

type OpsItemEventFilters = js.Array[OpsItemEventFilter]

type OpsItemEventMaxResults = Double

type OpsItemEventSummaries = js.Array[OpsItemEventSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Status
  - typings.awsSdk2Types.awsSdk2TypesStrings.CreatedBy
  - typings.awsSdk2Types.awsSdk2TypesStrings.Source
  - typings.awsSdk2Types.awsSdk2TypesStrings.Priority_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Title
  - typings.awsSdk2Types.awsSdk2TypesStrings.OpsItemId
  - typings.awsSdk2Types.awsSdk2TypesStrings.CreatedTime
  - typings.awsSdk2Types.awsSdk2TypesStrings.LastModifiedTime
  - typings.awsSdk2Types.awsSdk2TypesStrings.ActualStartTime
  - typings.awsSdk2Types.awsSdk2TypesStrings.ActualEndTime
  - typings.awsSdk2Types.awsSdk2TypesStrings.PlannedStartTime
  - typings.awsSdk2Types.awsSdk2TypesStrings.PlannedEndTime
  - typings.awsSdk2Types.awsSdk2TypesStrings.OperationalData
  - typings.awsSdk2Types.awsSdk2TypesStrings.OperationalDataKey
  - typings.awsSdk2Types.awsSdk2TypesStrings.OperationalDataValue
  - typings.awsSdk2Types.awsSdk2TypesStrings.ResourceId
  - typings.awsSdk2Types.awsSdk2TypesStrings.AutomationId
  - typings.awsSdk2Types.awsSdk2TypesStrings.Category
  - typings.awsSdk2Types.awsSdk2TypesStrings.Severity_
  - typings.awsSdk2Types.awsSdk2TypesStrings.OpsItemType
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeRequestByRequesterArn
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeRequestByRequesterName
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeRequestByApproverArn
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeRequestByApproverName
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeRequestByTemplate
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeRequestByTargetsResourceGroup
  - typings.awsSdk2Types.awsSdk2TypesStrings.InsightByType
  - typings.awsSdk2Types.awsSdk2TypesStrings.AccountId
  - java.lang.String
*/
type OpsItemFilterKey = _OpsItemFilterKey | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Equal_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Contains_
  - typings.awsSdk2Types.awsSdk2TypesStrings.GreaterThan
  - typings.awsSdk2Types.awsSdk2TypesStrings.LessThan
  - java.lang.String
*/
type OpsItemFilterOperator = _OpsItemFilterOperator | java.lang.String

type OpsItemFilterValue = java.lang.String

type OpsItemFilterValues = js.Array[OpsItemFilterValue]

type OpsItemFilters = js.Array[OpsItemFilter]

type OpsItemId = java.lang.String

type OpsItemMaxResults = Double

type OpsItemNotifications = js.Array[OpsItemNotification]

type OpsItemOperationalData = StringDictionary[OpsItemDataValue]

type OpsItemOpsDataKeysList = js.Array[String]

type OpsItemPriority = Double

type OpsItemRelatedItemAssociationId = java.lang.String

type OpsItemRelatedItemAssociationResourceType = java.lang.String

type OpsItemRelatedItemAssociationResourceUri = java.lang.String

type OpsItemRelatedItemAssociationType = java.lang.String

type OpsItemRelatedItemSummaries = js.Array[OpsItemRelatedItemSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ResourceType
  - typings.awsSdk2Types.awsSdk2TypesStrings.AssociationId
  - typings.awsSdk2Types.awsSdk2TypesStrings.ResourceUri
  - java.lang.String
*/
type OpsItemRelatedItemsFilterKey = _OpsItemRelatedItemsFilterKey | java.lang.String

type OpsItemRelatedItemsFilterOperator = Equal_ | java.lang.String

type OpsItemRelatedItemsFilterValue = java.lang.String

type OpsItemRelatedItemsFilterValues = js.Array[OpsItemRelatedItemsFilterValue]

type OpsItemRelatedItemsFilters = js.Array[OpsItemRelatedItemsFilter]

type OpsItemRelatedItemsMaxResults = Double

type OpsItemSeverity = java.lang.String

type OpsItemSource = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Open_
  - typings.awsSdk2Types.awsSdk2TypesStrings.InProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.Resolved
  - typings.awsSdk2Types.awsSdk2TypesStrings.Pending_
  - typings.awsSdk2Types.awsSdk2TypesStrings.TimedOut
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelling_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancelled_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - typings.awsSdk2Types.awsSdk2TypesStrings.CompletedWithSuccess
  - typings.awsSdk2Types.awsSdk2TypesStrings.CompletedWithFailure
  - typings.awsSdk2Types.awsSdk2TypesStrings.Scheduled
  - typings.awsSdk2Types.awsSdk2TypesStrings.RunbookInProgress
  - typings.awsSdk2Types.awsSdk2TypesStrings.PendingChangeCalendarOverride
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeCalendarOverrideApproved
  - typings.awsSdk2Types.awsSdk2TypesStrings.ChangeCalendarOverrideRejected
  - typings.awsSdk2Types.awsSdk2TypesStrings.PendingApproval
  - typings.awsSdk2Types.awsSdk2TypesStrings.Approved_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Rejected_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Closed_
  - java.lang.String
*/
type OpsItemStatus = _OpsItemStatus | java.lang.String

type OpsItemSummaries = js.Array[OpsItemSummary]

type OpsItemTitle = java.lang.String

type OpsItemType = java.lang.String

type OpsMetadataArn = java.lang.String

type OpsMetadataFilterKey = java.lang.String

type OpsMetadataFilterList = js.Array[OpsMetadataFilter]

type OpsMetadataFilterValue = java.lang.String

type OpsMetadataFilterValueList = js.Array[OpsMetadataFilterValue]

type OpsMetadataList = js.Array[OpsMetadata]

type OpsMetadataResourceId = java.lang.String

type OpsResultAttributeList = js.Array[OpsResultAttribute]

type OutputSourceId = java.lang.String

type OutputSourceType = java.lang.String

type OwnerInformation = java.lang.String

type PSParameterName = java.lang.String

type PSParameterSelector = java.lang.String

type PSParameterValue = java.lang.String

type PSParameterVersion = Double

type ParameterDataType = java.lang.String

type ParameterDescription = java.lang.String

type ParameterHistoryList = js.Array[ParameterHistory]

type ParameterKeyId = java.lang.String

type ParameterLabel = java.lang.String

type ParameterLabelList = js.Array[ParameterLabel]

type ParameterList = js.Array[Parameter]

type ParameterMetadataList = js.Array[ParameterMetadata]

type ParameterName = java.lang.String

type ParameterNameList = js.Array[PSParameterName]

type ParameterPolicies = java.lang.String

type ParameterPolicyList = js.Array[ParameterInlinePolicy]

type ParameterStringFilterKey = java.lang.String

type ParameterStringFilterList = js.Array[ParameterStringFilter]

type ParameterStringFilterValue = java.lang.String

type ParameterStringFilterValueList = js.Array[ParameterStringFilterValue]

type ParameterStringQueryOption = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Standard_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Advanced
  - typings.awsSdk2Types.awsSdk2TypesStrings.`Intelligent-Tiering`
  - java.lang.String
*/
type ParameterTier = _ParameterTier | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.String_
  - typings.awsSdk2Types.awsSdk2TypesStrings.StringList
  - typings.awsSdk2Types.awsSdk2TypesStrings.SecureString
  - java.lang.String
*/
type ParameterType = _ParameterType | java.lang.String

type ParameterValue = java.lang.String

type ParameterValueList = js.Array[ParameterValue]

type Parameters = StringDictionary[ParameterValueList]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Name_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Type
  - typings.awsSdk2Types.awsSdk2TypesStrings.KeyId
  - java.lang.String
*/
type ParametersFilterKey = _ParametersFilterKey | java.lang.String

type ParametersFilterList = js.Array[ParametersFilter]

type ParametersFilterValue = java.lang.String

type ParametersFilterValueList = js.Array[ParametersFilterValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ALLOW_AS_DEPENDENCY
  - typings.awsSdk2Types.awsSdk2TypesStrings.BLOCK
  - java.lang.String
*/
type PatchAction = _PatchAction | java.lang.String

type PatchAdvisoryId = java.lang.String

type PatchAdvisoryIdList = js.Array[PatchAdvisoryId]

type PatchArch = java.lang.String

type PatchBaselineIdentityList = js.Array[PatchBaselineIdentity]

type PatchBaselineMaxResults = Double

type PatchBugzillaId = java.lang.String

type PatchBugzillaIdList = js.Array[PatchBugzillaId]

type PatchCVEId = java.lang.String

type PatchCVEIdList = js.Array[PatchCVEId]

type PatchCVEIds = java.lang.String

type PatchClassification = java.lang.String

type PatchComplianceDataList = js.Array[PatchComplianceData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.INSTALLED
  - typings.awsSdk2Types.awsSdk2TypesStrings.INSTALLED_OTHER
  - typings.awsSdk2Types.awsSdk2TypesStrings.INSTALLED_PENDING_REBOOT
  - typings.awsSdk2Types.awsSdk2TypesStrings.INSTALLED_REJECTED
  - typings.awsSdk2Types.awsSdk2TypesStrings.MISSING
  - typings.awsSdk2Types.awsSdk2TypesStrings.NOT_APPLICABLE
  - typings.awsSdk2Types.awsSdk2TypesStrings.FAILED
  - java.lang.String
*/
type PatchComplianceDataState = _PatchComplianceDataState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.CRITICAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.HIGH
  - typings.awsSdk2Types.awsSdk2TypesStrings.MEDIUM
  - typings.awsSdk2Types.awsSdk2TypesStrings.LOW
  - typings.awsSdk2Types.awsSdk2TypesStrings.INFORMATIONAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.UNSPECIFIED
  - java.lang.String
*/
type PatchComplianceLevel = _PatchComplianceLevel | java.lang.String

type PatchComplianceMaxResults = Double

type PatchContentUrl = java.lang.String

type PatchCriticalNonCompliantCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.APPROVED
  - typings.awsSdk2Types.awsSdk2TypesStrings.PENDING_APPROVAL
  - typings.awsSdk2Types.awsSdk2TypesStrings.EXPLICIT_APPROVED
  - typings.awsSdk2Types.awsSdk2TypesStrings.EXPLICIT_REJECTED
  - java.lang.String
*/
type PatchDeploymentStatus = _PatchDeploymentStatus | java.lang.String

type PatchDescription = java.lang.String

type PatchEpoch = Double

type PatchFailedCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ARCH
  - typings.awsSdk2Types.awsSdk2TypesStrings.ADVISORY_ID
  - typings.awsSdk2Types.awsSdk2TypesStrings.BUGZILLA_ID
  - typings.awsSdk2Types.awsSdk2TypesStrings.PATCH_SET
  - typings.awsSdk2Types.awsSdk2TypesStrings.PRODUCT
  - typings.awsSdk2Types.awsSdk2TypesStrings.PRODUCT_FAMILY
  - typings.awsSdk2Types.awsSdk2TypesStrings.CLASSIFICATION
  - typings.awsSdk2Types.awsSdk2TypesStrings.CVE_ID
  - typings.awsSdk2Types.awsSdk2TypesStrings.EPOCH
  - typings.awsSdk2Types.awsSdk2TypesStrings.MSRC_SEVERITY
  - typings.awsSdk2Types.awsSdk2TypesStrings.NAME
  - typings.awsSdk2Types.awsSdk2TypesStrings.PATCH_ID
  - typings.awsSdk2Types.awsSdk2TypesStrings.SECTION
  - typings.awsSdk2Types.awsSdk2TypesStrings.PRIORITY
  - typings.awsSdk2Types.awsSdk2TypesStrings.REPOSITORY
  - typings.awsSdk2Types.awsSdk2TypesStrings.RELEASE
  - typings.awsSdk2Types.awsSdk2TypesStrings.SEVERITY
  - typings.awsSdk2Types.awsSdk2TypesStrings.SECURITY
  - typings.awsSdk2Types.awsSdk2TypesStrings.VERSION
  - java.lang.String
*/
type PatchFilterKey = _PatchFilterKey | java.lang.String

type PatchFilterList = js.Array[PatchFilter]

type PatchFilterValue = java.lang.String

type PatchFilterValueList = js.Array[PatchFilterValue]

type PatchGroup = java.lang.String

type PatchGroupList = js.Array[PatchGroup]

type PatchGroupPatchBaselineMappingList = js.Array[PatchGroupPatchBaselineMapping]

type PatchId = java.lang.String

type PatchIdList = js.Array[PatchId]

type PatchInstalledCount = Double

type PatchInstalledOtherCount = Double

type PatchInstalledPendingRebootCount = Double

type PatchInstalledRejectedCount = Double

type PatchKbNumber = java.lang.String

type PatchLanguage = java.lang.String

type PatchList = js.Array[Patch]

type PatchMissingCount = Double

type PatchMsrcNumber = java.lang.String

type PatchMsrcSeverity = java.lang.String

type PatchName = java.lang.String

type PatchNotApplicableCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Scan
  - typings.awsSdk2Types.awsSdk2TypesStrings.Install
  - java.lang.String
*/
type PatchOperationType = _PatchOperationType | java.lang.String

type PatchOrchestratorFilterKey = java.lang.String

type PatchOrchestratorFilterList = js.Array[PatchOrchestratorFilter]

type PatchOrchestratorFilterValue = java.lang.String

type PatchOrchestratorFilterValues = js.Array[PatchOrchestratorFilterValue]

type PatchOtherNonCompliantCount = Double

type PatchProduct = java.lang.String

type PatchProductFamily = java.lang.String

type PatchPropertiesList = js.Array[PatchPropertyEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.PRODUCT
  - typings.awsSdk2Types.awsSdk2TypesStrings.PRODUCT_FAMILY
  - typings.awsSdk2Types.awsSdk2TypesStrings.CLASSIFICATION
  - typings.awsSdk2Types.awsSdk2TypesStrings.MSRC_SEVERITY
  - typings.awsSdk2Types.awsSdk2TypesStrings.PRIORITY
  - typings.awsSdk2Types.awsSdk2TypesStrings.SEVERITY
  - java.lang.String
*/
type PatchProperty = _PatchProperty | java.lang.String

type PatchPropertyEntry = StringDictionary[AttributeValue]

type PatchRelease = java.lang.String

type PatchRepository = java.lang.String

type PatchRuleList = js.Array[PatchRule]

type PatchSecurityNonCompliantCount = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.OS
  - typings.awsSdk2Types.awsSdk2TypesStrings.APPLICATION
  - java.lang.String
*/
type PatchSet = _PatchSet | java.lang.String

type PatchSeverity = java.lang.String

type PatchSourceConfiguration = java.lang.String

type PatchSourceList = js.Array[PatchSource]

type PatchSourceName = java.lang.String

type PatchSourceProduct = java.lang.String

type PatchSourceProductList = js.Array[PatchSourceProduct]

type PatchStringDateTime = java.lang.String

type PatchTitle = java.lang.String

type PatchUnreportedNotApplicableCount = Double

type PatchVendor = java.lang.String

type PatchVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Online
  - typings.awsSdk2Types.awsSdk2TypesStrings.ConnectionLost
  - typings.awsSdk2Types.awsSdk2TypesStrings.Inactive
  - java.lang.String
*/
type PingStatus = _PingStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Windows_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Linux
  - typings.awsSdk2Types.awsSdk2TypesStrings.MacOS_
  - java.lang.String
*/
type PlatformType = _PlatformType | java.lang.String

type PlatformTypeList = js.Array[PlatformType]

type Policy = java.lang.String

type PolicyHash = java.lang.String

type PolicyId = java.lang.String

type Product = java.lang.String

type PutInventoryMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.RebootIfNeeded
  - typings.awsSdk2Types.awsSdk2TypesStrings.NoReboot
  - java.lang.String
*/
type RebootOption = _RebootOption | java.lang.String

type Region = java.lang.String

type Regions = js.Array[Region]

type RegistrationLimit = Double

type RegistrationMetadataKey = java.lang.String

type RegistrationMetadataList = js.Array[RegistrationMetadataItem]

type RegistrationMetadataValue = java.lang.String

type RegistrationsCount = Double

type RelatedOpsItems = js.Array[RelatedOpsItem]

type RemainingCount = Double

type RequireType = java.lang.String

type ResourceArnString = java.lang.String

type ResourceComplianceSummaryItemList = js.Array[ResourceComplianceSummaryItem]

type ResourceCount = Double

type ResourceCountByStatus = java.lang.String

type ResourceDataSyncAWSKMSKeyARN = java.lang.String

type ResourceDataSyncCreatedTime = js.Date

type ResourceDataSyncDestinationDataSharingType = java.lang.String

type ResourceDataSyncEnableAllOpsDataSources = scala.Boolean

type ResourceDataSyncIncludeFutureRegions = scala.Boolean

type ResourceDataSyncItemList = js.Array[ResourceDataSyncItem]

type ResourceDataSyncLastModifiedTime = js.Date

type ResourceDataSyncName = java.lang.String

type ResourceDataSyncOrganizationSourceType = java.lang.String

type ResourceDataSyncOrganizationalUnitId = java.lang.String

type ResourceDataSyncOrganizationalUnitList = js.Array[ResourceDataSyncOrganizationalUnit]

type ResourceDataSyncS3BucketName = java.lang.String

type ResourceDataSyncS3Format = JsonSerDe | java.lang.String

type ResourceDataSyncS3Prefix = java.lang.String

type ResourceDataSyncS3Region = java.lang.String

type ResourceDataSyncSourceRegion = java.lang.String

type ResourceDataSyncSourceRegionList = js.Array[ResourceDataSyncSourceRegion]

type ResourceDataSyncSourceType = java.lang.String

type ResourceDataSyncState = java.lang.String

type ResourceDataSyncType = java.lang.String

type ResourceId = java.lang.String

type ResourcePolicyMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.ManagedInstance
  - typings.awsSdk2Types.awsSdk2TypesStrings.Document_
  - typings.awsSdk2Types.awsSdk2TypesStrings.EC2Instance
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Document_
  - typings.awsSdk2Types.awsSdk2TypesStrings.ManagedInstance
  - typings.awsSdk2Types.awsSdk2TypesStrings.MaintenanceWindow
  - typings.awsSdk2Types.awsSdk2TypesStrings.Parameter
  - typings.awsSdk2Types.awsSdk2TypesStrings.PatchBaseline
  - typings.awsSdk2Types.awsSdk2TypesStrings.OpsItem
  - typings.awsSdk2Types.awsSdk2TypesStrings.OpsMetadata
  - typings.awsSdk2Types.awsSdk2TypesStrings.Automation_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Association
  - java.lang.String
*/
type ResourceTypeForTagging = _ResourceTypeForTagging | java.lang.String

type ResponseCode = Double

type ResultAttributeList = js.Array[ResultAttribute]

type ReviewInformationList = js.Array[ReviewInformation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.APPROVED
  - typings.awsSdk2Types.awsSdk2TypesStrings.NOT_REVIEWED
  - typings.awsSdk2Types.awsSdk2TypesStrings.PENDING
  - typings.awsSdk2Types.awsSdk2TypesStrings.REJECTED
  - java.lang.String
*/
type ReviewStatus = _ReviewStatus | java.lang.String

type Reviewer = java.lang.String

type Runbooks = js.Array[Runbook]

type S3BucketName = java.lang.String

type S3KeyPrefix = java.lang.String

type S3Region = java.lang.String

type ScheduleExpression = java.lang.String

type ScheduleOffset = Double

type ScheduledWindowExecutionList = js.Array[ScheduledWindowExecution]

type ServiceRole = java.lang.String

type ServiceSettingId = java.lang.String

type ServiceSettingValue = java.lang.String

type SessionDetails = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.InvokedAfter
  - typings.awsSdk2Types.awsSdk2TypesStrings.InvokedBefore
  - typings.awsSdk2Types.awsSdk2TypesStrings.Target
  - typings.awsSdk2Types.awsSdk2TypesStrings.Owner
  - typings.awsSdk2Types.awsSdk2TypesStrings.Status
  - typings.awsSdk2Types.awsSdk2TypesStrings.SessionId
  - java.lang.String
*/
type SessionFilterKey = _SessionFilterKey | java.lang.String

type SessionFilterList = js.Array[SessionFilter]

type SessionFilterValue = java.lang.String

type SessionId = java.lang.String

type SessionList = js.Array[Session]

type SessionManagerCloudWatchOutputUrl = java.lang.String

type SessionManagerParameterName = java.lang.String

type SessionManagerParameterValue = java.lang.String

type SessionManagerParameterValueList = js.Array[SessionManagerParameterValue]

type SessionManagerParameters = StringDictionary[SessionManagerParameterValueList]

type SessionManagerS3OutputUrl = java.lang.String

type SessionMaxResults = Double

type SessionOwner = java.lang.String

type SessionReason = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Active_
  - typings.awsSdk2Types.awsSdk2TypesStrings.History
  - java.lang.String
*/
type SessionState = _SessionState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Connected
  - typings.awsSdk2Types.awsSdk2TypesStrings.Connecting
  - typings.awsSdk2Types.awsSdk2TypesStrings.Disconnected
  - typings.awsSdk2Types.awsSdk2TypesStrings.Terminated
  - typings.awsSdk2Types.awsSdk2TypesStrings.Terminating
  - typings.awsSdk2Types.awsSdk2TypesStrings.Failed_
  - java.lang.String
*/
type SessionStatus = _SessionStatus | java.lang.String

type SessionTarget = java.lang.String

type SharedDocumentVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Approve
  - typings.awsSdk2Types.awsSdk2TypesStrings.Reject
  - typings.awsSdk2Types.awsSdk2TypesStrings.StartStep
  - typings.awsSdk2Types.awsSdk2TypesStrings.StopStep
  - typings.awsSdk2Types.awsSdk2TypesStrings.Resume
  - java.lang.String
*/
type SignalType = _SignalType | java.lang.String

type SnapshotDownloadUrl = java.lang.String

type SnapshotId = java.lang.String

type SourceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.AWSColonColonEC2ColonColonInstance
  - typings.awsSdk2Types.awsSdk2TypesStrings.AWSColonColonIoTColonColonThing
  - typings.awsSdk2Types.awsSdk2TypesStrings.AWSColonColonSSMColonColonManagedInstance
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

type StandardErrorContent = java.lang.String

type StandardOutputContent = java.lang.String

type StatusAdditionalInfo = java.lang.String

type StatusDetails = java.lang.String

type StatusMessage = java.lang.String

type StatusName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.StartTimeBefore
  - typings.awsSdk2Types.awsSdk2TypesStrings.StartTimeAfter
  - typings.awsSdk2Types.awsSdk2TypesStrings.StepExecutionStatus
  - typings.awsSdk2Types.awsSdk2TypesStrings.StepExecutionId
  - typings.awsSdk2Types.awsSdk2TypesStrings.StepName
  - typings.awsSdk2Types.awsSdk2TypesStrings.Action
  - java.lang.String
*/
type StepExecutionFilterKey = _StepExecutionFilterKey | java.lang.String

type StepExecutionFilterList = js.Array[StepExecutionFilter]

type StepExecutionFilterValue = java.lang.String

type StepExecutionFilterValueList = js.Array[StepExecutionFilterValue]

type StepExecutionList = js.Array[StepExecution]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.Complete_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Cancel
  - java.lang.String
*/
type StopType = _StopType | java.lang.String

type StreamUrl = java.lang.String

type String = java.lang.String

type StringDateTime = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetCount = Double

type TargetKey = java.lang.String

type TargetLocations = js.Array[TargetLocation]

type TargetMap = StringDictionary[TargetMapValueList]

type TargetMapKey = java.lang.String

type TargetMapValue = java.lang.String

type TargetMapValueList = js.Array[TargetMapValue]

type TargetMaps = js.Array[TargetMap]

type TargetParameterList = js.Array[ParameterValue]

type TargetType = java.lang.String

type TargetValue = java.lang.String

type TargetValues = js.Array[TargetValue]

type Targets = js.Array[Target]

type TimeoutSeconds = Double

type TokenValue = java.lang.String

type TotalCount = Double

type UUID = java.lang.String

type Url = java.lang.String

type ValidNextStep = java.lang.String

type ValidNextStepList = js.Array[ValidNextStep]

type Version = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`2014-11-06`
  - typings.awsSdk2Types.awsSdk2TypesStrings.latest
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
