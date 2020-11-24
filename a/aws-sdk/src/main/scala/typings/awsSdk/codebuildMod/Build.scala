package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the build.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the output artifacts for the build.
    */
  var artifacts: js.UndefOr[BuildArtifacts] = js.native
  
  /**
    * The ARN of the batch build that this build is a member of, if applicable.
    */
  var buildBatchArn: js.UndefOr[String] = js.native
  
  /**
    * Whether the build is complete. True if complete; otherwise, false.
    */
  var buildComplete: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of the build. For each project, the buildNumber of its first build is 1. The buildNumber of each subsequent build is incremented by 1. If a build is deleted, the buildNumber of other builds does not change.
    */
  var buildNumber: js.UndefOr[WrapperLong] = js.native
  
  /**
    * The current status of the build. Valid values include:    FAILED: The build failed.    FAULT: The build faulted.    IN_PROGRESS: The build is still in progress.    STOPPED: The build stopped.    SUCCEEDED: The build succeeded.    TIMED_OUT: The build timed out.  
    */
  var buildStatus: js.UndefOr[StatusType] = js.native
  
  /**
    * Information about the cache for the build.
    */
  var cache: js.UndefOr[ProjectCache] = js.native
  
  /**
    * The current build phase.
    */
  var currentPhase: js.UndefOr[String] = js.native
  
  /**
    * Contains information about the debug session for this build.
    */
  var debugSession: js.UndefOr[DebugSession] = js.native
  
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * When the build process ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Information about the build environment for this build.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.native
  
  /**
    *  A list of exported environment variables for this build. 
    */
  var exportedEnvironmentVariables: js.UndefOr[ExportedEnvironmentVariables] = js.native
  
  /**
    *  An array of ProjectFileSystemLocation objects for a CodeBuild build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.native
  
  /**
    * The unique ID for the build.
    */
  var id: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The entity that started the build. Valid values include:   If AWS CodePipeline started the build, the pipeline's name (for example, codepipeline/my-demo-pipeline).   If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example, MyUserName).   If the Jenkins plugin for AWS CodeBuild started the build, the string CodeBuild-Jenkins-Plugin.  
    */
  var initiator: js.UndefOr[String] = js.native
  
  /**
    * Information about the build's logs in Amazon CloudWatch Logs.
    */
  var logs: js.UndefOr[LogsLocation] = js.native
  
  /**
    * Describes a network interface.
    */
  var networkInterface: js.UndefOr[NetworkInterface] = js.native
  
  /**
    * Information about all previous build phases that are complete and information about any current build phase that is not yet complete.
    */
  var phases: js.UndefOr[BuildPhases] = js.native
  
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.native
  
  /**
    *  An array of the ARNs associated with this build's reports. 
    */
  var reportArns: js.UndefOr[BuildReportArns] = js.native
  
  /**
    *  An identifier for the version of this build's source code.     For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.     For AWS CodePipeline, the source revision provided by AWS CodePipeline.     For Amazon Simple Storage Service (Amazon S3), this does not apply.   
    */
  var resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.native
  
  /**
    *  An array of ProjectSourceVersion objects. Each ProjectSourceVersion must be one of:    For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.  
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.native
  
  /**
    * The name of a service role used for this build.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the source code to be built.
    */
  var source: js.UndefOr[ProjectSource] = js.native
  
  /**
    * Any version identifier for the version of the source code to be built. If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * When the build process started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as completed.
    */
  var timeoutInMinutes: js.UndefOr[WrapperInt] = js.native
  
  /**
    * If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same VPC. You must provide at least one security group and one subnet ID.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.native
}
object Build {
  
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    
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
    def setBuildBatchArn(value: String): Self = this.set("buildBatchArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBatchArn: Self = this.set("buildBatchArn", js.undefined)
    
    @scala.inline
    def setBuildComplete(value: Boolean): Self = this.set("buildComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildComplete: Self = this.set("buildComplete", js.undefined)
    
    @scala.inline
    def setBuildNumber(value: WrapperLong): Self = this.set("buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildNumber: Self = this.set("buildNumber", js.undefined)
    
    @scala.inline
    def setBuildStatus(value: StatusType): Self = this.set("buildStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildStatus: Self = this.set("buildStatus", js.undefined)
    
    @scala.inline
    def setCache(value: ProjectCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCurrentPhase(value: String): Self = this.set("currentPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPhase: Self = this.set("currentPhase", js.undefined)
    
    @scala.inline
    def setDebugSession(value: DebugSession): Self = this.set("debugSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugSession: Self = this.set("debugSession", js.undefined)
    
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
    def setExportedEnvironmentVariablesVarargs(value: ExportedEnvironmentVariable*): Self = this.set("exportedEnvironmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setExportedEnvironmentVariables(value: ExportedEnvironmentVariables): Self = this.set("exportedEnvironmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportedEnvironmentVariables: Self = this.set("exportedEnvironmentVariables", js.undefined)
    
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
    def setLogs(value: LogsLocation): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    
    @scala.inline
    def setNetworkInterface(value: NetworkInterface): Self = this.set("networkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterface: Self = this.set("networkInterface", js.undefined)
    
    @scala.inline
    def setPhasesVarargs(value: BuildPhase*): Self = this.set("phases", js.Array(value :_*))
    
    @scala.inline
    def setPhases(value: BuildPhases): Self = this.set("phases", value.asInstanceOf[js.Any])
    
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
    def setReportArnsVarargs(value: String*): Self = this.set("reportArns", js.Array(value :_*))
    
    @scala.inline
    def setReportArns(value: BuildReportArns): Self = this.set("reportArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportArns: Self = this.set("reportArns", js.undefined)
    
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
    def setTimeoutInMinutes(value: WrapperInt): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInMinutes: Self = this.set("timeoutInMinutes", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
}
