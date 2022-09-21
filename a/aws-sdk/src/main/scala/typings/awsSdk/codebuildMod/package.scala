package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EFS
import typings.awsSdk.awsSdkStrings.OAUTH
import typings.awsSdk.awsSdkStrings.SECRETS_MANAGER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.BUILD_ID
  - java.lang.String
*/
type ArtifactNamespace = _ArtifactNamespace | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.ZIP
  - java.lang.String
*/
type ArtifactPackaging = _ArtifactPackaging | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CODEPIPELINE
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.NO_ARTIFACTS
  - java.lang.String
*/
type ArtifactsType = _ArtifactsType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OAUTH
  - typings.awsSdk.awsSdkStrings.BASIC_AUTH
  - typings.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN
  - java.lang.String
*/
type AuthType = _AuthType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REPORT_INDIVIDUAL_BUILDS
  - typings.awsSdk.awsSdkStrings.REPORT_AGGREGATED_BATCH
  - java.lang.String
*/
type BatchReportModeType = _BatchReportModeType | java.lang.String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.READ_ONLY
  - typings.awsSdk.awsSdkStrings.FULL
  - java.lang.String
*/
type BucketOwnerAccess = _BucketOwnerAccess | java.lang.String

type BuildArtifactsList = js.Array[BuildArtifacts]

type BuildBatchIds = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.DOWNLOAD_BATCHSPEC
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMBINE_ARTIFACTS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type BuildBatchPhaseType = _BuildBatchPhaseType | java.lang.String

type BuildBatchPhases = js.Array[BuildBatchPhase]

type BuildBatches = js.Array[BuildBatch]

type BuildGroups = js.Array[BuildGroup]

type BuildIds = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.DOWNLOAD_SOURCE
  - typings.awsSdk.awsSdkStrings.INSTALL
  - typings.awsSdk.awsSdkStrings.PRE_BUILD
  - typings.awsSdk.awsSdkStrings.BUILD
  - typings.awsSdk.awsSdkStrings.POST_BUILD
  - typings.awsSdk.awsSdkStrings.UPLOAD_ARTIFACTS
  - typings.awsSdk.awsSdkStrings.FINALIZING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type BuildPhaseType = _BuildPhaseType | java.lang.String

type BuildPhases = js.Array[BuildPhase]

type BuildReportArns = js.Array[String]

type BuildSummaries = js.Array[BuildSummary]

type Builds = js.Array[Build]

type BuildsNotDeleted = js.Array[BuildNotDeleted]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOCAL_DOCKER_LAYER_CACHE
  - typings.awsSdk.awsSdkStrings.LOCAL_SOURCE_CACHE
  - typings.awsSdk.awsSdkStrings.LOCAL_CUSTOM_CACHE
  - java.lang.String
*/
type CacheMode = _CacheMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_CACHE
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.LOCAL
  - java.lang.String
*/
type CacheType = _CacheType | java.lang.String

type CodeCoverages = js.Array[CodeCoverage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
  - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
  - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
  - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_2XLARGE
  - java.lang.String
*/
type ComputeType = _ComputeType | java.lang.String

type ComputeTypesAllowed = js.Array[NonEmptyString]

type CredentialProviderType = SECRETS_MANAGER | java.lang.String

type EnvironmentImages = js.Array[EnvironmentImage]

type EnvironmentLanguages = js.Array[EnvironmentLanguage]

type EnvironmentPlatforms = js.Array[EnvironmentPlatform]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WINDOWS_CONTAINER
  - typings.awsSdk.awsSdkStrings.LINUX_CONTAINER
  - typings.awsSdk.awsSdkStrings.LINUX_GPU_CONTAINER
  - typings.awsSdk.awsSdkStrings.ARM_CONTAINER
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019_CONTAINER
  - java.lang.String
*/
type EnvironmentType = _EnvironmentType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PLAINTEXT
  - typings.awsSdk.awsSdkStrings.PARAMETER_STORE
  - typings.awsSdk.awsSdkStrings.SECRETS_MANAGER
  - java.lang.String
*/
type EnvironmentVariableType = _EnvironmentVariableType | java.lang.String

type EnvironmentVariables = js.Array[EnvironmentVariable]

type ExportedEnvironmentVariables = js.Array[ExportedEnvironmentVariable]

type FileSystemType = EFS | java.lang.String

type FilterGroup = js.Array[WebhookFilter]

type FilterGroups = js.Array[FilterGroup]

type GitCloneDepth = Double

type Identifiers = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CODEBUILD
  - typings.awsSdk.awsSdkStrings.SERVICE_ROLE
  - java.lang.String
*/
type ImagePullCredentialsType = _ImagePullCredentialsType | java.lang.String

type ImageVersions = js.Array[String]

type KeyInput = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JAVA
  - typings.awsSdk.awsSdkStrings.PYTHON
  - typings.awsSdk.awsSdkStrings.NODE_JS
  - typings.awsSdk.awsSdkStrings.RUBY
  - typings.awsSdk.awsSdkStrings.GOLANG
  - typings.awsSdk.awsSdkStrings.DOCKER
  - typings.awsSdk.awsSdkStrings.ANDROID
  - typings.awsSdk.awsSdkStrings.DOTNET
  - typings.awsSdk.awsSdkStrings.BASE
  - typings.awsSdk.awsSdkStrings.PHP
  - java.lang.String
*/
type LanguageType = _LanguageType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LogsConfigStatusType = _LogsConfigStatusType | java.lang.String

type NonEmptyString = java.lang.String

type NonNegativeInt = Double

type PageSize = Double

type Percentage = Double

type PhaseContexts = js.Array[PhaseContext]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEBIAN
  - typings.awsSdk.awsSdkStrings.AMAZON_LINUX
  - typings.awsSdk.awsSdkStrings.UBUNTU
  - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER
  - java.lang.String
*/
type PlatformType = _PlatformType | java.lang.String

type ProjectArns = js.Array[NonEmptyString]

type ProjectArtifactsList = js.Array[ProjectArtifacts]

type ProjectCacheModes = js.Array[CacheMode]

type ProjectDescription = java.lang.String

type ProjectFileSystemLocations = js.Array[ProjectFileSystemLocation]

type ProjectName = java.lang.String

type ProjectNames = js.Array[NonEmptyString]

type ProjectSecondarySourceVersions = js.Array[ProjectSourceVersion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.CREATED_TIME
  - typings.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - java.lang.String
*/
type ProjectSortByType = _ProjectSortByType | java.lang.String

type ProjectSources = js.Array[ProjectSource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC_READ
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type ProjectVisibilityType = _ProjectVisibilityType | java.lang.String

type Projects = js.Array[Project]

type ReportArns = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LINE_COVERAGE_PERCENTAGE
  - typings.awsSdk.awsSdkStrings.FILE_PATH
  - java.lang.String
*/
type ReportCodeCoverageSortByType = _ReportCodeCoverageSortByType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.NO_EXPORT
  - java.lang.String
*/
type ReportExportConfigType = _ReportExportConfigType | java.lang.String

type ReportGroupArns = js.Array[NonEmptyString]

type ReportGroupName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.CREATED_TIME
  - typings.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
  - java.lang.String
*/
type ReportGroupSortByType = _ReportGroupSortByType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ReportGroupStatusType = _ReportGroupStatusType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PASS_RATE
  - typings.awsSdk.awsSdkStrings.DURATION
  - typings.awsSdk.awsSdkStrings.TOTAL
  - typings.awsSdk.awsSdkStrings.LINE_COVERAGE
  - typings.awsSdk.awsSdkStrings.LINES_COVERED
  - typings.awsSdk.awsSdkStrings.LINES_MISSED
  - typings.awsSdk.awsSdkStrings.BRANCH_COVERAGE
  - typings.awsSdk.awsSdkStrings.BRANCHES_COVERED
  - typings.awsSdk.awsSdkStrings.BRANCHES_MISSED
  - java.lang.String
*/
type ReportGroupTrendFieldType = _ReportGroupTrendFieldType | java.lang.String

type ReportGroupTrendRawDataList = js.Array[ReportWithRawData]

type ReportGroups = js.Array[ReportGroup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ZIP
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ReportPackagingType = _ReportPackagingType | java.lang.String

type ReportStatusCounts = StringDictionary[WrapperInt]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GENERATING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.INCOMPLETE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ReportStatusType = _ReportStatusType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TEST
  - typings.awsSdk.awsSdkStrings.CODE_COVERAGE
  - java.lang.String
*/
type ReportType = _ReportType | java.lang.String

type Reports = js.Array[Report]

type ResolvedSecondaryArtifacts = js.Array[ResolvedArtifact]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RETRY_ALL_BUILDS
  - typings.awsSdk.awsSdkStrings.RETRY_FAILED_BUILDS
  - java.lang.String
*/
type RetryBuildBatchType = _RetryBuildBatchType | java.lang.String

type SecurityGroupIds = js.Array[NonEmptyString]

type SensitiveNonEmptyString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GITHUB
  - typings.awsSdk.awsSdkStrings.BITBUCKET
  - typings.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
  - java.lang.String
*/
type ServerType = _ServerType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARN
  - typings.awsSdk.awsSdkStrings.MODIFIED_TIME
  - java.lang.String
*/
type SharedResourceSortByType = _SharedResourceSortByType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrderType = _SortOrderType | java.lang.String

type SourceAuthType = OAUTH | java.lang.String

type SourceCredentialsInfos = js.Array[SourceCredentialsInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CODECOMMIT
  - typings.awsSdk.awsSdkStrings.CODEPIPELINE
  - typings.awsSdk.awsSdkStrings.GITHUB
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.BITBUCKET
  - typings.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
  - typings.awsSdk.awsSdkStrings.NO_SOURCE
  - java.lang.String
*/
type SourceType = _SourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.FAULT
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type StatusType = _StatusType | java.lang.String

type String = java.lang.String

type Subnets = js.Array[NonEmptyString]

type TagList = js.Array[Tag]

type TestCases = js.Array[TestCase]

type TimeOut = Double

type Timestamp = js.Date

type ValueInput = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BUILD
  - typings.awsSdk.awsSdkStrings.BUILD_BATCH
  - java.lang.String
*/
type WebhookBuildType = _WebhookBuildType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.BASE_REF
  - typings.awsSdk.awsSdkStrings.HEAD_REF
  - typings.awsSdk.awsSdkStrings.ACTOR_ACCOUNT_ID
  - typings.awsSdk.awsSdkStrings.FILE_PATH
  - typings.awsSdk.awsSdkStrings.COMMIT_MESSAGE
  - java.lang.String
*/
type WebhookFilterType = _WebhookFilterType | java.lang.String

type WrapperBoolean = scala.Boolean

type WrapperInt = Double

type WrapperLong = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-10-06`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
