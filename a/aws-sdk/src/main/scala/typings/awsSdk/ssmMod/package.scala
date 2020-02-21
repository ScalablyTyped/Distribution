package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ssmMod {
  type Account = java.lang.String
  type AccountId = java.lang.String
  type AccountIdList = js.Array[typings.awsSdk.ssmMod.AccountId]
  type AccountSharingInfoList = js.Array[typings.awsSdk.ssmMod.AccountSharingInfo]
  type Accounts = js.Array[typings.awsSdk.ssmMod.Account]
  type ActivationCode = java.lang.String
  type ActivationDescription = java.lang.String
  type ActivationId = java.lang.String
  type ActivationList = js.Array[typings.awsSdk.ssmMod.Activation]
  type AgentErrorCode = java.lang.String
  type AggregatorSchemaOnly = scala.Boolean
  type AllowedPattern = java.lang.String
  type ApproveAfterDays = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CRITICAL
    - typings.awsSdk.awsSdkStrings.HIGH
    - typings.awsSdk.awsSdkStrings.MEDIUM
    - typings.awsSdk.awsSdkStrings.LOW
    - typings.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type AssociationComplianceSeverity = typings.awsSdk.ssmMod._AssociationComplianceSeverity | java.lang.String
  type AssociationDescriptionList = js.Array[typings.awsSdk.ssmMod.AssociationDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ExecutionId
    - typings.awsSdk.awsSdkStrings.Status_
    - typings.awsSdk.awsSdkStrings.CreatedTime
    - java.lang.String
  */
  type AssociationExecutionFilterKey = typings.awsSdk.ssmMod._AssociationExecutionFilterKey | java.lang.String
  type AssociationExecutionFilterList = js.Array[typings.awsSdk.ssmMod.AssociationExecutionFilter]
  type AssociationExecutionFilterValue = java.lang.String
  type AssociationExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Status_
    - typings.awsSdk.awsSdkStrings.ResourceId
    - typings.awsSdk.awsSdkStrings.ResourceType
    - java.lang.String
  */
  type AssociationExecutionTargetsFilterKey = typings.awsSdk.ssmMod._AssociationExecutionTargetsFilterKey | java.lang.String
  type AssociationExecutionTargetsFilterList = js.Array[typings.awsSdk.ssmMod.AssociationExecutionTargetsFilter]
  type AssociationExecutionTargetsFilterValue = java.lang.String
  type AssociationExecutionTargetsList = js.Array[typings.awsSdk.ssmMod.AssociationExecutionTarget]
  type AssociationExecutionsList = js.Array[typings.awsSdk.ssmMod.AssociationExecution]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InstanceId
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.AssociationId
    - typings.awsSdk.awsSdkStrings.AssociationStatusName
    - typings.awsSdk.awsSdkStrings.LastExecutedBefore
    - typings.awsSdk.awsSdkStrings.LastExecutedAfter
    - typings.awsSdk.awsSdkStrings.AssociationName
    - java.lang.String
  */
  type AssociationFilterKey = typings.awsSdk.ssmMod._AssociationFilterKey | java.lang.String
  type AssociationFilterList = js.Array[typings.awsSdk.ssmMod.AssociationFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQUAL
    - typings.awsSdk.awsSdkStrings.LESS_THAN
    - typings.awsSdk.awsSdkStrings.GREATER_THAN
    - java.lang.String
  */
  type AssociationFilterOperatorType = typings.awsSdk.ssmMod._AssociationFilterOperatorType | java.lang.String
  type AssociationFilterValue = java.lang.String
  type AssociationId = java.lang.String
  type AssociationIdList = js.Array[typings.awsSdk.ssmMod.AssociationId]
  type AssociationList = js.Array[typings.awsSdk.ssmMod.Association]
  type AssociationName = java.lang.String
  type AssociationResourceId = java.lang.String
  type AssociationResourceType = java.lang.String
  type AssociationStatusAggregatedCount = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.InstanceCount]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type AssociationStatusName = typings.awsSdk.ssmMod._AssociationStatusName | java.lang.String
  type AssociationVersion = java.lang.String
  type AssociationVersionList = js.Array[typings.awsSdk.ssmMod.AssociationVersionInfo]
  type AttachmentContentList = js.Array[typings.awsSdk.ssmMod.AttachmentContent]
  type AttachmentHash = java.lang.String
  type AttachmentHashType = typings.awsSdk.awsSdkStrings.Sha256_ | java.lang.String
  type AttachmentIdentifier = java.lang.String
  type AttachmentInformationList = js.Array[typings.awsSdk.ssmMod.AttachmentInformation]
  type AttachmentName = java.lang.String
  type AttachmentUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SourceUrl
    - typings.awsSdk.awsSdkStrings.S3FileUrl
    - typings.awsSdk.awsSdkStrings.AttachmentReference
    - java.lang.String
  */
  type AttachmentsSourceKey = typings.awsSdk.ssmMod._AttachmentsSourceKey | java.lang.String
  type AttachmentsSourceList = js.Array[typings.awsSdk.ssmMod.AttachmentsSource]
  type AttachmentsSourceValue = java.lang.String
  type AttachmentsSourceValues = js.Array[typings.awsSdk.ssmMod.AttachmentsSourceValue]
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type AutomationActionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DocumentNamePrefix
    - typings.awsSdk.awsSdkStrings.ExecutionStatus
    - typings.awsSdk.awsSdkStrings.ExecutionId
    - typings.awsSdk.awsSdkStrings.ParentExecutionId
    - typings.awsSdk.awsSdkStrings.CurrentAction
    - typings.awsSdk.awsSdkStrings.StartTimeBefore
    - typings.awsSdk.awsSdkStrings.StartTimeAfter
    - typings.awsSdk.awsSdkStrings.AutomationType
    - typings.awsSdk.awsSdkStrings.TagKey
    - java.lang.String
  */
  type AutomationExecutionFilterKey = typings.awsSdk.ssmMod._AutomationExecutionFilterKey | java.lang.String
  type AutomationExecutionFilterList = js.Array[typings.awsSdk.ssmMod.AutomationExecutionFilter]
  type AutomationExecutionFilterValue = java.lang.String
  type AutomationExecutionFilterValueList = js.Array[typings.awsSdk.ssmMod.AutomationExecutionFilterValue]
  type AutomationExecutionId = java.lang.String
  type AutomationExecutionMetadataList = js.Array[typings.awsSdk.ssmMod.AutomationExecutionMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Waiting_
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.TimedOut_
    - typings.awsSdk.awsSdkStrings.Cancelling_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type AutomationExecutionStatus = typings.awsSdk.ssmMod._AutomationExecutionStatus | java.lang.String
  type AutomationParameterKey = java.lang.String
  type AutomationParameterMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.AutomationParameterValueList]
  type AutomationParameterValue = java.lang.String
  type AutomationParameterValueList = js.Array[typings.awsSdk.ssmMod.AutomationParameterValue]
  type AutomationTargetParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CrossAccount
    - typings.awsSdk.awsSdkStrings.Local_
    - java.lang.String
  */
  type AutomationType = typings.awsSdk.ssmMod._AutomationType | java.lang.String
  type BaselineDescription = java.lang.String
  type BaselineId = java.lang.String
  type BaselineName = java.lang.String
  type BatchErrorMessage = java.lang.String
  type Boolean = scala.Boolean
  type CalendarNameOrARN = java.lang.String
  type CalendarNameOrARNList = js.Array[typings.awsSdk.ssmMod.CalendarNameOrARN]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OPEN
    - typings.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type CalendarState = typings.awsSdk.ssmMod._CalendarState | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ssmMod.ClientApiVersions
  type ClientToken = java.lang.String
  type CloudWatchLogGroupName = java.lang.String
  type CloudWatchOutputEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InvokedAfter
    - typings.awsSdk.awsSdkStrings.InvokedBefore
    - typings.awsSdk.awsSdkStrings.Status_
    - typings.awsSdk.awsSdkStrings.ExecutionStage
    - typings.awsSdk.awsSdkStrings.DocumentName
    - java.lang.String
  */
  type CommandFilterKey = typings.awsSdk.ssmMod._CommandFilterKey | java.lang.String
  type CommandFilterList = js.Array[typings.awsSdk.ssmMod.CommandFilter]
  type CommandFilterValue = java.lang.String
  type CommandId = java.lang.String
  type CommandInvocationList = js.Array[typings.awsSdk.ssmMod.CommandInvocation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Delayed
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.TimedOut_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Cancelling_
    - java.lang.String
  */
  type CommandInvocationStatus = typings.awsSdk.ssmMod._CommandInvocationStatus | java.lang.String
  type CommandList = js.Array[typings.awsSdk.ssmMod.Command]
  type CommandMaxResults = scala.Double
  type CommandPluginList = js.Array[typings.awsSdk.ssmMod.CommandPlugin]
  type CommandPluginName = java.lang.String
  type CommandPluginOutput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.TimedOut_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type CommandPluginStatus = typings.awsSdk.ssmMod._CommandPluginStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.TimedOut_
    - typings.awsSdk.awsSdkStrings.Cancelling_
    - java.lang.String
  */
  type CommandStatus = typings.awsSdk.ssmMod._CommandStatus | java.lang.String
  type Comment = java.lang.String
  type CompletedCount = scala.Double
  type ComplianceExecutionId = java.lang.String
  type ComplianceExecutionType = java.lang.String
  type ComplianceFilterValue = java.lang.String
  type ComplianceItemContentHash = java.lang.String
  type ComplianceItemDetails = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.AttributeValue]
  type ComplianceItemEntryList = js.Array[typings.awsSdk.ssmMod.ComplianceItemEntry]
  type ComplianceItemId = java.lang.String
  type ComplianceItemList = js.Array[typings.awsSdk.ssmMod.ComplianceItem]
  type ComplianceItemTitle = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQUAL
    - typings.awsSdk.awsSdkStrings.NOT_EQUAL
    - typings.awsSdk.awsSdkStrings.BEGIN_WITH
    - typings.awsSdk.awsSdkStrings.LESS_THAN
    - typings.awsSdk.awsSdkStrings.GREATER_THAN
    - java.lang.String
  */
  type ComplianceQueryOperatorType = typings.awsSdk.ssmMod._ComplianceQueryOperatorType | java.lang.String
  type ComplianceResourceId = java.lang.String
  type ComplianceResourceIdList = js.Array[typings.awsSdk.ssmMod.ComplianceResourceId]
  type ComplianceResourceType = java.lang.String
  type ComplianceResourceTypeList = js.Array[typings.awsSdk.ssmMod.ComplianceResourceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CRITICAL
    - typings.awsSdk.awsSdkStrings.HIGH
    - typings.awsSdk.awsSdkStrings.MEDIUM
    - typings.awsSdk.awsSdkStrings.LOW
    - typings.awsSdk.awsSdkStrings.INFORMATIONAL
    - typings.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type ComplianceSeverity = typings.awsSdk.ssmMod._ComplianceSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLIANT
    - typings.awsSdk.awsSdkStrings.NON_COMPLIANT
    - java.lang.String
  */
  type ComplianceStatus = typings.awsSdk.ssmMod._ComplianceStatus | java.lang.String
  type ComplianceStringFilterKey = java.lang.String
  type ComplianceStringFilterList = js.Array[typings.awsSdk.ssmMod.ComplianceStringFilter]
  type ComplianceStringFilterValueList = js.Array[typings.awsSdk.ssmMod.ComplianceFilterValue]
  type ComplianceSummaryCount = scala.Double
  type ComplianceSummaryItemList = js.Array[typings.awsSdk.ssmMod.ComplianceSummaryItem]
  type ComplianceTypeName = java.lang.String
  type ComputerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Connected_
    - typings.awsSdk.awsSdkStrings.NotConnected
    - java.lang.String
  */
  type ConnectionStatus = typings.awsSdk.ssmMod._ConnectionStatus | java.lang.String
  type ContentLength = scala.Double
  type CreateAssociationBatchRequestEntries = js.Array[typings.awsSdk.ssmMod.CreateAssociationBatchRequestEntry]
  type CreatedDate = typings.std.Date
  type DateTime = typings.std.Date
  type DefaultBaseline = scala.Boolean
  type DefaultInstanceName = java.lang.String
  type DeliveryTimedOutCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ActivationIds
    - typings.awsSdk.awsSdkStrings.DefaultInstanceName
    - typings.awsSdk.awsSdkStrings.IamRole
    - java.lang.String
  */
  type DescribeActivationsFilterKeys = typings.awsSdk.ssmMod._DescribeActivationsFilterKeys | java.lang.String
  type DescribeActivationsFilterList = js.Array[typings.awsSdk.ssmMod.DescribeActivationsFilter]
  type DescriptionInDocument = java.lang.String
  type DocumentARN = java.lang.String
  type DocumentContent = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.Owner_
    - typings.awsSdk.awsSdkStrings.PlatformTypes
    - typings.awsSdk.awsSdkStrings.DocumentType
    - java.lang.String
  */
  type DocumentFilterKey = typings.awsSdk.ssmMod._DocumentFilterKey | java.lang.String
  type DocumentFilterList = js.Array[typings.awsSdk.ssmMod.DocumentFilter]
  type DocumentFilterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.YAML
    - typings.awsSdk.awsSdkStrings.JSON
    - typings.awsSdk.awsSdkStrings.TEXT
    - java.lang.String
  */
  type DocumentFormat = typings.awsSdk.ssmMod._DocumentFormat | java.lang.String
  type DocumentHash = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Sha256_
    - typings.awsSdk.awsSdkStrings.Sha1_
    - java.lang.String
  */
  type DocumentHashType = typings.awsSdk.ssmMod._DocumentHashType | java.lang.String
  type DocumentIdentifierList = js.Array[typings.awsSdk.ssmMod.DocumentIdentifier]
  type DocumentKeyValuesFilterKey = java.lang.String
  type DocumentKeyValuesFilterList = js.Array[typings.awsSdk.ssmMod.DocumentKeyValuesFilter]
  type DocumentKeyValuesFilterValue = java.lang.String
  type DocumentKeyValuesFilterValues = js.Array[typings.awsSdk.ssmMod.DocumentKeyValuesFilterValue]
  type DocumentName = java.lang.String
  type DocumentOwner = java.lang.String
  type DocumentParameterDefaultValue = java.lang.String
  type DocumentParameterDescrption = java.lang.String
  type DocumentParameterList = js.Array[typings.awsSdk.ssmMod.DocumentParameter]
  type DocumentParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.String_
    - typings.awsSdk.awsSdkStrings.StringList
    - java.lang.String
  */
  type DocumentParameterType = typings.awsSdk.ssmMod._DocumentParameterType | java.lang.String
  type DocumentPermissionType = typings.awsSdk.awsSdkStrings.Share | java.lang.String
  type DocumentRequiresList = js.Array[typings.awsSdk.ssmMod.DocumentRequires]
  type DocumentSchemaVersion = java.lang.String
  type DocumentSha1 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Updating_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DocumentStatus = typings.awsSdk.ssmMod._DocumentStatus | java.lang.String
  type DocumentStatusInformation = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Command
    - typings.awsSdk.awsSdkStrings.Policy_
    - typings.awsSdk.awsSdkStrings.Automation_
    - typings.awsSdk.awsSdkStrings.Session
    - typings.awsSdk.awsSdkStrings.Package
    - typings.awsSdk.awsSdkStrings.ApplicationConfiguration
    - typings.awsSdk.awsSdkStrings.ApplicationConfigurationSchema
    - typings.awsSdk.awsSdkStrings.DeploymentStrategy
    - typings.awsSdk.awsSdkStrings.ChangeCalendar
    - java.lang.String
  */
  type DocumentType = typings.awsSdk.ssmMod._DocumentType | java.lang.String
  type DocumentVersion = java.lang.String
  type DocumentVersionList = js.Array[typings.awsSdk.ssmMod.DocumentVersionInfo]
  type DocumentVersionName = java.lang.String
  type DocumentVersionNumber = java.lang.String
  type DryRun = scala.Boolean
  type EffectiveInstanceAssociationMaxResults = scala.Double
  type EffectivePatchList = js.Array[typings.awsSdk.ssmMod.EffectivePatch]
  type ErrorCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Auto_
    - typings.awsSdk.awsSdkStrings.Interactive_
    - java.lang.String
  */
  type ExecutionMode = typings.awsSdk.ssmMod._ExecutionMode | java.lang.String
  type ExecutionRoleName = java.lang.String
  type ExpirationDate = typings.std.Date
  type FailedCreateAssociationList = js.Array[typings.awsSdk.ssmMod.FailedCreateAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Client
    - typings.awsSdk.awsSdkStrings.Server_
    - typings.awsSdk.awsSdkStrings.Unknown_
    - java.lang.String
  */
  type Fault = typings.awsSdk.ssmMod._Fault | java.lang.String
  type GetInventorySchemaMaxResults = scala.Double
  type GetParametersByPathMaxResults = scala.Double
  type IPAddress = java.lang.String
  type ISO8601String = java.lang.String
  type IamRole = java.lang.String
  type IdempotencyToken = java.lang.String
  type InstallOverrideList = java.lang.String
  type InstanceAssociationExecutionSummary = java.lang.String
  type InstanceAssociationList = js.Array[typings.awsSdk.ssmMod.InstanceAssociation]
  type InstanceAssociationStatusAggregatedCount = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.InstanceCount]
  type InstanceAssociationStatusInfos = js.Array[typings.awsSdk.ssmMod.InstanceAssociationStatusInfo]
  type InstanceCount = scala.Double
  type InstanceId = java.lang.String
  type InstanceIdList = js.Array[typings.awsSdk.ssmMod.InstanceId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InstanceIds
    - typings.awsSdk.awsSdkStrings.AgentVersion
    - typings.awsSdk.awsSdkStrings.PingStatus
    - typings.awsSdk.awsSdkStrings.PlatformTypes
    - typings.awsSdk.awsSdkStrings.ActivationIds
    - typings.awsSdk.awsSdkStrings.IamRole
    - typings.awsSdk.awsSdkStrings.ResourceType
    - typings.awsSdk.awsSdkStrings.AssociationStatus
    - java.lang.String
  */
  type InstanceInformationFilterKey = typings.awsSdk.ssmMod._InstanceInformationFilterKey | java.lang.String
  type InstanceInformationFilterList = js.Array[typings.awsSdk.ssmMod.InstanceInformationFilter]
  type InstanceInformationFilterValue = java.lang.String
  type InstanceInformationFilterValueSet = js.Array[typings.awsSdk.ssmMod.InstanceInformationFilterValue]
  type InstanceInformationList = js.Array[typings.awsSdk.ssmMod.InstanceInformation]
  type InstanceInformationStringFilterKey = java.lang.String
  type InstanceInformationStringFilterList = js.Array[typings.awsSdk.ssmMod.InstanceInformationStringFilter]
  type InstancePatchStateFilterKey = java.lang.String
  type InstancePatchStateFilterList = js.Array[typings.awsSdk.ssmMod.InstancePatchStateFilter]
  type InstancePatchStateFilterValue = java.lang.String
  type InstancePatchStateFilterValues = js.Array[typings.awsSdk.ssmMod.InstancePatchStateFilterValue]
  type InstancePatchStateList = js.Array[typings.awsSdk.ssmMod.InstancePatchState]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Equal_
    - typings.awsSdk.awsSdkStrings.NotEqual
    - typings.awsSdk.awsSdkStrings.LessThan
    - typings.awsSdk.awsSdkStrings.GreaterThan
    - java.lang.String
  */
  type InstancePatchStateOperatorType = typings.awsSdk.ssmMod._InstancePatchStateOperatorType | java.lang.String
  type InstancePatchStatesList = js.Array[typings.awsSdk.ssmMod.InstancePatchState]
  type InstanceTagName = java.lang.String
  type InstancesCount = scala.Double
  type Integer = scala.Double
  type InventoryAggregatorExpression = java.lang.String
  type InventoryAggregatorList = js.Array[typings.awsSdk.ssmMod.InventoryAggregator]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.string__
    - typings.awsSdk.awsSdkStrings.number__
    - java.lang.String
  */
  type InventoryAttributeDataType = typings.awsSdk.ssmMod._InventoryAttributeDataType | java.lang.String
  type InventoryDeletionId = java.lang.String
  type InventoryDeletionLastStatusMessage = java.lang.String
  type InventoryDeletionLastStatusUpdateTime = typings.std.Date
  type InventoryDeletionStartTime = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Complete_
    - java.lang.String
  */
  type InventoryDeletionStatus = typings.awsSdk.ssmMod._InventoryDeletionStatus | java.lang.String
  type InventoryDeletionSummaryItems = js.Array[typings.awsSdk.ssmMod.InventoryDeletionSummaryItem]
  type InventoryDeletionsList = js.Array[typings.awsSdk.ssmMod.InventoryDeletionStatusItem]
  type InventoryFilterKey = java.lang.String
  type InventoryFilterList = js.Array[typings.awsSdk.ssmMod.InventoryFilter]
  type InventoryFilterValue = java.lang.String
  type InventoryFilterValueList = js.Array[typings.awsSdk.ssmMod.InventoryFilterValue]
  type InventoryGroupList = js.Array[typings.awsSdk.ssmMod.InventoryGroup]
  type InventoryGroupName = java.lang.String
  type InventoryItemAttributeList = js.Array[typings.awsSdk.ssmMod.InventoryItemAttribute]
  type InventoryItemAttributeName = java.lang.String
  type InventoryItemCaptureTime = java.lang.String
  type InventoryItemContentContext = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.AttributeValue]
  type InventoryItemContentHash = java.lang.String
  type InventoryItemEntry = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.AttributeValue]
  type InventoryItemEntryList = js.Array[typings.awsSdk.ssmMod.InventoryItemEntry]
  type InventoryItemList = js.Array[typings.awsSdk.ssmMod.InventoryItem]
  type InventoryItemSchemaResultList = js.Array[typings.awsSdk.ssmMod.InventoryItemSchema]
  type InventoryItemSchemaVersion = java.lang.String
  type InventoryItemTypeName = java.lang.String
  type InventoryItemTypeNameFilter = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Equal_
    - typings.awsSdk.awsSdkStrings.NotEqual
    - typings.awsSdk.awsSdkStrings.BeginWith
    - typings.awsSdk.awsSdkStrings.LessThan
    - typings.awsSdk.awsSdkStrings.GreaterThan
    - typings.awsSdk.awsSdkStrings.Exists
    - java.lang.String
  */
  type InventoryQueryOperatorType = typings.awsSdk.ssmMod._InventoryQueryOperatorType | java.lang.String
  type InventoryResultEntityId = java.lang.String
  type InventoryResultEntityList = js.Array[typings.awsSdk.ssmMod.InventoryResultEntity]
  type InventoryResultItemKey = java.lang.String
  type InventoryResultItemMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.InventoryResultItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DisableSchema
    - typings.awsSdk.awsSdkStrings.DeleteSchema
    - java.lang.String
  */
  type InventorySchemaDeleteOption = typings.awsSdk.ssmMod._InventorySchemaDeleteOption | java.lang.String
  type InventoryTypeDisplayName = java.lang.String
  type InvocationTraceOutput = java.lang.String
  type IsSubTypeSchema = scala.Boolean
  type KeyList = js.Array[typings.awsSdk.ssmMod.TagKey]
  type LastResourceDataSyncMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Successful_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - java.lang.String
  */
  type LastResourceDataSyncStatus = typings.awsSdk.ssmMod._LastResourceDataSyncStatus | java.lang.String
  type LastResourceDataSyncTime = typings.std.Date
  type LastSuccessfulResourceDataSyncTime = typings.std.Date
  type Long = scala.Double
  type MaintenanceWindowAllowUnassociatedTargets = scala.Boolean
  type MaintenanceWindowCutoff = scala.Double
  type MaintenanceWindowDescription = java.lang.String
  type MaintenanceWindowDurationHours = scala.Double
  type MaintenanceWindowEnabled = scala.Boolean
  type MaintenanceWindowExecutionId = java.lang.String
  type MaintenanceWindowExecutionList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowExecution]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.TIMED_OUT
    - typings.awsSdk.awsSdkStrings.CANCELLING
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.SKIPPED_OVERLAPPING
    - java.lang.String
  */
  type MaintenanceWindowExecutionStatus = typings.awsSdk.ssmMod._MaintenanceWindowExecutionStatus | java.lang.String
  type MaintenanceWindowExecutionStatusDetails = java.lang.String
  type MaintenanceWindowExecutionTaskExecutionId = java.lang.String
  type MaintenanceWindowExecutionTaskId = java.lang.String
  type MaintenanceWindowExecutionTaskIdList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowExecutionTaskId]
  type MaintenanceWindowExecutionTaskIdentityList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowExecutionTaskIdentity]
  type MaintenanceWindowExecutionTaskInvocationId = java.lang.String
  type MaintenanceWindowExecutionTaskInvocationIdentityList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowExecutionTaskInvocationIdentity]
  type MaintenanceWindowExecutionTaskInvocationParameters = java.lang.String
  type MaintenanceWindowFilterKey = java.lang.String
  type MaintenanceWindowFilterList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowFilter]
  type MaintenanceWindowFilterValue = java.lang.String
  type MaintenanceWindowFilterValues = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowFilterValue]
  type MaintenanceWindowId = java.lang.String
  type MaintenanceWindowIdentityList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowIdentity]
  type MaintenanceWindowLambdaClientContext = java.lang.String
  type MaintenanceWindowLambdaPayload = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.ssmMod.Blob | java.lang.String
  type MaintenanceWindowLambdaQualifier = java.lang.String
  type MaintenanceWindowMaxResults = scala.Double
  type MaintenanceWindowName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INSTANCE
    - typings.awsSdk.awsSdkStrings.RESOURCE_GROUP
    - java.lang.String
  */
  type MaintenanceWindowResourceType = typings.awsSdk.ssmMod._MaintenanceWindowResourceType | java.lang.String
  type MaintenanceWindowSchedule = java.lang.String
  type MaintenanceWindowSearchMaxResults = scala.Double
  type MaintenanceWindowStepFunctionsInput = java.lang.String
  type MaintenanceWindowStepFunctionsName = java.lang.String
  type MaintenanceWindowStringDateTime = java.lang.String
  type MaintenanceWindowTargetId = java.lang.String
  type MaintenanceWindowTargetList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowTarget]
  type MaintenanceWindowTaskArn = java.lang.String
  type MaintenanceWindowTaskId = java.lang.String
  type MaintenanceWindowTaskList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowTask]
  type MaintenanceWindowTaskParameterName = java.lang.String
  type MaintenanceWindowTaskParameterValue = java.lang.String
  type MaintenanceWindowTaskParameterValueList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowTaskParameterValue]
  type MaintenanceWindowTaskParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.MaintenanceWindowTaskParameterValueExpression]
  type MaintenanceWindowTaskParametersList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowTaskParameters]
  type MaintenanceWindowTaskPriority = scala.Double
  type MaintenanceWindowTaskTargetId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUN_COMMAND
    - typings.awsSdk.awsSdkStrings.AUTOMATION
    - typings.awsSdk.awsSdkStrings.STEP_FUNCTIONS
    - typings.awsSdk.awsSdkStrings.LAMBDA
    - java.lang.String
  */
  type MaintenanceWindowTaskType = typings.awsSdk.ssmMod._MaintenanceWindowTaskType | java.lang.String
  type MaintenanceWindowTimezone = java.lang.String
  type MaintenanceWindowsForTargetList = js.Array[typings.awsSdk.ssmMod.MaintenanceWindowIdentityForTarget]
  type ManagedInstanceId = java.lang.String
  type MaxConcurrency = java.lang.String
  type MaxErrors = java.lang.String
  type MaxResults = scala.Double
  type MaxResultsEC2Compatible = scala.Double
  type NextToken = java.lang.String
  type NormalStringMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.String]
  type NotificationArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.All_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.TimedOut_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type NotificationEvent = typings.awsSdk.ssmMod._NotificationEvent | java.lang.String
  type NotificationEventList = js.Array[typings.awsSdk.ssmMod.NotificationEvent]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Command
    - typings.awsSdk.awsSdkStrings.Invocation
    - java.lang.String
  */
  type NotificationType = typings.awsSdk.ssmMod._NotificationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WINDOWS
    - typings.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typings.awsSdk.awsSdkStrings.AMAZON_LINUX_2
    - typings.awsSdk.awsSdkStrings.UBUNTU
    - typings.awsSdk.awsSdkStrings.REDHAT_ENTERPRISE_LINUX
    - typings.awsSdk.awsSdkStrings.SUSE
    - typings.awsSdk.awsSdkStrings.CENTOS
    - java.lang.String
  */
  type OperatingSystem = typings.awsSdk.ssmMod._OperatingSystem | java.lang.String
  type OpsAggregatorList = js.Array[typings.awsSdk.ssmMod.OpsAggregator]
  type OpsAggregatorType = java.lang.String
  type OpsAggregatorValue = java.lang.String
  type OpsAggregatorValueKey = java.lang.String
  type OpsAggregatorValueMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.OpsAggregatorValue]
  type OpsDataAttributeName = java.lang.String
  type OpsDataTypeName = java.lang.String
  type OpsEntityId = java.lang.String
  type OpsEntityItemCaptureTime = java.lang.String
  type OpsEntityItemEntry = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.AttributeValue]
  type OpsEntityItemEntryList = js.Array[typings.awsSdk.ssmMod.OpsEntityItemEntry]
  type OpsEntityItemKey = java.lang.String
  type OpsEntityItemMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.OpsEntityItem]
  type OpsEntityList = js.Array[typings.awsSdk.ssmMod.OpsEntity]
  type OpsFilterKey = java.lang.String
  type OpsFilterList = js.Array[typings.awsSdk.ssmMod.OpsFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Equal_
    - typings.awsSdk.awsSdkStrings.NotEqual
    - typings.awsSdk.awsSdkStrings.BeginWith
    - typings.awsSdk.awsSdkStrings.LessThan
    - typings.awsSdk.awsSdkStrings.GreaterThan
    - typings.awsSdk.awsSdkStrings.Exists
    - java.lang.String
  */
  type OpsFilterOperatorType = typings.awsSdk.ssmMod._OpsFilterOperatorType | java.lang.String
  type OpsFilterValue = java.lang.String
  type OpsFilterValueList = js.Array[typings.awsSdk.ssmMod.OpsFilterValue]
  type OpsItemCategory = java.lang.String
  type OpsItemDataKey = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SearchableString
    - typings.awsSdk.awsSdkStrings.String_
    - java.lang.String
  */
  type OpsItemDataType = typings.awsSdk.ssmMod._OpsItemDataType | java.lang.String
  type OpsItemDataValueString = java.lang.String
  type OpsItemDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Status_
    - typings.awsSdk.awsSdkStrings.CreatedBy
    - typings.awsSdk.awsSdkStrings.Source
    - typings.awsSdk.awsSdkStrings.Priority_
    - typings.awsSdk.awsSdkStrings.Title_
    - typings.awsSdk.awsSdkStrings.OpsItemId
    - typings.awsSdk.awsSdkStrings.CreatedTime
    - typings.awsSdk.awsSdkStrings.LastModifiedTime
    - typings.awsSdk.awsSdkStrings.OperationalData
    - typings.awsSdk.awsSdkStrings.OperationalDataKey
    - typings.awsSdk.awsSdkStrings.OperationalDataValue
    - typings.awsSdk.awsSdkStrings.ResourceId
    - typings.awsSdk.awsSdkStrings.AutomationId
    - typings.awsSdk.awsSdkStrings.Category
    - typings.awsSdk.awsSdkStrings.Severity_
    - java.lang.String
  */
  type OpsItemFilterKey = typings.awsSdk.ssmMod._OpsItemFilterKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Equal_
    - typings.awsSdk.awsSdkStrings.Contains_
    - typings.awsSdk.awsSdkStrings.GreaterThan
    - typings.awsSdk.awsSdkStrings.LessThan
    - java.lang.String
  */
  type OpsItemFilterOperator = typings.awsSdk.ssmMod._OpsItemFilterOperator | java.lang.String
  type OpsItemFilterValue = java.lang.String
  type OpsItemFilterValues = js.Array[typings.awsSdk.ssmMod.OpsItemFilterValue]
  type OpsItemFilters = js.Array[typings.awsSdk.ssmMod.OpsItemFilter]
  type OpsItemId = java.lang.String
  type OpsItemMaxResults = scala.Double
  type OpsItemNotifications = js.Array[typings.awsSdk.ssmMod.OpsItemNotification]
  type OpsItemOperationalData = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.OpsItemDataValue]
  type OpsItemOpsDataKeysList = js.Array[typings.awsSdk.ssmMod.String]
  type OpsItemPriority = scala.Double
  type OpsItemSeverity = java.lang.String
  type OpsItemSource = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Open_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Resolved_
    - java.lang.String
  */
  type OpsItemStatus = typings.awsSdk.ssmMod._OpsItemStatus | java.lang.String
  type OpsItemSummaries = js.Array[typings.awsSdk.ssmMod.OpsItemSummary]
  type OpsItemTitle = java.lang.String
  type OpsResultAttributeList = js.Array[typings.awsSdk.ssmMod.OpsResultAttribute]
  type OutputSourceId = java.lang.String
  type OutputSourceType = java.lang.String
  type OwnerInformation = java.lang.String
  type PSParameterName = java.lang.String
  type PSParameterSelector = java.lang.String
  type PSParameterValue = java.lang.String
  type PSParameterVersion = scala.Double
  type ParameterDescription = java.lang.String
  type ParameterHistoryList = js.Array[typings.awsSdk.ssmMod.ParameterHistory]
  type ParameterKeyId = java.lang.String
  type ParameterLabel = java.lang.String
  type ParameterLabelList = js.Array[typings.awsSdk.ssmMod.ParameterLabel]
  type ParameterList = js.Array[typings.awsSdk.ssmMod.Parameter]
  type ParameterMetadataList = js.Array[typings.awsSdk.ssmMod.ParameterMetadata]
  type ParameterName = java.lang.String
  type ParameterNameList = js.Array[typings.awsSdk.ssmMod.PSParameterName]
  type ParameterPolicies = java.lang.String
  type ParameterPolicyList = js.Array[typings.awsSdk.ssmMod.ParameterInlinePolicy]
  type ParameterStringFilterKey = java.lang.String
  type ParameterStringFilterList = js.Array[typings.awsSdk.ssmMod.ParameterStringFilter]
  type ParameterStringFilterValue = java.lang.String
  type ParameterStringFilterValueList = js.Array[typings.awsSdk.ssmMod.ParameterStringFilterValue]
  type ParameterStringQueryOption = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Standard_
    - typings.awsSdk.awsSdkStrings.Advanced
    - typings.awsSdk.awsSdkStrings.`Intelligent-Tiering`
    - java.lang.String
  */
  type ParameterTier = typings.awsSdk.ssmMod._ParameterTier | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.String_
    - typings.awsSdk.awsSdkStrings.StringList
    - typings.awsSdk.awsSdkStrings.SecureString
    - java.lang.String
  */
  type ParameterType = typings.awsSdk.ssmMod._ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValueList = js.Array[typings.awsSdk.ssmMod.ParameterValue]
  type Parameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.ParameterValueList]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.Type_
    - typings.awsSdk.awsSdkStrings.KeyId
    - java.lang.String
  */
  type ParametersFilterKey = typings.awsSdk.ssmMod._ParametersFilterKey | java.lang.String
  type ParametersFilterList = js.Array[typings.awsSdk.ssmMod.ParametersFilter]
  type ParametersFilterValue = java.lang.String
  type ParametersFilterValueList = js.Array[typings.awsSdk.ssmMod.ParametersFilterValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALLOW_AS_DEPENDENCY
    - typings.awsSdk.awsSdkStrings.BLOCK
    - java.lang.String
  */
  type PatchAction = typings.awsSdk.ssmMod._PatchAction | java.lang.String
  type PatchBaselineIdentityList = js.Array[typings.awsSdk.ssmMod.PatchBaselineIdentity]
  type PatchBaselineMaxResults = scala.Double
  type PatchClassification = java.lang.String
  type PatchComplianceDataList = js.Array[typings.awsSdk.ssmMod.PatchComplianceData]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INSTALLED
    - typings.awsSdk.awsSdkStrings.INSTALLED_OTHER
    - typings.awsSdk.awsSdkStrings.INSTALLED_PENDING_REBOOT
    - typings.awsSdk.awsSdkStrings.INSTALLED_REJECTED
    - typings.awsSdk.awsSdkStrings.MISSING
    - typings.awsSdk.awsSdkStrings.NOT_APPLICABLE
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type PatchComplianceDataState = typings.awsSdk.ssmMod._PatchComplianceDataState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CRITICAL
    - typings.awsSdk.awsSdkStrings.HIGH
    - typings.awsSdk.awsSdkStrings.MEDIUM
    - typings.awsSdk.awsSdkStrings.LOW
    - typings.awsSdk.awsSdkStrings.INFORMATIONAL
    - typings.awsSdk.awsSdkStrings.UNSPECIFIED
    - java.lang.String
  */
  type PatchComplianceLevel = typings.awsSdk.ssmMod._PatchComplianceLevel | java.lang.String
  type PatchComplianceMaxResults = scala.Double
  type PatchContentUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APPROVED
    - typings.awsSdk.awsSdkStrings.PENDING_APPROVAL
    - typings.awsSdk.awsSdkStrings.EXPLICIT_APPROVED
    - typings.awsSdk.awsSdkStrings.EXPLICIT_REJECTED
    - java.lang.String
  */
  type PatchDeploymentStatus = typings.awsSdk.ssmMod._PatchDeploymentStatus | java.lang.String
  type PatchDescription = java.lang.String
  type PatchFailedCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PATCH_SET
    - typings.awsSdk.awsSdkStrings.PRODUCT
    - typings.awsSdk.awsSdkStrings.PRODUCT_FAMILY
    - typings.awsSdk.awsSdkStrings.CLASSIFICATION
    - typings.awsSdk.awsSdkStrings.MSRC_SEVERITY
    - typings.awsSdk.awsSdkStrings.PATCH_ID
    - typings.awsSdk.awsSdkStrings.SECTION
    - typings.awsSdk.awsSdkStrings.PRIORITY
    - typings.awsSdk.awsSdkStrings.SEVERITY
    - java.lang.String
  */
  type PatchFilterKey = typings.awsSdk.ssmMod._PatchFilterKey | java.lang.String
  type PatchFilterList = js.Array[typings.awsSdk.ssmMod.PatchFilter]
  type PatchFilterValue = java.lang.String
  type PatchFilterValueList = js.Array[typings.awsSdk.ssmMod.PatchFilterValue]
  type PatchGroup = java.lang.String
  type PatchGroupList = js.Array[typings.awsSdk.ssmMod.PatchGroup]
  type PatchGroupPatchBaselineMappingList = js.Array[typings.awsSdk.ssmMod.PatchGroupPatchBaselineMapping]
  type PatchId = java.lang.String
  type PatchIdList = js.Array[typings.awsSdk.ssmMod.PatchId]
  type PatchInstalledCount = scala.Double
  type PatchInstalledOtherCount = scala.Double
  type PatchInstalledPendingRebootCount = scala.Double
  type PatchInstalledRejectedCount = scala.Double
  type PatchKbNumber = java.lang.String
  type PatchLanguage = java.lang.String
  type PatchList = js.Array[typings.awsSdk.ssmMod.Patch]
  type PatchMissingCount = scala.Double
  type PatchMsrcNumber = java.lang.String
  type PatchMsrcSeverity = java.lang.String
  type PatchNotApplicableCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Scan
    - typings.awsSdk.awsSdkStrings.Install_
    - java.lang.String
  */
  type PatchOperationType = typings.awsSdk.ssmMod._PatchOperationType | java.lang.String
  type PatchOrchestratorFilterKey = java.lang.String
  type PatchOrchestratorFilterList = js.Array[typings.awsSdk.ssmMod.PatchOrchestratorFilter]
  type PatchOrchestratorFilterValue = java.lang.String
  type PatchOrchestratorFilterValues = js.Array[typings.awsSdk.ssmMod.PatchOrchestratorFilterValue]
  type PatchProduct = java.lang.String
  type PatchProductFamily = java.lang.String
  type PatchPropertiesList = js.Array[typings.awsSdk.ssmMod.PatchPropertyEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PRODUCT
    - typings.awsSdk.awsSdkStrings.PRODUCT_FAMILY
    - typings.awsSdk.awsSdkStrings.CLASSIFICATION
    - typings.awsSdk.awsSdkStrings.MSRC_SEVERITY
    - typings.awsSdk.awsSdkStrings.PRIORITY
    - typings.awsSdk.awsSdkStrings.SEVERITY
    - java.lang.String
  */
  type PatchProperty = typings.awsSdk.ssmMod._PatchProperty | java.lang.String
  type PatchPropertyEntry = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.AttributeValue]
  type PatchRuleList = js.Array[typings.awsSdk.ssmMod.PatchRule]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OS
    - typings.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type PatchSet = typings.awsSdk.ssmMod._PatchSet | java.lang.String
  type PatchSeverity = java.lang.String
  type PatchSourceConfiguration = java.lang.String
  type PatchSourceList = js.Array[typings.awsSdk.ssmMod.PatchSource]
  type PatchSourceName = java.lang.String
  type PatchSourceProduct = java.lang.String
  type PatchSourceProductList = js.Array[typings.awsSdk.ssmMod.PatchSourceProduct]
  type PatchStringDate = java.lang.String
  type PatchTitle = java.lang.String
  type PatchUnreportedNotApplicableCount = scala.Double
  type PatchVendor = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Online_
    - typings.awsSdk.awsSdkStrings.ConnectionLost
    - typings.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type PingStatus = typings.awsSdk.ssmMod._PingStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Windows_
    - typings.awsSdk.awsSdkStrings.Linux_
    - java.lang.String
  */
  type PlatformType = typings.awsSdk.ssmMod._PlatformType | java.lang.String
  type PlatformTypeList = js.Array[typings.awsSdk.ssmMod.PlatformType]
  type Product = java.lang.String
  type PutInventoryMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RebootIfNeeded
    - typings.awsSdk.awsSdkStrings.NoReboot
    - java.lang.String
  */
  type RebootOption = typings.awsSdk.ssmMod._RebootOption | java.lang.String
  type Region = java.lang.String
  type Regions = js.Array[typings.awsSdk.ssmMod.Region]
  type RegistrationLimit = scala.Double
  type RegistrationsCount = scala.Double
  type RelatedOpsItems = js.Array[typings.awsSdk.ssmMod.RelatedOpsItem]
  type RemainingCount = scala.Double
  type ResourceComplianceSummaryItemList = js.Array[typings.awsSdk.ssmMod.ResourceComplianceSummaryItem]
  type ResourceCount = scala.Double
  type ResourceCountByStatus = java.lang.String
  type ResourceDataSyncAWSKMSKeyARN = java.lang.String
  type ResourceDataSyncCreatedTime = typings.std.Date
  type ResourceDataSyncIncludeFutureRegions = scala.Boolean
  type ResourceDataSyncItemList = js.Array[typings.awsSdk.ssmMod.ResourceDataSyncItem]
  type ResourceDataSyncLastModifiedTime = typings.std.Date
  type ResourceDataSyncName = java.lang.String
  type ResourceDataSyncOrganizationSourceType = java.lang.String
  type ResourceDataSyncOrganizationalUnitId = java.lang.String
  type ResourceDataSyncOrganizationalUnitList = js.Array[typings.awsSdk.ssmMod.ResourceDataSyncOrganizationalUnit]
  type ResourceDataSyncS3BucketName = java.lang.String
  type ResourceDataSyncS3Format = typings.awsSdk.awsSdkStrings.JsonSerDe | java.lang.String
  type ResourceDataSyncS3Prefix = java.lang.String
  type ResourceDataSyncS3Region = java.lang.String
  type ResourceDataSyncSourceRegion = java.lang.String
  type ResourceDataSyncSourceRegionList = js.Array[typings.awsSdk.ssmMod.ResourceDataSyncSourceRegion]
  type ResourceDataSyncSourceType = java.lang.String
  type ResourceDataSyncState = java.lang.String
  type ResourceDataSyncType = java.lang.String
  type ResourceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ManagedInstance
    - typings.awsSdk.awsSdkStrings.Document_
    - typings.awsSdk.awsSdkStrings.EC2Instance
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.ssmMod._ResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Document_
    - typings.awsSdk.awsSdkStrings.ManagedInstance
    - typings.awsSdk.awsSdkStrings.MaintenanceWindow
    - typings.awsSdk.awsSdkStrings.Parameter
    - typings.awsSdk.awsSdkStrings.PatchBaseline
    - typings.awsSdk.awsSdkStrings.OpsItem
    - java.lang.String
  */
  type ResourceTypeForTagging = typings.awsSdk.ssmMod._ResourceTypeForTagging | java.lang.String
  type ResponseCode = scala.Double
  type ResultAttributeList = js.Array[typings.awsSdk.ssmMod.ResultAttribute]
  type S3BucketName = java.lang.String
  type S3KeyPrefix = java.lang.String
  type S3Region = java.lang.String
  type ScheduleExpression = java.lang.String
  type ScheduledWindowExecutionList = js.Array[typings.awsSdk.ssmMod.ScheduledWindowExecution]
  type ServiceRole = java.lang.String
  type ServiceSettingId = java.lang.String
  type ServiceSettingValue = java.lang.String
  type SessionDetails = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InvokedAfter
    - typings.awsSdk.awsSdkStrings.InvokedBefore
    - typings.awsSdk.awsSdkStrings.Target
    - typings.awsSdk.awsSdkStrings.Owner_
    - typings.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type SessionFilterKey = typings.awsSdk.ssmMod._SessionFilterKey | java.lang.String
  type SessionFilterList = js.Array[typings.awsSdk.ssmMod.SessionFilter]
  type SessionFilterValue = java.lang.String
  type SessionId = java.lang.String
  type SessionList = js.Array[typings.awsSdk.ssmMod.Session]
  type SessionManagerCloudWatchOutputUrl = java.lang.String
  type SessionManagerParameterName = java.lang.String
  type SessionManagerParameterValue = java.lang.String
  type SessionManagerParameterValueList = js.Array[typings.awsSdk.ssmMod.SessionManagerParameterValue]
  type SessionManagerParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.SessionManagerParameterValueList]
  type SessionManagerS3OutputUrl = java.lang.String
  type SessionMaxResults = scala.Double
  type SessionOwner = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.History
    - java.lang.String
  */
  type SessionState = typings.awsSdk.ssmMod._SessionState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Connected_
    - typings.awsSdk.awsSdkStrings.Connecting_
    - typings.awsSdk.awsSdkStrings.Disconnected_
    - typings.awsSdk.awsSdkStrings.Terminated_
    - typings.awsSdk.awsSdkStrings.Terminating_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type SessionStatus = typings.awsSdk.ssmMod._SessionStatus | java.lang.String
  type SessionTarget = java.lang.String
  type SharedDocumentVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Approve_
    - typings.awsSdk.awsSdkStrings.Reject_
    - typings.awsSdk.awsSdkStrings.StartStep
    - typings.awsSdk.awsSdkStrings.StopStep
    - typings.awsSdk.awsSdkStrings.Resume
    - java.lang.String
  */
  type SignalType = typings.awsSdk.ssmMod._SignalType | java.lang.String
  type SnapshotDownloadUrl = java.lang.String
  type SnapshotId = java.lang.String
  type StandardErrorContent = java.lang.String
  type StandardOutputContent = java.lang.String
  type StatusAdditionalInfo = java.lang.String
  type StatusDetails = java.lang.String
  type StatusMessage = java.lang.String
  type StatusName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.StartTimeBefore
    - typings.awsSdk.awsSdkStrings.StartTimeAfter
    - typings.awsSdk.awsSdkStrings.StepExecutionStatus
    - typings.awsSdk.awsSdkStrings.StepExecutionId
    - typings.awsSdk.awsSdkStrings.StepName
    - typings.awsSdk.awsSdkStrings.Action_
    - java.lang.String
  */
  type StepExecutionFilterKey = typings.awsSdk.ssmMod._StepExecutionFilterKey | java.lang.String
  type StepExecutionFilterList = js.Array[typings.awsSdk.ssmMod.StepExecutionFilter]
  type StepExecutionFilterValue = java.lang.String
  type StepExecutionFilterValueList = js.Array[typings.awsSdk.ssmMod.StepExecutionFilterValue]
  type StepExecutionList = js.Array[typings.awsSdk.ssmMod.StepExecution]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Complete_
    - typings.awsSdk.awsSdkStrings.Cancel_
    - java.lang.String
  */
  type StopType = typings.awsSdk.ssmMod._StopType | java.lang.String
  type StreamUrl = java.lang.String
  type String = java.lang.String
  type StringDateTime = java.lang.String
  type StringList = js.Array[typings.awsSdk.ssmMod.String]
  type TagKey = java.lang.String
  type TagList = js.Array[typings.awsSdk.ssmMod.Tag]
  type TagValue = java.lang.String
  type TargetCount = scala.Double
  type TargetKey = java.lang.String
  type TargetLocations = js.Array[typings.awsSdk.ssmMod.TargetLocation]
  type TargetMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ssmMod.TargetMapValueList]
  type TargetMapKey = java.lang.String
  type TargetMapValue = java.lang.String
  type TargetMapValueList = js.Array[typings.awsSdk.ssmMod.TargetMapValue]
  type TargetMaps = js.Array[typings.awsSdk.ssmMod.TargetMap]
  type TargetParameterList = js.Array[typings.awsSdk.ssmMod.ParameterValue]
  type TargetType = java.lang.String
  type TargetValue = java.lang.String
  type TargetValues = js.Array[typings.awsSdk.ssmMod.TargetValue]
  type Targets = js.Array[typings.awsSdk.ssmMod.Target]
  type TimeoutSeconds = scala.Double
  type TokenValue = java.lang.String
  type TotalCount = scala.Double
  type Url = java.lang.String
  type ValidNextStep = java.lang.String
  type ValidNextStepList = js.Array[typings.awsSdk.ssmMod.ValidNextStep]
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-11-06`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ssmMod._apiVersion | java.lang.String
}
