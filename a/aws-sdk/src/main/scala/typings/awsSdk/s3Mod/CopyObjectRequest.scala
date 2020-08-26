package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyObjectRequest extends js.Object {
  /**
    * The canned ACL to apply to the object.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.native
  /**
    * The name of the destination bucket.
    */
  var Bucket: BucketName = js.native
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typings.awsSdk.s3Mod.CacheControl] = js.native
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typings.awsSdk.s3Mod.ContentDisposition] = js.native
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk.s3Mod.ContentEncoding] = js.native
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsSdk.s3Mod.ContentLanguage] = js.native
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typings.awsSdk.s3Mod.ContentType] = js.native
  /**
    * The name of the source bucket and key name of the source object, separated by a slash (/). Must be URL-encoded.
    */
  var CopySource: typings.awsSdk.s3Mod.CopySource = js.native
  /**
    * Copies the object if its entity tag (ETag) matches the specified tag.
    */
  var CopySourceIfMatch: js.UndefOr[typings.awsSdk.s3Mod.CopySourceIfMatch] = js.native
  /**
    * Copies the object if it has been modified since the specified time.
    */
  var CopySourceIfModifiedSince: js.UndefOr[typings.awsSdk.s3Mod.CopySourceIfModifiedSince] = js.native
  /**
    * Copies the object if its entity tag (ETag) is different than the specified ETag.
    */
  var CopySourceIfNoneMatch: js.UndefOr[typings.awsSdk.s3Mod.CopySourceIfNoneMatch] = js.native
  /**
    * Copies the object if it hasn't been modified since the specified time.
    */
  var CopySourceIfUnmodifiedSince: js.UndefOr[typings.awsSdk.s3Mod.CopySourceIfUnmodifiedSince] = js.native
  /**
    * Specifies the algorithm to use when decrypting the source object (for example, AES256).
    */
  var CopySourceSSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.CopySourceSSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
    */
  var CopySourceSSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.CopySourceSSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var CopySourceSSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.CopySourceSSECustomerKeyMD5] = js.native
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[typings.awsSdk.s3Mod.Expires] = js.native
  /**
    * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.
    */
  var GrantFullControl: js.UndefOr[typings.awsSdk.s3Mod.GrantFullControl] = js.native
  /**
    * Allows grantee to read the object data and its metadata.
    */
  var GrantRead: js.UndefOr[typings.awsSdk.s3Mod.GrantRead] = js.native
  /**
    * Allows grantee to read the object ACL.
    */
  var GrantReadACP: js.UndefOr[typings.awsSdk.s3Mod.GrantReadACP] = js.native
  /**
    * Allows grantee to write the ACL for the applicable object.
    */
  var GrantWriteACP: js.UndefOr[typings.awsSdk.s3Mod.GrantWriteACP] = js.native
  /**
    * The key of the destination object.
    */
  var Key: ObjectKey = js.native
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsSdk.s3Mod.Metadata] = js.native
  /**
    * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
    */
  var MetadataDirective: js.UndefOr[typings.awsSdk.s3Mod.MetadataDirective] = js.native
  /**
    * Specifies whether you want to apply a Legal Hold to the copied object.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockLegalHoldStatus] = js.native
  /**
    * The Object Lock mode that you want to apply to the copied object.
    */
  var ObjectLockMode: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockMode] = js.native
  /**
    * The date and time when you want the copied object's Object Lock to expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockRetainUntilDate] = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * Specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSEncryptionContext] = js.native
  /**
    * Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. For information about configuring using any of the officially supported AWS SDKs and AWS CLI, see Specifying the Signature Version in Request Authentication in the Amazon S3 Developer Guide.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryption] = js.native
  /**
    * The type of storage to use for the object. Defaults to 'STANDARD'.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
  /**
    * The tag-set for the object destination object this value must be used in conjunction with the TaggingDirective. The tag-set must be encoded as URL Query parameters.
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.native
  /**
    * Specifies whether the object tag-set are copied from the source object or replaced with tag-set provided in the request.
    */
  var TaggingDirective: js.UndefOr[typings.awsSdk.s3Mod.TaggingDirective] = js.native
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsSdk.s3Mod.WebsiteRedirectLocation] = js.native
}

object CopyObjectRequest {
  @scala.inline
  def apply(Bucket: BucketName, CopySource: CopySource, Key: ObjectKey): CopyObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectRequest]
  }
  @scala.inline
  implicit class CopyObjectRequestOps[Self <: CopyObjectRequest] (val x: Self) extends AnyVal {
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopySource(value: CopySource): Self = this.set("CopySource", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setACL(value: ObjectCannedACL): Self = this.set("ACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteACL: Self = this.set("ACL", js.undefined)
    @scala.inline
    def setCacheControl(value: CacheControl): Self = this.set("CacheControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheControl: Self = this.set("CacheControl", js.undefined)
    @scala.inline
    def setContentDisposition(value: ContentDisposition): Self = this.set("ContentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDisposition: Self = this.set("ContentDisposition", js.undefined)
    @scala.inline
    def setContentEncoding(value: ContentEncoding): Self = this.set("ContentEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEncoding: Self = this.set("ContentEncoding", js.undefined)
    @scala.inline
    def setContentLanguage(value: ContentLanguage): Self = this.set("ContentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLanguage: Self = this.set("ContentLanguage", js.undefined)
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setCopySourceIfMatch(value: CopySourceIfMatch): Self = this.set("CopySourceIfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceIfMatch: Self = this.set("CopySourceIfMatch", js.undefined)
    @scala.inline
    def setCopySourceIfModifiedSince(value: CopySourceIfModifiedSince): Self = this.set("CopySourceIfModifiedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceIfModifiedSince: Self = this.set("CopySourceIfModifiedSince", js.undefined)
    @scala.inline
    def setCopySourceIfNoneMatch(value: CopySourceIfNoneMatch): Self = this.set("CopySourceIfNoneMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceIfNoneMatch: Self = this.set("CopySourceIfNoneMatch", js.undefined)
    @scala.inline
    def setCopySourceIfUnmodifiedSince(value: CopySourceIfUnmodifiedSince): Self = this.set("CopySourceIfUnmodifiedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceIfUnmodifiedSince: Self = this.set("CopySourceIfUnmodifiedSince", js.undefined)
    @scala.inline
    def setCopySourceSSECustomerAlgorithm(value: CopySourceSSECustomerAlgorithm): Self = this.set("CopySourceSSECustomerAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceSSECustomerAlgorithm: Self = this.set("CopySourceSSECustomerAlgorithm", js.undefined)
    @scala.inline
    def setCopySourceSSECustomerKey(value: CopySourceSSECustomerKey): Self = this.set("CopySourceSSECustomerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceSSECustomerKey: Self = this.set("CopySourceSSECustomerKey", js.undefined)
    @scala.inline
    def setCopySourceSSECustomerKeyMD5(value: CopySourceSSECustomerKeyMD5): Self = this.set("CopySourceSSECustomerKeyMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopySourceSSECustomerKeyMD5: Self = this.set("CopySourceSSECustomerKeyMD5", js.undefined)
    @scala.inline
    def setExpires(value: Expires): Self = this.set("Expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("Expires", js.undefined)
    @scala.inline
    def setGrantFullControl(value: GrantFullControl): Self = this.set("GrantFullControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantFullControl: Self = this.set("GrantFullControl", js.undefined)
    @scala.inline
    def setGrantRead(value: GrantRead): Self = this.set("GrantRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantRead: Self = this.set("GrantRead", js.undefined)
    @scala.inline
    def setGrantReadACP(value: GrantReadACP): Self = this.set("GrantReadACP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantReadACP: Self = this.set("GrantReadACP", js.undefined)
    @scala.inline
    def setGrantWriteACP(value: GrantWriteACP): Self = this.set("GrantWriteACP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantWriteACP: Self = this.set("GrantWriteACP", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    @scala.inline
    def setMetadataDirective(value: MetadataDirective): Self = this.set("MetadataDirective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadataDirective: Self = this.set("MetadataDirective", js.undefined)
    @scala.inline
    def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = this.set("ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockLegalHoldStatus: Self = this.set("ObjectLockLegalHoldStatus", js.undefined)
    @scala.inline
    def setObjectLockMode(value: ObjectLockMode): Self = this.set("ObjectLockMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockMode: Self = this.set("ObjectLockMode", js.undefined)
    @scala.inline
    def setObjectLockRetainUntilDate(value: ObjectLockRetainUntilDate): Self = this.set("ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockRetainUntilDate: Self = this.set("ObjectLockRetainUntilDate", js.undefined)
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = this.set("SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerAlgorithm: Self = this.set("SSECustomerAlgorithm", js.undefined)
    @scala.inline
    def setSSECustomerKey(value: SSECustomerKey): Self = this.set("SSECustomerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerKey: Self = this.set("SSECustomerKey", js.undefined)
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = this.set("SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSECustomerKeyMD5: Self = this.set("SSECustomerKeyMD5", js.undefined)
    @scala.inline
    def setSSEKMSEncryptionContext(value: SSEKMSEncryptionContext): Self = this.set("SSEKMSEncryptionContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEKMSEncryptionContext: Self = this.set("SSEKMSEncryptionContext", js.undefined)
    @scala.inline
    def setSSEKMSKeyId(value: SSEKMSKeyId): Self = this.set("SSEKMSKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEKMSKeyId: Self = this.set("SSEKMSKeyId", js.undefined)
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = this.set("ServerSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("ServerSideEncryption", js.undefined)
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
    @scala.inline
    def setTagging(value: TaggingHeader): Self = this.set("Tagging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagging: Self = this.set("Tagging", js.undefined)
    @scala.inline
    def setTaggingDirective(value: TaggingDirective): Self = this.set("TaggingDirective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaggingDirective: Self = this.set("TaggingDirective", js.undefined)
    @scala.inline
    def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = this.set("WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteRedirectLocation: Self = this.set("WebsiteRedirectLocation", js.undefined)
  }
  
}

