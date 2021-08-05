package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMBFileShareInfo extends StObject {
  
  /**
    * Indicates whether AccessBasedEnumeration is enabled.
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
  
  var Authentication: js.UndefOr[typings.awsSdk.storagegatewayMod.Authentication] = js.undefined
  
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
    * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var InvalidUserList: js.UndefOr[FileShareUserList] = js.undefined
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.undefined
  
  var LocationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.LocationARN] = js.undefined
  
  /**
    * The notification policy of the file share.
    */
  var NotificationPolicy: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationPolicy] = js.undefined
  
  var ObjectACL: js.UndefOr[typings.awsSdk.storagegatewayMod.ObjectACL] = js.undefined
  
  /**
    * The file share path used by the SMB client to identify the mount point.
    */
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
  
  /**
    * If this value is set to true, it indicates that access control list (ACL) is enabled on the SMB file share. If it is set to false, it indicates that file and directory permissions are mapped to the POSIX permission. For more information, see Using Microsoft Windows ACLs to control access to an SMB file share in the AWS Storage Gateway User Guide.
    */
  var SMBACLEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.undefined
  
  /**
    * A list of users or groups in the Active Directory that are allowed to access the file share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var ValidUserList: js.UndefOr[FileShareUserList] = js.undefined
}
object SMBFileShareInfo {
  
  inline def apply(): SMBFileShareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMBFileShareInfo]
  }
  
  extension [Self <: SMBFileShareInfo](x: Self) {
    
    inline def setAccessBasedEnumeration(value: Boolean): Self = StObject.set(x, "AccessBasedEnumeration", value.asInstanceOf[js.Any])
    
    inline def setAccessBasedEnumerationUndefined: Self = StObject.set(x, "AccessBasedEnumeration", js.undefined)
    
    inline def setAdminUserList(value: FileShareUserList): Self = StObject.set(x, "AdminUserList", value.asInstanceOf[js.Any])
    
    inline def setAdminUserListUndefined: Self = StObject.set(x, "AdminUserList", js.undefined)
    
    inline def setAdminUserListVarargs(value: FileShareUser*): Self = StObject.set(x, "AdminUserList", js.Array(value :_*))
    
    inline def setAuditDestinationARN(value: AuditDestinationARN): Self = StObject.set(x, "AuditDestinationARN", value.asInstanceOf[js.Any])
    
    inline def setAuditDestinationARNUndefined: Self = StObject.set(x, "AuditDestinationARN", js.undefined)
    
    inline def setAuthentication(value: Authentication): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    inline def setCacheAttributes(value: CacheAttributes): Self = StObject.set(x, "CacheAttributes", value.asInstanceOf[js.Any])
    
    inline def setCacheAttributesUndefined: Self = StObject.set(x, "CacheAttributes", js.undefined)
    
    inline def setCaseSensitivity(value: CaseSensitivity): Self = StObject.set(x, "CaseSensitivity", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitivityUndefined: Self = StObject.set(x, "CaseSensitivity", js.undefined)
    
    inline def setDefaultStorageClass(value: StorageClass): Self = StObject.set(x, "DefaultStorageClass", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageClassUndefined: Self = StObject.set(x, "DefaultStorageClass", js.undefined)
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
    
    inline def setFileShareId(value: FileShareId): Self = StObject.set(x, "FileShareId", value.asInstanceOf[js.Any])
    
    inline def setFileShareIdUndefined: Self = StObject.set(x, "FileShareId", js.undefined)
    
    inline def setFileShareName(value: FileShareName): Self = StObject.set(x, "FileShareName", value.asInstanceOf[js.Any])
    
    inline def setFileShareNameUndefined: Self = StObject.set(x, "FileShareName", js.undefined)
    
    inline def setFileShareStatus(value: FileShareStatus): Self = StObject.set(x, "FileShareStatus", value.asInstanceOf[js.Any])
    
    inline def setFileShareStatusUndefined: Self = StObject.set(x, "FileShareStatus", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setGuessMIMETypeEnabled(value: Boolean): Self = StObject.set(x, "GuessMIMETypeEnabled", value.asInstanceOf[js.Any])
    
    inline def setGuessMIMETypeEnabledUndefined: Self = StObject.set(x, "GuessMIMETypeEnabled", js.undefined)
    
    inline def setInvalidUserList(value: FileShareUserList): Self = StObject.set(x, "InvalidUserList", value.asInstanceOf[js.Any])
    
    inline def setInvalidUserListUndefined: Self = StObject.set(x, "InvalidUserList", js.undefined)
    
    inline def setInvalidUserListVarargs(value: FileShareUser*): Self = StObject.set(x, "InvalidUserList", js.Array(value :_*))
    
    inline def setKMSEncrypted(value: scala.Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    inline def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setLocationARN(value: LocationARN): Self = StObject.set(x, "LocationARN", value.asInstanceOf[js.Any])
    
    inline def setLocationARNUndefined: Self = StObject.set(x, "LocationARN", js.undefined)
    
    inline def setNotificationPolicy(value: NotificationPolicy): Self = StObject.set(x, "NotificationPolicy", value.asInstanceOf[js.Any])
    
    inline def setNotificationPolicyUndefined: Self = StObject.set(x, "NotificationPolicy", js.undefined)
    
    inline def setObjectACL(value: ObjectACL): Self = StObject.set(x, "ObjectACL", value.asInstanceOf[js.Any])
    
    inline def setObjectACLUndefined: Self = StObject.set(x, "ObjectACL", js.undefined)
    
    inline def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setRequesterPays(value: Boolean): Self = StObject.set(x, "RequesterPays", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysUndefined: Self = StObject.set(x, "RequesterPays", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setSMBACLEnabled(value: Boolean): Self = StObject.set(x, "SMBACLEnabled", value.asInstanceOf[js.Any])
    
    inline def setSMBACLEnabledUndefined: Self = StObject.set(x, "SMBACLEnabled", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setValidUserList(value: FileShareUserList): Self = StObject.set(x, "ValidUserList", value.asInstanceOf[js.Any])
    
    inline def setValidUserListUndefined: Self = StObject.set(x, "ValidUserList", js.undefined)
    
    inline def setValidUserListVarargs(value: FileShareUser*): Self = StObject.set(x, "ValidUserList", js.Array(value :_*))
  }
}
