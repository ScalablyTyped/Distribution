package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNFSFileShareInput extends js.Object {
  /**
    * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks.
    */
  var ClientList: js.UndefOr[FileShareClientList] = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is S3_INTELLIGENT_TIERING. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.native
  /**
    * The Amazon Resource Name (ARN) of the file share to be updated.
    */
  var FileShareARN: typings.awsSdk.storagegatewayMod.FileShareARN = js.native
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, otherwise set to false. The default value is true. Valid Values: true | false 
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The default values for the file share. Optional.
    */
  var NFSFileShareDefaults: js.UndefOr[typings.awsSdk.storagegatewayMod.NFSFileShareDefaults] = js.native
  /**
    * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts objects into. The default value is private.
    */
  var ObjectACL: js.UndefOr[typings.awsSdk.storagegatewayMod.ObjectACL] = js.native
  /**
    * A value that sets the write status of a file share. Set this value to true to set the write status to read-only, otherwise set to false. Valid Values: true | false 
    */
  var ReadOnly: js.UndefOr[Boolean] = js.native
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs; otherwise, the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration.  Valid Values: true | false 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.native
  /**
    * The user mapped to anonymous user. Valid values are the following:    RootSquash: Only root is mapped to anonymous user.    NoSquash: No one is mapped to anonymous user.    AllSquash: Everyone is mapped to anonymous user.  
    */
  var Squash: js.UndefOr[typings.awsSdk.storagegatewayMod.Squash] = js.native
}

object UpdateNFSFileShareInput {
  @scala.inline
  def apply(
    FileShareARN: FileShareARN,
    ClientList: FileShareClientList = null,
    DefaultStorageClass: StorageClass = null,
    GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined,
    KMSEncrypted: js.UndefOr[Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    NFSFileShareDefaults: NFSFileShareDefaults = null,
    ObjectACL: ObjectACL = null,
    ReadOnly: js.UndefOr[Boolean] = js.undefined,
    RequesterPays: js.UndefOr[Boolean] = js.undefined,
    Squash: Squash = null
  ): UpdateNFSFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    if (ClientList != null) __obj.updateDynamic("ClientList")(ClientList.asInstanceOf[js.Any])
    if (DefaultStorageClass != null) __obj.updateDynamic("DefaultStorageClass")(DefaultStorageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(GuessMIMETypeEnabled)) __obj.updateDynamic("GuessMIMETypeEnabled")(GuessMIMETypeEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted.get.asInstanceOf[js.Any])
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey.asInstanceOf[js.Any])
    if (NFSFileShareDefaults != null) __obj.updateDynamic("NFSFileShareDefaults")(NFSFileShareDefaults.asInstanceOf[js.Any])
    if (ObjectACL != null) __obj.updateDynamic("ObjectACL")(ObjectACL.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadOnly)) __obj.updateDynamic("ReadOnly")(ReadOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequesterPays)) __obj.updateDynamic("RequesterPays")(RequesterPays.get.asInstanceOf[js.Any])
    if (Squash != null) __obj.updateDynamic("Squash")(Squash.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNFSFileShareInput]
  }
}

