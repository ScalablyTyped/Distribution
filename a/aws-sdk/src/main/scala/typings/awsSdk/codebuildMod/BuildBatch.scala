package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBatch extends js.Object {
  
  /**
    * The ARN of the batch build.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A BuildArtifacts object the defines the build artifacts for this batch build.
    */
  var artifacts: js.UndefOr[BuildArtifacts] = js.native
  
  var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.native
  
  /**
    * The number of the batch build. For each project, the buildBatchNumber of its first batch build is 1. The buildBatchNumber of each subsequent batch build is incremented by 1. If a batch build is deleted, the buildBatchNumber of other batch builds does not change.
    */
  var buildBatchNumber: js.UndefOr[WrapperLong] = js.native
  
  /**
    * The status of the batch build.
    */
  var buildBatchStatus: js.UndefOr[StatusType] = js.native
  
  /**
    * An array of BuildGroup objects that define the build groups for the batch build.
    */
  var buildGroups: js.UndefOr[BuildGroups] = js.native
  
  /**
    * Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
    */
  var buildTimeoutInMinutes: js.UndefOr[WrapperInt] = js.native
  
  var cache: js.UndefOr[ProjectCache] = js.native
  
  /**
    * Indicates if the batch build is complete.
    */
  var complete: js.UndefOr[Boolean] = js.native
  
  /**
    * The current phase of the batch build.
    */
  var currentPhase: js.UndefOr[String] = js.native
  
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the batch build output artifacts.  You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The date and time that the batch build ended.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  var environment: js.UndefOr[ProjectEnvironment] = js.native
  
  /**
    * An array of ProjectFileSystemLocation objects for the batch build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.native
  
  /**
    * The identifier of the batch build.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The entity that started the batch build. Valid values include:   If AWS CodePipeline started the build, the pipeline's name (for example, codepipeline/my-demo-pipeline).   If an AWS Identity and Access Management (IAM) user started the build, the user's name.   If the Jenkins plugin for AWS CodeBuild started the build, the string CodeBuild-Jenkins-Plugin.  
    */
  var initiator: js.UndefOr[String] = js.native
  
  var logConfig: js.UndefOr[LogsConfig] = js.native
  
  /**
    * An array of BuildBatchPhase objects the specify the phases of the batch build.
    */
  var phases: js.UndefOr[BuildBatchPhases] = js.native
  
  /**
    * The name of the batch build project.
    */
  var projectName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times out.
    */
  var queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.native
  
  /**
    * The identifier of the resolved version of this batch build's source code.   For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.   For AWS CodePipeline, the source revision provided by AWS CodePipeline.   For Amazon Simple Storage Service (Amazon S3), this does not apply.  
    */
  var resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * An array of BuildArtifacts objects the define the build artifacts for this batch build.
    */
  var secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.native
  
  /**
    * An array of ProjectSourceVersion objects. Each ProjectSourceVersion must be one of:    For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.  
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  
  /**
    * An array of ProjectSource objects that define the sources for the batch build.
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.native
  
  /**
    * The name of a service role used for builds in the batch.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.native
  
  var source: js.UndefOr[ProjectSource] = js.native
  
  /**
    * The identifier of the version of the source code to be built.
    */
  var sourceVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The date and time that the batch build started.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  
  var vpcConfig: js.UndefOr[VpcConfig] = js.native
}
object BuildBatch {
  
  @scala.inline
  def apply(): BuildBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBatch]
  }
  
  @scala.inline
  implicit class BuildBatchOps[Self <: BuildBatch] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setArtifacts(value: BuildArtifacts): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifacts: Self = this.set("artifacts", js.undefined)
    
    @scala.inline
    def setBuildBatchConfig(value: ProjectBuildBatchConfig): Self = this.set("buildBatchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBatchConfig: Self = this.set("buildBatchConfig", js.undefined)
    
    @scala.inline
    def setBuildBatchNumber(value: WrapperLong): Self = this.set("buildBatchNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBatchNumber: Self = this.set("buildBatchNumber", js.undefined)
    
    @scala.inline
    def setBuildBatchStatus(value: StatusType): Self = this.set("buildBatchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBatchStatus: Self = this.set("buildBatchStatus", js.undefined)
    
    @scala.inline
    def setBuildGroupsVarargs(value: BuildGroup*): Self = this.set("buildGroups", js.Array(value :_*))
    
    @scala.inline
    def setBuildGroups(value: BuildGroups): Self = this.set("buildGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildGroups: Self = this.set("buildGroups", js.undefined)
    
    @scala.inline
    def setBuildTimeoutInMinutes(value: WrapperInt): Self = this.set("buildTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildTimeoutInMinutes: Self = this.set("buildTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setCache(value: ProjectCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setCurrentPhase(value: String): Self = this.set("currentPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPhase: Self = this.set("currentPhase", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: NonEmptyString): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEnvironment(value: ProjectEnvironment): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setFileSystemLocationsVarargs(value: ProjectFileSystemLocation*): Self = this.set("fileSystemLocations", js.Array(value :_*))
    
    @scala.inline
    def setFileSystemLocations(value: ProjectFileSystemLocations): Self = this.set("fileSystemLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemLocations: Self = this.set("fileSystemLocations", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitiator(value: String): Self = this.set("initiator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitiator: Self = this.set("initiator", js.undefined)
    
    @scala.inline
    def setLogConfig(value: LogsConfig): Self = this.set("logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfig: Self = this.set("logConfig", js.undefined)
    
    @scala.inline
    def setPhasesVarargs(value: BuildBatchPhase*): Self = this.set("phases", js.Array(value :_*))
    
    @scala.inline
    def setPhases(value: BuildBatchPhases): Self = this.set("phases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhases: Self = this.set("phases", js.undefined)
    
    @scala.inline
    def setProjectName(value: NonEmptyString): Self = this.set("projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectName: Self = this.set("projectName", js.undefined)
    
    @scala.inline
    def setQueuedTimeoutInMinutes(value: WrapperInt): Self = this.set("queuedTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueuedTimeoutInMinutes: Self = this.set("queuedTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setResolvedSourceVersion(value: NonEmptyString): Self = this.set("resolvedSourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedSourceVersion: Self = this.set("resolvedSourceVersion", js.undefined)
    
    @scala.inline
    def setSecondaryArtifactsVarargs(value: BuildArtifacts*): Self = this.set("secondaryArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryArtifacts(value: BuildArtifactsList): Self = this.set("secondaryArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryArtifacts: Self = this.set("secondaryArtifacts", js.undefined)
    
    @scala.inline
    def setSecondarySourceVersionsVarargs(value: ProjectSourceVersion*): Self = this.set("secondarySourceVersions", js.Array(value :_*))
    
    @scala.inline
    def setSecondarySourceVersions(value: ProjectSecondarySourceVersions): Self = this.set("secondarySourceVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondarySourceVersions: Self = this.set("secondarySourceVersions", js.undefined)
    
    @scala.inline
    def setSecondarySourcesVarargs(value: ProjectSource*): Self = this.set("secondarySources", js.Array(value :_*))
    
    @scala.inline
    def setSecondarySources(value: ProjectSources): Self = this.set("secondarySources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondarySources: Self = this.set("secondarySources", js.undefined)
    
    @scala.inline
    def setServiceRole(value: NonEmptyString): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRole: Self = this.set("serviceRole", js.undefined)
    
    @scala.inline
    def setSource(value: ProjectSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceVersion(value: NonEmptyString): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceVersion: Self = this.set("sourceVersion", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
}
