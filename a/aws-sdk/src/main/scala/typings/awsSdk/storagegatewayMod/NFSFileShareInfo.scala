package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NFSFileShareInfo extends StObject {
  
  /**
    * Refresh cache information.
    */
  var CacheAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheAttributes] = js.undefined
  
  var ClientList: js.UndefOr[FileShareClientList] = js.undefined
  
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is S3_INTELLIGENT_TIERING. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
  
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.undefined
  
  var FileShareId: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareId] = js.undefined
  
  /**
    * The name of the file share. Optional.   FileShareName must be set if an S3 prefix name is set in LocationARN. 
    */
  var FileShareName: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareName] = js.undefined
  
  var FileShareStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareStatus] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
  
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, otherwise set to false. The default value is true. Valid Values: true | false 
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.undefined
  
  var LocationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.LocationARN] = js.undefined
  
  var NFSFileShareDefaults: js.UndefOr[typings.awsSdk.storagegatewayMod.NFSFileShareDefaults] = js.undefined
  
  /**
    * The notification policy of the file share.
    */
  var NotificationPolicy: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationPolicy] = js.undefined
  
  var ObjectACL: js.UndefOr[typings.awsSdk.storagegatewayMod.ObjectACL] = js.undefined
  
  var Path: js.UndefOr[typings.awsSdk.storagegatewayMod.Path] = js.undefined
  
  /**
    * A value that sets the write status of a file share. Set this value to true to set the write status to read-only, otherwise set to false. Valid Values: true | false 
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs; otherwise, the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration.  Valid Values: true | false 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  
  var Role: js.UndefOr[typings.awsSdk.storagegatewayMod.Role] = js.undefined
  
  var Squash: js.UndefOr[typings.awsSdk.storagegatewayMod.Squash] = js.undefined
  
  /**
    * A list of up to 50 tags assigned to the NFS file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.undefined
}
object NFSFileShareInfo {
  
  @scala.inline
  def apply(): NFSFileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NFSFileShareInfo]
  }
  
  @scala.inline
  implicit class NFSFileShareInfoMutableBuilder[Self <: NFSFileShareInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheAttributes(value: CacheAttributes): Self = StObject.set(x, "CacheAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheAttributesUndefined: Self = StObject.set(x, "CacheAttributes", js.undefined)
    
    @scala.inline
    def setClientList(value: FileShareClientList): Self = StObject.set(x, "ClientList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientListUndefined: Self = StObject.set(x, "ClientList", js.undefined)
    
    @scala.inline
    def setClientListVarargs(value: IPV4AddressCIDR*): Self = StObject.set(x, "ClientList", js.Array(value :_*))
    
    @scala.inline
    def setDefaultStorageClass(value: StorageClass): Self = StObject.set(x, "DefaultStorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStorageClassUndefined: Self = StObject.set(x, "DefaultStorageClass", js.undefined)
    
    @scala.inline
    def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
    
    @scala.inline
    def setFileShareId(value: FileShareId): Self = StObject.set(x, "FileShareId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareIdUndefined: Self = StObject.set(x, "FileShareId", js.undefined)
    
    @scala.inline
    def setFileShareName(value: FileShareName): Self = StObject.set(x, "FileShareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareNameUndefined: Self = StObject.set(x, "FileShareName", js.undefined)
    
    @scala.inline
    def setFileShareStatus(value: FileShareStatus): Self = StObject.set(x, "FileShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareStatusUndefined: Self = StObject.set(x, "FileShareStatus", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setGuessMIMETypeEnabled(value: Boolean): Self = StObject.set(x, "GuessMIMETypeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuessMIMETypeEnabledUndefined: Self = StObject.set(x, "GuessMIMETypeEnabled", js.undefined)
    
    @scala.inline
    def setKMSEncrypted(value: scala.Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    @scala.inline
    def setLocationARN(value: LocationARN): Self = StObject.set(x, "LocationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationARNUndefined: Self = StObject.set(x, "LocationARN", js.undefined)
    
    @scala.inline
    def setNFSFileShareDefaults(value: NFSFileShareDefaults): Self = StObject.set(x, "NFSFileShareDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNFSFileShareDefaultsUndefined: Self = StObject.set(x, "NFSFileShareDefaults", js.undefined)
    
    @scala.inline
    def setNotificationPolicy(value: NotificationPolicy): Self = StObject.set(x, "NotificationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationPolicyUndefined: Self = StObject.set(x, "NotificationPolicy", js.undefined)
    
    @scala.inline
    def setObjectACL(value: ObjectACL): Self = StObject.set(x, "ObjectACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectACLUndefined: Self = StObject.set(x, "ObjectACL", js.undefined)
    
    @scala.inline
    def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    @scala.inline
    def setRequesterPays(value: Boolean): Self = StObject.set(x, "RequesterPays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterPaysUndefined: Self = StObject.set(x, "RequesterPays", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setSquash(value: Squash): Self = StObject.set(x, "Squash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquashUndefined: Self = StObject.set(x, "Squash", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
