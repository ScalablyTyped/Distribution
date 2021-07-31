package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSMBFileShareInput extends StObject {
  
  /**
    * The files and folders on this share will only be visible to users with read access.
    */
  var AccessBasedEnumeration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of users or groups in the Active Directory that have administrator rights to the file share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var AdminUserList: js.UndefOr[FileShareUserList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the storage used for the audit logs.
    */
  var AuditDestinationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.AuditDestinationARN] = js.undefined
  
  /**
    * Refresh cache information.
    */
  var CacheAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheAttributes] = js.undefined
  
  /**
    * The case of an object name in an Amazon S3 bucket. For ClientSpecified, the client determines the case sensitivity. For CaseSensitive, the gateway determines the case sensitivity. The default value is ClientSpecified.
    */
  var CaseSensitivity: js.UndefOr[typings.awsSdk.storagegatewayMod.CaseSensitivity] = js.undefined
  
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is S3_INTELLIGENT_TIERING. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the SMB file share that you want to update.
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
    * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.undefined
  
  /**
    * The notification policy of the file share.
    */
  var NotificationPolicy: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationPolicy] = js.undefined
  
  /**
    * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a file gateway puts objects into. The default value is private.
    */
  var ObjectACL: js.UndefOr[typings.awsSdk.storagegatewayMod.ObjectACL] = js.undefined
  
  /**
    * A value that sets the write status of a file share. Set this value to true to set write status to read-only, otherwise set to false. Valid Values: true | false 
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs; otherwise, the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration.  Valid Values: true | false 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this value to true to enable access control list (ACL) on the SMB file share. Set it to false to map file and directory permissions to the POSIX permissions. For more information, see Using Microsoft Windows ACLs to control access to an SMB file share in the AWS Storage Gateway User Guide. Valid Values: true | false 
    */
  var SMBACLEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
}
object UpdateSMBFileShareInput {
  
  @scala.inline
  def apply(FileShareARN: FileShareARN): UpdateSMBFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSMBFileShareInput]
  }
  
  @scala.inline
  implicit class UpdateSMBFileShareInputMutableBuilder[Self <: UpdateSMBFileShareInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessBasedEnumeration(value: Boolean): Self = StObject.set(x, "AccessBasedEnumeration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessBasedEnumerationUndefined: Self = StObject.set(x, "AccessBasedEnumeration", js.undefined)
    
    @scala.inline
    def setAdminUserList(value: FileShareUserList): Self = StObject.set(x, "AdminUserList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminUserListUndefined: Self = StObject.set(x, "AdminUserList", js.undefined)
    
    @scala.inline
    def setAdminUserListVarargs(value: FileShareUser*): Self = StObject.set(x, "AdminUserList", js.Array(value :_*))
    
    @scala.inline
    def setAuditDestinationARN(value: AuditDestinationARN): Self = StObject.set(x, "AuditDestinationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditDestinationARNUndefined: Self = StObject.set(x, "AuditDestinationARN", js.undefined)
    
    @scala.inline
    def setCacheAttributes(value: CacheAttributes): Self = StObject.set(x, "CacheAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheAttributesUndefined: Self = StObject.set(x, "CacheAttributes", js.undefined)
    
    @scala.inline
    def setCaseSensitivity(value: CaseSensitivity): Self = StObject.set(x, "CaseSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitivityUndefined: Self = StObject.set(x, "CaseSensitivity", js.undefined)
    
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
    def setInvalidUserList(value: FileShareUserList): Self = StObject.set(x, "InvalidUserList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUserListUndefined: Self = StObject.set(x, "InvalidUserList", js.undefined)
    
    @scala.inline
    def setInvalidUserListVarargs(value: FileShareUser*): Self = StObject.set(x, "InvalidUserList", js.Array(value :_*))
    
    @scala.inline
    def setKMSEncrypted(value: Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
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
    def setSMBACLEnabled(value: Boolean): Self = StObject.set(x, "SMBACLEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSMBACLEnabledUndefined: Self = StObject.set(x, "SMBACLEnabled", js.undefined)
    
    @scala.inline
    def setValidUserList(value: FileShareUserList): Self = StObject.set(x, "ValidUserList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUserListUndefined: Self = StObject.set(x, "ValidUserList", js.undefined)
    
    @scala.inline
    def setValidUserListVarargs(value: FileShareUser*): Self = StObject.set(x, "ValidUserList", js.Array(value :_*))
  }
}
