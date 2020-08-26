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
  def apply(fileSystemId: String): EFSVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EFSVolumeConfiguration]
  }
  @scala.inline
  implicit class EFSVolumeConfigurationOps[Self <: EFSVolumeConfiguration] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizationConfig(value: EFSAuthorizationConfig): Self = this.set("authorizationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationConfig: Self = this.set("authorizationConfig", js.undefined)
    @scala.inline
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDirectory: Self = this.set("rootDirectory", js.undefined)
    @scala.inline
    def setTransitEncryption(value: EFSTransitEncryption): Self = this.set("transitEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitEncryption: Self = this.set("transitEncryption", js.undefined)
    @scala.inline
    def setTransitEncryptionPort(value: BoxedInteger): Self = this.set("transitEncryptionPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitEncryptionPort: Self = this.set("transitEncryptionPort", js.undefined)
  }
  
}

