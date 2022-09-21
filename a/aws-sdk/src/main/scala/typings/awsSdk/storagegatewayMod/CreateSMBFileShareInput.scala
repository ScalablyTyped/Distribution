package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSMBFileShareInput extends StObject {
  
  /**
    * The files and folders on this share will only be visible to users with read access.
    */
  var AccessBasedEnumeration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of users or groups in the Active Directory that will be granted administrator privileges on the file share. These users can do all file operations as the super-user. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1.  Use this option very carefully, because any user in this list can do anything they like on the file share, regardless of file permissions. 
    */
  var AdminUserList: js.UndefOr[UserList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the storage used for audit logs.
    */
  var AuditDestinationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.AuditDestinationARN] = js.undefined
  
  /**
    * The authentication method that users use to access the file share. The default is ActiveDirectory. Valid Values: ActiveDirectory | GuestAccess 
    */
  var Authentication: js.UndefOr[typings.awsSdk.storagegatewayMod.Authentication] = js.undefined
  
  /**
    * Specifies the Region of the S3 bucket where the SMB file share stores files.  This parameter is required for SMB file shares that connect to Amazon S3 through a VPC endpoint, a VPC access point, or an access point alias that points to a VPC access point. 
    */
  var BucketRegion: js.UndefOr[RegionId] = js.undefined
  
  /**
    * Specifies refresh cache information for the file share.
    */
  var CacheAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheAttributes] = js.undefined
  
  /**
    * The case of an object name in an Amazon S3 bucket. For ClientSpecified, the client determines the case sensitivity. For CaseSensitive, the gateway determines the case sensitivity. The default value is ClientSpecified.
    */
  var CaseSensitivity: js.UndefOr[typings.awsSdk.storagegatewayMod.CaseSensitivity] = js.undefined
  
  /**
    * A unique string value that you supply that is used by S3 File Gateway to ensure idempotent file share creation.
    */
  var ClientToken: typings.awsSdk.storagegatewayMod.ClientToken
  
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the S3 File Gateway. The default value is S3_STANDARD. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.undefined
  
  /**
    * The name of the file share. Optional.   FileShareName must be set if an S3 prefix name is set in LocationARN, or if an access point or access point alias is used. 
    */
  var FileShareName: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareName] = js.undefined
  
  /**
    * The ARN of the S3 File Gateway on which you want to create a file share.
    */
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
  
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, otherwise set to false. The default value is true. Valid Values: true | false 
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var InvalidUserList: js.UndefOr[UserList] = js.undefined
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.undefined
  
  /**
    * A custom ARN for the backend storage used for storing data for file shares. It includes a resource ARN with an optional prefix concatenation. The prefix must end with a forward slash (/).  You can specify LocationARN as a bucket ARN, access point ARN or access point alias, as shown in the following examples. Bucket ARN:  arn:aws:s3:::my-bucket/prefix/  Access point ARN:  arn:aws:s3:region:account-id:accesspoint/access-point-name/prefix/  If you specify an access point, the bucket policy must be configured to delegate access control to the access point. For information, see Delegating access control to access points in the Amazon S3 User Guide. Access point alias:  test-ap-ab123cdef4gehijklmn5opqrstuvuse1a-s3alias  
    */
  var LocationARN: typings.awsSdk.storagegatewayMod.LocationARN
  
  /**
    * The notification policy of the file share. SettlingTimeInSeconds controls the number of seconds to wait after the last point in time a client wrote to a file before generating an ObjectUploaded notification. Because clients can make many small writes to files, it's best to set this parameter for as long as possible to avoid generating multiple notifications for the same file in a small time period.   SettlingTimeInSeconds has no effect on the timing of the object uploading to Amazon S3, only the timing of the notification.  The following example sets NotificationPolicy on with SettlingTimeInSeconds set to 60.  {\"Upload\": {\"SettlingTimeInSeconds\": 60}}  The following example sets NotificationPolicy off.  {} 
    */
  var NotificationPolicy: js.UndefOr[typings.awsSdk.storagegatewayMod.NotificationPolicy] = js.undefined
  
  /**
    * A value that sets the access control list (ACL) permission for objects in the S3 bucket that a S3 File Gateway puts objects into. The default value is private.
    */
  var ObjectACL: js.UndefOr[typings.awsSdk.storagegatewayMod.ObjectACL] = js.undefined
  
  /**
    * Specifies whether opportunistic locking is enabled for the SMB file share.  Enabling opportunistic locking on case-sensitive shares is not recommended for workloads that involve access to files with the same name in different case.  Valid Values: true | false 
    */
  var OplocksEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that sets the write status of a file share. Set this value to true to set the write status to read-only, otherwise set to false. Valid Values: true | false 
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that sets who pays the cost of the request and the cost associated with data download from the S3 bucket. If this value is set to true, the requester pays the costs; otherwise, the S3 bucket owner pays. However, the S3 bucket owner always pays the cost of storing data.   RequesterPays is a configuration for the S3 bucket that backs the file share, so make sure that the configuration on the file share is the same as the S3 bucket configuration.  Valid Values: true | false 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the Identity and Access Management (IAM) role that an S3 File Gateway assumes when it accesses the underlying storage.
    */
  var Role: typings.awsSdk.storagegatewayMod.Role
  
  /**
    * Set this value to true to enable access control list (ACL) on the SMB file share. Set it to false to map file and directory permissions to the POSIX permissions. For more information, see Using Microsoft Windows ACLs to control access to an SMB file share in the Storage Gateway User Guide. Valid Values: true | false 
    */
  var SMBACLEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of up to 50 tags that can be assigned to the NFS file share. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.undefined
  
  /**
    * Specifies the DNS name for the VPC endpoint that the SMB file share uses to connect to Amazon S3.  This parameter is required for SMB file shares that connect to Amazon S3 through a VPC endpoint, a VPC access point, or an access point alias that points to a VPC access point. 
    */
  var VPCEndpointDNSName: js.UndefOr[DNSHostName] = js.undefined
  
  /**
    * A list of users or groups in the Active Directory that are allowed to access the file  share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var ValidUserList: js.UndefOr[UserList] = js.undefined
}
object CreateSMBFileShareInput {
  
  inline def apply(ClientToken: ClientToken, GatewayARN: GatewayARN, LocationARN: LocationARN, Role: Role): CreateSMBFileShareInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], LocationARN = LocationARN.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSMBFileShareInput]
  }
  
  extension [Self <: CreateSMBFileShareInput](x: Self) {
    
    inline def setAccessBasedEnumeration(value: Boolean): Self = StObject.set(x, "AccessBasedEnumeration", value.asInstanceOf[js.Any])
    
    inline def setAccessBasedEnumerationUndefined: Self = StObject.set(x, "AccessBasedEnumeration", js.undefined)
    
    inline def setAdminUserList(value: UserList): Self = StObject.set(x, "AdminUserList", value.asInstanceOf[js.Any])
    
    inline def setAdminUserListUndefined: Self = StObject.set(x, "AdminUserList", js.undefined)
    
    inline def setAdminUserListVarargs(value: UserListUser*): Self = StObject.set(x, "AdminUserList", js.Array(value*))
    
    inline def setAuditDestinationARN(value: AuditDestinationARN): Self = StObject.set(x, "AuditDestinationARN", value.asInstanceOf[js.Any])
    
    inline def setAuditDestinationARNUndefined: Self = StObject.set(x, "AuditDestinationARN", js.undefined)
    
    inline def setAuthentication(value: Authentication): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    inline def setBucketRegion(value: RegionId): Self = StObject.set(x, "BucketRegion", value.asInstanceOf[js.Any])
    
    inline def setBucketRegionUndefined: Self = StObject.set(x, "BucketRegion", js.undefined)
    
    inline def setCacheAttributes(value: CacheAttributes): Self = StObject.set(x, "CacheAttributes", value.asInstanceOf[js.Any])
    
    inline def setCacheAttributesUndefined: Self = StObject.set(x, "CacheAttributes", js.undefined)
    
    inline def setCaseSensitivity(value: CaseSensitivity): Self = StObject.set(x, "CaseSensitivity", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitivityUndefined: Self = StObject.set(x, "CaseSensitivity", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageClass(value: StorageClass): Self = StObject.set(x, "DefaultStorageClass", value.asInstanceOf[js.Any])
    
    inline def setDefaultStorageClassUndefined: Self = StObject.set(x, "DefaultStorageClass", js.undefined)
    
    inline def setFileShareName(value: FileShareName): Self = StObject.set(x, "FileShareName", value.asInstanceOf[js.Any])
    
    inline def setFileShareNameUndefined: Self = StObject.set(x, "FileShareName", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGuessMIMETypeEnabled(value: Boolean): Self = StObject.set(x, "GuessMIMETypeEnabled", value.asInstanceOf[js.Any])
    
    inline def setGuessMIMETypeEnabledUndefined: Self = StObject.set(x, "GuessMIMETypeEnabled", js.undefined)
    
    inline def setInvalidUserList(value: UserList): Self = StObject.set(x, "InvalidUserList", value.asInstanceOf[js.Any])
    
    inline def setInvalidUserListUndefined: Self = StObject.set(x, "InvalidUserList", js.undefined)
    
    inline def setInvalidUserListVarargs(value: UserListUser*): Self = StObject.set(x, "InvalidUserList", js.Array(value*))
    
    inline def setKMSEncrypted(value: Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    inline def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setLocationARN(value: LocationARN): Self = StObject.set(x, "LocationARN", value.asInstanceOf[js.Any])
    
    inline def setNotificationPolicy(value: NotificationPolicy): Self = StObject.set(x, "NotificationPolicy", value.asInstanceOf[js.Any])
    
    inline def setNotificationPolicyUndefined: Self = StObject.set(x, "NotificationPolicy", js.undefined)
    
    inline def setObjectACL(value: ObjectACL): Self = StObject.set(x, "ObjectACL", value.asInstanceOf[js.Any])
    
    inline def setObjectACLUndefined: Self = StObject.set(x, "ObjectACL", js.undefined)
    
    inline def setOplocksEnabled(value: Boolean): Self = StObject.set(x, "OplocksEnabled", value.asInstanceOf[js.Any])
    
    inline def setOplocksEnabledUndefined: Self = StObject.set(x, "OplocksEnabled", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setRequesterPays(value: Boolean): Self = StObject.set(x, "RequesterPays", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysUndefined: Self = StObject.set(x, "RequesterPays", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setSMBACLEnabled(value: Boolean): Self = StObject.set(x, "SMBACLEnabled", value.asInstanceOf[js.Any])
    
    inline def setSMBACLEnabledUndefined: Self = StObject.set(x, "SMBACLEnabled", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVPCEndpointDNSName(value: DNSHostName): Self = StObject.set(x, "VPCEndpointDNSName", value.asInstanceOf[js.Any])
    
    inline def setVPCEndpointDNSNameUndefined: Self = StObject.set(x, "VPCEndpointDNSName", js.undefined)
    
    inline def setValidUserList(value: UserList): Self = StObject.set(x, "ValidUserList", value.asInstanceOf[js.Any])
    
    inline def setValidUserListUndefined: Self = StObject.set(x, "ValidUserList", js.undefined)
    
    inline def setValidUserListVarargs(value: UserListUser*): Self = StObject.set(x, "ValidUserList", js.Array(value*))
  }
}
