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
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
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
    *  Information about logs for the build project. A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both. 
    */
  var logsConfig: js.UndefOr[LogsConfig] = js.native
  /**
    * The name of the build project.
    */
  var name: js.UndefOr[ProjectName] = js.native
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.native
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.native
  /**
    *  An array of ProjectSourceVersion objects. If secondarySourceVersions is specified at the build level, then they take over these secondarySourceVersions (at the project level). 
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.native
  /**
    *  An array of ProjectSource objects. 
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
    * A version of the build input to be built for this project. If not specified, the latest version is used. If specified, it must be one of:   For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    If sourceVersion is specified at the build level, then that version takes precedence over this sourceVersion (at the project level).   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.native
  /**
    * The tags for this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
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
  def apply(
    arn: String = null,
    artifacts: ProjectArtifacts = null,
    badge: ProjectBadge = null,
    cache: ProjectCache = null,
    created: Timestamp = null,
    description: ProjectDescription = null,
    encryptionKey: NonEmptyString = null,
    environment: ProjectEnvironment = null,
    fileSystemLocations: ProjectFileSystemLocations = null,
    lastModified: Timestamp = null,
    logsConfig: LogsConfig = null,
    name: ProjectName = null,
    queuedTimeoutInMinutes: Int | Double = null,
    secondaryArtifacts: ProjectArtifactsList = null,
    secondarySourceVersions: ProjectSecondarySourceVersions = null,
    secondarySources: ProjectSources = null,
    serviceRole: NonEmptyString = null,
    source: ProjectSource = null,
    sourceVersion: String = null,
    tags: TagList = null,
    timeoutInMinutes: Int | Double = null,
    vpcConfig: VpcConfig = null,
    webhook: Webhook = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (fileSystemLocations != null) __obj.updateDynamic("fileSystemLocations")(fileSystemLocations.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (logsConfig != null) __obj.updateDynamic("logsConfig")(logsConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (queuedTimeoutInMinutes != null) __obj.updateDynamic("queuedTimeoutInMinutes")(queuedTimeoutInMinutes.asInstanceOf[js.Any])
    if (secondaryArtifacts != null) __obj.updateDynamic("secondaryArtifacts")(secondaryArtifacts.asInstanceOf[js.Any])
    if (secondarySourceVersions != null) __obj.updateDynamic("secondarySourceVersions")(secondarySourceVersions.asInstanceOf[js.Any])
    if (secondarySources != null) __obj.updateDynamic("secondarySources")(secondarySources.asInstanceOf[js.Any])
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceVersion != null) __obj.updateDynamic("sourceVersion")(sourceVersion.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeoutInMinutes != null) __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
}

