package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainRequest extends js.Object {
  /**
    * The mode of authentication that members use to access the domain.
    */
  var AuthMode: typings.awsSdk.sagemakerMod.AuthMode = js.native
  /**
    * The default user settings.
    */
  var DefaultUserSettings: UserSettings = js.native
  /**
    * A name for the domain.
    */
  var DomainName: typings.awsSdk.sagemakerMod.DomainName = js.native
  /**
    * The AWS Key Management Service (KMS) encryption key ID. Encryption with a customer master key (CMK) is not supported.
    */
  var HomeEfsFileSystemKmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The VPC subnets to use for communication with the EFS volume.
    */
  var SubnetIds: Subnets = js.native
  /**
    * Tags to associated with the Domain. Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags are searchable using the Search API.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the Amazon Virtual Private Cloud (VPC) to use for communication with the EFS volume.
    */
  var VpcId: typings.awsSdk.sagemakerMod.VpcId = js.native
}

object CreateDomainRequest {
  @scala.inline
  def apply(
    AuthMode: AuthMode,
    DefaultUserSettings: UserSettings,
    DomainName: DomainName,
    SubnetIds: Subnets,
    VpcId: VpcId,
    HomeEfsFileSystemKmsKeyId: KmsKeyId = null,
    Tags: TagList = null
  ): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(AuthMode = AuthMode.asInstanceOf[js.Any], DefaultUserSettings = DefaultUserSettings.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (HomeEfsFileSystemKmsKeyId != null) __obj.updateDynamic("HomeEfsFileSystemKmsKeyId")(HomeEfsFileSystemKmsKeyId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
}

