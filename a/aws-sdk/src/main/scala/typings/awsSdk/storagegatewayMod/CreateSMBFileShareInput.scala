package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSMBFileShareInput extends js.Object {
  /**
    * A list of users or groups in the Active Directory that will be granted administrator privileges on the file share. These users can do all file operations as the super-user. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1.  Use this option very carefully, because any user in this list can do anything they like on the file share, regardless of file permissions. 
    */
  var AdminUserList: js.UndefOr[FileShareUserList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the storage used for the audit logs.
    */
  var AuditDestinationARN: js.UndefOr[typings.awsSdk.storagegatewayMod.AuditDestinationARN] = js.native
  /**
    * The authentication method that users use to access the file share. The default is ActiveDirectory. Valid Values: ActiveDirectory | GuestAccess 
    */
  var Authentication: js.UndefOr[typings.awsSdk.storagegatewayMod.Authentication] = js.native
  /**
    * Refresh cache information.
    */
  var CacheAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheAttributes] = js.native
  /**
    * The case of an object name in an Amazon S3 bucket. For ClientSpecified, the client determines the case sensitivity. For CaseSensitive, the gateway determines the case sensitivity. The default value is ClientSpecified.
    */
  var CaseSensitivity: js.UndefOr[typings.awsSdk.storagegatewayMod.CaseSensitivity] = js.native
  /**
    * A unique string value that you supply that is used by file gateway to ensure idempotent file share creation.
    */
  var ClientToken: typings.awsSdk.storagegatewayMod.ClientToken = js.native
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. The default value is S3_INTELLIGENT_TIERING. Optional. Valid Values: S3_STANDARD | S3_INTELLIGENT_TIERING | S3_STANDARD_IA | S3_ONEZONE_IA 
    */
  var DefaultStorageClass: js.UndefOr[StorageClass] = js.native
  /**
    * The name of the file share. Optional.   FileShareName must be set if an S3 prefix name is set in LocationARN. 
    */
  var FileShareName: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareName] = js.native
  /**
    * The ARN of the file gateway on which you want to create a file share.
    */
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * A value that enables guessing of the MIME type for uploaded objects based on file extensions. Set this value to true to enable MIME type guessing, otherwise set to false. The default value is true. Valid Values: true | false 
    */
  var GuessMIMETypeEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of users or groups in the Active Directory that are not allowed to access the file share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var InvalidUserList: js.UndefOr[FileShareUserList] = js.native
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The ARN of the backend storage used for storing file data. A prefix name can be added to the S3 bucket name. It must end with a "/".
    */
  var LocationARN: typings.awsSdk.storagegatewayMod.LocationARN = js.native
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
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
    */
  var Role: typings.awsSdk.storagegatewayMod.Role = js.native
  /**
    * Set this value to true to enable access control list (ACL) on the SMB file share. Set it to false to map file and directory permissions to the POSIX permissions. For more information, see Using Microsoft Windows ACLs to control access to an SMB file share in the AWS Storage Gateway User Guide. Valid Values: true | false 
    */
  var SMBACLEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A list of up to 50 tags that can be assigned to the NFS file share. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * A list of users or groups in the Active Directory that are allowed to access the file  share. A group must be prefixed with the @ character. Acceptable formats include: DOMAIN\User1, user1, @group1, and @DOMAIN\group1. Can only be set if Authentication is set to ActiveDirectory.
    */
  var ValidUserList: js.UndefOr[FileShareUserList] = js.native
}

object CreateSMBFileShareInput {
  @scala.inline
  def apply(ClientToken: ClientToken, GatewayARN: GatewayARN, LocationARN: LocationARN, Role: Role): CreateSMBFileShareInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], LocationARN = LocationARN.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSMBFileShareInput]
  }
  @scala.inline
  implicit class CreateSMBFileShareInputOps[Self <: CreateSMBFileShareInput] (val x: Self) extends AnyVal {
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
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationARN(value: LocationARN): Self = this.set("LocationARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdminUserListVarargs(value: FileShareUser*): Self = this.set("AdminUserList", js.Array(value :_*))
    @scala.inline
    def setAdminUserList(value: FileShareUserList): Self = this.set("AdminUserList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminUserList: Self = this.set("AdminUserList", js.undefined)
    @scala.inline
    def setAuditDestinationARN(value: AuditDestinationARN): Self = this.set("AuditDestinationARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditDestinationARN: Self = this.set("AuditDestinationARN", js.undefined)
    @scala.inline
    def setAuthentication(value: Authentication): Self = this.set("Authentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthentication: Self = this.set("Authentication", js.undefined)
    @scala.inline
    def setCacheAttributes(value: CacheAttributes): Self = this.set("CacheAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheAttributes: Self = this.set("CacheAttributes", js.undefined)
    @scala.inline
    def setCaseSensitivity(value: CaseSensitivity): Self = this.set("CaseSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitivity: Self = this.set("CaseSensitivity", js.undefined)
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
    def setInvalidUserListVarargs(value: FileShareUser*): Self = this.set("InvalidUserList", js.Array(value :_*))
    @scala.inline
    def setInvalidUserList(value: FileShareUserList): Self = this.set("InvalidUserList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidUserList: Self = this.set("InvalidUserList", js.undefined)
    @scala.inline
    def setKMSEncrypted(value: Boolean): Self = this.set("KMSEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSEncrypted: Self = this.set("KMSEncrypted", js.undefined)
    @scala.inline
    def setKMSKey(value: KMSKey): Self = this.set("KMSKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSKey: Self = this.set("KMSKey", js.undefined)
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
    def setSMBACLEnabled(value: Boolean): Self = this.set("SMBACLEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSMBACLEnabled: Self = this.set("SMBACLEnabled", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setValidUserListVarargs(value: FileShareUser*): Self = this.set("ValidUserList", js.Array(value :_*))
    @scala.inline
    def setValidUserList(value: FileShareUserList): Self = this.set("ValidUserList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidUserList: Self = this.set("ValidUserList", js.undefined)
  }
  
}

