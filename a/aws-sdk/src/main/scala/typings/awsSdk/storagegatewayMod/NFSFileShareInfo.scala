package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NFSFileShareInfo extends js.Object {
  
  /**
    * Refresh cache information.
    */
  var CacheAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheAttributes] = js.native
  
  var ClientList: js.UndefOr[FileShareClientList] = js.native
  
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is S3_INTELLIGENT_TIERING. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.native
  
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.native
  
  var FileShareId: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareId] = js.native
  
  /**
    * The name of the file share. Optional.   FileShareName must be set if an S3 prefix name is set in LocationARN. 
    */
  var FileShareName: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareName] = js.native
  
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
  
  /**
    * The notification policy of the file share.
    */
  var NotificationPolicy: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationPolicy] = js.native
  
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
  def apply(): NFSFileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NFSFileShareInfo]
  }
  
  @scala.inline
  implicit class NFSFileShareInfoOps[Self <: NFSFileShareInfo] (val x: Self) extends AnyVal {
    
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
    def setFileShareARN(value: FileShareARN): Self = this.set("FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileShareARN: Self = this.set("FileShareARN", js.undefined)
    
    @scala.inline
    def setFileShareId(value: FileShareId): Self = this.set("FileShareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileShareId: Self = this.set("FileShareId", js.undefined)
    
    @scala.inline
    def setFileShareName(value: FileShareName): Self = this.set("FileShareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileShareName: Self = this.set("FileShareName", js.undefined)
    
    @scala.inline
    def setFileShareStatus(value: FileShareStatus): Self = this.set("FileShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileShareStatus: Self = this.set("FileShareStatus", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    
    @scala.inline
    def setGuessMIMETypeEnabled(value: Boolean): Self = this.set("GuessMIMETypeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuessMIMETypeEnabled: Self = this.set("GuessMIMETypeEnabled", js.undefined)
    
    @scala.inline
    def setKMSEncrypted(value: scala.Boolean): Self = this.set("KMSEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSEncrypted: Self = this.set("KMSEncrypted", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = this.set("KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSKey: Self = this.set("KMSKey", js.undefined)
    
    @scala.inline
    def setLocationARN(value: LocationARN): Self = this.set("LocationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationARN: Self = this.set("LocationARN", js.undefined)
    
    @scala.inline
    def setNFSFileShareDefaults(value: NFSFileShareDefaults): Self = this.set("NFSFileShareDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNFSFileShareDefaults: Self = this.set("NFSFileShareDefaults", js.undefined)
    
    @scala.inline
    def setNotificationPolicy(value: NotificationPolicy): Self = this.set("NotificationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationPolicy: Self = this.set("NotificationPolicy", js.undefined)
    
    @scala.inline
    def setObjectACL(value: ObjectACL): Self = this.set("ObjectACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectACL: Self = this.set("ObjectACL", js.undefined)
    
    @scala.inline
    def setPath(value: Path): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("ReadOnly", js.undefined)
    
    @scala.inline
    def setRequesterPays(value: Boolean): Self = this.set("RequesterPays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterPays: Self = this.set("RequesterPays", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    
    @scala.inline
    def setSquash(value: Squash): Self = this.set("Squash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquash: Self = this.set("Squash", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
