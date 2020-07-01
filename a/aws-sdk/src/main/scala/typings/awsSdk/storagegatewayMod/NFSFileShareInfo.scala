package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NFSFileShareInfo extends js.Object {
  var ClientList: js.UndefOr[FileShareClientList] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is S3_INTELLIGENT_TIERING. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.native
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.native
  var FileShareId: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareId] = js.native
  var FileShareStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareStatus] = js.native
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, otherwise set to false. The default value is true. Valid Values: true | false 
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[scala.Boolean] = js.native
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  var LocationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.LocationARN] = js.native
  var NFSFileShareDefaults: js.UndefOr[typings.awsSdk.storagegatewayMod.NFSFileShareDefaults] = js.native
  var ObjectACL: js.UndefOr[typings.awsSdk.storagegatewayMod.ObjectACL] = js.native
  var Path: js.UndefOr[typings.awsSdk.storagegatewayMod.Path] = js.native
  /**
    * A value that sets the write status of a file share. Set this value to true to set the write status to read-only, otherwise set to false. Valid Values: true | false 
    */
  var ReadOnly: js.UndefOr[Boolean] = js.native
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs; otherwise, the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration.  Valid Values: true | false 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.native
  var Role: js.UndefOr[typings.awsSdk.storagegatewayMod.Role] = js.native
  var Squash: js.UndefOr[typings.awsSdk.storagegatewayMod.Squash] = js.native
  /**
    * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
}

object NFSFileShareInfo {
  @scala.inline
  def apply(
    ClientList: FileShareClientList = null,
    DefaultStorageClass: StorageClass = null,
    FileShareARN: FileShareARN = null,
    FileShareId: FileShareId = null,
    FileShareStatus: FileShareStatus = null,
    GatewayARN: GatewayARN = null,
    GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
    KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    LocationARN: LocationARN = null,
    NFSFileShareDefaults: NFSFileShareDefaults = null,
    ObjectACL: ObjectACL = null,
    Path: Path = null,
    ReadOnly: js.UndefOr[Boolean] = js.undefined,
    RequesterPays: js.UndefOr[Boolean] = js.undefined,
    Role: Role = null,
    Squash: Squash = null,
    Tags: Tags = null
  ): NFSFileShareInfo = {
    val __obj = js.Dynamic.literal()
    if (ClientList != null) __obj.updateDynamic("ClientList")(ClientList.asInstanceOf[js.Any])
    if (DefaultStorageClass != null) __obj.updateDynamic("DefaultStorageClass")(DefaultStorageClass.asInstanceOf[js.Any])
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN.asInstanceOf[js.Any])
    if (FileShareId != null) __obj.updateDynamic("FileShareId")(FileShareId.asInstanceOf[js.Any])
    if (FileShareStatus != null) __obj.updateDynamic("FileShareStatus")(FileShareStatus.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (!js.isUndefined(GuessMIMETypeEnabled)) __obj.updateDynamic("GuessMIMETypeEnabled")(GuessMIMETypeEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted.get.asInstanceOf[js.Any])
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey.asInstanceOf[js.Any])
    if (LocationARN != null) __obj.updateDynamic("LocationARN")(LocationARN.asInstanceOf[js.Any])
    if (NFSFileShareDefaults != null) __obj.updateDynamic("NFSFileShareDefaults")(NFSFileShareDefaults.asInstanceOf[js.Any])
    if (ObjectACL != null) __obj.updateDynamic("ObjectACL")(ObjectACL.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays.get.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Squash != null) __obj.updateDynamic("Squash")(Squash.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFSFileShareInfo]
  }
}

