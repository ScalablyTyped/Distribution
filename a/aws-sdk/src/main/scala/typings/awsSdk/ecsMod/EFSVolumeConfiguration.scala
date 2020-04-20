package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EFSVolumeConfiguration extends js.Object {
  /**
    * The authorization configuration details for the Amazon EFS file system.
    */
  var authorizationConfig: js.UndefOr[EFSAuthorizationConfig] = js.native
  /**
    * The Amazon EFS file system ID to use.
    */
  var fileSystemId: String = js.native
  /**
    * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying / will have the same effect as omitting this parameter.
    */
  var rootDirectory: js.UndefOr[String] = js.native
  /**
    * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this parameter is omitted, the default value of DISABLED is used. For more information, see Encrypting Data in Transit in the Amazon Elastic File System User Guide.
    */
  var transitEncryption: js.UndefOr[EFSTransitEncryption] = js.native
  /**
    * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses. For more information, see EFS Mount Helper in the Amazon Elastic File System User Guide.
    */
  var transitEncryptionPort: js.UndefOr[BoxedInteger] = js.native
}

object EFSVolumeConfiguration {
  @scala.inline
  def apply(
    fileSystemId: String,
    authorizationConfig: EFSAuthorizationConfig = null,
    rootDirectory: String = null,
    transitEncryption: EFSTransitEncryption = null,
    transitEncryptionPort: Int | scala.Double = null
  ): EFSVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    if (authorizationConfig != null) __obj.updateDynamic("authorizationConfig")(authorizationConfig.asInstanceOf[js.Any])
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory.asInstanceOf[js.Any])
    if (transitEncryption != null) __obj.updateDynamic("transitEncryption")(transitEncryption.asInstanceOf[js.Any])
    if (transitEncryptionPort != null) __obj.updateDynamic("transitEncryptionPort")(transitEncryptionPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[EFSVolumeConfiguration]
  }
}

