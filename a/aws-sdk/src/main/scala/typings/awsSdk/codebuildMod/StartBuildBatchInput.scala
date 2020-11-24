package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartBuildBatchInput extends js.Object {
  
  /**
    * An array of ProjectArtifacts objects that contains information about the build output artifact overrides for the build project.
    */
  var artifactsOverride: js.UndefOr[ProjectArtifacts] = js.native
  
  /**
    * A BuildBatchConfigOverride object that contains batch build configuration overrides.
    */
  var buildBatchConfigOverride: js.UndefOr[ProjectBuildBatchConfig] = js.native
  
  /**
    * Overrides the build timeout specified in the batch build project.
    */
  var buildTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.native
  
  /**
    * A buildspec file declaration that overrides, for this build only, the latest one already defined in the build project. If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file relative to the value of the built-in CODEBUILD_SRC_DIR environment variable, or the path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN (for example, arn:aws:s3:::my-codebuild-sample2/buildspec.yml). If this value is not provided or is set to an empty string, the source code must contain a buildspec file in its root directory. For more information, see Buildspec File Name and Storage Location. 
    */
  var buildspecOverride: js.UndefOr[String] = js.native
  
  /**
    * A ProjectCache object that specifies cache overrides.
    */
  var cacheOverride: js.UndefOr[ProjectCache] = js.native
  
  /**
    * The name of a certificate for this batch build that overrides the one specified in the batch build project.
    */
  var certificateOverride: js.UndefOr[String] = js.native
  
  /**
    * The name of a compute type for this batch build that overrides the one specified in the batch build project.
    */
  var computeTypeOverride: js.UndefOr[ComputeType] = js.native
  
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) that overrides the one specified in the batch build project. The CMK key encrypts the build output artifacts.  You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKeyOverride: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A container type for this batch build that overrides the one specified in the batch build project.
    */
  var environmentTypeOverride: js.UndefOr[EnvironmentType] = js.native
  
  /**
    * An array of EnvironmentVariable objects that override, or add to, the environment variables defined in the batch build project.
    */
  var environmentVariablesOverride: js.UndefOr[EnvironmentVariables] = js.native
  
  /**
    * The user-defined depth of history, with a minimum value of 0, that overrides, for this batch build only, any previous depth of history defined in the batch build project.
    */
  var gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.native
  
  /**
    * A GitSubmodulesConfig object that overrides the Git submodules configuration for this batch build.
    */
  var gitSubmodulesConfigOverride: js.UndefOr[GitSubmodulesConfig] = js.native
  
  /**
    * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuildBatch request. The token is included in the StartBuildBatch request and is valid for five minutes. If you repeat the StartBuildBatch request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error.
    */
  var idempotencyToken: js.UndefOr[String] = js.native
  
  /**
    * The name of an image for this batch build that overrides the one specified in the batch build project.
    */
  var imageOverride: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of credentials AWS CodeBuild uses to pull images in your batch build. There are two valid values:   CODEBUILD  Specifies that AWS CodeBuild uses its own credentials. This requires that you modify your ECR repository policy to trust AWS CodeBuild's service principal.  SERVICE_ROLE  Specifies that AWS CodeBuild uses your build project's service role.    When using a cross-account or private registry image, you must use SERVICE_ROLE credentials. When using an AWS CodeBuild curated image, you must use CODEBUILD credentials. 
    */
  var imagePullCredentialsTypeOverride: js.UndefOr[ImagePullCredentialsType] = js.native
  
  /**
    * Enable this flag to override the insecure SSL setting that is specified in the batch build project. The insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override applies only if the build's source is GitHub Enterprise.
    */
  var insecureSslOverride: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * A LogsConfig object that override the log settings defined in the batch build project.
    */
  var logsConfigOverride: js.UndefOr[LogsConfig] = js.native
  
  /**
    * Enable this flag to override privileged mode in the batch build project.
    */
  var privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * The name of the project.
    */
  var projectName: NonEmptyString = js.native
  
  /**
    * The number of minutes a batch build is allowed to be queued before it times out.
    */
  var queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.native
  
  /**
    * A RegistryCredential object that overrides credentials for access to a private registry.
    */
  var registryCredentialOverride: js.UndefOr[RegistryCredential] = js.native
  
  /**
    * Set to true to report to your source provider the status of a batch build's start and completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is thrown.   The status of a build triggered by a webhook is always reported to your source provider.  
    */
  var reportBuildBatchStatusOverride: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * An array of ProjectArtifacts objects that override the secondary artifacts defined in the batch build project.
    */
  var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.native
  
  /**
    * An array of ProjectSource objects that override the secondary sources defined in the batch build project.
    */
  var secondarySourcesOverride: js.UndefOr[ProjectSources] = js.native
  
  /**
    * An array of ProjectSourceVersion objects that override the secondary source versions in the batch build project.
    */
  var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  
  /**
    * The name of a service role for this batch build that overrides the one specified in the batch build project.
    */
  var serviceRoleOverride: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A SourceAuth object that overrides the one defined in the batch build project. This override applies only if the build project's source is BitBucket or GitHub.
    */
  var sourceAuthOverride: js.UndefOr[SourceAuth] = js.native
  
  /**
    * A location that overrides, for this batch build, the source location defined in the batch build project.
    */
  var sourceLocationOverride: js.UndefOr[String] = js.native
  
  /**
    * The source input type that overrides the source input defined in the batch build project.
    */
  var sourceTypeOverride: js.UndefOr[SourceType] = js.native
  
  /**
    * The version of the batch build input to be built, for this build only. If not specified, the latest version is used. If specified, the contents depends on the source provider:  AWS CodeCommit  The commit ID, branch, or Git tag to use.  GitHub  The commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.  Bitbucket  The commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.  Amazon Simple Storage Service (Amazon S3)  The version ID of the object that represents the build input ZIP file to use.   If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.  For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.native
}
object StartBuildBatchInput {
  
  @scala.inline
  def apply(projectName: NonEmptyString): StartBuildBatchInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBuildBatchInput]
  }
  
  @scala.inline
  implicit class StartBuildBatchInputOps[Self <: StartBuildBatchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProjectName(value: NonEmptyString): Self = this.set("projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsOverride(value: ProjectArtifacts): Self = this.set("artifactsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactsOverride: Self = this.set("artifactsOverride", js.undefined)
    
    @scala.inline
    def setBuildBatchConfigOverride(value: ProjectBuildBatchConfig): Self = this.set("buildBatchConfigOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBatchConfigOverride: Self = this.set("buildBatchConfigOverride", js.undefined)
    
    @scala.inline
    def setBuildTimeoutInMinutesOverride(value: TimeOut): Self = this.set("buildTimeoutInMinutesOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildTimeoutInMinutesOverride: Self = this.set("buildTimeoutInMinutesOverride", js.undefined)
    
    @scala.inline
    def setBuildspecOverride(value: String): Self = this.set("buildspecOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildspecOverride: Self = this.set("buildspecOverride", js.undefined)
    
    @scala.inline
    def setCacheOverride(value: ProjectCache): Self = this.set("cacheOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheOverride: Self = this.set("cacheOverride", js.undefined)
    
    @scala.inline
    def setCertificateOverride(value: String): Self = this.set("certificateOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateOverride: Self = this.set("certificateOverride", js.undefined)
    
    @scala.inline
    def setComputeTypeOverride(value: ComputeType): Self = this.set("computeTypeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeTypeOverride: Self = this.set("computeTypeOverride", js.undefined)
    
    @scala.inline
    def setEncryptionKeyOverride(value: NonEmptyString): Self = this.set("encryptionKeyOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKeyOverride: Self = this.set("encryptionKeyOverride", js.undefined)
    
    @scala.inline
    def setEnvironmentTypeOverride(value: EnvironmentType): Self = this.set("environmentTypeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentTypeOverride: Self = this.set("environmentTypeOverride", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesOverrideVarargs(value: EnvironmentVariable*): Self = this.set("environmentVariablesOverride", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentVariablesOverride(value: EnvironmentVariables): Self = this.set("environmentVariablesOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariablesOverride: Self = this.set("environmentVariablesOverride", js.undefined)
    
    @scala.inline
    def setGitCloneDepthOverride(value: GitCloneDepth): Self = this.set("gitCloneDepthOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitCloneDepthOverride: Self = this.set("gitCloneDepthOverride", js.undefined)
    
    @scala.inline
    def setGitSubmodulesConfigOverride(value: GitSubmodulesConfig): Self = this.set("gitSubmodulesConfigOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitSubmodulesConfigOverride: Self = this.set("gitSubmodulesConfigOverride", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: String): Self = this.set("idempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("idempotencyToken", js.undefined)
    
    @scala.inline
    def setImageOverride(value: NonEmptyString): Self = this.set("imageOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageOverride: Self = this.set("imageOverride", js.undefined)
    
    @scala.inline
    def setImagePullCredentialsTypeOverride(value: ImagePullCredentialsType): Self = this.set("imagePullCredentialsTypeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePullCredentialsTypeOverride: Self = this.set("imagePullCredentialsTypeOverride", js.undefined)
    
    @scala.inline
    def setInsecureSslOverride(value: WrapperBoolean): Self = this.set("insecureSslOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecureSslOverride: Self = this.set("insecureSslOverride", js.undefined)
    
    @scala.inline
    def setLogsConfigOverride(value: LogsConfig): Self = this.set("logsConfigOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogsConfigOverride: Self = this.set("logsConfigOverride", js.undefined)
    
    @scala.inline
    def setPrivilegedModeOverride(value: WrapperBoolean): Self = this.set("privilegedModeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilegedModeOverride: Self = this.set("privilegedModeOverride", js.undefined)
    
    @scala.inline
    def setQueuedTimeoutInMinutesOverride(value: TimeOut): Self = this.set("queuedTimeoutInMinutesOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueuedTimeoutInMinutesOverride: Self = this.set("queuedTimeoutInMinutesOverride", js.undefined)
    
    @scala.inline
    def setRegistryCredentialOverride(value: RegistryCredential): Self = this.set("registryCredentialOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryCredentialOverride: Self = this.set("registryCredentialOverride", js.undefined)
    
    @scala.inline
    def setReportBuildBatchStatusOverride(value: WrapperBoolean): Self = this.set("reportBuildBatchStatusOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportBuildBatchStatusOverride: Self = this.set("reportBuildBatchStatusOverride", js.undefined)
    
    @scala.inline
    def setSecondaryArtifactsOverrideVarargs(value: ProjectArtifacts*): Self = this.set("secondaryArtifactsOverride", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryArtifactsOverride(value: ProjectArtifactsList): Self = this.set("secondaryArtifactsOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryArtifactsOverride: Self = this.set("secondaryArtifactsOverride", js.undefined)
    
    @scala.inline
    def setSecondarySourcesOverrideVarargs(value: ProjectSource*): Self = this.set("secondarySourcesOverride", js.Array(value :_*))
    
    @scala.inline
    def setSecondarySourcesOverride(value: ProjectSources): Self = this.set("secondarySourcesOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondarySourcesOverride: Self = this.set("secondarySourcesOverride", js.undefined)
    
    @scala.inline
    def setSecondarySourcesVersionOverrideVarargs(value: ProjectSourceVersion*): Self = this.set("secondarySourcesVersionOverride", js.Array(value :_*))
    
    @scala.inline
    def setSecondarySourcesVersionOverride(value: ProjectSecondarySourceVersions): Self = this.set("secondarySourcesVersionOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondarySourcesVersionOverride: Self = this.set("secondarySourcesVersionOverride", js.undefined)
    
    @scala.inline
    def setServiceRoleOverride(value: NonEmptyString): Self = this.set("serviceRoleOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRoleOverride: Self = this.set("serviceRoleOverride", js.undefined)
    
    @scala.inline
    def setSourceAuthOverride(value: SourceAuth): Self = this.set("sourceAuthOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAuthOverride: Self = this.set("sourceAuthOverride", js.undefined)
    
    @scala.inline
    def setSourceLocationOverride(value: String): Self = this.set("sourceLocationOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLocationOverride: Self = this.set("sourceLocationOverride", js.undefined)
    
    @scala.inline
    def setSourceTypeOverride(value: SourceType): Self = this.set("sourceTypeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTypeOverride: Self = this.set("sourceTypeOverride", js.undefined)
    
    @scala.inline
    def setSourceVersion(value: String): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceVersion: Self = this.set("sourceVersion", js.undefined)
  }
}
