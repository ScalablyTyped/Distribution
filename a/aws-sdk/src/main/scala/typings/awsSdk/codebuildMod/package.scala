package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codebuildMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.BUILD_ID
    - java.lang.String
  */
  type ArtifactNamespace = typings.awsSdk.codebuildMod._ArtifactNamespace | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.ZIP
    - java.lang.String
  */
  type ArtifactPackaging = typings.awsSdk.codebuildMod._ArtifactPackaging | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CODEPIPELINE
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.NO_ARTIFACTS
    - java.lang.String
  */
  type ArtifactsType = typings.awsSdk.codebuildMod._ArtifactsType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OAUTH
    - typings.awsSdk.awsSdkStrings.BASIC_AUTH
    - typings.awsSdk.awsSdkStrings.PERSONAL_ACCESS_TOKEN
    - java.lang.String
  */
  type AuthType = typings.awsSdk.codebuildMod._AuthType | java.lang.String
  type Boolean = scala.Boolean
  type BuildArtifactsList = js.Array[typings.awsSdk.codebuildMod.BuildArtifacts]
  type BuildIds = js.Array[typings.awsSdk.codebuildMod.NonEmptyString]
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
  type BuildPhaseType = typings.awsSdk.codebuildMod._BuildPhaseType | java.lang.String
  type BuildPhases = js.Array[typings.awsSdk.codebuildMod.BuildPhase]
  type BuildReportArns = js.Array[typings.awsSdk.codebuildMod.String]
  type Builds = js.Array[typings.awsSdk.codebuildMod.Build]
  type BuildsNotDeleted = js.Array[typings.awsSdk.codebuildMod.BuildNotDeleted]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LOCAL_DOCKER_LAYER_CACHE
    - typings.awsSdk.awsSdkStrings.LOCAL_SOURCE_CACHE
    - typings.awsSdk.awsSdkStrings.LOCAL_CUSTOM_CACHE
    - java.lang.String
  */
  type CacheMode = typings.awsSdk.codebuildMod._CacheMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NO_CACHE
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.LOCAL
    - java.lang.String
  */
  type CacheType = typings.awsSdk.codebuildMod._CacheType | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codebuildMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
    - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
    - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
    - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_2XLARGE
    - java.lang.String
  */
  type ComputeType = typings.awsSdk.codebuildMod._ComputeType | java.lang.String
  type CredentialProviderType = typings.awsSdk.awsSdkStrings.SECRETS_MANAGER | java.lang.String
  type EnvironmentImages = js.Array[typings.awsSdk.codebuildMod.EnvironmentImage]
  type EnvironmentLanguages = js.Array[typings.awsSdk.codebuildMod.EnvironmentLanguage]
  type EnvironmentPlatforms = js.Array[typings.awsSdk.codebuildMod.EnvironmentPlatform]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WINDOWS_CONTAINER
    - typings.awsSdk.awsSdkStrings.LINUX_CONTAINER
    - typings.awsSdk.awsSdkStrings.LINUX_GPU_CONTAINER
    - typings.awsSdk.awsSdkStrings.ARM_CONTAINER
    - java.lang.String
  */
  type EnvironmentType = typings.awsSdk.codebuildMod._EnvironmentType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PLAINTEXT
    - typings.awsSdk.awsSdkStrings.PARAMETER_STORE
    - typings.awsSdk.awsSdkStrings.SECRETS_MANAGER
    - java.lang.String
  */
  type EnvironmentVariableType = typings.awsSdk.codebuildMod._EnvironmentVariableType | java.lang.String
  type EnvironmentVariables = js.Array[typings.awsSdk.codebuildMod.EnvironmentVariable]
  type ExportedEnvironmentVariables = js.Array[typings.awsSdk.codebuildMod.ExportedEnvironmentVariable]
  type FileSystemType = typings.awsSdk.awsSdkStrings.EFS | java.lang.String
  type FilterGroup = js.Array[typings.awsSdk.codebuildMod.WebhookFilter]
  type FilterGroups = js.Array[typings.awsSdk.codebuildMod.FilterGroup]
  type GitCloneDepth = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CODEBUILD
    - typings.awsSdk.awsSdkStrings.SERVICE_ROLE
    - java.lang.String
  */
  type ImagePullCredentialsType = typings.awsSdk.codebuildMod._ImagePullCredentialsType | java.lang.String
  type ImageVersions = js.Array[typings.awsSdk.codebuildMod.String]
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
  type LanguageType = typings.awsSdk.codebuildMod._LanguageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type LogsConfigStatusType = typings.awsSdk.codebuildMod._LogsConfigStatusType | java.lang.String
  type NonEmptyString = java.lang.String
  type PageSize = scala.Double
  type PhaseContexts = js.Array[typings.awsSdk.codebuildMod.PhaseContext]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEBIAN
    - typings.awsSdk.awsSdkStrings.AMAZON_LINUX
    - typings.awsSdk.awsSdkStrings.UBUNTU
    - typings.awsSdk.awsSdkStrings.WINDOWS_SERVER
    - java.lang.String
  */
  type PlatformType = typings.awsSdk.codebuildMod._PlatformType | java.lang.String
  type ProjectArns = js.Array[typings.awsSdk.codebuildMod.NonEmptyString]
  type ProjectArtifactsList = js.Array[typings.awsSdk.codebuildMod.ProjectArtifacts]
  type ProjectCacheModes = js.Array[typings.awsSdk.codebuildMod.CacheMode]
  type ProjectDescription = java.lang.String
  type ProjectFileSystemLocations = js.Array[typings.awsSdk.codebuildMod.ProjectFileSystemLocation]
  type ProjectName = java.lang.String
  type ProjectNames = js.Array[typings.awsSdk.codebuildMod.NonEmptyString]
  type ProjectSecondarySourceVersions = js.Array[typings.awsSdk.codebuildMod.ProjectSourceVersion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.CREATED_TIME
    - typings.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ProjectSortByType = typings.awsSdk.codebuildMod._ProjectSortByType | java.lang.String
  type ProjectSources = js.Array[typings.awsSdk.codebuildMod.ProjectSource]
  type Projects = js.Array[typings.awsSdk.codebuildMod.Project]
  type ReportArns = js.Array[typings.awsSdk.codebuildMod.NonEmptyString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.NO_EXPORT
    - java.lang.String
  */
  type ReportExportConfigType = typings.awsSdk.codebuildMod._ReportExportConfigType | java.lang.String
  type ReportGroupArns = js.Array[typings.awsSdk.codebuildMod.NonEmptyString]
  type ReportGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.CREATED_TIME
    - typings.awsSdk.awsSdkStrings.LAST_MODIFIED_TIME
    - java.lang.String
  */
  type ReportGroupSortByType = typings.awsSdk.codebuildMod._ReportGroupSortByType | java.lang.String
  type ReportGroups = js.Array[typings.awsSdk.codebuildMod.ReportGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ZIP
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReportPackagingType = typings.awsSdk.codebuildMod._ReportPackagingType | java.lang.String
  type ReportStatusCounts = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codebuildMod.WrapperInt]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GENERATING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.INCOMPLETE
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ReportStatusType = typings.awsSdk.codebuildMod._ReportStatusType | java.lang.String
  type ReportType = typings.awsSdk.awsSdkStrings.TEST | java.lang.String
  type Reports = js.Array[typings.awsSdk.codebuildMod.Report]
  type SecurityGroupIds = js.Array[typings.awsSdk.codebuildMod.NonEmptyString]
  type SensitiveNonEmptyString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GITHUB
    - typings.awsSdk.awsSdkStrings.BITBUCKET
    - typings.awsSdk.awsSdkStrings.GITHUB_ENTERPRISE
    - java.lang.String
  */
  type ServerType = typings.awsSdk.codebuildMod._ServerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ARN
    - typings.awsSdk.awsSdkStrings.MODIFIED_TIME
    - java.lang.String
  */
  type SharedResourceSortByType = typings.awsSdk.codebuildMod._SharedResourceSortByType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASCENDING
    - typings.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrderType = typings.awsSdk.codebuildMod._SortOrderType | java.lang.String
  type SourceAuthType = typings.awsSdk.awsSdkStrings.OAUTH | java.lang.String
  type SourceCredentialsInfos = js.Array[typings.awsSdk.codebuildMod.SourceCredentialsInfo]
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
  type SourceType = typings.awsSdk.codebuildMod._SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.FAULT
    - typings.awsSdk.awsSdkStrings.TIMED_OUT
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type StatusType = typings.awsSdk.codebuildMod._StatusType | java.lang.String
  type String = java.lang.String
  type Subnets = js.Array[typings.awsSdk.codebuildMod.NonEmptyString]
  type TagList = js.Array[typings.awsSdk.codebuildMod.Tag]
  type TestCases = js.Array[typings.awsSdk.codebuildMod.TestCase]
  type TimeOut = scala.Double
  type Timestamp = typings.std.Date
  type ValueInput = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EVENT
    - typings.awsSdk.awsSdkStrings.BASE_REF
    - typings.awsSdk.awsSdkStrings.HEAD_REF
    - typings.awsSdk.awsSdkStrings.ACTOR_ACCOUNT_ID
    - typings.awsSdk.awsSdkStrings.FILE_PATH
    - typings.awsSdk.awsSdkStrings.COMMIT_MESSAGE
    - java.lang.String
  */
  type WebhookFilterType = typings.awsSdk.codebuildMod._WebhookFilterType | java.lang.String
  type WrapperBoolean = scala.Boolean
  type WrapperInt = scala.Double
  type WrapperLong = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-10-06`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codebuildMod._apiVersion | java.lang.String
}
