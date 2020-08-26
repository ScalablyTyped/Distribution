package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the build project.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * Information about the build output artifacts for the build project.
    */
  var artifacts: js.UndefOr[ProjectArtifacts] = js.native
  /**
    * Information about the build badge for the build project.
    */
  var badge: js.UndefOr[ProjectBadge] = js.native
  /**
    * A ProjectBuildBatchConfig object that defines the batch build options for the project.
    */
  var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.native
  /**
    * Information about the cache for the build project.
    */
  var cache: js.UndefOr[ProjectCache] = js.native
  /**
    * When the build project was created, expressed in Unix time format.
    */
  var created: js.UndefOr[Timestamp] = js.native
  /**
    * A description that makes the build project easy to identify.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.  You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information about the build environment for this build project.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.native
  /**
    *  An array of ProjectFileSystemLocation objects for a CodeBuild build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.native
  /**
    * When the build project's settings were last modified, expressed in Unix time format.
    */
  var lastModified: js.UndefOr[Timestamp] = js.native
  /**
    * Information about logs for the build project. A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both. 
    */
  var logsConfig: js.UndefOr[LogsConfig] = js.native
  /**
    * The name of the build project.
    */
  var name: js.UndefOr[ProjectName] = js.native
  /**
    * The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.native
  /**
    * An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.native
  /**
    * An array of ProjectSourceVersion objects. If secondarySourceVersions is specified at the build level, then they take over these secondarySourceVersions (at the project level). 
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  /**
    * An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.native
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.native
  /**
    * Information about the build input source code for this build project.
    */
  var source: js.UndefOr[ProjectSource] = js.native
  /**
    * A version of the build input to be built for this project. If not specified, the latest version is used. If specified, it must be one of:   For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.   If sourceVersion is specified at the build level, then that version takes precedence over this sourceVersion (at the project level).  For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.native
  /**
    * A list of tag key and value pairs associated with this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any related build that did not get marked as completed. The default is 60 minutes.
    */
  var timeoutInMinutes: js.UndefOr[TimeOut] = js.native
  /**
    * Information about the VPC configuration that AWS CodeBuild accesses.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.native
  /**
    * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
    */
  var webhook: js.UndefOr[Webhook] = js.native
}

object Project {
  @scala.inline
  def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setArtifacts(value: ProjectArtifacts): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifacts: Self = this.set("artifacts", js.undefined)
    @scala.inline
    def setBadge(value: ProjectBadge): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBuildBatchConfig(value: ProjectBuildBatchConfig): Self = this.set("buildBatchConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildBatchConfig: Self = this.set("buildBatchConfig", js.undefined)
    @scala.inline
    def setCache(value: ProjectCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: ProjectDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEncryptionKey(value: NonEmptyString): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
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
    def setLastModified(value: Timestamp): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setLogsConfig(value: LogsConfig): Self = this.set("logsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogsConfig: Self = this.set("logsConfig", js.undefined)
    @scala.inline
    def setName(value: ProjectName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQueuedTimeoutInMinutes(value: TimeOut): Self = this.set("queuedTimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueuedTimeoutInMinutes: Self = this.set("queuedTimeoutInMinutes", js.undefined)
    @scala.inline
    def setSecondaryArtifactsVarargs(value: ProjectArtifacts*): Self = this.set("secondaryArtifacts", js.Array(value :_*))
    @scala.inline
    def setSecondaryArtifacts(value: ProjectArtifactsList): Self = this.set("secondaryArtifacts", value.asInstanceOf[js.Any])
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
    def setSourceVersion(value: String): Self = this.set("sourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceVersion: Self = this.set("sourceVersion", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimeoutInMinutes(value: TimeOut): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInMinutes: Self = this.set("timeoutInMinutes", js.undefined)
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
    @scala.inline
    def setWebhook(value: Webhook): Self = this.set("webhook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebhook: Self = this.set("webhook", js.undefined)
  }
  
}

