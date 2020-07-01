package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sagemakerMod {
  type Accept = java.lang.String
  type AccountId = java.lang.String
  type AdditionalCodeRepositoryNamesOrUrls = js.Array[typings.awsSdk.sagemakerMod.CodeRepositoryNameOrUrl]
  type AlgorithmArn = java.lang.String
  type AlgorithmImage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type AlgorithmSortBy = typings.awsSdk.sagemakerMod._AlgorithmSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type AlgorithmStatus = typings.awsSdk.sagemakerMod._AlgorithmStatus | java.lang.String
  type AlgorithmStatusItemList = js.Array[typings.awsSdk.sagemakerMod.AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[typings.awsSdk.sagemakerMod.AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[typings.awsSdk.sagemakerMod.AlgorithmValidationProfile]
  type AppArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.system__
    - typings.awsSdk.awsSdkStrings.mlDott3Dotmicro
    - typings.awsSdk.awsSdkStrings.mlDott3Dotsmall
    - typings.awsSdk.awsSdkStrings.mlDott3Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDott3Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDott3Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
    - java.lang.String
  */
  type AppInstanceType = typings.awsSdk.sagemakerMod._AppInstanceType | java.lang.String
  type AppList = js.Array[typings.awsSdk.sagemakerMod.AppDetails]
  type AppName = java.lang.String
  type AppSortKey = typings.awsSdk.awsSdkStrings.CreationTime | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Deleted_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.InService
    - typings.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type AppStatus = typings.awsSdk.sagemakerMod._AppStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.JupyterServer
    - typings.awsSdk.awsSdkStrings.KernelGateway
    - typings.awsSdk.awsSdkStrings.TensorBoard
    - java.lang.String
  */
  type AppType = typings.awsSdk.sagemakerMod._AppType | java.lang.String
  type ArnOrName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.None_
    - typings.awsSdk.awsSdkStrings.Line_
    - java.lang.String
  */
  type AssemblyType = typings.awsSdk.sagemakerMod._AssemblyType | java.lang.String
  type AttributeName = java.lang.String
  type AttributeNames = js.Array[typings.awsSdk.sagemakerMod.AttributeName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SSO
    - typings.awsSdk.awsSdkStrings.IAM
    - java.lang.String
  */
  type AuthMode = typings.awsSdk.sagemakerMod._AuthMode | java.lang.String
  type AutoMLCandidates = js.Array[typings.awsSdk.sagemakerMod.AutoMLCandidate]
  type AutoMLContainerDefinitions = js.Array[typings.awsSdk.sagemakerMod.AutoMLContainerDefinition]
  type AutoMLFailureReason = java.lang.String
  type AutoMLInputDataConfig = js.Array[typings.awsSdk.sagemakerMod.AutoMLChannel]
  type AutoMLJobArn = java.lang.String
  type AutoMLJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Maximize
    - typings.awsSdk.awsSdkStrings.Minimize
    - java.lang.String
  */
  type AutoMLJobObjectiveType = typings.awsSdk.sagemakerMod._AutoMLJobObjectiveType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Starting_
    - typings.awsSdk.awsSdkStrings.AnalyzingData
    - typings.awsSdk.awsSdkStrings.FeatureEngineering
    - typings.awsSdk.awsSdkStrings.ModelTuning
    - typings.awsSdk.awsSdkStrings.MaxCandidatesReached
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - typings.awsSdk.awsSdkStrings.MaxAutoMLJobRuntimeReached
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.CandidateDefinitionsGenerated
    - java.lang.String
  */
  type AutoMLJobSecondaryStatus = typings.awsSdk.sagemakerMod._AutoMLJobSecondaryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type AutoMLJobStatus = typings.awsSdk.sagemakerMod._AutoMLJobStatus | java.lang.String
  type AutoMLJobSummaries = js.Array[typings.awsSdk.sagemakerMod.AutoMLJobSummary]
  type AutoMLMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Accuracy
    - typings.awsSdk.awsSdkStrings.MSE
    - typings.awsSdk.awsSdkStrings.F1
    - typings.awsSdk.awsSdkStrings.F1macro
    - java.lang.String
  */
  type AutoMLMetricEnum = typings.awsSdk.sagemakerMod._AutoMLMetricEnum | java.lang.String
  type AutoMLNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ManifestFile
    - typings.awsSdk.awsSdkStrings.S3Prefix
    - java.lang.String
  */
  type AutoMLS3DataType = typings.awsSdk.sagemakerMod._AutoMLS3DataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type AutoMLSortBy = typings.awsSdk.sagemakerMod._AutoMLSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ascending_
    - typings.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type AutoMLSortOrder = typings.awsSdk.sagemakerMod._AutoMLSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWSSlashRekognitionSlashDetectModerationLabelsSlashImageSlashV3
    - typings.awsSdk.awsSdkStrings.AWSSlashTextractSlashAnalyzeDocumentSlashFormsSlashV1
    - java.lang.String
  */
  type AwsManagedHumanLoopRequestSource = typings.awsSdk.sagemakerMod._AwsManagedHumanLoopRequestSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MultiRecord
    - typings.awsSdk.awsSdkStrings.SingleRecord
    - java.lang.String
  */
  type BatchStrategy = typings.awsSdk.sagemakerMod._BatchStrategy | java.lang.String
  type BillableTimeInSeconds = scala.Double
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.And_
    - typings.awsSdk.awsSdkStrings.Or_
    - java.lang.String
  */
  type BooleanOperator = typings.awsSdk.sagemakerMod._BooleanOperator | java.lang.String
  type Branch = java.lang.String
  type CandidateDefinitionNotebookLocation = java.lang.String
  type CandidateName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.Status_
    - typings.awsSdk.awsSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type CandidateSortBy = typings.awsSdk.sagemakerMod._CandidateSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type CandidateStatus = typings.awsSdk.sagemakerMod._CandidateStatus | java.lang.String
  type CandidateStepArn = java.lang.String
  type CandidateStepName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonTrainingJob
    - typings.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonTransformJob
    - typings.awsSdk.awsSdkStrings.AWSColonColonSageMakerColonColonProcessingJob
    - java.lang.String
  */
  type CandidateStepType = typings.awsSdk.sagemakerMod._CandidateStepType | java.lang.String
  type CandidateSteps = js.Array[typings.awsSdk.sagemakerMod.AutoMLCandidateStep]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Input_
    - typings.awsSdk.awsSdkStrings.Output_
    - java.lang.String
  */
  type CaptureMode = typings.awsSdk.sagemakerMod._CaptureMode | java.lang.String
  type CaptureOptionList = js.Array[typings.awsSdk.sagemakerMod.CaptureOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Started_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type CaptureStatus = typings.awsSdk.sagemakerMod._CaptureStatus | java.lang.String
  type CategoricalParameterRanges = js.Array[typings.awsSdk.sagemakerMod.CategoricalParameterRange]
  type Cents = scala.Double
  type CertifyForMarketplace = scala.Boolean
  type ChannelName = java.lang.String
  type ChannelSpecifications = js.Array[typings.awsSdk.sagemakerMod.ChannelSpecification]
  type Cidr = java.lang.String
  type Cidrs = js.Array[typings.awsSdk.sagemakerMod.Cidr]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.sagemakerMod.ClientApiVersions
  type CodeRepositoryArn = java.lang.String
  type CodeRepositoryContains = java.lang.String
  type CodeRepositoryNameContains = java.lang.String
  type CodeRepositoryNameOrUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type CodeRepositorySortBy = typings.awsSdk.sagemakerMod._CodeRepositorySortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ascending_
    - typings.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type CodeRepositorySortOrder = typings.awsSdk.sagemakerMod._CodeRepositorySortOrder | java.lang.String
  type CodeRepositorySummaryList = js.Array[typings.awsSdk.sagemakerMod.CodeRepositorySummary]
  type CognitoClientId = java.lang.String
  type CognitoUserGroup = java.lang.String
  type CognitoUserPool = java.lang.String
  type CollectionConfigurations = js.Array[typings.awsSdk.sagemakerMod.CollectionConfiguration]
  type CollectionName = java.lang.String
  type CollectionParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.ConfigValue]
  type CompilationJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INPROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type CompilationJobStatus = typings.awsSdk.sagemakerMod._CompilationJobStatus | java.lang.String
  type CompilationJobSummaries = js.Array[typings.awsSdk.sagemakerMod.CompilationJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.None_
    - typings.awsSdk.awsSdkStrings.Gzip_
    - java.lang.String
  */
  type CompressionType = typings.awsSdk.sagemakerMod._CompressionType | java.lang.String
  type CompressionTypes = js.Array[typings.awsSdk.sagemakerMod.CompressionType]
  type ConfigKey = java.lang.String
  type ConfigValue = java.lang.String
  type ContainerArgument = java.lang.String
  type ContainerArguments = js.Array[typings.awsSdk.sagemakerMod.ContainerArgument]
  type ContainerDefinitionList = js.Array[typings.awsSdk.sagemakerMod.ContainerDefinition]
  type ContainerEntrypoint = js.Array[typings.awsSdk.sagemakerMod.ContainerEntrypointString]
  type ContainerEntrypointString = java.lang.String
  type ContainerHostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SingleModel
    - typings.awsSdk.awsSdkStrings.MultiModel
    - java.lang.String
  */
  type ContainerMode = typings.awsSdk.sagemakerMod._ContainerMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typings.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typings.awsSdk.sagemakerMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typings.awsSdk.sagemakerMod.ContentClassifier]
  type ContentType = java.lang.String
  type ContentTypes = js.Array[typings.awsSdk.sagemakerMod.ContentType]
  type ContinuousParameterRanges = js.Array[typings.awsSdk.sagemakerMod.ContinuousParameterRange]
  type CreationTime = typings.std.Date
  type CsvContentType = java.lang.String
  type CsvContentTypes = js.Array[typings.awsSdk.sagemakerMod.CsvContentType]
  type DataExplorationNotebookLocation = java.lang.String
  type DataInputConfig = java.lang.String
  type DebugRuleConfigurations = js.Array[typings.awsSdk.sagemakerMod.DebugRuleConfiguration]
  type DebugRuleEvaluationStatuses = js.Array[typings.awsSdk.sagemakerMod.DebugRuleEvaluationStatus]
  type DeployedImages = js.Array[typings.awsSdk.sagemakerMod.DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[typings.awsSdk.sagemakerMod.DesiredWeightAndCapacity]
  type DestinationS3Uri = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NotStarted
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DetailedAlgorithmStatus = typings.awsSdk.sagemakerMod._DetailedAlgorithmStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NotStarted
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DetailedModelPackageStatus = typings.awsSdk.sagemakerMod._DetailedModelPackageStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type DirectInternetAccess = typings.awsSdk.sagemakerMod._DirectInternetAccess | java.lang.String
  type DirectoryPath = java.lang.String
  type DisassociateAdditionalCodeRepositories = scala.Boolean
  type DisassociateDefaultCodeRepository = scala.Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = scala.Boolean
  type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean
  type Dollars = scala.Double
  type DomainArn = java.lang.String
  type DomainId = java.lang.String
  type DomainList = js.Array[typings.awsSdk.sagemakerMod.DomainDetails]
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.InService
    - typings.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type DomainStatus = typings.awsSdk.sagemakerMod._DomainStatus | java.lang.String
  type DoubleParameterValue = scala.Double
  type EfsUid = java.lang.String
  type EnableCapture = scala.Boolean
  type EndpointArn = java.lang.String
  type EndpointConfigArn = java.lang.String
  type EndpointConfigName = java.lang.String
  type EndpointConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type EndpointConfigSortKey = typings.awsSdk.sagemakerMod._EndpointConfigSortKey | java.lang.String
  type EndpointConfigSummaryList = js.Array[typings.awsSdk.sagemakerMod.EndpointConfigSummary]
  type EndpointName = java.lang.String
  type EndpointNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type EndpointSortKey = typings.awsSdk.sagemakerMod._EndpointSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OutOfService
    - typings.awsSdk.awsSdkStrings.Creating_
    - typings.awsSdk.awsSdkStrings.Updating_
    - typings.awsSdk.awsSdkStrings.SystemUpdating
    - typings.awsSdk.awsSdkStrings.RollingBack
    - typings.awsSdk.awsSdkStrings.InService
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type EndpointStatus = typings.awsSdk.sagemakerMod._EndpointStatus | java.lang.String
  type EndpointSummaryList = js.Array[typings.awsSdk.sagemakerMod.EndpointSummary]
  type EntityDescription = java.lang.String
  type EntityName = java.lang.String
  type EnvironmentKey = java.lang.String
  type EnvironmentMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.EnvironmentValue]
  type EnvironmentValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.CompletedWithViolations
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type ExecutionStatus = typings.awsSdk.sagemakerMod._ExecutionStatus | java.lang.String
  type ExitMessage = java.lang.String
  type ExperimentArn = java.lang.String
  type ExperimentDescription = java.lang.String
  type ExperimentEntityName = java.lang.String
  type ExperimentSourceArn = java.lang.String
  type ExperimentSummaries = js.Array[typings.awsSdk.sagemakerMod.ExperimentSummary]
  type FailureReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.rw_
    - typings.awsSdk.awsSdkStrings.ro_
    - java.lang.String
  */
  type FileSystemAccessMode = typings.awsSdk.sagemakerMod._FileSystemAccessMode | java.lang.String
  type FileSystemId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EFS
    - typings.awsSdk.awsSdkStrings.FSxLustre
    - java.lang.String
  */
  type FileSystemType = typings.awsSdk.sagemakerMod._FileSystemType | java.lang.String
  type FilterList = js.Array[typings.awsSdk.sagemakerMod.Filter]
  type FilterValue = java.lang.String
  type FinalMetricDataList = js.Array[typings.awsSdk.sagemakerMod.MetricData]
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  type FlowDefinitionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Initializing_
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type FlowDefinitionStatus = typings.awsSdk.sagemakerMod._FlowDefinitionStatus | java.lang.String
  type FlowDefinitionSummaries = js.Array[typings.awsSdk.sagemakerMod.FlowDefinitionSummary]
  type FlowDefinitionTaskAvailabilityLifetimeInSeconds = scala.Double
  type FlowDefinitionTaskCount = scala.Double
  type FlowDefinitionTaskDescription = java.lang.String
  type FlowDefinitionTaskKeyword = java.lang.String
  type FlowDefinitionTaskKeywords = js.Array[typings.awsSdk.sagemakerMod.FlowDefinitionTaskKeyword]
  type FlowDefinitionTaskTimeLimitInSeconds = scala.Double
  type FlowDefinitionTaskTitle = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TENSORFLOW
    - typings.awsSdk.awsSdkStrings.KERAS
    - typings.awsSdk.awsSdkStrings.MXNET
    - typings.awsSdk.awsSdkStrings.ONNX
    - typings.awsSdk.awsSdkStrings.PYTORCH
    - typings.awsSdk.awsSdkStrings.XGBOOST
    - typings.awsSdk.awsSdkStrings.TFLITE
    - java.lang.String
  */
  type Framework = typings.awsSdk.sagemakerMod._Framework | java.lang.String
  type GenerateCandidateDefinitionsOnly = scala.Boolean
  type GitConfigUrl = java.lang.String
  type HookParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.ConfigValue]
  type HumanLoopActivationConditions = java.lang.String
  type HumanTaskUiArn = java.lang.String
  type HumanTaskUiName = java.lang.String
  type HumanTaskUiSummaries = js.Array[typings.awsSdk.sagemakerMod.HumanTaskUiSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Auto_
    - typings.awsSdk.awsSdkStrings.Linear_
    - typings.awsSdk.awsSdkStrings.Logarithmic
    - typings.awsSdk.awsSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type HyperParameterScalingType = typings.awsSdk.sagemakerMod._HyperParameterScalingType | java.lang.String
  type HyperParameterSpecifications = js.Array[typings.awsSdk.sagemakerMod.HyperParameterSpecification]
  type HyperParameterTrainingJobDefinitionName = java.lang.String
  type HyperParameterTrainingJobDefinitions = js.Array[typings.awsSdk.sagemakerMod.HyperParameterTrainingJobDefinition]
  type HyperParameterTrainingJobSummaries = js.Array[typings.awsSdk.sagemakerMod.HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = java.lang.String
  type HyperParameterTuningJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Maximize
    - typings.awsSdk.awsSdkStrings.Minimize
    - java.lang.String
  */
  type HyperParameterTuningJobObjectiveType = typings.awsSdk.sagemakerMod._HyperParameterTuningJobObjectiveType | java.lang.String
  type HyperParameterTuningJobObjectives = js.Array[typings.awsSdk.sagemakerMod.HyperParameterTuningJobObjective]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.Status_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type HyperParameterTuningJobSortByOptions = typings.awsSdk.sagemakerMod._HyperParameterTuningJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - java.lang.String
  */
  type HyperParameterTuningJobStatus = typings.awsSdk.sagemakerMod._HyperParameterTuningJobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Bayesian
    - typings.awsSdk.awsSdkStrings.Random
    - java.lang.String
  */
  type HyperParameterTuningJobStrategyType = typings.awsSdk.sagemakerMod._HyperParameterTuningJobStrategyType | java.lang.String
  type HyperParameterTuningJobSummaries = js.Array[typings.awsSdk.sagemakerMod.HyperParameterTuningJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IdenticalDataAndAlgorithm
    - typings.awsSdk.awsSdkStrings.TransferLearning
    - java.lang.String
  */
  type HyperParameterTuningJobWarmStartType = typings.awsSdk.sagemakerMod._HyperParameterTuningJobWarmStartType | java.lang.String
  type HyperParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.ParameterValue]
  type Image = java.lang.String
  type ImageDigest = java.lang.String
  type ImageUri = java.lang.String
  type InputDataConfig = js.Array[typings.awsSdk.sagemakerMod.Channel]
  type InputModes = js.Array[typings.awsSdk.sagemakerMod.TrainingInputMode]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.mlDott2Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDott2Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDott2Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDott2Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDott3Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDott3Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDott3Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDot18xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - java.lang.String
  */
  type InstanceType = typings.awsSdk.sagemakerMod._InstanceType | java.lang.String
  type IntegerParameterRanges = js.Array[typings.awsSdk.sagemakerMod.IntegerParameterRange]
  type InvocationsMaxRetries = scala.Double
  type InvocationsTimeoutInSeconds = scala.Double
  type JobReferenceCode = java.lang.String
  type JobReferenceCodeContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Input_
    - typings.awsSdk.awsSdkStrings.None_
    - java.lang.String
  */
  type JoinSource = typings.awsSdk.sagemakerMod._JoinSource | java.lang.String
  type JsonContentType = java.lang.String
  type JsonContentTypes = js.Array[typings.awsSdk.sagemakerMod.JsonContentType]
  type JsonPath = java.lang.String
  type KmsKeyId = java.lang.String
  type LabelAttributeName = java.lang.String
  type LabelCounter = scala.Double
  type LabelingJobAlgorithmSpecificationArn = java.lang.String
  type LabelingJobArn = java.lang.String
  type LabelingJobForWorkteamSummaryList = js.Array[typings.awsSdk.sagemakerMod.LabelingJobForWorkteamSummary]
  type LabelingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type LabelingJobStatus = typings.awsSdk.sagemakerMod._LabelingJobStatus | java.lang.String
  type LabelingJobSummaryList = js.Array[typings.awsSdk.sagemakerMod.LabelingJobSummary]
  type LambdaFunctionArn = java.lang.String
  type LastModifiedTime = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type ListCompilationJobsSortBy = typings.awsSdk.sagemakerMod._ListCompilationJobsSortBy | java.lang.String
  type ListLabelingJobsForWorkteamSortByOptions = typings.awsSdk.awsSdkStrings.CreationTime | java.lang.String
  type ListTagsMaxResults = scala.Double
  type ListTrialComponentKey256 = js.Array[typings.awsSdk.sagemakerMod.TrialComponentKey256]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreateDate
    - java.lang.String
  */
  type ListWorkteamsSortByOptions = typings.awsSdk.sagemakerMod._ListWorkteamsSortByOptions | java.lang.String
  type MaxAutoMLJobRuntimeInSeconds = scala.Double
  type MaxCandidates = scala.Double
  type MaxConcurrentTaskCount = scala.Double
  type MaxConcurrentTransforms = scala.Double
  type MaxHumanLabeledObjectCount = scala.Double
  type MaxNumberOfTrainingJobs = scala.Double
  type MaxParallelTrainingJobs = scala.Double
  type MaxPayloadInMB = scala.Double
  type MaxPercentageOfInputDatasetLabeled = scala.Double
  type MaxResults = scala.Double
  type MaxRuntimeInSeconds = scala.Double
  type MaxRuntimePerTrainingJobInSeconds = scala.Double
  type MaxWaitTimeInSeconds = scala.Double
  type MediaType = java.lang.String
  type MemberDefinitions = js.Array[typings.awsSdk.sagemakerMod.MemberDefinition]
  type MetricDefinitionList = js.Array[typings.awsSdk.sagemakerMod.MetricDefinition]
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type ModelArn = java.lang.String
  type ModelName = java.lang.String
  type ModelNameContains = java.lang.String
  type ModelPackageArn = java.lang.String
  type ModelPackageContainerDefinitionList = js.Array[typings.awsSdk.sagemakerMod.ModelPackageContainerDefinition]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelPackageSortBy = typings.awsSdk.sagemakerMod._ModelPackageSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type ModelPackageStatus = typings.awsSdk.sagemakerMod._ModelPackageStatus | java.lang.String
  type ModelPackageStatusItemList = js.Array[typings.awsSdk.sagemakerMod.ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[typings.awsSdk.sagemakerMod.ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[typings.awsSdk.sagemakerMod.ModelPackageValidationProfile]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelSortKey = typings.awsSdk.sagemakerMod._ModelSortKey | java.lang.String
  type ModelSummaryList = js.Array[typings.awsSdk.sagemakerMod.ModelSummary]
  type MonitoringContainerArguments = js.Array[typings.awsSdk.sagemakerMod.ContainerArgument]
  type MonitoringEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.ProcessingEnvironmentValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.ScheduledTime
    - typings.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type MonitoringExecutionSortKey = typings.awsSdk.sagemakerMod._MonitoringExecutionSortKey | java.lang.String
  type MonitoringExecutionSummaryList = js.Array[typings.awsSdk.sagemakerMod.MonitoringExecutionSummary]
  type MonitoringInputs = js.Array[typings.awsSdk.sagemakerMod.MonitoringInput]
  type MonitoringMaxRuntimeInSeconds = scala.Double
  type MonitoringOutputs = js.Array[typings.awsSdk.sagemakerMod.MonitoringOutput]
  type MonitoringS3Uri = java.lang.String
  type MonitoringScheduleArn = java.lang.String
  type MonitoringScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type MonitoringScheduleSortKey = typings.awsSdk.sagemakerMod._MonitoringScheduleSortKey | java.lang.String
  type MonitoringScheduleSummaryList = js.Array[typings.awsSdk.sagemakerMod.MonitoringScheduleSummary]
  type NameContains = java.lang.String
  type NestedFiltersList = js.Array[typings.awsSdk.sagemakerMod.NestedFilters]
  type NetworkInterfaceId = java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.mlDoteia1Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDoteia1Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDoteia1Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDoteia2Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDoteia2Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDoteia2Dotxlarge
    - java.lang.String
  */
  type NotebookInstanceAcceleratorType = typings.awsSdk.sagemakerMod._NotebookInstanceAcceleratorType | java.lang.String
  type NotebookInstanceAcceleratorTypes = js.Array[typings.awsSdk.sagemakerMod.NotebookInstanceAcceleratorType]
  type NotebookInstanceArn = java.lang.String
  type NotebookInstanceLifecycleConfigArn = java.lang.String
  type NotebookInstanceLifecycleConfigContent = java.lang.String
  type NotebookInstanceLifecycleConfigList = js.Array[typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName = java.lang.String
  type NotebookInstanceLifecycleConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortKey = typings.awsSdk.sagemakerMod._NotebookInstanceLifecycleConfigSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ascending_
    - typings.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortOrder = typings.awsSdk.sagemakerMod._NotebookInstanceLifecycleConfigSortOrder | java.lang.String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = java.lang.String
  type NotebookInstanceNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type NotebookInstanceSortKey = typings.awsSdk.sagemakerMod._NotebookInstanceSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ascending_
    - typings.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type NotebookInstanceSortOrder = typings.awsSdk.sagemakerMod._NotebookInstanceSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InService
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Updating_
    - java.lang.String
  */
  type NotebookInstanceStatus = typings.awsSdk.sagemakerMod._NotebookInstanceStatus | java.lang.String
  type NotebookInstanceSummaryList = js.Array[typings.awsSdk.sagemakerMod.NotebookInstanceSummary]
  type NotebookInstanceUrl = java.lang.String
  type NotebookInstanceVolumeSizeInGB = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Allowed_
    - typings.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type NotebookOutputOption = typings.awsSdk.sagemakerMod._NotebookOutputOption | java.lang.String
  type NotificationTopicArn = java.lang.String
  type NumberOfHumanWorkersPerDataObject = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ObjectiveStatus = typings.awsSdk.sagemakerMod._ObjectiveStatus | java.lang.String
  type ObjectiveStatusCounter = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Equals_
    - typings.awsSdk.awsSdkStrings.NotEquals
    - typings.awsSdk.awsSdkStrings.GreaterThan
    - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualTo
    - typings.awsSdk.awsSdkStrings.LessThan
    - typings.awsSdk.awsSdkStrings.LessThanOrEqualTo
    - typings.awsSdk.awsSdkStrings.Contains_
    - typings.awsSdk.awsSdkStrings.Exists
    - typings.awsSdk.awsSdkStrings.NotExists
    - typings.awsSdk.awsSdkStrings.In_
    - java.lang.String
  */
  type Operator = typings.awsSdk.sagemakerMod._Operator | java.lang.String
  type OptionalDouble = scala.Double
  type OptionalInteger = scala.Double
  type OptionalVolumeSizeInGB = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ascending_
    - typings.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type OrderKey = typings.awsSdk.sagemakerMod._OrderKey | java.lang.String
  type PaginationToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Integer_
    - typings.awsSdk.awsSdkStrings.Continuous_
    - typings.awsSdk.awsSdkStrings.Categorical
    - typings.awsSdk.awsSdkStrings.FreeText
    - java.lang.String
  */
  type ParameterType = typings.awsSdk.sagemakerMod._ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValues = js.Array[typings.awsSdk.sagemakerMod.ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[typings.awsSdk.sagemakerMod.ParentHyperParameterTuningJob]
  type Parents = js.Array[typings.awsSdk.sagemakerMod.Parent]
  type PresignedDomainUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BinaryClassification
    - typings.awsSdk.awsSdkStrings.MulticlassClassification
    - typings.awsSdk.awsSdkStrings.Regression_
    - java.lang.String
  */
  type ProblemType = typings.awsSdk.sagemakerMod._ProblemType | java.lang.String
  type ProcessingEnvironmentKey = java.lang.String
  type ProcessingEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.ProcessingEnvironmentValue]
  type ProcessingEnvironmentValue = java.lang.String
  type ProcessingInputs = js.Array[typings.awsSdk.sagemakerMod.ProcessingInput]
  type ProcessingInstanceCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.mlDott3Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDott3Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDott3Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDott3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot24xlarge
    - java.lang.String
  */
  type ProcessingInstanceType = typings.awsSdk.sagemakerMod._ProcessingInstanceType | java.lang.String
  type ProcessingJobArn = java.lang.String
  type ProcessingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type ProcessingJobStatus = typings.awsSdk.sagemakerMod._ProcessingJobStatus | java.lang.String
  type ProcessingJobSummaries = js.Array[typings.awsSdk.sagemakerMod.ProcessingJobSummary]
  type ProcessingLocalPath = java.lang.String
  type ProcessingMaxRuntimeInSeconds = scala.Double
  type ProcessingOutputs = js.Array[typings.awsSdk.sagemakerMod.ProcessingOutput]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.None_
    - typings.awsSdk.awsSdkStrings.Gzip_
    - java.lang.String
  */
  type ProcessingS3CompressionType = typings.awsSdk.sagemakerMod._ProcessingS3CompressionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FullyReplicated
    - typings.awsSdk.awsSdkStrings.ShardedByS3Key
    - java.lang.String
  */
  type ProcessingS3DataDistributionType = typings.awsSdk.sagemakerMod._ProcessingS3DataDistributionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ManifestFile
    - typings.awsSdk.awsSdkStrings.S3Prefix
    - java.lang.String
  */
  type ProcessingS3DataType = typings.awsSdk.sagemakerMod._ProcessingS3DataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pipe
    - typings.awsSdk.awsSdkStrings.File_
    - java.lang.String
  */
  type ProcessingS3InputMode = typings.awsSdk.sagemakerMod._ProcessingS3InputMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Continuous_
    - typings.awsSdk.awsSdkStrings.EndOfJob
    - java.lang.String
  */
  type ProcessingS3UploadMode = typings.awsSdk.sagemakerMod._ProcessingS3UploadMode | java.lang.String
  type ProcessingVolumeSizeInGB = scala.Double
  type ProductId = java.lang.String
  type ProductListings = js.Array[typings.awsSdk.sagemakerMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.mlDoteia1Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDoteia1Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDoteia1Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDoteia2Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDoteia2Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDoteia2Dotxlarge
    - java.lang.String
  */
  type ProductionVariantAcceleratorType = typings.awsSdk.sagemakerMod._ProductionVariantAcceleratorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.mlDott2Dotmedium
    - typings.awsSdk.awsSdkStrings.mlDott2Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDott2Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDott2Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5dDotlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5dDotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5dDot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5dDot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5dDot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5dDot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDotlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5dDot18xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5dDotlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5dDotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5dDot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5dDot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5dDot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotr5dDot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotinf1Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotinf1Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotinf1Dot6xlarge
    - typings.awsSdk.awsSdkStrings.mlDotinf1Dot24xlarge
    - java.lang.String
  */
  type ProductionVariantInstanceType = typings.awsSdk.sagemakerMod._ProductionVariantInstanceType | java.lang.String
  type ProductionVariantList = js.Array[typings.awsSdk.sagemakerMod.ProductionVariant]
  type ProductionVariantSummaryList = js.Array[typings.awsSdk.sagemakerMod.ProductionVariantSummary]
  type PropertyNameHint = java.lang.String
  type PropertyNameSuggestionList = js.Array[typings.awsSdk.sagemakerMod.PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes = js.Array[typings.awsSdk.sagemakerMod.ProductionVariantInstanceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.None_
    - typings.awsSdk.awsSdkStrings.RecordIO
    - java.lang.String
  */
  type RecordWrapper = typings.awsSdk.sagemakerMod._RecordWrapper | java.lang.String
  type RenderingErrorList = js.Array[typings.awsSdk.sagemakerMod.RenderingError]
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePropertyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TrainingJob
    - typings.awsSdk.awsSdkStrings.Experiment
    - typings.awsSdk.awsSdkStrings.ExperimentTrial
    - typings.awsSdk.awsSdkStrings.ExperimentTrialComponent
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.sagemakerMod._ResourceType | java.lang.String
  type ResponseMIMEType = java.lang.String
  type ResponseMIMETypes = js.Array[typings.awsSdk.sagemakerMod.ResponseMIMEType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Retain_
    - typings.awsSdk.awsSdkStrings.Delete_
    - java.lang.String
  */
  type RetentionType = typings.awsSdk.sagemakerMod._RetentionType | java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Enabled_
    - typings.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type RootAccess = typings.awsSdk.sagemakerMod._RootAccess | java.lang.String
  type RuleConfigurationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.NoIssuesFound
    - typings.awsSdk.awsSdkStrings.IssuesFound
    - typings.awsSdk.awsSdkStrings.Error_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type RuleEvaluationStatus = typings.awsSdk.sagemakerMod._RuleEvaluationStatus | java.lang.String
  type RuleParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.ConfigValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FullyReplicated
    - typings.awsSdk.awsSdkStrings.ShardedByS3Key
    - java.lang.String
  */
  type S3DataDistribution = typings.awsSdk.sagemakerMod._S3DataDistribution | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ManifestFile
    - typings.awsSdk.awsSdkStrings.S3Prefix
    - typings.awsSdk.awsSdkStrings.AugmentedManifestFile
    - java.lang.String
  */
  type S3DataType = typings.awsSdk.sagemakerMod._S3DataType | java.lang.String
  type S3Uri = java.lang.String
  type SageMakerImageArn = java.lang.String
  type SamplingPercentage = scala.Double
  type ScheduleExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Scheduled_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type ScheduleStatus = typings.awsSdk.sagemakerMod._ScheduleStatus | java.lang.String
  type SearchExpressionList = js.Array[typings.awsSdk.sagemakerMod.SearchExpression]
  type SearchResultsList = js.Array[typings.awsSdk.sagemakerMod.SearchRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ascending_
    - typings.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SearchSortOrder = typings.awsSdk.sagemakerMod._SearchSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Starting_
    - typings.awsSdk.awsSdkStrings.LaunchingMLInstances
    - typings.awsSdk.awsSdkStrings.PreparingTrainingStack
    - typings.awsSdk.awsSdkStrings.Downloading_
    - typings.awsSdk.awsSdkStrings.DownloadingTrainingImage
    - typings.awsSdk.awsSdkStrings.Training_
    - typings.awsSdk.awsSdkStrings.Uploading_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - typings.awsSdk.awsSdkStrings.MaxRuntimeExceeded
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Interrupted_
    - typings.awsSdk.awsSdkStrings.MaxWaitTimeExceeded
    - java.lang.String
  */
  type SecondaryStatus = typings.awsSdk.sagemakerMod._SecondaryStatus | java.lang.String
  type SecondaryStatusTransitions = js.Array[typings.awsSdk.sagemakerMod.SecondaryStatusTransition]
  type SecretArn = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typings.awsSdk.sagemakerMod.SecurityGroupId]
  type Seed = scala.Double
  type SessionExpirationDurationInSeconds = scala.Double
  type SingleSignOnUserIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.Status_
    - java.lang.String
  */
  type SortBy = typings.awsSdk.sagemakerMod._SortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortExperimentsBy = typings.awsSdk.sagemakerMod._SortExperimentsBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Ascending_
    - typings.awsSdk.awsSdkStrings.Descending_
    - java.lang.String
  */
  type SortOrder = typings.awsSdk.sagemakerMod._SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortTrialComponentsBy = typings.awsSdk.sagemakerMod._SortTrialComponentsBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - java.lang.String
  */
  type SortTrialsBy = typings.awsSdk.sagemakerMod._SortTrialsBy | java.lang.String
  type SourceAlgorithmList = js.Array[typings.awsSdk.sagemakerMod.SourceAlgorithm]
  type SourceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.None_
    - typings.awsSdk.awsSdkStrings.Line_
    - typings.awsSdk.awsSdkStrings.RecordIO
    - typings.awsSdk.awsSdkStrings.TFRecord
    - java.lang.String
  */
  type SplitType = typings.awsSdk.sagemakerMod._SplitType | java.lang.String
  type StatusDetails = java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type String1024 = java.lang.String
  type String200 = java.lang.String
  type String256 = java.lang.String
  type StringParameterValue = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[typings.awsSdk.sagemakerMod.SubnetId]
  type SubscribedWorkteams = js.Array[typings.awsSdk.sagemakerMod.SubscribedWorkteam]
  type Success = scala.Boolean
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.sagemakerMod.TagKey]
  type TagList = js.Array[typings.awsSdk.sagemakerMod.Tag]
  type TagValue = java.lang.String
  type TargetAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.lambda__
    - typings.awsSdk.awsSdkStrings.ml_m4
    - typings.awsSdk.awsSdkStrings.ml_m5
    - typings.awsSdk.awsSdkStrings.ml_c4
    - typings.awsSdk.awsSdkStrings.ml_c5
    - typings.awsSdk.awsSdkStrings.ml_p2
    - typings.awsSdk.awsSdkStrings.ml_p3
    - typings.awsSdk.awsSdkStrings.ml_inf1
    - typings.awsSdk.awsSdkStrings.jetson_tx1
    - typings.awsSdk.awsSdkStrings.jetson_tx2
    - typings.awsSdk.awsSdkStrings.jetson_nano
    - typings.awsSdk.awsSdkStrings.jetson_xavier
    - typings.awsSdk.awsSdkStrings.rasp3b
    - typings.awsSdk.awsSdkStrings.imx8qm
    - typings.awsSdk.awsSdkStrings.deeplens
    - typings.awsSdk.awsSdkStrings.rk3399
    - typings.awsSdk.awsSdkStrings.rk3288
    - typings.awsSdk.awsSdkStrings.aisage
    - typings.awsSdk.awsSdkStrings.sbe_c
    - typings.awsSdk.awsSdkStrings.qcs605
    - typings.awsSdk.awsSdkStrings.qcs603
    - typings.awsSdk.awsSdkStrings.sitara_am57x
    - typings.awsSdk.awsSdkStrings.amba_cv22
    - java.lang.String
  */
  type TargetDevice = typings.awsSdk.sagemakerMod._TargetDevice | java.lang.String
  type TargetObjectiveMetricValue = scala.Double
  type TaskAvailabilityLifetimeInSeconds = scala.Double
  type TaskCount = scala.Double
  type TaskDescription = java.lang.String
  type TaskInput = java.lang.String
  type TaskKeyword = java.lang.String
  type TaskKeywords = js.Array[typings.awsSdk.sagemakerMod.TaskKeyword]
  type TaskTimeLimitInSeconds = scala.Double
  type TaskTitle = java.lang.String
  type TemplateContent = java.lang.String
  type TemplateContentSha256 = java.lang.String
  type TemplateUrl = java.lang.String
  type TenthFractionsOfACent = scala.Double
  type Timestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pipe
    - typings.awsSdk.awsSdkStrings.File_
    - java.lang.String
  */
  type TrainingInputMode = typings.awsSdk.sagemakerMod._TrainingInputMode | java.lang.String
  type TrainingInstanceCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotg4dnDot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3dnDot24xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5nDotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5nDot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5nDot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5nDot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5nDot18xlarge
    - java.lang.String
  */
  type TrainingInstanceType = typings.awsSdk.sagemakerMod._TrainingInstanceType | java.lang.String
  type TrainingInstanceTypes = js.Array[typings.awsSdk.sagemakerMod.TrainingInstanceType]
  type TrainingJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Off_
    - typings.awsSdk.awsSdkStrings.Auto_
    - java.lang.String
  */
  type TrainingJobEarlyStoppingType = typings.awsSdk.sagemakerMod._TrainingJobEarlyStoppingType | java.lang.String
  type TrainingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.Status_
    - typings.awsSdk.awsSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type TrainingJobSortByOptions = typings.awsSdk.sagemakerMod._TrainingJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type TrainingJobStatus = typings.awsSdk.sagemakerMod._TrainingJobStatus | java.lang.String
  type TrainingJobStatusCounter = scala.Double
  type TrainingJobSummaries = js.Array[typings.awsSdk.sagemakerMod.TrainingJobSummary]
  type TrainingTimeInSeconds = scala.Double
  type TransformEnvironmentKey = java.lang.String
  type TransformEnvironmentMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.TransformEnvironmentValue]
  type TransformEnvironmentValue = java.lang.String
  type TransformInstanceCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.mlDotm4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot10xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm4Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc4Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp2Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot8xlarge
    - typings.awsSdk.awsSdkStrings.mlDotp3Dot16xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot9xlarge
    - typings.awsSdk.awsSdkStrings.mlDotc5Dot18xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dotxlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot2xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot4xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot12xlarge
    - typings.awsSdk.awsSdkStrings.mlDotm5Dot24xlarge
    - java.lang.String
  */
  type TransformInstanceType = typings.awsSdk.sagemakerMod._TransformInstanceType | java.lang.String
  type TransformInstanceTypes = js.Array[typings.awsSdk.sagemakerMod.TransformInstanceType]
  type TransformJobArn = java.lang.String
  type TransformJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type TransformJobStatus = typings.awsSdk.sagemakerMod._TransformJobStatus | java.lang.String
  type TransformJobSummaries = js.Array[typings.awsSdk.sagemakerMod.TransformJobSummary]
  type TrialArn = java.lang.String
  type TrialComponentArn = java.lang.String
  type TrialComponentArtifactValue = java.lang.String
  type TrialComponentArtifacts = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.TrialComponentArtifact]
  type TrialComponentKey256 = java.lang.String
  type TrialComponentKey64 = java.lang.String
  type TrialComponentMetricSummaries = js.Array[typings.awsSdk.sagemakerMod.TrialComponentMetricSummary]
  type TrialComponentParameters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sagemakerMod.TrialComponentParameterValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Stopping_
    - typings.awsSdk.awsSdkStrings.Stopped_
    - java.lang.String
  */
  type TrialComponentPrimaryStatus = typings.awsSdk.sagemakerMod._TrialComponentPrimaryStatus | java.lang.String
  type TrialComponentSimpleSummaries = js.Array[typings.awsSdk.sagemakerMod.TrialComponentSimpleSummary]
  type TrialComponentSourceArn = java.lang.String
  type TrialComponentStatusMessage = java.lang.String
  type TrialComponentSummaries = js.Array[typings.awsSdk.sagemakerMod.TrialComponentSummary]
  type TrialSourceArn = java.lang.String
  type TrialSummaries = js.Array[typings.awsSdk.sagemakerMod.TrialSummary]
  type Url = java.lang.String
  type UserProfileArn = java.lang.String
  type UserProfileList = js.Array[typings.awsSdk.sagemakerMod.UserProfileDetails]
  type UserProfileName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CreationTime
    - typings.awsSdk.awsSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type UserProfileSortKey = typings.awsSdk.sagemakerMod._UserProfileSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Deleting_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.InService
    - typings.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type UserProfileStatus = typings.awsSdk.sagemakerMod._UserProfileStatus | java.lang.String
  type VariantName = java.lang.String
  type VariantPropertyList = js.Array[typings.awsSdk.sagemakerMod.VariantProperty]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DesiredInstanceCount
    - typings.awsSdk.awsSdkStrings.DesiredWeight
    - typings.awsSdk.awsSdkStrings.DataCaptureConfig
    - java.lang.String
  */
  type VariantPropertyType = typings.awsSdk.sagemakerMod._VariantPropertyType | java.lang.String
  type VariantWeight = scala.Double
  type VolumeSizeInGB = scala.Double
  type VpcId = java.lang.String
  type VpcSecurityGroupIds = js.Array[typings.awsSdk.sagemakerMod.SecurityGroupId]
  type WorkforceArn = java.lang.String
  type WorkforceName = java.lang.String
  type WorkteamArn = java.lang.String
  type WorkteamName = java.lang.String
  type Workteams = js.Array[typings.awsSdk.sagemakerMod.Workteam]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-07-24`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.sagemakerMod._apiVersion | java.lang.String
}
