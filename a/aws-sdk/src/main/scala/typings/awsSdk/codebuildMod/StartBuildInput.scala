package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartBuildInput extends StObject {
  
  /**
    * Build output artifact settings that override, for this build only, the latest ones already defined in the build project.
    */
  var artifactsOverride: js.UndefOr[ProjectArtifacts] = js.native
  
  /**
    * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
    */
  var buildStatusConfigOverride: js.UndefOr[BuildStatusConfig] = js.native
  
  /**
    * A buildspec file declaration that overrides, for this build only, the latest one already defined in the build project.  If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file relative to the value of the built-in CODEBUILD_SRC_DIR environment variable, or the path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN (for example, arn:aws:s3:::my-codebuild-sample2/buildspec.yml). If this value is not provided or is set to an empty string, the source code must contain a buildspec file in its root directory. For more information, see Buildspec File Name and Storage Location. 
    */
  var buildspecOverride: js.UndefOr[String] = js.native
  
  /**
    * A ProjectCache object specified for this build that overrides the one defined in the build project.
    */
  var cacheOverride: js.UndefOr[ProjectCache] = js.native
  
  /**
    * The name of a certificate for this build that overrides the one specified in the build project.
    */
  var certificateOverride: js.UndefOr[String] = js.native
  
  /**
    * The name of a compute type for this build that overrides the one specified in the build project.
    */
  var computeTypeOverride: js.UndefOr[ComputeType] = js.native
  
  /**
    * Specifies if session debugging is enabled for this build. For more information, see Viewing a running build in Session Manager.
    */
  var debugSessionEnabled: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the build project. The CMK key encrypts the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKeyOverride: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A container type for this build that overrides the one specified in the build project.
    */
  var environmentTypeOverride: js.UndefOr[EnvironmentType] = js.native
  
  /**
    * A set of environment variables that overrides, for this build only, the latest ones already defined in the build project.
    */
  var environmentVariablesOverride: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous depth of history defined in the build project.
    */
  var gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.native
  
  /**
    *  Information about the Git submodules configuration for this build of an AWS CodeBuild build project. 
    */
  var gitSubmodulesConfigOverride: js.UndefOr[GitSubmodulesConfig] = js.native
  
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is included in the StartBuild request and is valid for 5 minutes. If you repeat the StartBuild request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error. 
    */
  var idempotencyToken: js.UndefOr[String] = js.native
  
  /**
    * The name of an image for this build that overrides the one specified in the build project.
    */
  var imageOverride: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid values:   CODEBUILD  Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust AWS CodeBuild's service principal.  SERVICE_ROLE  Specifies that AWS CodeBuild uses your build project's service role.    When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you must use CODEBUILD credentials. 
    */
  var imagePullCredentialsTypeOverride: js.UndefOr[ImagePullCredentialsType] = js.native
  
  /**
    * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override applies only if the build's source is GitHub Enterprise.
    */
  var insecureSslOverride: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    *  Log settings for this build that override the log settings defined in the build project. 
    */
  var logsConfigOverride: js.UndefOr[LogsConfig] = js.native
  
  /**
    * Enable this flag to override privileged mode in the build project.
    */
  var privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * The name of the AWS CodeBuild build project to start running a build.
    */
  var projectName: NonEmptyString = js.native
  
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.native
  
  /**
    *  The credentials for access to a private registry. 
    */
  var registryCredentialOverride: js.UndefOr[RegistryCredential] = js.native
  
  /**
    *  Set to true to report to your source provider the status of a build's start and completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is thrown.    The status of a build triggered by a webhook is always reported to your source provider.  
    */
  var reportBuildStatusOverride: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.native
  
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySourcesOverride: js.UndefOr[ProjectSources] = js.native
  
  /**
    *  An array of ProjectSourceVersion objects that specify one or more versions of the project's secondary sources to be used for this build only. 
    */
  var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  
  /**
    * The name of a service role for this build that overrides the one specified in the build project.
    */
  var serviceRoleOverride: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * An authorization type for this build that overrides the one defined in the build project. This override applies only if the build project's source is BitBucket or GitHub.
    */
  var sourceAuthOverride: js.UndefOr[SourceAuth] = js.native
  
  /**
    * A location that overrides, for this build, the source location for the one defined in the build project.
    */
  var sourceLocationOverride: js.UndefOr[String] = js.native
  
  /**
    * A source input type, for this build, that overrides the source input defined in the build project.
    */
  var sourceTypeOverride: js.UndefOr[SourceType] = js.native
  
  /**
    * The version of the build input to be built, for this build only. If not specified, the latest version is used. If specified, the contents depends on the source provider:  AWS CodeCommit  The commit ID, branch, or Git tag to use.  GitHub  The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.  Bitbucket  The commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.  Amazon Simple Storage Service (Amazon S3)  The version ID of the object that represents the build input ZIP file to use.   If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.  For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.native
  
  /**
    * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest setting already defined in the build project.
    */
  var timeoutInMinutesOverride: js.UndefOr[TimeOut] = js.native
}
object StartBuildInput {
  
  @scala.inline
  def apply(projectName: NonEmptyString): StartBuildInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBuildInput]
  }
  
  @scala.inline
  implicit class StartBuildInputMutableBuilder[Self <: StartBuildInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactsOverride(value: ProjectArtifacts): Self = StObject.set(x, "artifactsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsOverrideUndefined: Self = StObject.set(x, "artifactsOverride", js.undefined)
    
    @scala.inline
    def setBuildStatusConfigOverride(value: BuildStatusConfig): Self = StObject.set(x, "buildStatusConfigOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildStatusConfigOverrideUndefined: Self = StObject.set(x, "buildStatusConfigOverride", js.undefined)
    
    @scala.inline
    def setBuildspecOverride(value: String): Self = StObject.set(x, "buildspecOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildspecOverrideUndefined: Self = StObject.set(x, "buildspecOverride", js.undefined)
    
    @scala.inline
    def setCacheOverride(value: ProjectCache): Self = StObject.set(x, "cacheOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheOverrideUndefined: Self = StObject.set(x, "cacheOverride", js.undefined)
    
    @scala.inline
    def setCertificateOverride(value: String): Self = StObject.set(x, "certificateOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateOverrideUndefined: Self = StObject.set(x, "certificateOverride", js.undefined)
    
    @scala.inline
    def setComputeTypeOverride(value: ComputeType): Self = StObject.set(x, "computeTypeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeTypeOverrideUndefined: Self = StObject.set(x, "computeTypeOverride", js.undefined)
    
    @scala.inline
    def setDebugSessionEnabled(value: WrapperBoolean): Self = StObject.set(x, "debugSessionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugSessionEnabledUndefined: Self = StObject.set(x, "debugSessionEnabled", js.undefined)
    
    @scala.inline
    def setEncryptionKeyOverride(value: NonEmptyString): Self = StObject.set(x, "encryptionKeyOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyOverrideUndefined: Self = StObject.set(x, "encryptionKeyOverride", js.undefined)
    
    @scala.inline
    def setEnvironmentTypeOverride(value: EnvironmentType): Self = StObject.set(x, "environmentTypeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentTypeOverrideUndefined: Self = StObject.set(x, "environmentTypeOverride", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesOverride(value: EnvironmentVariables): Self = StObject.set(x, "environmentVariablesOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesOverrideUndefined: Self = StObject.set(x, "environmentVariablesOverride", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesOverrideVarargs(value: EnvironmentVariable*): Self = StObject.set(x, "environmentVariablesOverride", js.Array(value :_*))
    
    @scala.inline
    def setGitCloneDepthOverride(value: GitCloneDepth): Self = StObject.set(x, "gitCloneDepthOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitCloneDepthOverrideUndefined: Self = StObject.set(x, "gitCloneDepthOverride", js.undefined)
    
    @scala.inline
    def setGitSubmodulesConfigOverride(value: GitSubmodulesConfig): Self = StObject.set(x, "gitSubmodulesConfigOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitSubmodulesConfigOverrideUndefined: Self = StObject.set(x, "gitSubmodulesConfigOverride", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: String): Self = StObject.set(x, "idempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "idempotencyToken", js.undefined)
    
    @scala.inline
    def setImageOverride(value: NonEmptyString): Self = StObject.set(x, "imageOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOverrideUndefined: Self = StObject.set(x, "imageOverride", js.undefined)
    
    @scala.inline
    def setImagePullCredentialsTypeOverride(value: ImagePullCredentialsType): Self = StObject.set(x, "imagePullCredentialsTypeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullCredentialsTypeOverrideUndefined: Self = StObject.set(x, "imagePullCredentialsTypeOverride", js.undefined)
    
    @scala.inline
    def setInsecureSslOverride(value: WrapperBoolean): Self = StObject.set(x, "insecureSslOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsecureSslOverrideUndefined: Self = StObject.set(x, "insecureSslOverride", js.undefined)
    
    @scala.inline
    def setLogsConfigOverride(value: LogsConfig): Self = StObject.set(x, "logsConfigOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsConfigOverrideUndefined: Self = StObject.set(x, "logsConfigOverride", js.undefined)
    
    @scala.inline
    def setPrivilegedModeOverride(value: WrapperBoolean): Self = StObject.set(x, "privilegedModeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedModeOverrideUndefined: Self = StObject.set(x, "privilegedModeOverride", js.undefined)
    
    @scala.inline
    def setProjectName(value: NonEmptyString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedTimeoutInMinutesOverride(value: TimeOut): Self = StObject.set(x, "queuedTimeoutInMinutesOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedTimeoutInMinutesOverrideUndefined: Self = StObject.set(x, "queuedTimeoutInMinutesOverride", js.undefined)
    
    @scala.inline
    def setRegistryCredentialOverride(value: RegistryCredential): Self = StObject.set(x, "registryCredentialOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryCredentialOverrideUndefined: Self = StObject.set(x, "registryCredentialOverride", js.undefined)
    
    @scala.inline
    def setReportBuildStatusOverride(value: WrapperBoolean): Self = StObject.set(x, "reportBuildStatusOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportBuildStatusOverrideUndefined: Self = StObject.set(x, "reportBuildStatusOverride", js.undefined)
    
    @scala.inline
    def setSecondaryArtifactsOverride(value: ProjectArtifactsList): Self = StObject.set(x, "secondaryArtifactsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryArtifactsOverrideUndefined: Self = StObject.set(x, "secondaryArtifactsOverride", js.undefined)
    
    @scala.inline
    def setSecondaryArtifactsOverrideVarargs(value: ProjectArtifacts*): Self = StObject.set(x, "secondaryArtifactsOverride", js.Array(value :_*))
    
    @scala.inline
    def setSecondarySourcesOverride(value: ProjectSources): Self = StObject.set(x, "secondarySourcesOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondarySourcesOverrideUndefined: Self = StObject.set(x, "secondarySourcesOverride", js.undefined)
    
    @scala.inline
    def setSecondarySourcesOverrideVarargs(value: ProjectSource*): Self = StObject.set(x, "secondarySourcesOverride", js.Array(value :_*))
    
    @scala.inline
    def setSecondarySourcesVersionOverride(value: ProjectSecondarySourceVersions): Self = StObject.set(x, "secondarySourcesVersionOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondarySourcesVersionOverrideUndefined: Self = StObject.set(x, "secondarySourcesVersionOverride", js.undefined)
    
    @scala.inline
    def setSecondarySourcesVersionOverrideVarargs(value: ProjectSourceVersion*): Self = StObject.set(x, "secondarySourcesVersionOverride", js.Array(value :_*))
    
    @scala.inline
    def setServiceRoleOverride(value: NonEmptyString): Self = StObject.set(x, "serviceRoleOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleOverrideUndefined: Self = StObject.set(x, "serviceRoleOverride", js.undefined)
    
    @scala.inline
    def setSourceAuthOverride(value: SourceAuth): Self = StObject.set(x, "sourceAuthOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAuthOverrideUndefined: Self = StObject.set(x, "sourceAuthOverride", js.undefined)
    
    @scala.inline
    def setSourceLocationOverride(value: String): Self = StObject.set(x, "sourceLocationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationOverrideUndefined: Self = StObject.set(x, "sourceLocationOverride", js.undefined)
    
    @scala.inline
    def setSourceTypeOverride(value: SourceType): Self = StObject.set(x, "sourceTypeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeOverrideUndefined: Self = StObject.set(x, "sourceTypeOverride", js.undefined)
    
    @scala.inline
    def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    @scala.inline
    def setTimeoutInMinutesOverride(value: TimeOut): Self = StObject.set(x, "timeoutInMinutesOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutesOverrideUndefined: Self = StObject.set(x, "timeoutInMinutesOverride", js.undefined)
  }
}
