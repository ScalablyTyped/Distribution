package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build extends StObject {
  
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
  implicit class BuildMutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setArtifacts(value: BuildArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setBuildBatchArn(value: String): Self = StObject.set(x, "buildBatchArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildBatchArnUndefined: Self = StObject.set(x, "buildBatchArn", js.undefined)
    
    @scala.inline
    def setBuildComplete(value: Boolean): Self = StObject.set(x, "buildComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildCompleteUndefined: Self = StObject.set(x, "buildComplete", js.undefined)
    
    @scala.inline
    def setBuildNumber(value: WrapperLong): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    @scala.inline
    def setBuildStatus(value: StatusType): Self = StObject.set(x, "buildStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildStatusUndefined: Self = StObject.set(x, "buildStatus", js.undefined)
    
    @scala.inline
    def setCache(value: ProjectCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setCurrentPhase(value: String): Self = StObject.set(x, "currentPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPhaseUndefined: Self = StObject.set(x, "currentPhase", js.undefined)
    
    @scala.inline
    def setDebugSession(value: DebugSession): Self = StObject.set(x, "debugSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugSessionUndefined: Self = StObject.set(x, "debugSession", js.undefined)
    
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
    def setExportedEnvironmentVariables(value: ExportedEnvironmentVariables): Self = StObject.set(x, "exportedEnvironmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedEnvironmentVariablesUndefined: Self = StObject.set(x, "exportedEnvironmentVariables", js.undefined)
    
    @scala.inline
    def setExportedEnvironmentVariablesVarargs(value: ExportedEnvironmentVariable*): Self = StObject.set(x, "exportedEnvironmentVariables", js.Array(value :_*))
    
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
    def setLogs(value: LogsLocation): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    @scala.inline
    def setNetworkInterface(value: NetworkInterface): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceUndefined: Self = StObject.set(x, "networkInterface", js.undefined)
    
    @scala.inline
    def setPhases(value: BuildPhases): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhasesUndefined: Self = StObject.set(x, "phases", js.undefined)
    
    @scala.inline
    def setPhasesVarargs(value: BuildPhase*): Self = StObject.set(x, "phases", js.Array(value :_*))
    
    @scala.inline
    def setProjectName(value: NonEmptyString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    @scala.inline
    def setQueuedTimeoutInMinutes(value: WrapperInt): Self = StObject.set(x, "queuedTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedTimeoutInMinutesUndefined: Self = StObject.set(x, "queuedTimeoutInMinutes", js.undefined)
    
    @scala.inline
    def setReportArns(value: BuildReportArns): Self = StObject.set(x, "reportArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportArnsUndefined: Self = StObject.set(x, "reportArns", js.undefined)
    
    @scala.inline
    def setReportArnsVarargs(value: String*): Self = StObject.set(x, "reportArns", js.Array(value :_*))
    
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
    def setTimeoutInMinutes(value: WrapperInt): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutesUndefined: Self = StObject.set(x, "timeoutInMinutes", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
