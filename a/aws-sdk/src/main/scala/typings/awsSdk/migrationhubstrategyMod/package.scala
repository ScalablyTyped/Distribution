package typings.awsSdk.migrationhubstrategyMod

import typings.awsSdk.awsSdkStrings.ExternalId
import typings.awsSdk.awsSdkStrings.`None specified`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - java.lang.String
*/
type AntipatternReportStatus = _AntipatternReportStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DotNetFramework
  - typings.awsSdk.awsSdkStrings.Java_
  - typings.awsSdk.awsSdkStrings.SQLServer_
  - typings.awsSdk.awsSdkStrings.IIS
  - typings.awsSdk.awsSdkStrings.Oracle_
  - typings.awsSdk.awsSdkStrings.Other_
  - java.lang.String
*/
type AppType = _AppType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_DEFINED
  - typings.awsSdk.awsSdkStrings.APP_NAME
  - typings.awsSdk.awsSdkStrings.SERVER_ID
  - typings.awsSdk.awsSdkStrings.APP_TYPE
  - typings.awsSdk.awsSdkStrings.STRATEGY
  - typings.awsSdk.awsSdkStrings.DESTINATION
  - java.lang.String
*/
type ApplicationComponentCriteria = _ApplicationComponentCriteria | java.lang.String

type ApplicationComponentDetails = js.Array[ApplicationComponentDetail]

type ApplicationComponentId = java.lang.String

type ApplicationComponentStrategies = js.Array[ApplicationComponentStrategy]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETE
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type AssessmentStatus = _AssessmentStatus | java.lang.String

type AssociatedApplications = js.Array[AssociatedApplication]

type AssociatedServerIDs = js.Array[String]

type AsyncTaskId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`None specified`
  - typings.awsSdk.awsSdkStrings.`AWS Elastic BeanStalk`
  - typings.awsSdk.awsSdkStrings.`AWS Fargate`
  - java.lang.String
*/
type AwsManagedTargetDestination = _AwsManagedTargetDestination | java.lang.String

type AwsManagedTargetDestinations = js.Array[AwsManagedTargetDestination]

type Boolean = scala.Boolean

type BusinessGoalsInteger = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COLLECTOR_HEALTHY
  - typings.awsSdk.awsSdkStrings.COLLECTOR_UNHEALTHY
  - java.lang.String
*/
type CollectorHealth = _CollectorHealth | java.lang.String

type Collectors = js.Array[Collector]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ApplicationDiscoveryService
  - typings.awsSdk.awsSdkStrings.MPA
  - java.lang.String
*/
type DataSourceType = _DataSourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`AWS-managed`
  - typings.awsSdk.awsSdkStrings.`Self-manage`
  - typings.awsSdk.awsSdkStrings.`No preference`
  - java.lang.String
*/
type DatabaseManagementPreference = _DatabaseManagementPreference | java.lang.String

type GroupIds = js.Array[Group]

type GroupName = ExternalId | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`None specified`
  - typings.awsSdk.awsSdkStrings.`Amazon Aurora`
  - typings.awsSdk.awsSdkStrings.`AWS PostgreSQL`
  - typings.awsSdk.awsSdkStrings.MySQL_
  - typings.awsSdk.awsSdkStrings.`Microsoft SQL Server`
  - typings.awsSdk.awsSdkStrings.`Oracle Database`
  - typings.awsSdk.awsSdkStrings.MariaDB_
  - typings.awsSdk.awsSdkStrings.SAP
  - typings.awsSdk.awsSdkStrings.`Db2 LUW`
  - typings.awsSdk.awsSdkStrings.MongoDB_
  - java.lang.String
*/
type HeterogeneousTargetDatabaseEngine = _HeterogeneousTargetDatabaseEngine | java.lang.String

type HeterogeneousTargetDatabaseEngines = js.Array[HeterogeneousTargetDatabaseEngine]

type HomogeneousTargetDatabaseEngine = (`None specified`) | java.lang.String

type HomogeneousTargetDatabaseEngines = js.Array[HomogeneousTargetDatabaseEngine]

type IPAddress = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ImportInProgress
  - typings.awsSdk.awsSdkStrings.ImportFailed
  - typings.awsSdk.awsSdkStrings.ImportPartialSuccess
  - typings.awsSdk.awsSdkStrings.ImportSuccess
  - typings.awsSdk.awsSdkStrings.DeleteInProgress
  - typings.awsSdk.awsSdkStrings.DeleteFailed
  - typings.awsSdk.awsSdkStrings.DeletePartialSuccess
  - typings.awsSdk.awsSdkStrings.DeleteSuccess
  - java.lang.String
*/
type ImportFileTaskStatus = _ImportFileTaskStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.excludeFromAssessment
  - typings.awsSdk.awsSdkStrings.includeInAssessment
  - java.lang.String
*/
type InclusionStatus = _InclusionStatus | java.lang.String

type Integer = Double

type InterfaceName = java.lang.String

type ListAntipatternSeveritySummary = js.Array[AntipatternSeveritySummary]

type ListApplicationComponentSummary = js.Array[ApplicationComponentSummary]

type ListApplicationComponentsRequestFilterValueString = java.lang.String

type ListImportFileTaskInformation = js.Array[ImportFileTaskInformation]

type ListServerSummary = js.Array[ServerSummary]

type ListStrategySummary = js.Array[StrategySummary]

type Location = java.lang.String

type MacAddress = java.lang.String

type MaxResult = Double

type NetMask = java.lang.String

type NetworkInfoList = js.Array[NetworkInfo]

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`None specified`
  - typings.awsSdk.awsSdkStrings.`AWS Elastic BeanStalk`
  - typings.awsSdk.awsSdkStrings.`AWS Fargate`
  - java.lang.String
*/
type NoPreferenceTargetDestination = _NoPreferenceTargetDestination | java.lang.String

type NoPreferenceTargetDestinations = js.Array[NoPreferenceTargetDestination]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINUX
  - typings.awsSdk.awsSdkStrings.WINDOWS
  - java.lang.String
*/
type OSType = _OSType | java.lang.String

type OSVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Excel_
  - typings.awsSdk.awsSdkStrings.Json_
  - java.lang.String
*/
type OutputFormat = _OutputFormat | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - java.lang.String
*/
type RecommendationReportStatus = _RecommendationReportStatus | java.lang.String

type RecommendationReportStatusMessage = java.lang.String

type RecommendationReportTimeStamp = js.Date

type RecommendationTaskId = java.lang.String

type ResourceId = java.lang.String

type ResourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Database_
  - typings.awsSdk.awsSdkStrings.Process_
  - typings.awsSdk.awsSdkStrings.DatabaseProcess
  - java.lang.String
*/
type ResourceSubType = _ResourceSubType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.dataCollectionTaskToBeScheduled
  - typings.awsSdk.awsSdkStrings.dataCollectionTaskScheduled
  - typings.awsSdk.awsSdkStrings.dataCollectionTaskStarted
  - typings.awsSdk.awsSdkStrings.dataCollectionTaskStopped
  - typings.awsSdk.awsSdkStrings.dataCollectionTaskSuccess
  - typings.awsSdk.awsSdkStrings.dataCollectionTaskFailed
  - typings.awsSdk.awsSdkStrings.dataCollectionTaskPartialSuccess
  - java.lang.String
*/
type RunTimeAssessmentStatus = _RunTimeAssessmentStatus | java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type S3Keys = js.Array[String]

type SecretsManagerKey = java.lang.String

type SelfManageTargetDestination = (`None specified`) | java.lang.String

type SelfManageTargetDestinations = js.Array[SelfManageTargetDestination]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_DEFINED
  - typings.awsSdk.awsSdkStrings.OS_NAME
  - typings.awsSdk.awsSdkStrings.STRATEGY
  - typings.awsSdk.awsSdkStrings.DESTINATION
  - typings.awsSdk.awsSdkStrings.SERVER_ID
  - java.lang.String
*/
type ServerCriteria = _ServerCriteria | java.lang.String

type ServerDetails = js.Array[ServerDetail]

type ServerId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WindowsServer
  - typings.awsSdk.awsSdkStrings.AmazonLinux
  - typings.awsSdk.awsSdkStrings.EndOfSupportWindowsServer
  - typings.awsSdk.awsSdkStrings.Redhat
  - typings.awsSdk.awsSdkStrings.Other_
  - java.lang.String
*/
type ServerOsType = _ServerOsType | java.lang.String

type ServerStrategies = js.Array[ServerStrategy]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.LOW
  - java.lang.String
*/
type Severity = _Severity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type SourceCodeList = js.Array[SourceCode]

type SourceCodeRepositories = js.Array[SourceCodeRepository]

type SourceVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ANALYSIS_TO_BE_SCHEDULED
  - typings.awsSdk.awsSdkStrings.ANALYSIS_STARTED
  - typings.awsSdk.awsSdkStrings.ANALYSIS_SUCCESS
  - typings.awsSdk.awsSdkStrings.ANALYSIS_FAILED
  - java.lang.String
*/
type SrcCodeOrDbAnalysisStatus = _SrcCodeOrDbAnalysisStatus | java.lang.String

type StartAssessmentRequestS3bucketForAnalysisDataString = java.lang.String

type StartAssessmentRequestS3bucketForReportDataString = java.lang.String

type StartImportFileTaskRequestNameString = java.lang.String

type StartImportFileTaskRequestS3bucketForReportDataString = java.lang.String

type StatusMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Rehost
  - typings.awsSdk.awsSdkStrings.Retirement
  - typings.awsSdk.awsSdkStrings.Refactor
  - typings.awsSdk.awsSdkStrings.Replatform
  - typings.awsSdk.awsSdkStrings.Retain_
  - typings.awsSdk.awsSdkStrings.Relocate
  - typings.awsSdk.awsSdkStrings.Repurchase
  - java.lang.String
*/
type Strategy = _Strategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.recommended
  - typings.awsSdk.awsSdkStrings.viableOption
  - typings.awsSdk.awsSdkStrings.notRecommended
  - java.lang.String
*/
type StrategyRecommendation = _StrategyRecommendation | java.lang.String

type String = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`None specified`
  - typings.awsSdk.awsSdkStrings.`Amazon Aurora`
  - typings.awsSdk.awsSdkStrings.`AWS PostgreSQL`
  - typings.awsSdk.awsSdkStrings.MySQL_
  - typings.awsSdk.awsSdkStrings.`Microsoft SQL Server`
  - typings.awsSdk.awsSdkStrings.`Oracle Database`
  - typings.awsSdk.awsSdkStrings.MariaDB_
  - typings.awsSdk.awsSdkStrings.SAP
  - typings.awsSdk.awsSdkStrings.`Db2 LUW`
  - typings.awsSdk.awsSdkStrings.MongoDB_
  - java.lang.String
*/
type TargetDatabaseEngine = _TargetDatabaseEngine | java.lang.String

type TargetDatabaseEngines = js.Array[TargetDatabaseEngine]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`None specified`
  - typings.awsSdk.awsSdkStrings.`AWS Elastic BeanStalk`
  - typings.awsSdk.awsSdkStrings.`AWS Fargate`
  - java.lang.String
  - typings.awsSdk.awsSdkStrings.`Aurora MySQL`
  - typings.awsSdk.awsSdkStrings.`Aurora PostgreSQL`
  - typings.awsSdk.awsSdkStrings.`Amazon Relational Database Service on MySQL`
  - typings.awsSdk.awsSdkStrings.`Amazon Relational Database Service on PostgreSQL`
  - typings.awsSdk.awsSdkStrings.`Amazon DocumentDB`
  - typings.awsSdk.awsSdkStrings.`Amazon DynamoDB`
  - typings.awsSdk.awsSdkStrings.`Amazon Relational Database Service`
*/
type TargetDestination = _TargetDestination | java.lang.String

type TimeStamp = js.Date

type TranformationToolDescription = java.lang.String

type TranformationToolInstallationLink = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.App2Container
  - typings.awsSdk.awsSdkStrings.`Porting Assistant For DotNET`
  - typings.awsSdk.awsSdkStrings.`End of Support Migration`
  - typings.awsSdk.awsSdkStrings.`Windows Web Application Migration Assistant`
  - typings.awsSdk.awsSdkStrings.`Application Migration Service`
  - typings.awsSdk.awsSdkStrings.`Strategy Recommendation Support`
  - typings.awsSdk.awsSdkStrings.`In Place Operating System Upgrade`
  - typings.awsSdk.awsSdkStrings.`Schema Conversion Tool`
  - typings.awsSdk.awsSdkStrings.`Database Migration Service`
  - typings.awsSdk.awsSdkStrings.`Native SQL Server BackupSlashRestore`
  - java.lang.String
*/
type TransformationToolName = _TransformationToolName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GITHUB
  - typings.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
  - java.lang.String
*/
type VersionControl = _VersionControl | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-02-19`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type importS3Bucket = java.lang.String

type importS3Key = java.lang.String
