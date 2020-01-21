package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codepipelineMod {
  type AWSRegionName = java.lang.String
  type AccessKeyId = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Source
    - typings.awsSdk.awsSdkStrings.Build_
    - typings.awsSdk.awsSdkStrings.Deploy
    - typings.awsSdk.awsSdkStrings.Test_
    - typings.awsSdk.awsSdkStrings.Invoke
    - typings.awsSdk.awsSdkStrings.Approval
    - java.lang.String
  */
  type ActionCategory = typings.awsSdk.codepipelineMod._ActionCategory | java.lang.String
  type ActionConfigurationKey = java.lang.String
  type ActionConfigurationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codepipelineMod.ActionConfigurationValue]
  type ActionConfigurationPropertyList = js.Array[typings.awsSdk.codepipelineMod.ActionConfigurationProperty]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.String_
    - typings.awsSdk.awsSdkStrings.Number_
    - typings.awsSdk.awsSdkStrings.Boolean_
    - java.lang.String
  */
  type ActionConfigurationPropertyType = typings.awsSdk.codepipelineMod._ActionConfigurationPropertyType | java.lang.String
  type ActionConfigurationQueryableValue = java.lang.String
  type ActionConfigurationValue = java.lang.String
  type ActionExecutionDetailList = js.Array[typings.awsSdk.codepipelineMod.ActionExecutionDetail]
  type ActionExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ActionExecutionStatus = typings.awsSdk.codepipelineMod._ActionExecutionStatus | java.lang.String
  type ActionExecutionToken = java.lang.String
  type ActionName = java.lang.String
  type ActionNamespace = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWS
    - typings.awsSdk.awsSdkStrings.ThirdParty
    - typings.awsSdk.awsSdkStrings.Custom_
    - java.lang.String
  */
  type ActionOwner = typings.awsSdk.codepipelineMod._ActionOwner | java.lang.String
  type ActionProvider = java.lang.String
  type ActionRunOrder = scala.Double
  type ActionStateList = js.Array[typings.awsSdk.codepipelineMod.ActionState]
  type ActionTypeList = js.Array[typings.awsSdk.codepipelineMod.ActionType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Approved_
    - typings.awsSdk.awsSdkStrings.Rejected_
    - java.lang.String
  */
  type ApprovalStatus = typings.awsSdk.codepipelineMod._ApprovalStatus | java.lang.String
  type ApprovalSummary = java.lang.String
  type ApprovalToken = java.lang.String
  type ArtifactDetailList = js.Array[typings.awsSdk.codepipelineMod.ArtifactDetail]
  type ArtifactList = js.Array[typings.awsSdk.codepipelineMod.Artifact]
  type ArtifactLocationType = typings.awsSdk.awsSdkStrings.S3 | java.lang.String
  type ArtifactName = java.lang.String
  type ArtifactRevisionList = js.Array[typings.awsSdk.codepipelineMod.ArtifactRevision]
  type ArtifactStoreLocation = java.lang.String
  type ArtifactStoreMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codepipelineMod.ArtifactStore]
  type ArtifactStoreType = typings.awsSdk.awsSdkStrings.S3 | java.lang.String
  type BlockerName = java.lang.String
  type BlockerType = typings.awsSdk.awsSdkStrings.Schedule | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codepipelineMod.ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type Code = java.lang.String
  type ContinuationToken = java.lang.String
  type Description = java.lang.String
  type DisabledReason = java.lang.String
  type Enabled = scala.Boolean
  type EncryptionKeyId = java.lang.String
  type EncryptionKeyType = typings.awsSdk.awsSdkStrings.KMS | java.lang.String
  type ExecutionId = java.lang.String
  type ExecutionSummary = java.lang.String
  type ExternalExecutionId = java.lang.String
  type ExternalExecutionSummary = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.JobFailed
    - typings.awsSdk.awsSdkStrings.ConfigurationError
    - typings.awsSdk.awsSdkStrings.PermissionError
    - typings.awsSdk.awsSdkStrings.RevisionOutOfSync
    - typings.awsSdk.awsSdkStrings.RevisionUnavailable
    - typings.awsSdk.awsSdkStrings.SystemUnavailable
    - java.lang.String
  */
  type FailureType = typings.awsSdk.codepipelineMod._FailureType | java.lang.String
  type InputArtifactList = js.Array[typings.awsSdk.codepipelineMod.InputArtifact]
  type JobId = java.lang.String
  type JobList = js.Array[typings.awsSdk.codepipelineMod.Job]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Created_
    - typings.awsSdk.awsSdkStrings.Queued_
    - typings.awsSdk.awsSdkStrings.Dispatched
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.TimedOut_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type JobStatus = typings.awsSdk.codepipelineMod._JobStatus | java.lang.String
  type JsonPath = java.lang.String
  type LastChangedAt = typings.std.Date
  type LastChangedBy = java.lang.String
  type LastUpdatedBy = java.lang.String
  type MatchEquals = java.lang.String
  type MaxBatchSize = scala.Double
  type MaxResults = scala.Double
  type MaximumArtifactCount = scala.Double
  type Message = java.lang.String
  type MinimumArtifactCount = scala.Double
  type NextToken = java.lang.String
  type Nonce = java.lang.String
  type OutputArtifactList = js.Array[typings.awsSdk.codepipelineMod.OutputArtifact]
  type OutputVariablesKey = java.lang.String
  type OutputVariablesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codepipelineMod.OutputVariablesValue]
  type OutputVariablesValue = java.lang.String
  type Percentage = scala.Double
  type PipelineArn = java.lang.String
  type PipelineExecutionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - typings.awsSdk.awsSdkStrings.Superseded_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type PipelineExecutionStatus = typings.awsSdk.codepipelineMod._PipelineExecutionStatus | java.lang.String
  type PipelineExecutionSummaryList = js.Array[typings.awsSdk.codepipelineMod.PipelineExecutionSummary]
  type PipelineList = js.Array[typings.awsSdk.codepipelineMod.PipelineSummary]
  type PipelineName = java.lang.String
  type PipelineStageDeclarationList = js.Array[typings.awsSdk.codepipelineMod.StageDeclaration]
  type PipelineVersion = scala.Double
  type QueryParamMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codepipelineMod.ActionConfigurationQueryableValue]
  type ResolvedActionConfigurationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codepipelineMod.String]
  type ResourceArn = java.lang.String
  type Revision = java.lang.String
  type RevisionChangeIdentifier = java.lang.String
  type RevisionSummary = java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3BucketName = java.lang.String
  type S3Key = java.lang.String
  type S3ObjectKey = java.lang.String
  type SecretAccessKey = java.lang.String
  type SessionToken = java.lang.String
  type SourceRevisionList = js.Array[typings.awsSdk.codepipelineMod.SourceRevision]
  type StageActionDeclarationList = js.Array[typings.awsSdk.codepipelineMod.ActionDeclaration]
  type StageBlockerDeclarationList = js.Array[typings.awsSdk.codepipelineMod.BlockerDeclaration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type StageExecutionStatus = typings.awsSdk.codepipelineMod._StageExecutionStatus | java.lang.String
  type StageName = java.lang.String
  type StageRetryMode = typings.awsSdk.awsSdkStrings.FAILED_ACTIONS | java.lang.String
  type StageStateList = js.Array[typings.awsSdk.codepipelineMod.StageState]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Inbound_
    - typings.awsSdk.awsSdkStrings.Outbound_
    - java.lang.String
  */
  type StageTransitionType = typings.awsSdk.codepipelineMod._StageTransitionType | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.codepipelineMod.TagKey]
  type TagList = js.Array[typings.awsSdk.codepipelineMod.Tag]
  type TagValue = java.lang.String
  type ThirdPartyJobId = java.lang.String
  type ThirdPartyJobList = js.Array[typings.awsSdk.codepipelineMod.ThirdPartyJob]
  type Time = typings.std.Date
  type Timestamp = typings.std.Date
  type TriggerDetail = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CreatePipeline
    - typings.awsSdk.awsSdkStrings.StartPipelineExecution
    - typings.awsSdk.awsSdkStrings.PollForSourceChanges
    - typings.awsSdk.awsSdkStrings.Webhook
    - typings.awsSdk.awsSdkStrings.CloudWatchEvent
    - typings.awsSdk.awsSdkStrings.PutActionRevision
    - java.lang.String
  */
  type TriggerType = typings.awsSdk.codepipelineMod._TriggerType | java.lang.String
  type Url = java.lang.String
  type UrlTemplate = java.lang.String
  type Version = java.lang.String
  type WebhookArn = java.lang.String
  type WebhookAuthConfigurationAllowedIPRange = java.lang.String
  type WebhookAuthConfigurationSecretToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GITHUB_HMAC
    - typings.awsSdk.awsSdkStrings.IP
    - typings.awsSdk.awsSdkStrings.UNAUTHENTICATED
    - java.lang.String
  */
  type WebhookAuthenticationType = typings.awsSdk.codepipelineMod._WebhookAuthenticationType | java.lang.String
  type WebhookErrorCode = java.lang.String
  type WebhookErrorMessage = java.lang.String
  type WebhookFilters = js.Array[typings.awsSdk.codepipelineMod.WebhookFilterRule]
  type WebhookLastTriggered = typings.std.Date
  type WebhookList = js.Array[typings.awsSdk.codepipelineMod.ListWebhookItem]
  type WebhookName = java.lang.String
  type WebhookUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-07-09`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codepipelineMod._apiVersion | java.lang.String
}
