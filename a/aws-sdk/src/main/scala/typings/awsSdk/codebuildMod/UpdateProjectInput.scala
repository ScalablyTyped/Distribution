package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectInput extends StObject {
  
  /**
    * Information to be changed about the build output artifacts for the build project.
    */
  var artifacts: js.UndefOr[ProjectArtifacts] = js.undefined
  
  /**
    * Set this to true to generate a publicly accessible URL for your project's build badge.
    */
  var badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.undefined
  
  /**
    * Stores recently used information so that it can be quickly accessed at a later time.
    */
  var cache: js.UndefOr[ProjectCache] = js.undefined
  
  /**
    * A new or replacement description of the build project.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information to be changed about the build environment for the build project.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.undefined
  
  /**
    *  An array of ProjectFileSystemLocation objects for a CodeBuild build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined
  
  /**
    *  Information about logs for the build project. A project can create logs in Amazon CloudWatch Logs, logs in an S3 bucket, or both. 
    */
  var logsConfig: js.UndefOr[LogsConfig] = js.undefined
  
  /**
    * The name of the build project.  You cannot change a build project's name. 
    */
  var name: NonEmptyString
  
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  
  /**
    *  An array of ProjectSource objects. 
    */
  var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined
  
  /**
    *  An array of ProjectSourceVersion objects. If secondarySourceVersions is specified at the build level, then they take over these secondarySourceVersions (at the project level). 
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  
  /**
    *  An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.undefined
  
  /**
    * The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information to be changed about the build input source code for the build project.
    */
  var source: js.UndefOr[ProjectSource] = js.undefined
  
  /**
    *  A version of the build input to be built for this project. If not specified, the latest version is used. If specified, it must be one of:    For AWS CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.    If sourceVersion is specified at the build level, then that version takes precedence over this sourceVersion (at the project level).   For more information, see Source Version Sample with CodeBuild in the AWS CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An updated list of tag key and value pairs associated with this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any related build that did not get marked as completed.
    */
  var timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  
  /**
    * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}
object UpdateProjectInput {
  
  inline def apply(name: NonEmptyString): UpdateProjectInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectInput]
  }
  
  extension [Self <: UpdateProjectInput](x: Self) {
    
    inline def setArtifacts(value: ProjectArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setBadgeEnabled(value: WrapperBoolean): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
    
    inline def setBadgeEnabledUndefined: Self = StObject.set(x, "badgeEnabled", js.undefined)
    
    inline def setBuildBatchConfig(value: ProjectBuildBatchConfig): Self = StObject.set(x, "buildBatchConfig", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchConfigUndefined: Self = StObject.set(x, "buildBatchConfig", js.undefined)
    
    inline def setCache(value: ProjectCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setDescription(value: ProjectDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setEnvironment(value: ProjectEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setFileSystemLocations(value: ProjectFileSystemLocations): Self = StObject.set(x, "fileSystemLocations", value.asInstanceOf[js.Any])
    
    inline def setFileSystemLocationsUndefined: Self = StObject.set(x, "fileSystemLocations", js.undefined)
    
    inline def setFileSystemLocationsVarargs(value: ProjectFileSystemLocation*): Self = StObject.set(x, "fileSystemLocations", js.Array(value :_*))
    
    inline def setLogsConfig(value: LogsConfig): Self = StObject.set(x, "logsConfig", value.asInstanceOf[js.Any])
    
    inline def setLogsConfigUndefined: Self = StObject.set(x, "logsConfig", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeoutInMinutes(value: TimeOut): Self = StObject.set(x, "queuedTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeoutInMinutesUndefined: Self = StObject.set(x, "queuedTimeoutInMinutes", js.undefined)
    
    inline def setSecondaryArtifacts(value: ProjectArtifactsList): Self = StObject.set(x, "secondaryArtifacts", value.asInstanceOf[js.Any])
    
    inline def setSecondaryArtifactsUndefined: Self = StObject.set(x, "secondaryArtifacts", js.undefined)
    
    inline def setSecondaryArtifactsVarargs(value: ProjectArtifacts*): Self = StObject.set(x, "secondaryArtifacts", js.Array(value :_*))
    
    inline def setSecondarySourceVersions(value: ProjectSecondarySourceVersions): Self = StObject.set(x, "secondarySourceVersions", value.asInstanceOf[js.Any])
    
    inline def setSecondarySourceVersionsUndefined: Self = StObject.set(x, "secondarySourceVersions", js.undefined)
    
    inline def setSecondarySourceVersionsVarargs(value: ProjectSourceVersion*): Self = StObject.set(x, "secondarySourceVersions", js.Array(value :_*))
    
    inline def setSecondarySources(value: ProjectSources): Self = StObject.set(x, "secondarySources", value.asInstanceOf[js.Any])
    
    inline def setSecondarySourcesUndefined: Self = StObject.set(x, "secondarySources", js.undefined)
    
    inline def setSecondarySourcesVarargs(value: ProjectSource*): Self = StObject.set(x, "secondarySources", js.Array(value :_*))
    
    inline def setServiceRole(value: NonEmptyString): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    inline def setSource(value: ProjectSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTimeoutInMinutes(value: TimeOut): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutesUndefined: Self = StObject.set(x, "timeoutInMinutes", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
