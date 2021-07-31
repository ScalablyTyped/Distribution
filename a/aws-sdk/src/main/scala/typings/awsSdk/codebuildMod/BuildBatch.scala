package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBatch extends StObject {
  
  /**
    * The ARN of the batch build.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A BuildArtifacts object the defines the build artifacts for this batch build.
    */
  var artifacts: js.UndefOr[BuildArtifacts] = js.undefined
  
  var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.undefined
  
  /**
    * The number of the batch build. For each project, the buildBatchNumber of its first batch build is 1. The buildBatchNumber of each subsequent batch build is incremented by 1. If a batch build is deleted, the buildBatchNumber of other batch builds does not change.
    */
  var buildBatchNumber: js.UndefOr[WrapperLong] = js.undefined
  
  /**
    * The status of the batch build.
    */
  var buildBatchStatus: js.UndefOr[StatusType] = js.undefined
  
  /**
    * An array of BuildGroup objects that define the build groups for the batch build.
    */
  var buildGroups: js.UndefOr[BuildGroups] = js.undefined
  
  /**
    * Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
    */
  var buildTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
  
  var cache: js.UndefOr[ProjectCache] = js.undefined
  
  /**
    * Indicates if the batch build is complete.
    */
  var complete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current phase of the batch build.
    */
  var currentPhase: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch build output artifacts.  You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time that the batch build ended.
    */
  var endTime: js.UndefOr[Timestamp] = js.undefined
  
  var environment: js.UndefOr[ProjectEnvironment] = js.undefined
  
  /**
    * An array of ProjectFileSystemLocation objects for the batch build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined
  
  /**
    * The identifier of the batch build.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The entity that started the batch build. Valid values include:   If AWS CodePipeline started the build, the pipeline's name (for example, codepipeline/my-demo-pipeline).   If an AWS Identity and Access Management (IAM) user started the build, the user's name.   If the Jenkins plugin for AWS CodeBuild started the build, the string CodeBuild-Jenkins-Plugin.  
    */
  var initiator: js.UndefOr[String] = js.undefined
  
  var logConfig: js.UndefOr[LogsConfig] = js.undefined
  
  /**
    * An array of BuildBatchPhase objects the specify the phases of the batch build.
    */
  var phases: js.UndefOr[BuildBatchPhases] = js.undefined
  
  /**
    * The name of the batch build project.
    */
  var projectName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times out.
    */
  var queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
  
  /**
    * The identifier of the resolved version of this batch build's source code.   For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.   For AWS CodePipeline, the source revision provided by AWS CodePipeline.   For Amazon Simple Storage Service (Amazon S3), this does not apply.  
    */
  var resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array of BuildArtifacts objects the define the build artifacts for this batch build.
    */
  var secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.undefined
  
  /**
    * An array of ProjectSourceVersion objects. Each ProjectSourceVersion must be one of:    For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.  
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  
  /**
    * An array of ProjectSource objects that define the sources for the batch build.
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.undefined
  
  /**
    * The name of a service role used for builds in the batch.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
  
  var source: js.UndefOr[ProjectSource] = js.undefined
  
  /**
    * The identifier of the version of the source code to be built.
    */
  var sourceVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time that the batch build started.
    */
  var startTime: js.UndefOr[Timestamp] = js.undefined
  
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}
object BuildBatch {
  
  @scala.inline
  def apply(): BuildBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBatch]
  }
  
  @scala.inline
  implicit class BuildBatchMutableBuilder[Self <: BuildBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setArtifacts(value: BuildArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setBuildBatchConfig(value: ProjectBuildBatchConfig): Self = StObject.set(x, "buildBatchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBatchConfigUndefined: Self = StObject.set(x, "buildBatchConfig", js.undefined)
    
    @scala.inline
    def setBuildBatchNumber(value: WrapperLong): Self = StObject.set(x, "buildBatchNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBatchNumberUndefined: Self = StObject.set(x, "buildBatchNumber", js.undefined)
    
    @scala.inline
    def setBuildBatchStatus(value: StatusType): Self = StObject.set(x, "buildBatchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBatchStatusUndefined: Self = StObject.set(x, "buildBatchStatus", js.undefined)
    
    @scala.inline
    def setBuildGroups(value: BuildGroups): Self = StObject.set(x, "buildGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildGroupsUndefined: Self = StObject.set(x, "buildGroups", js.undefined)
    
    @scala.inline
    def setBuildGroupsVarargs(value: BuildGroup*): Self = StObject.set(x, "buildGroups", js.Array(value :_*))
    
    @scala.inline
    def setBuildTimeoutInMinutes(value: WrapperInt): Self = StObject.set(x, "buildTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildTimeoutInMinutesUndefined: Self = StObject.set(x, "buildTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setCache(value: ProjectCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCurrentPhase(value: String): Self = StObject.set(x, "currentPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPhaseUndefined: Self = StObject.set(x, "currentPhase", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEnvironment(value: ProjectEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setFileSystemLocations(value: ProjectFileSystemLocations): Self = StObject.set(x, "fileSystemLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemLocationsUndefined: Self = StObject.set(x, "fileSystemLocations", js.undefined)
    
    @scala.inline
    def setFileSystemLocationsVarargs(value: ProjectFileSystemLocation*): Self = StObject.set(x, "fileSystemLocations", js.Array(value :_*))
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitiator(value: String): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    @scala.inline
    def setLogConfig(value: LogsConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    @scala.inline
    def setPhases(value: BuildBatchPhases): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhasesUndefined: Self = StObject.set(x, "phases", js.undefined)
    
    @scala.inline
    def setPhasesVarargs(value: BuildBatchPhase*): Self = StObject.set(x, "phases", js.Array(value :_*))
    
    @scala.inline
    def setProjectName(value: NonEmptyString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    @scala.inline
    def setQueuedTimeoutInMinutes(value: WrapperInt): Self = StObject.set(x, "queuedTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedTimeoutInMinutesUndefined: Self = StObject.set(x, "queuedTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setResolvedSourceVersion(value: NonEmptyString): Self = StObject.set(x, "resolvedSourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedSourceVersionUndefined: Self = StObject.set(x, "resolvedSourceVersion", js.undefined)
    
    @scala.inline
    def setSecondaryArtifacts(value: BuildArtifactsList): Self = StObject.set(x, "secondaryArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryArtifactsUndefined: Self = StObject.set(x, "secondaryArtifacts", js.undefined)
    
    @scala.inline
    def setSecondaryArtifactsVarargs(value: BuildArtifacts*): Self = StObject.set(x, "secondaryArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setSecondarySourceVersions(value: ProjectSecondarySourceVersions): Self = StObject.set(x, "secondarySourceVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondarySourceVersionsUndefined: Self = StObject.set(x, "secondarySourceVersions", js.undefined)
    
    @scala.inline
    def setSecondarySourceVersionsVarargs(value: ProjectSourceVersion*): Self = StObject.set(x, "secondarySourceVersions", js.Array(value :_*))
    
    @scala.inline
    def setSecondarySources(value: ProjectSources): Self = StObject.set(x, "secondarySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondarySourcesUndefined: Self = StObject.set(x, "secondarySources", js.undefined)
    
    @scala.inline
    def setSecondarySourcesVarargs(value: ProjectSource*): Self = StObject.set(x, "secondarySources", js.Array(value :_*))
    
    @scala.inline
    def setServiceRole(value: NonEmptyString): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    @scala.inline
    def setSource(value: ProjectSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceVersion(value: NonEmptyString): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
