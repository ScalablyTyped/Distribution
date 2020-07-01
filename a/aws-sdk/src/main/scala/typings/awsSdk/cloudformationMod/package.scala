package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloudformationMod {
  type Account = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.SKIPPED
    - java.lang.String
  */
  type AccountGateStatus = typings.awsSdk.cloudformationMod._AccountGateStatus | java.lang.String
  type AccountGateStatusReason = java.lang.String
  type AccountLimitList = js.Array[typings.awsSdk.cloudformationMod.AccountLimit]
  type AccountList = js.Array[typings.awsSdk.cloudformationMod.Account]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[typings.awsSdk.cloudformationMod.AllowedValue]
  type Arn = java.lang.String
  type AutoDeploymentNullable = scala.Boolean
  type BoxedInteger = scala.Double
  type BoxedMaxResults = scala.Double
  type Capabilities = js.Array[typings.awsSdk.cloudformationMod.Capability]
  type CapabilitiesReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CAPABILITY_IAM
    - typings.awsSdk.awsSdkStrings.CAPABILITY_NAMED_IAM
    - typings.awsSdk.awsSdkStrings.CAPABILITY_AUTO_EXPAND
    - java.lang.String
  */
  type Capability = typings.awsSdk.cloudformationMod._Capability | java.lang.String
  type CausingEntity = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Add_
    - typings.awsSdk.awsSdkStrings.Modify_
    - typings.awsSdk.awsSdkStrings.Remove_
    - typings.awsSdk.awsSdkStrings.Import_
    - java.lang.String
  */
  type ChangeAction = typings.awsSdk.cloudformationMod._ChangeAction | java.lang.String
  type ChangeSetId = java.lang.String
  type ChangeSetName = java.lang.String
  type ChangeSetNameOrId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_PENDING
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typings.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ChangeSetStatus = typings.awsSdk.cloudformationMod._ChangeSetStatus | java.lang.String
  type ChangeSetStatusReason = java.lang.String
  type ChangeSetSummaries = js.Array[typings.awsSdk.cloudformationMod.ChangeSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE
    - typings.awsSdk.awsSdkStrings.UPDATE
    - typings.awsSdk.awsSdkStrings.IMPORT
    - java.lang.String
  */
  type ChangeSetType = typings.awsSdk.cloudformationMod._ChangeSetType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ResourceReference
    - typings.awsSdk.awsSdkStrings.ParameterReference
    - typings.awsSdk.awsSdkStrings.ResourceAttribute
    - typings.awsSdk.awsSdkStrings.DirectModification
    - typings.awsSdk.awsSdkStrings.Automatic_
    - java.lang.String
  */
  type ChangeSource = typings.awsSdk.cloudformationMod._ChangeSource | java.lang.String
  type ChangeType = typings.awsSdk.awsSdkStrings.Resource_ | java.lang.String
  type Changes = js.Array[typings.awsSdk.cloudformationMod.Change]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudformationMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type CreationTime = typings.std.Date
  type DeletionTime = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LIVE
    - typings.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type DeprecatedStatus = typings.awsSdk.cloudformationMod._DeprecatedStatus | java.lang.String
  type Description = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ADD
    - typings.awsSdk.awsSdkStrings.REMOVE
    - typings.awsSdk.awsSdkStrings.NOT_EQUAL
    - java.lang.String
  */
  type DifferenceType = typings.awsSdk.cloudformationMod._DifferenceType | java.lang.String
  type DisableRollback = scala.Boolean
  type DriftedStackInstancesCount = scala.Double
  type EnableTerminationProtection = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Static_
    - typings.awsSdk.awsSdkStrings.Dynamic_
    - java.lang.String
  */
  type EvaluationType = typings.awsSdk.cloudformationMod._EvaluationType | java.lang.String
  type EventId = java.lang.String
  type ExecutionRoleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNAVAILABLE
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.EXECUTE_COMPLETE
    - typings.awsSdk.awsSdkStrings.EXECUTE_FAILED
    - typings.awsSdk.awsSdkStrings.OBSOLETE
    - java.lang.String
  */
  type ExecutionStatus = typings.awsSdk.cloudformationMod._ExecutionStatus | java.lang.String
  type ExportName = java.lang.String
  type ExportValue = java.lang.String
  type Exports = js.Array[typings.awsSdk.cloudformationMod.Export]
  type FailedStackInstancesCount = scala.Double
  type FailureToleranceCount = scala.Double
  type FailureTolerancePercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NotUpdatable
    - typings.awsSdk.awsSdkStrings.InvalidRequest
    - typings.awsSdk.awsSdkStrings.AccessDenied
    - typings.awsSdk.awsSdkStrings.InvalidCredentials
    - typings.awsSdk.awsSdkStrings.AlreadyExists
    - typings.awsSdk.awsSdkStrings.NotFound
    - typings.awsSdk.awsSdkStrings.ResourceConflict
    - typings.awsSdk.awsSdkStrings.Throttling_
    - typings.awsSdk.awsSdkStrings.ServiceLimitExceeded
    - typings.awsSdk.awsSdkStrings.NotStabilized
    - typings.awsSdk.awsSdkStrings.GeneralServiceException
    - typings.awsSdk.awsSdkStrings.ServiceInternalError
    - typings.awsSdk.awsSdkStrings.NetworkFailure
    - typings.awsSdk.awsSdkStrings.InternalFailure
    - java.lang.String
  */
  type HandlerErrorCode = typings.awsSdk.cloudformationMod._HandlerErrorCode | java.lang.String
  type Imports = js.Array[typings.awsSdk.cloudformationMod.StackName]
  type InProgressStackInstancesCount = scala.Double
  type InSyncStackInstancesCount = scala.Double
  type IsDefaultVersion = scala.Boolean
  type Key = java.lang.String
  type LastUpdatedTime = typings.std.Date
  type LimitName = java.lang.String
  type LimitValue = scala.Double
  type LogGroupName = java.lang.String
  type LogicalResourceId = java.lang.String
  type LogicalResourceIds = js.Array[typings.awsSdk.cloudformationMod.LogicalResourceId]
  type MaxConcurrentCount = scala.Double
  type MaxConcurrentPercentage = scala.Double
  type MaxResults = scala.Double
  type Metadata = java.lang.String
  type MonitoringTimeInMinutes = scala.Double
  type NextToken = java.lang.String
  type NoEcho = scala.Boolean
  type NotificationARN = java.lang.String
  type NotificationARNs = js.Array[typings.awsSdk.cloudformationMod.NotificationARN]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DO_NOTHING
    - typings.awsSdk.awsSdkStrings.ROLLBACK
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type OnFailure = typings.awsSdk.cloudformationMod._OnFailure | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type OperationStatus = typings.awsSdk.cloudformationMod._OperationStatus | java.lang.String
  type OptionalSecureUrl = java.lang.String
  type OrganizationalUnitId = java.lang.String
  type OrganizationalUnitIdList = js.Array[typings.awsSdk.cloudformationMod.OrganizationalUnitId]
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type Outputs = js.Array[typings.awsSdk.cloudformationMod.Output]
  type ParameterDeclarations = js.Array[typings.awsSdk.cloudformationMod.ParameterDeclaration]
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type Parameters = js.Array[typings.awsSdk.cloudformationMod.Parameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SERVICE_MANAGED
    - typings.awsSdk.awsSdkStrings.SELF_MANAGED
    - java.lang.String
  */
  type PermissionModels = typings.awsSdk.cloudformationMod._PermissionModels | java.lang.String
  type PhysicalResourceId = java.lang.String
  type PhysicalResourceIdContext = js.Array[typings.awsSdk.cloudformationMod.PhysicalResourceIdContextKeyValuePair]
  type PrivateTypeArn = java.lang.String
  type Properties = java.lang.String
  type PropertyDifferences = js.Array[typings.awsSdk.cloudformationMod.PropertyDifference]
  type PropertyName = java.lang.String
  type PropertyPath = java.lang.String
  type PropertyValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NON_PROVISIONABLE
    - typings.awsSdk.awsSdkStrings.IMMUTABLE
    - typings.awsSdk.awsSdkStrings.FULLY_MUTABLE
    - java.lang.String
  */
  type ProvisioningType = typings.awsSdk.cloudformationMod._ProvisioningType | java.lang.String
  type Reason = java.lang.String
  type Region = java.lang.String
  type RegionList = js.Array[typings.awsSdk.cloudformationMod.Region]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RegistrationStatus = typings.awsSdk.cloudformationMod._RegistrationStatus | java.lang.String
  type RegistrationToken = java.lang.String
  type RegistrationTokenList = js.Array[typings.awsSdk.cloudformationMod.RegistrationToken]
  type RegistryType = typings.awsSdk.awsSdkStrings.RESOURCE | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.True_
    - typings.awsSdk.awsSdkStrings.False_
    - typings.awsSdk.awsSdkStrings.Conditional_
    - java.lang.String
  */
  type Replacement = typings.awsSdk.cloudformationMod._Replacement | java.lang.String
  type RequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Never_
    - typings.awsSdk.awsSdkStrings.Conditionally_
    - typings.awsSdk.awsSdkStrings.Always_
    - java.lang.String
  */
  type RequiresRecreation = typings.awsSdk.cloudformationMod._RequiresRecreation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Properties_
    - typings.awsSdk.awsSdkStrings.Metadata_
    - typings.awsSdk.awsSdkStrings.CreationPolicy_
    - typings.awsSdk.awsSdkStrings.UpdatePolicy_
    - typings.awsSdk.awsSdkStrings.DeletionPolicy_
    - typings.awsSdk.awsSdkStrings.Tags_
    - java.lang.String
  */
  type ResourceAttribute = typings.awsSdk.cloudformationMod._ResourceAttribute | java.lang.String
  type ResourceChangeDetails = js.Array[typings.awsSdk.cloudformationMod.ResourceChangeDetail]
  type ResourceIdentifierProperties = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudformationMod.ResourceIdentifierPropertyValue]
  type ResourceIdentifierPropertyKey = java.lang.String
  type ResourceIdentifierPropertyValue = java.lang.String
  type ResourceIdentifierSummaries = js.Array[typings.awsSdk.cloudformationMod.ResourceIdentifierSummary]
  type ResourceIdentifiers = js.Array[typings.awsSdk.cloudformationMod.ResourceIdentifierPropertyKey]
  type ResourceModel = java.lang.String
  type ResourceProperties = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILURE
    - java.lang.String
  */
  type ResourceSignalStatus = typings.awsSdk.cloudformationMod._ResourceSignalStatus | java.lang.String
  type ResourceSignalUniqueId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typings.awsSdk.awsSdkStrings.DELETE_SKIPPED
    - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
    - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE
    - typings.awsSdk.awsSdkStrings.IMPORT_FAILED
    - typings.awsSdk.awsSdkStrings.IMPORT_COMPLETE
    - typings.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_FAILED
    - typings.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_COMPLETE
    - java.lang.String
  */
  type ResourceStatus = typings.awsSdk.cloudformationMod._ResourceStatus | java.lang.String
  type ResourceStatusReason = java.lang.String
  type ResourceToSkip = java.lang.String
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[typings.awsSdk.cloudformationMod.ResourceType]
  type ResourcesToImport = js.Array[typings.awsSdk.cloudformationMod.ResourceToImport]
  type ResourcesToSkip = js.Array[typings.awsSdk.cloudformationMod.ResourceToSkip]
  type RetainResources = js.Array[typings.awsSdk.cloudformationMod.LogicalResourceId]
  type RetainStacks = scala.Boolean
  type RetainStacksNullable = scala.Boolean
  type RetainStacksOnAccountRemovalNullable = scala.Boolean
  type RoleARN_ = java.lang.String
  type RoleArn = java.lang.String
  type RollbackTriggers = js.Array[typings.awsSdk.cloudformationMod.RollbackTrigger]
  type S3Url = java.lang.String
  type Scope = js.Array[typings.awsSdk.cloudformationMod.ResourceAttribute]
  type StackDriftDetectionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DETECTION_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.DETECTION_FAILED
    - typings.awsSdk.awsSdkStrings.DETECTION_COMPLETE
    - java.lang.String
  */
  type StackDriftDetectionStatus = typings.awsSdk.cloudformationMod._StackDriftDetectionStatus | java.lang.String
  type StackDriftDetectionStatusReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DRIFTED
    - typings.awsSdk.awsSdkStrings.IN_SYNC
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - typings.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackDriftStatus = typings.awsSdk.cloudformationMod._StackDriftStatus | java.lang.String
  type StackEvents = js.Array[typings.awsSdk.cloudformationMod.StackEvent]
  type StackId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceDetailedStatus = typings.awsSdk.cloudformationMod._StackInstanceDetailedStatus | java.lang.String
  type StackInstanceFilterName = typings.awsSdk.awsSdkStrings.DETAILED_STATUS | java.lang.String
  type StackInstanceFilterValues = java.lang.String
  type StackInstanceFilters = js.Array[typings.awsSdk.cloudformationMod.StackInstanceFilter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CURRENT
    - typings.awsSdk.awsSdkStrings.OUTDATED
    - typings.awsSdk.awsSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = typings.awsSdk.cloudformationMod._StackInstanceStatus | java.lang.String
  type StackInstanceSummaries = js.Array[typings.awsSdk.cloudformationMod.StackInstanceSummary]
  type StackName = java.lang.String
  type StackNameOrId = java.lang.String
  type StackPolicyBody = java.lang.String
  type StackPolicyDuringUpdateBody = java.lang.String
  type StackPolicyDuringUpdateURL = java.lang.String
  type StackPolicyURL = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_SYNC
    - typings.awsSdk.awsSdkStrings.MODIFIED
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackResourceDriftStatus = typings.awsSdk.cloudformationMod._StackResourceDriftStatus | java.lang.String
  type StackResourceDriftStatusFilters = js.Array[typings.awsSdk.cloudformationMod.StackResourceDriftStatus]
  type StackResourceDrifts = js.Array[typings.awsSdk.cloudformationMod.StackResourceDrift]
  type StackResourceSummaries = js.Array[typings.awsSdk.cloudformationMod.StackResourceSummary]
  type StackResources = js.Array[typings.awsSdk.cloudformationMod.StackResource]
  type StackSetARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type StackSetDriftDetectionStatus = typings.awsSdk.cloudformationMod._StackSetDriftDetectionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DRIFTED
    - typings.awsSdk.awsSdkStrings.IN_SYNC
    - typings.awsSdk.awsSdkStrings.NOT_CHECKED
    - java.lang.String
  */
  type StackSetDriftStatus = typings.awsSdk.cloudformationMod._StackSetDriftStatus | java.lang.String
  type StackSetId = java.lang.String
  type StackSetName = java.lang.String
  type StackSetNameOrId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE
    - typings.awsSdk.awsSdkStrings.UPDATE
    - typings.awsSdk.awsSdkStrings.DELETE
    - typings.awsSdk.awsSdkStrings.DETECT_DRIFT
    - java.lang.String
  */
  type StackSetOperationAction = typings.awsSdk.cloudformationMod._StackSetOperationAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type StackSetOperationResultStatus = typings.awsSdk.cloudformationMod._StackSetOperationResultStatus | java.lang.String
  type StackSetOperationResultSummaries = js.Array[typings.awsSdk.cloudformationMod.StackSetOperationResultSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.STOPPED
    - typings.awsSdk.awsSdkStrings.QUEUED
    - java.lang.String
  */
  type StackSetOperationStatus = typings.awsSdk.cloudformationMod._StackSetOperationStatus | java.lang.String
  type StackSetOperationSummaries = js.Array[typings.awsSdk.cloudformationMod.StackSetOperationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type StackSetStatus = typings.awsSdk.cloudformationMod._StackSetStatus | java.lang.String
  type StackSetSummaries = js.Array[typings.awsSdk.cloudformationMod.StackSetSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typings.awsSdk.awsSdkStrings.ROLLBACK_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.ROLLBACK_FAILED
    - typings.awsSdk.awsSdkStrings.ROLLBACK_COMPLETE
    - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE_CLEANUP_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE
    - typings.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_FAILED
    - typings.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.UPDATE_ROLLBACK_COMPLETE
    - typings.awsSdk.awsSdkStrings.REVIEW_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.IMPORT_COMPLETE
    - typings.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_FAILED
    - typings.awsSdk.awsSdkStrings.IMPORT_ROLLBACK_COMPLETE
    - java.lang.String
  */
  type StackStatus = typings.awsSdk.cloudformationMod._StackStatus | java.lang.String
  type StackStatusFilter = js.Array[typings.awsSdk.cloudformationMod.StackStatus]
  type StackStatusReason = java.lang.String
  type StackSummaries = js.Array[typings.awsSdk.cloudformationMod.StackSummary]
  type Stacks = js.Array[typings.awsSdk.cloudformationMod.Stack]
  type StageList = js.Array[typings.awsSdk.cloudformationMod.TemplateStage]
  type StatusMessage = java.lang.String
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[typings.awsSdk.cloudformationMod.Tag]
  type TemplateBody = java.lang.String
  type TemplateDescription = java.lang.String
  type TemplateParameters = js.Array[typings.awsSdk.cloudformationMod.TemplateParameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Original_
    - typings.awsSdk.awsSdkStrings.Processed
    - java.lang.String
  */
  type TemplateStage = typings.awsSdk.cloudformationMod._TemplateStage | java.lang.String
  type TemplateURL = java.lang.String
  type TimeoutMinutes = scala.Double
  type Timestamp = typings.std.Date
  type TotalStackInstancesCount = scala.Double
  type TransformName = java.lang.String
  type TransformsList = js.Array[typings.awsSdk.cloudformationMod.TransformName]
  type Type = java.lang.String
  type TypeArn = java.lang.String
  type TypeName = java.lang.String
  type TypeSchema = java.lang.String
  type TypeSummaries = js.Array[typings.awsSdk.cloudformationMod.TypeSummary]
  type TypeVersionId = java.lang.String
  type TypeVersionSummaries = js.Array[typings.awsSdk.cloudformationMod.TypeVersionSummary]
  type Url = java.lang.String
  type UsePreviousTemplate = scala.Boolean
  type UsePreviousValue = scala.Boolean
  type Value = java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type Visibility = typings.awsSdk.cloudformationMod._Visibility | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2010-05-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudformationMod._apiVersion | java.lang.String
}
