package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNFSFileShareInput extends js.Object {
  /**
    * Refresh cache information.
    */
  var CacheAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheAttributes] = js.native
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
    * The name of the file share. Optional.   FileShareName must be set if an S3 prefix name is set in LocationARN. 
    */
  var FileShareName: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareName] = js.native
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
  def apply(FileShareARN: FileShareARN): UpdateNFSFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNFSFileShareInput]
  }
  @scala.inline
  implicit class UpdateNFSFileShareInputOps[Self <: UpdateNFSFileShareInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileShareARN(value: FileShareARN): Self = this.set("FileShareARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheAttributes(value: CacheAttributes): Self = this.set("CacheAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheAttributes: Self = this.set("CacheAttributes", js.undefined)
    @scala.inline
    def setClientListVarargs(value: IPV4AddressCIDR*): Self = this.set("ClientList", js.Array(value :_*))
    @scala.inline
    def setClientList(value: FileShareClientList): Self = this.set("ClientList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientList: Self = this.set("ClientList", js.undefined)
    @scala.inline
    def setDefaultStorageClass(value: StorageClass): Self = this.set("DefaultStorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStorageClass: Self = this.set("DefaultStorageClass", js.undefined)
    @scala.inline
    def setFileShareName(value: FileShareName): Self = this.set("FileShareName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileShareName: Self = this.set("FileShareName", js.undefined)
    @scala.inline
    def setGuessMIMETypeEnabled(value: Boolean): Self = this.set("GuessMIMETypeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuessMIMETypeEnabled: Self = this.set("GuessMIMETypeEnabled", js.undefined)
    @scala.inline
    def setKMSEncrypted(value: Boolean): Self = this.set("KMSEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSEncrypted: Self = this.set("KMSEncrypted", js.undefined)
    @scala.inline
    def setKMSKey(value: KMSKey): Self = this.set("KMSKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSKey: Self = this.set("KMSKey", js.undefined)
    @scala.inline
    def setNFSFileShareDefaults(value: NFSFileShareDefaults): Self = this.set("NFSFileShareDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNFSFileShareDefaults: Self = this.set("NFSFileShareDefaults", js.undefined)
    @scala.inline
    def setObjectACL(value: ObjectACL): Self = this.set("ObjectACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectACL: Self = this.set("ObjectACL", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("ReadOnly", js.undefined)
    @scala.inline
    def setRequesterPays(value: Boolean): Self = this.set("RequesterPays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterPays: Self = this.set("RequesterPays", js.undefined)
    @scala.inline
    def setSquash(value: Squash): Self = this.set("Squash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquash: Self = this.set("Squash", js.undefined)
  }
  
}

