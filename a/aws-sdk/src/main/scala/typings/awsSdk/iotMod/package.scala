package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotMod {
  type AbortAction = typings.awsSdk.awsSdkStrings.CANCEL | java.lang.String
  type AbortCriteriaList = js.Array[typings.awsSdk.iotMod.AbortCriteria]
  type AbortThresholdPercentage = scala.Double
  type AcmCertificateArn = java.lang.String
  type ActionList = js.Array[typings.awsSdk.iotMod.Action]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLISH
    - typings.awsSdk.awsSdkStrings.SUBSCRIBE
    - typings.awsSdk.awsSdkStrings.RECEIVE
    - typings.awsSdk.awsSdkStrings.CONNECT
    - java.lang.String
  */
  type ActionType = typings.awsSdk.iotMod._ActionType | java.lang.String
  type ActiveViolations = js.Array[typings.awsSdk.iotMod.ActiveViolation]
  type AdditionalMetricsToRetainList = js.Array[typings.awsSdk.iotMod.BehaviorMetric]
  type AdditionalParameterMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.Value]
  type AggregationField = java.lang.String
  type AlarmName = java.lang.String
  type AlertTargetArn = java.lang.String
  type AlertTargetType = typings.awsSdk.awsSdkStrings.SNS | java.lang.String
  type AlertTargets = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.AlertTarget]
  type AllowAuthorizerOverride = scala.Boolean
  type AllowAutoRegistration = scala.Boolean
  type ApproximateSecondsBeforeTimedOut = scala.Double
  type AscendingOrder = scala.Boolean
  type AssetId = java.lang.String
  type AssetPropertyAlias = java.lang.String
  type AssetPropertyBooleanValue = java.lang.String
  type AssetPropertyDoubleValue = java.lang.String
  type AssetPropertyEntryId = java.lang.String
  type AssetPropertyId = java.lang.String
  type AssetPropertyIntegerValue = java.lang.String
  type AssetPropertyOffsetInNanos = java.lang.String
  type AssetPropertyQuality = java.lang.String
  type AssetPropertyStringValue = java.lang.String
  type AssetPropertyTimeInSeconds = java.lang.String
  type AssetPropertyValueList = js.Array[typings.awsSdk.iotMod.AssetPropertyValue]
  type AttributeKey = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.AttributeValue]
  type AttributesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.Value]
  type AuditCheckConfigurations = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.AuditCheckConfiguration]
  type AuditCheckName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.WAITING_FOR_DATA_COLLECTION
    - typings.awsSdk.awsSdkStrings.CANCELED
    - typings.awsSdk.awsSdkStrings.COMPLETED_COMPLIANT
    - typings.awsSdk.awsSdkStrings.COMPLETED_NON_COMPLIANT
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AuditCheckRunStatus = typings.awsSdk.iotMod._AuditCheckRunStatus | java.lang.String
  type AuditCheckToActionsMapping = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.MitigationActionNameList]
  type AuditCheckToReasonCodeFilter = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.ReasonForNonComplianceCodes]
  type AuditDetails = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.AuditCheckDetails]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CRITICAL
    - typings.awsSdk.awsSdkStrings.HIGH
    - typings.awsSdk.awsSdkStrings.MEDIUM
    - typings.awsSdk.awsSdkStrings.LOW
    - java.lang.String
  */
  type AuditFindingSeverity = typings.awsSdk.iotMod._AuditFindingSeverity | java.lang.String
  type AuditFindings = js.Array[typings.awsSdk.iotMod.AuditFinding]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DAILY
    - typings.awsSdk.awsSdkStrings.WEEKLY
    - typings.awsSdk.awsSdkStrings.BIWEEKLY
    - typings.awsSdk.awsSdkStrings.MONTHLY
    - java.lang.String
  */
  type AuditFrequency = typings.awsSdk.iotMod._AuditFrequency | java.lang.String
  type AuditMitigationActionExecutionMetadataList = js.Array[typings.awsSdk.iotMod.AuditMitigationActionExecutionMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELED
    - typings.awsSdk.awsSdkStrings.SKIPPED
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type AuditMitigationActionsExecutionStatus = typings.awsSdk.iotMod._AuditMitigationActionsExecutionStatus | java.lang.String
  type AuditMitigationActionsTaskId = java.lang.String
  type AuditMitigationActionsTaskMetadataList = js.Array[typings.awsSdk.iotMod.AuditMitigationActionsTaskMetadata]
  type AuditMitigationActionsTaskStatistics = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.TaskStatisticsForAuditCheck]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type AuditMitigationActionsTaskStatus = typings.awsSdk.iotMod._AuditMitigationActionsTaskStatus | java.lang.String
  type AuditNotificationTargetConfigurations = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.AuditNotificationTarget]
  type AuditNotificationType = typings.awsSdk.awsSdkStrings.SNS | java.lang.String
  type AuditTaskId = java.lang.String
  type AuditTaskMetadataList = js.Array[typings.awsSdk.iotMod.AuditTaskMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type AuditTaskStatus = typings.awsSdk.iotMod._AuditTaskStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ON_DEMAND_AUDIT_TASK
    - typings.awsSdk.awsSdkStrings.SCHEDULED_AUDIT_TASK
    - java.lang.String
  */
  type AuditTaskType = typings.awsSdk.iotMod._AuditTaskType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALLOWED
    - typings.awsSdk.awsSdkStrings.EXPLICIT_DENY
    - typings.awsSdk.awsSdkStrings.IMPLICIT_DENY
    - java.lang.String
  */
  type AuthDecision = typings.awsSdk.iotMod._AuthDecision | java.lang.String
  type AuthInfos = js.Array[typings.awsSdk.iotMod.AuthInfo]
  type AuthResults = js.Array[typings.awsSdk.iotMod.AuthResult]
  type AuthorizerArn = java.lang.String
  type AuthorizerFunctionArn = java.lang.String
  type AuthorizerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type AuthorizerStatus = typings.awsSdk.iotMod._AuthorizerStatus | java.lang.String
  type Authorizers = js.Array[typings.awsSdk.iotMod.AuthorizerSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLE
    - typings.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type AutoRegistrationStatus = typings.awsSdk.iotMod._AutoRegistrationStatus | java.lang.String
  type Average = scala.Double
  type AwsAccountId = java.lang.String
  type AwsArn = java.lang.String
  type AwsIotJobArn = java.lang.String
  type AwsIotJobId = java.lang.String
  type AwsIotSqlVersion = java.lang.String
  type BehaviorMetric = java.lang.String
  type BehaviorName = java.lang.String
  type Behaviors = js.Array[typings.awsSdk.iotMod.Behavior]
  type BillingGroupArn = java.lang.String
  type BillingGroupDescription = java.lang.String
  type BillingGroupId = java.lang.String
  type BillingGroupName = java.lang.String
  type BillingGroupNameAndArnList = js.Array[typings.awsSdk.iotMod.GroupNameAndArn]
  type Boolean = scala.Boolean
  type BooleanKey = scala.Boolean
  type BucketName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type CACertificateStatus = typings.awsSdk.iotMod._CACertificateStatus | java.lang.String
  type CACertificateUpdateAction = typings.awsSdk.awsSdkStrings.DEACTIVATE | java.lang.String
  type CACertificates = js.Array[typings.awsSdk.iotMod.CACertificate]
  type CanceledChecksCount = scala.Double
  type CanceledFindingsCount = scala.Double
  type CanceledThings = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.private__
    - typings.awsSdk.awsSdkStrings.`public-read`
    - typings.awsSdk.awsSdkStrings.`public-read-write`
    - typings.awsSdk.awsSdkStrings.`aws-exec-read`
    - typings.awsSdk.awsSdkStrings.`authenticated-read`
    - typings.awsSdk.awsSdkStrings.`bucket-owner-read`
    - typings.awsSdk.awsSdkStrings.`bucket-owner-full-control`
    - typings.awsSdk.awsSdkStrings.`log-delivery-write`
    - java.lang.String
  */
  type CannedAccessControlList = typings.awsSdk.iotMod._CannedAccessControlList | java.lang.String
  type CertificateArn = java.lang.String
  type CertificateId = java.lang.String
  type CertificateName = java.lang.String
  type CertificatePathOnDevice = java.lang.String
  type CertificatePem = java.lang.String
  type CertificateSigningRequest = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.REVOKED
    - typings.awsSdk.awsSdkStrings.PENDING_TRANSFER
    - typings.awsSdk.awsSdkStrings.REGISTER_INACTIVE
    - typings.awsSdk.awsSdkStrings.PENDING_ACTIVATION
    - java.lang.String
  */
  type CertificateStatus = typings.awsSdk.iotMod._CertificateStatus | java.lang.String
  type Certificates = js.Array[typings.awsSdk.iotMod.Certificate]
  type ChannelName = java.lang.String
  type CheckCompliant = scala.Boolean
  type Cidr = java.lang.String
  type Cidrs = js.Array[typings.awsSdk.iotMod.Cidr]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.iotMod.ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  type Code = java.lang.String
  type CognitoIdentityPoolId = java.lang.String
  type Comment = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`less-than`
    - typings.awsSdk.awsSdkStrings.`less-than-equals`
    - typings.awsSdk.awsSdkStrings.`greater-than`
    - typings.awsSdk.awsSdkStrings.`greater-than-equals`
    - typings.awsSdk.awsSdkStrings.`in-cidr-set`
    - typings.awsSdk.awsSdkStrings.`not-in-cidr-set`
    - typings.awsSdk.awsSdkStrings.`in-port-set`
    - typings.awsSdk.awsSdkStrings.`not-in-port-set`
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.iotMod._ComparisonOperator | java.lang.String
  type CompliantChecksCount = scala.Double
  type ConfirmationToken = java.lang.String
  type ConnectivityTimestamp = scala.Double
  type ConsecutiveDatapointsToAlarm = scala.Double
  type ConsecutiveDatapointsToClear = scala.Double
  type Count = scala.Double
  type CreatedAtDate = typings.std.Date
  type CreationDate = typings.std.Date
  type CredentialDurationSeconds = scala.Double
  type CustomerVersion = scala.Double
  type DateType = typings.std.Date
  type DayOfMonth = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUN
    - typings.awsSdk.awsSdkStrings.MON
    - typings.awsSdk.awsSdkStrings.TUE
    - typings.awsSdk.awsSdkStrings.WED
    - typings.awsSdk.awsSdkStrings.THU
    - typings.awsSdk.awsSdkStrings.FRI
    - typings.awsSdk.awsSdkStrings.SAT
    - java.lang.String
  */
  type DayOfWeek = typings.awsSdk.iotMod._DayOfWeek | java.lang.String
  type DeleteAdditionalMetricsToRetain = scala.Boolean
  type DeleteAlertTargets = scala.Boolean
  type DeleteBehaviors = scala.Boolean
  type DeleteScheduledAudits = scala.Boolean
  type DeleteStream = scala.Boolean
  type DeliveryStreamName = java.lang.String
  type DeprecationDate = typings.std.Date
  type Description = java.lang.String
  type DetailsKey = java.lang.String
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.DetailsValue]
  type DetailsValue = java.lang.String
  type DeviceCertificateUpdateAction = typings.awsSdk.awsSdkStrings.DEACTIVATE | java.lang.String
  type DeviceDefenderThingName = java.lang.String
  type DisableAllLogs = scala.Boolean
  type DomainConfigurationArn = java.lang.String
  type DomainConfigurationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DomainConfigurationStatus = typings.awsSdk.iotMod._DomainConfigurationStatus | java.lang.String
  type DomainConfigurations = js.Array[typings.awsSdk.iotMod.DomainConfigurationSummary]
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENDPOINT
    - typings.awsSdk.awsSdkStrings.AWS_MANAGED
    - typings.awsSdk.awsSdkStrings.CUSTOMER_MANAGED
    - java.lang.String
  */
  type DomainType = typings.awsSdk.iotMod._DomainType | java.lang.String
  type DurationSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.BUILDING
    - typings.awsSdk.awsSdkStrings.REBUILDING
    - java.lang.String
  */
  type DynamicGroupStatus = typings.awsSdk.iotMod._DynamicGroupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRING
    - typings.awsSdk.awsSdkStrings.NUMBER
    - java.lang.String
  */
  type DynamoKeyType = typings.awsSdk.iotMod._DynamoKeyType | java.lang.String
  type DynamoOperation = java.lang.String
  type EffectivePolicies = js.Array[typings.awsSdk.iotMod.EffectivePolicy]
  type ElasticsearchEndpoint = java.lang.String
  type ElasticsearchId = java.lang.String
  type ElasticsearchIndex = java.lang.String
  type ElasticsearchType = java.lang.String
  type Enabled = scala.Boolean
  type EndpointAddress = java.lang.String
  type EndpointType = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type EvaluationStatistic = java.lang.String
  type EventConfigurations = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.Configuration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.THING
    - typings.awsSdk.awsSdkStrings.THING_GROUP
    - typings.awsSdk.awsSdkStrings.THING_TYPE
    - typings.awsSdk.awsSdkStrings.THING_GROUP_MEMBERSHIP
    - typings.awsSdk.awsSdkStrings.THING_GROUP_HIERARCHY
    - typings.awsSdk.awsSdkStrings.THING_TYPE_ASSOCIATION
    - typings.awsSdk.awsSdkStrings.JOB
    - typings.awsSdk.awsSdkStrings.JOB_EXECUTION
    - typings.awsSdk.awsSdkStrings.POLICY
    - typings.awsSdk.awsSdkStrings.CERTIFICATE
    - typings.awsSdk.awsSdkStrings.CA_CERTIFICATE
    - java.lang.String
  */
  type EventType = typings.awsSdk.iotMod._EventType | java.lang.String
  type ExecutionNamePrefix = java.lang.String
  type ExecutionNumber = scala.Double
  type ExpectedVersion = scala.Double
  type ExpiresInSec = scala.Double
  type ExpiresInSeconds = scala.Double
  type FailedChecksCount = scala.Double
  type FailedFindingsCount = scala.Double
  type FailedThings = scala.Double
  type FieldName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Number_
    - typings.awsSdk.awsSdkStrings.String_
    - typings.awsSdk.awsSdkStrings.Boolean_
    - java.lang.String
  */
  type FieldType = typings.awsSdk.iotMod._FieldType | java.lang.String
  type Fields = js.Array[typings.awsSdk.iotMod.Field]
  type FileId = scala.Double
  type FileName = java.lang.String
  type FindingId = java.lang.String
  type FindingIds = js.Array[typings.awsSdk.iotMod.FindingId]
  type FirehoseSeparator = java.lang.String
  type Flag = scala.Boolean
  type ForceDelete = scala.Boolean
  type ForceDeleteAWSJob = scala.Boolean
  type ForceFlag = scala.Boolean
  type Forced = scala.Boolean
  type FunctionArn = java.lang.String
  type GenerationId = java.lang.String
  type HashAlgorithm = java.lang.String
  type HashKeyField = java.lang.String
  type HashKeyValue = java.lang.String
  type HeaderKey = java.lang.String
  type HeaderList = js.Array[typings.awsSdk.iotMod.HttpActionHeader]
  type HeaderValue = java.lang.String
  type HttpHeaderName = java.lang.String
  type HttpHeaderValue = java.lang.String
  type HttpHeaders = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.HttpHeaderValue]
  type HttpQueryString = java.lang.String
  type InProgressChecksCount = scala.Double
  type InProgressThings = scala.Double
  type InProgressTimeoutInMinutes = scala.Double
  type IncrementFactor = scala.Double
  type IndexName = java.lang.String
  type IndexNamesList = js.Array[typings.awsSdk.iotMod.IndexName]
  type IndexSchema = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.BUILDING
    - typings.awsSdk.awsSdkStrings.REBUILDING
    - java.lang.String
  */
  type IndexStatus = typings.awsSdk.iotMod._IndexStatus | java.lang.String
  type InlineDocument = java.lang.String
  type InputName = java.lang.String
  type IsAuthenticated = scala.Boolean
  type IsDefaultVersion = scala.Boolean
  type IsDisabled = scala.Boolean
  type JobArn = java.lang.String
  type JobDescription = java.lang.String
  type JobDocument = java.lang.String
  type JobDocumentSource = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.REJECTED
    - typings.awsSdk.awsSdkStrings.TIMED_OUT
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type JobExecutionFailureType = typings.awsSdk.iotMod._JobExecutionFailureType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.QUEUED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.TIMED_OUT
    - typings.awsSdk.awsSdkStrings.REJECTED
    - typings.awsSdk.awsSdkStrings.REMOVED
    - typings.awsSdk.awsSdkStrings.CANCELED
    - java.lang.String
  */
  type JobExecutionStatus = typings.awsSdk.iotMod._JobExecutionStatus | java.lang.String
  type JobExecutionSummaryForJobList = js.Array[typings.awsSdk.iotMod.JobExecutionSummaryForJob]
  type JobExecutionSummaryForThingList = js.Array[typings.awsSdk.iotMod.JobExecutionSummaryForThing]
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CANCELED
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
    - java.lang.String
  */
  type JobStatus = typings.awsSdk.iotMod._JobStatus | java.lang.String
  type JobSummaryList = js.Array[typings.awsSdk.iotMod.JobSummary]
  type JobTargets = js.Array[typings.awsSdk.iotMod.TargetArn]
  type JsonDocument = java.lang.String
  type Key = java.lang.String
  type KeyName = java.lang.String
  type KeyValue = java.lang.String
  type LaserMaxResults = scala.Double
  type LastModifiedDate = typings.std.Date
  type LogGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEBUG
    - typings.awsSdk.awsSdkStrings.INFO
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.WARN
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type LogLevel = typings.awsSdk.iotMod._LogLevel | java.lang.String
  type LogTargetConfigurations = js.Array[typings.awsSdk.iotMod.LogTargetConfiguration]
  type LogTargetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.THING_GROUP
    - java.lang.String
  */
  type LogTargetType = typings.awsSdk.iotMod._LogTargetType | java.lang.String
  type Marker = java.lang.String
  type MaxJobExecutionsPerMin = scala.Double
  type MaxResults = scala.Double
  type Maximum = scala.Double
  type MaximumPerMinute = scala.Double
  type Message = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RAW
    - typings.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type MessageFormat = typings.awsSdk.iotMod._MessageFormat | java.lang.String
  type MessageId = java.lang.String
  type Minimum = scala.Double
  type MinimumNumberOfExecutedThings = scala.Double
  type MissingContextValue = java.lang.String
  type MissingContextValues = js.Array[typings.awsSdk.iotMod.MissingContextValue]
  type MitigationActionArn = java.lang.String
  type MitigationActionId = java.lang.String
  type MitigationActionIdentifierList = js.Array[typings.awsSdk.iotMod.MitigationActionIdentifier]
  type MitigationActionList = js.Array[typings.awsSdk.iotMod.MitigationAction]
  type MitigationActionName = java.lang.String
  type MitigationActionNameList = js.Array[typings.awsSdk.iotMod.MitigationActionName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UPDATE_DEVICE_CERTIFICATE
    - typings.awsSdk.awsSdkStrings.UPDATE_CA_CERTIFICATE
    - typings.awsSdk.awsSdkStrings.ADD_THINGS_TO_THING_GROUP
    - typings.awsSdk.awsSdkStrings.REPLACE_DEFAULT_POLICY_VERSION
    - typings.awsSdk.awsSdkStrings.ENABLE_IOT_LOGGING
    - typings.awsSdk.awsSdkStrings.PUBLISH_FINDING_TO_SNS
    - java.lang.String
  */
  type MitigationActionType = typings.awsSdk.iotMod._MitigationActionType | java.lang.String
  type MqttClientId = java.lang.String
  type MqttPassword = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.iotMod.Blob | java.lang.String
  type MqttUsername = java.lang.String
  type NextToken = java.lang.String
  type NonCompliantChecksCount = scala.Double
  type NonCompliantResourcesCount = scala.Double
  type NumberOfThings = scala.Double
  type OTAUpdateArn = java.lang.String
  type OTAUpdateDescription = java.lang.String
  type OTAUpdateErrorMessage = java.lang.String
  type OTAUpdateFileVersion = java.lang.String
  type OTAUpdateFiles = js.Array[typings.awsSdk.iotMod.OTAUpdateFile]
  type OTAUpdateId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_PENDING
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - java.lang.String
  */
  type OTAUpdateStatus = typings.awsSdk.iotMod._OTAUpdateStatus | java.lang.String
  type OTAUpdatesSummary = js.Array[typings.awsSdk.iotMod.OTAUpdateSummary]
  type OptionalVersion = scala.Double
  type OutgoingCertificates = js.Array[typings.awsSdk.iotMod.OutgoingCertificate]
  type OverrideDynamicGroups = scala.Boolean
  type PageSize = scala.Double
  type Parameter = java.lang.String
  type Parameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.Value]
  type PartitionKey = java.lang.String
  type PayloadField = java.lang.String
  type Percent = scala.Double
  type PercentList = js.Array[typings.awsSdk.iotMod.Percent]
  type PercentValue = scala.Double
  type Percentage = scala.Double
  type Percentiles = js.Array[typings.awsSdk.iotMod.PercentPair]
  type Platform = java.lang.String
  type Policies = js.Array[typings.awsSdk.iotMod.Policy]
  type PolicyArn = java.lang.String
  type PolicyDocument = java.lang.String
  type PolicyDocuments = js.Array[typings.awsSdk.iotMod.PolicyDocument]
  type PolicyName = java.lang.String
  type PolicyNames = js.Array[typings.awsSdk.iotMod.PolicyName]
  type PolicyTarget = java.lang.String
  type PolicyTargets = js.Array[typings.awsSdk.iotMod.PolicyTarget]
  type PolicyTemplateName = typings.awsSdk.awsSdkStrings.BLANK_POLICY | java.lang.String
  type PolicyVersionId = java.lang.String
  type PolicyVersions = js.Array[typings.awsSdk.iotMod.PolicyVersion]
  type Port = scala.Double
  type Ports = js.Array[typings.awsSdk.iotMod.Port]
  type Prefix = java.lang.String
  type Principal = java.lang.String
  type PrincipalArn = java.lang.String
  type PrincipalId = java.lang.String
  type Principals = js.Array[typings.awsSdk.iotMod.PrincipalArn]
  type PrivateKey = java.lang.String
  type ProcessingTargetName = java.lang.String
  type ProcessingTargetNameList = js.Array[typings.awsSdk.iotMod.ProcessingTargetName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MQTT
    - typings.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type Protocol = typings.awsSdk.iotMod._Protocol | java.lang.String
  type Protocols = js.Array[typings.awsSdk.iotMod.Protocol]
  type ProvisioningTemplateListing = js.Array[typings.awsSdk.iotMod.ProvisioningTemplateSummary]
  type ProvisioningTemplateVersionListing = js.Array[typings.awsSdk.iotMod.ProvisioningTemplateVersionSummary]
  type PublicKey = java.lang.String
  type PublicKeyMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.KeyValue]
  type PutAssetPropertyValueEntryList = js.Array[typings.awsSdk.iotMod.PutAssetPropertyValueEntry]
  type Qos = scala.Double
  type QueryMaxResults = scala.Double
  type QueryString = java.lang.String
  type QueryVersion = java.lang.String
  type QueueUrl = java.lang.String
  type QueuedThings = scala.Double
  type RangeKeyField = java.lang.String
  type RangeKeyValue = java.lang.String
  type ReasonCode = java.lang.String
  type ReasonForNonCompliance = java.lang.String
  type ReasonForNonComplianceCode = java.lang.String
  type ReasonForNonComplianceCodes = js.Array[typings.awsSdk.iotMod.ReasonForNonComplianceCode]
  type Recursive = scala.Boolean
  type RecursiveWithoutDefault = scala.Boolean
  type RegistrationCode = java.lang.String
  type RegistryMaxResults = scala.Double
  type RegistryS3BucketName = java.lang.String
  type RegistryS3KeyName = java.lang.String
  type RejectedThings = scala.Double
  type RelatedResources = js.Array[typings.awsSdk.iotMod.RelatedResource]
  type RemoveAuthorizerConfig = scala.Boolean
  type RemoveAutoRegistration = scala.Boolean
  type RemoveThingType = scala.Boolean
  type RemovedThings = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ERRORS
    - typings.awsSdk.awsSdkStrings.RESULTS
    - java.lang.String
  */
  type ReportType = typings.awsSdk.iotMod._ReportType | java.lang.String
  type ReservedDomainConfigurationName = java.lang.String
  type Resource = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArns = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.ResourceArn]
  type ResourceLogicalId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEVICE_CERTIFICATE
    - typings.awsSdk.awsSdkStrings.CA_CERTIFICATE
    - typings.awsSdk.awsSdkStrings.IOT_POLICY
    - typings.awsSdk.awsSdkStrings.COGNITO_IDENTITY_POOL
    - typings.awsSdk.awsSdkStrings.CLIENT_ID
    - typings.awsSdk.awsSdkStrings.ACCOUNT_SETTINGS
    - typings.awsSdk.awsSdkStrings.ROLE_ALIAS
    - typings.awsSdk.awsSdkStrings.IAM_ROLE
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.iotMod._ResourceType | java.lang.String
  type Resources = js.Array[typings.awsSdk.iotMod.Resource]
  type RoleAlias = java.lang.String
  type RoleAliasArn = java.lang.String
  type RoleAliases = js.Array[typings.awsSdk.iotMod.RoleAlias]
  type RoleArn = java.lang.String
  type RolloutRatePerMinute = scala.Double
  type RuleArn = java.lang.String
  type RuleName = java.lang.String
  type S3Bucket = java.lang.String
  type S3FileUrl = java.lang.String
  type S3FileUrlList = js.Array[typings.awsSdk.iotMod.S3FileUrl]
  type S3Key = java.lang.String
  type S3Version = java.lang.String
  type SQL = java.lang.String
  type SalesforceEndpoint = java.lang.String
  type SalesforceToken = java.lang.String
  type ScheduledAuditArn = java.lang.String
  type ScheduledAuditMetadataList = js.Array[typings.awsSdk.iotMod.ScheduledAuditMetadata]
  type ScheduledAuditName = java.lang.String
  type SearchableAttributes = js.Array[typings.awsSdk.iotMod.AttributeName]
  type Seconds = scala.Double
  type SecurityProfileArn = java.lang.String
  type SecurityProfileDescription = java.lang.String
  type SecurityProfileIdentifiers = js.Array[typings.awsSdk.iotMod.SecurityProfileIdentifier]
  type SecurityProfileName = java.lang.String
  type SecurityProfileTargetArn = java.lang.String
  type SecurityProfileTargetMappings = js.Array[typings.awsSdk.iotMod.SecurityProfileTargetMapping]
  type SecurityProfileTargets = js.Array[typings.awsSdk.iotMod.SecurityProfileTarget]
  type ServerCertificateArns = js.Array[typings.awsSdk.iotMod.AcmCertificateArn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INVALID
    - typings.awsSdk.awsSdkStrings.VALID
    - java.lang.String
  */
  type ServerCertificateStatus = typings.awsSdk.iotMod._ServerCertificateStatus | java.lang.String
  type ServerCertificateStatusDetail = java.lang.String
  type ServerCertificates = js.Array[typings.awsSdk.iotMod.ServerCertificateSummary]
  type ServerName = java.lang.String
  type ServiceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DATA
    - typings.awsSdk.awsSdkStrings.CREDENTIAL_PROVIDER
    - typings.awsSdk.awsSdkStrings.JOBS
    - java.lang.String
  */
  type ServiceType = typings.awsSdk.iotMod._ServiceType | java.lang.String
  type SetAsActive = scala.Boolean
  type SetAsActiveFlag = scala.Boolean
  type SetAsDefault = scala.Boolean
  type Signature = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.iotMod.Blob | java.lang.String
  type SignatureAlgorithm = java.lang.String
  type SigningJobId = java.lang.String
  type SigningProfileName = java.lang.String
  type SigningRegion = java.lang.String
  type SkippedFindingsCount = scala.Double
  type SkyfallMaxResults = scala.Double
  type SnsTopicArn = java.lang.String
  type StateMachineName = java.lang.String
  type StateReason = java.lang.String
  type StateValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Cancelling_
    - java.lang.String
  */
  type Status = typings.awsSdk.iotMod._Status | java.lang.String
  type StdDeviation = scala.Double
  type StreamArn = java.lang.String
  type StreamDescription = java.lang.String
  type StreamFiles = js.Array[typings.awsSdk.iotMod.StreamFile]
  type StreamId = java.lang.String
  type StreamName = java.lang.String
  type StreamVersion = scala.Double
  type StreamsSummary = js.Array[typings.awsSdk.iotMod.StreamSummary]
  type String = java.lang.String
  type StringMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotMod.String]
  type SucceededFindingsCount = scala.Double
  type SucceededThings = scala.Double
  type Sum = scala.Double
  type SumOfSquares = scala.Double
  type TableName = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.iotMod.TagKey]
  type TagList = js.Array[typings.awsSdk.iotMod.Tag]
  type TagValue = java.lang.String
  type Target = java.lang.String
  type TargetArn = java.lang.String
  type TargetAuditCheckNames = js.Array[typings.awsSdk.iotMod.AuditCheckName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONTINUOUS
    - typings.awsSdk.awsSdkStrings.SNAPSHOT
    - java.lang.String
  */
  type TargetSelection = typings.awsSdk.iotMod._TargetSelection | java.lang.String
  type Targets = js.Array[typings.awsSdk.iotMod.Target]
  type TaskId = java.lang.String
  type TaskIdList = js.Array[typings.awsSdk.iotMod.TaskId]
  type TemplateArn = java.lang.String
  type TemplateBody = java.lang.String
  type TemplateDescription = java.lang.String
  type TemplateName = java.lang.String
  type TemplateVersionId = scala.Double
  type ThingArn = java.lang.String
  type ThingAttributeList = js.Array[typings.awsSdk.iotMod.ThingAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OFF
    - typings.awsSdk.awsSdkStrings.STATUS
    - java.lang.String
  */
  type ThingConnectivityIndexingMode = typings.awsSdk.iotMod._ThingConnectivityIndexingMode | java.lang.String
  type ThingDocumentList = js.Array[typings.awsSdk.iotMod.ThingDocument]
  type ThingGroupArn = java.lang.String
  type ThingGroupDescription = java.lang.String
  type ThingGroupDocumentList = js.Array[typings.awsSdk.iotMod.ThingGroupDocument]
  type ThingGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OFF
    - typings.awsSdk.awsSdkStrings.ON
    - java.lang.String
  */
  type ThingGroupIndexingMode = typings.awsSdk.iotMod._ThingGroupIndexingMode | java.lang.String
  type ThingGroupList = js.Array[typings.awsSdk.iotMod.ThingGroupName]
  type ThingGroupName = java.lang.String
  type ThingGroupNameAndArnList = js.Array[typings.awsSdk.iotMod.GroupNameAndArn]
  type ThingGroupNameList = js.Array[typings.awsSdk.iotMod.ThingGroupName]
  type ThingGroupNames = js.Array[typings.awsSdk.iotMod.ThingGroupName]
  type ThingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OFF
    - typings.awsSdk.awsSdkStrings.REGISTRY
    - typings.awsSdk.awsSdkStrings.REGISTRY_AND_SHADOW
    - java.lang.String
  */
  type ThingIndexingMode = typings.awsSdk.iotMod._ThingIndexingMode | java.lang.String
  type ThingName = java.lang.String
  type ThingNameList = js.Array[typings.awsSdk.iotMod.ThingName]
  type ThingTypeArn = java.lang.String
  type ThingTypeDescription = java.lang.String
  type ThingTypeId = java.lang.String
  type ThingTypeList = js.Array[typings.awsSdk.iotMod.ThingTypeDefinition]
  type ThingTypeName = java.lang.String
  type TimedOutThings = scala.Double
  type Timestamp = typings.std.Date
  type Token = java.lang.String
  type TokenKeyName = java.lang.String
  type TokenSignature = java.lang.String
  type Topic = java.lang.String
  type TopicPattern = java.lang.String
  type TopicRuleDestinationMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type TopicRuleDestinationStatus = typings.awsSdk.iotMod._TopicRuleDestinationStatus | java.lang.String
  type TopicRuleDestinationSummaries = js.Array[typings.awsSdk.iotMod.TopicRuleDestinationSummary]
  type TopicRuleList = js.Array[typings.awsSdk.iotMod.TopicRuleListItem]
  type TopicRuleMaxResults = scala.Double
  type TotalChecksCount = scala.Double
  type TotalFindingsCount = scala.Double
  type TotalResourcesCount = scala.Double
  type UndoDeprecate = scala.Boolean
  type UnsignedLong = scala.Double
  type Url = java.lang.String
  type UseBase64 = scala.Boolean
  type Valid = scala.Boolean
  type ValidationErrors = js.Array[typings.awsSdk.iotMod.ValidationError]
  type Value = java.lang.String
  type Variance = scala.Double
  type Version = scala.Double
  type VersionNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`in-alarm`
    - typings.awsSdk.awsSdkStrings.`alarm-cleared`
    - typings.awsSdk.awsSdkStrings.`alarm-invalidated`
    - java.lang.String
  */
  type ViolationEventType = typings.awsSdk.iotMod._ViolationEventType | java.lang.String
  type ViolationEvents = js.Array[typings.awsSdk.iotMod.ViolationEvent]
  type ViolationId = java.lang.String
  type WaitingForDataCollectionChecksCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-05-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.iotMod._apiVersion | java.lang.String
}
