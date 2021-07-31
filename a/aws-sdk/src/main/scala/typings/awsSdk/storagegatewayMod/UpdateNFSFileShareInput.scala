package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNFSFileShareInput extends StObject {
  
  /**
    * Refresh cache information.
    */
  var CacheAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheAttributes] = js.undefined
  
  /**
    * The list of clients that are allowed to access the file gateway. The list must contain either valid IP addresses or valid CIDR blocks.
    */
  var ClientList: js.UndefOr[FileShareClientList] = js.undefined
  
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is S3_INTELLIGENT_TIERING. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the file share to be updated.
    */
  var FileShareARN: typings.awsSdk.storagegatewayMod.FileShareARN
  
  /**
    * The name of the file share. Optional.   FileShareName must be set if an S3 prefix name is set in LocationARN. 
    */
  var FileShareName: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareName] = js.undefined
  
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, otherwise set to false. The default value is true. Valid Values: true | false 
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.undefined
  
  /**
    * The default values for the file share. Optional.
    */
  var NFSFileShareDefaults: js.UndefOr[typings.awsSdk.storagegatewayMod.NFSFileShareDefaults] = js.undefined
  
  /**
    * The notification policy of the file share.
    */
  var NotificationPolicy: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationPolicy] = js.undefined
  
  /**
    * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts objects into. The default value is private.
    */
  var ObjectACL: js.UndefOr[typings.awsSdk.storagegatewayMod.ObjectACL] = js.undefined
  
  /**
    * A value that sets the write status of a file share. Set this value to true to set the write status to read-only, otherwise set to false. Valid Values: true | false 
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs; otherwise, the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration.  Valid Values: true | false 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user mapped to anonymous user. Valid values are the following:    RootSquash: Only root is mapped to anonymous user.    NoSquash: No one is mapped to anonymous user.    AllSquash: Everyone is mapped to anonymous user.  
    */
  var Squash: js.UndefOr[typings.awsSdk.storagegatewayMod.Squash] = js.undefined
}
object UpdateNFSFileShareInput {
  
  @scala.inline
  def apply(FileShareARN: FileShareARN): UpdateNFSFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNFSFileShareInput]
  }
  
  @scala.inline
  implicit class UpdateNFSFileShareInputMutableBuilder[Self <: UpdateNFSFileShareInput] (val x: Self) extends AnyVal {
    
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
    def setFileShareName(value: FileShareName): Self = StObject.set(x, "FileShareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareNameUndefined: Self = StObject.set(x, "FileShareName", js.undefined)
    
    @scala.inline
    def setGuessMIMETypeEnabled(value: Boolean): Self = StObject.set(x, "GuessMIMETypeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuessMIMETypeEnabledUndefined: Self = StObject.set(x, "GuessMIMETypeEnabled", js.undefined)
    
    @scala.inline
    def setKMSEncrypted(value: Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
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
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    @scala.inline
    def setRequesterPays(value: Boolean): Self = StObject.set(x, "RequesterPays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterPaysUndefined: Self = StObject.set(x, "RequesterPays", js.undefined)
    
    @scala.inline
    def setSquash(value: Squash): Self = StObject.set(x, "Squash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquashUndefined: Self = StObject.set(x, "Squash", js.undefined)
  }
}
