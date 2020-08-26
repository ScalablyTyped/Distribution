package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectRequest extends js.Object {
  /**
    * The canned ACL to apply to the object. For more information, see Canned ACL.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.native
  /**
    * Object data.
    */
  var Body: js.UndefOr[typings.awsSdk.s3Mod.Body] = js.native
  /**
    * Bucket name to which the PUT operation was initiated.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    *  Can be used to specify caching behavior along the request/reply chain. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9.
    */
  var CacheControl: js.UndefOr[typings.awsSdk.s3Mod.CacheControl] = js.native
  /**
    * Specifies presentational information for the object. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1.
    */
  var ContentDisposition: js.UndefOr[typings.awsSdk.s3Mod.ContentDisposition] = js.native
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk.s3Mod.ContentEncoding] = js.native
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsSdk.s3Mod.ContentLanguage] = js.native
  /**
    * Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13.
    */
  var ContentLength: js.UndefOr[typings.awsSdk.s3Mod.ContentLength] = js.native
  /**
    * The base64-encoded 128-bit MD5 digest of the message (without the headers) according to RFC 1864. This header can be used as a message integrity check to verify that the data is the same data that was originally sent. Although it is optional, we recommend using the Content-MD5 mechanism as an end-to-end integrity check. For more information about REST request authentication, see REST Authentication.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * A standard MIME type describing the format of the contents. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17.
    */
  var ContentType: js.UndefOr[typings.awsSdk.s3Mod.ContentType] = js.native
  /**
    * The date and time at which the object is no longer cacheable. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21.
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
    * Object key for which the PUT operation was initiated.
    */
  var Key: ObjectKey = js.native
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsSdk.s3Mod.Metadata] = js.native
  /**
    * Specifies whether a legal hold will be applied to this object. For more information about S3 Object Lock, see Object Lock.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockLegalHoldStatus] = js.native
  /**
    * The Object Lock mode that you want to apply to this object.
    */
  var ObjectLockMode: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockMode] = js.native
  /**
    * The date and time when you want this object's Object Lock to expire.
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
    * If x-amz-server-side-encryption is present and has the value of aws:kms, this header specifies the ID of the AWS Key Management Service (AWS KMS) symmetrical customer managed customer master key (CMK) that was used for the object.  If the value of x-amz-server-side-encryption is aws:kms, this header specifies the ID of the symmetric customer managed AWS KMS CMK that will be used for the object. If you specify x-amz-server-side-encryption:aws:kms, but do not provide x-amz-server-side-encryption-aws-kms-key-id, Amazon S3 uses the AWS managed CMK in AWS to protect the data.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSKeyId] = js.native
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryption] = js.native
  /**
    * If you don't specify, S3 Standard is the default storage class. Amazon S3 supports other storage classes.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.native
  /**
    * The tag-set for the object. The tag-set must be encoded as URL Query parameters. (For example, "Key1=Value1")
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.native
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata. For information about object metadata, see Object Key and Metadata. In the following example, the request header sets the redirect to an object (anotherPage.html) in the same bucket:  x-amz-website-redirect-location: /anotherPage.html  In the following example, the request header sets the object redirect to another website:  x-amz-website-redirect-location: http://www.example.com/  For more information about website hosting in Amazon S3, see Hosting Websites on Amazon S3 and How to Configure Website Page Redirects. 
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsSdk.s3Mod.WebsiteRedirectLocation] = js.native
}

object PutObjectRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): PutObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectRequest]
  }
  @scala.inline
  implicit class PutObjectRequestOps[Self <: PutObjectRequest] (val x: Self) extends AnyVal {
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
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setACL(value: ObjectCannedACL): Self = this.set("ACL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteACL: Self = this.set("ACL", js.undefined)
    @scala.inline
    def setBody(value: Body): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
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
    def setContentLength(value: ContentLength): Self = this.set("ContentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLength: Self = this.set("ContentLength", js.undefined)
    @scala.inline
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
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
    def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = this.set("WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteRedirectLocation: Self = this.set("WebsiteRedirectLocation", js.undefined)
  }
  
}

