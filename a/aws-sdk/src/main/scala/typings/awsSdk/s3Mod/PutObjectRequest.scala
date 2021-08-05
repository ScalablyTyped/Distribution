package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectRequest extends StObject {
  
  /**
    * The canned ACL to apply to the object. For more information, see Canned ACL. This action is not supported by Amazon S3 on Outposts.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
  
  /**
    * Object data.
    */
  var Body: js.UndefOr[typings.awsSdk.s3Mod.Body] = js.undefined
  
  /**
    * The bucket name to which the PUT operation was initiated.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName
  
  /**
    *  Can be used to specify caching behavior along the request/reply chain. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9.
    */
  var CacheControl: js.UndefOr[typings.awsSdk.s3Mod.CacheControl] = js.undefined
  
  /**
    * Specifies presentational information for the object. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1.
    */
  var ContentDisposition: js.UndefOr[typings.awsSdk.s3Mod.ContentDisposition] = js.undefined
  
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk.s3Mod.ContentEncoding] = js.undefined
  
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsSdk.s3Mod.ContentLanguage] = js.undefined
  
  /**
    * Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13.
    */
  var ContentLength: js.UndefOr[typings.awsSdk.s3Mod.ContentLength] = js.undefined
  
  /**
    * The base64-encoded 128-bit MD5 digest of the message (without the headers) according to RFC 1864. This header can be used as a message integrity check to verify that the data is the same data that was originally sent. Although it is optional, we recommend using the Content-MD5 mechanism as an end-to-end integrity check. For more information about REST request authentication, see REST Authentication.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.undefined
  
  /**
    * A standard MIME type describing the format of the contents. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17.
    */
  var ContentType: js.UndefOr[typings.awsSdk.s3Mod.ContentType] = js.undefined
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The date and time at which the object is no longer cacheable. For more information, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21.
    */
  var Expires: js.UndefOr[typings.awsSdk.s3Mod.Expires] = js.undefined
  
  /**
    * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantFullControl: js.UndefOr[typings.awsSdk.s3Mod.GrantFullControl] = js.undefined
  
  /**
    * Allows grantee to read the object data and its metadata. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantRead: js.UndefOr[typings.awsSdk.s3Mod.GrantRead] = js.undefined
  
  /**
    * Allows grantee to read the object ACL. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantReadACP: js.UndefOr[typings.awsSdk.s3Mod.GrantReadACP] = js.undefined
  
  /**
    * Allows grantee to write the ACL for the applicable object. This action is not supported by Amazon S3 on Outposts.
    */
  var GrantWriteACP: js.UndefOr[typings.awsSdk.s3Mod.GrantWriteACP] = js.undefined
  
  /**
    * Object key for which the PUT operation was initiated.
    */
  var Key: ObjectKey
  
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsSdk.s3Mod.Metadata] = js.undefined
  
  /**
    * Specifies whether a legal hold will be applied to this object. For more information about S3 Object Lock, see Object Lock.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockLegalHoldStatus] = js.undefined
  
  /**
    * The Object Lock mode that you want to apply to this object.
    */
  var ObjectLockMode: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockMode] = js.undefined
  
  /**
    * The date and time when you want this object's Object Lock to expire.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockRetainUntilDate] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.undefined
  
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKey] = js.undefined
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * Specifies the AWS KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSEncryptionContext] = js.undefined
  
  /**
    * If x-amz-server-side-encryption is present and has the value of aws:kms, this header specifies the ID of the AWS Key Management Service (AWS KMS) symmetrical customer managed customer master key (CMK) that was used for the object.  If the value of x-amz-server-side-encryption is aws:kms, this header specifies the ID of the symmetric customer managed AWS KMS CMK that will be used for the object. If you specify x-amz-server-side-encryption:aws:kms, but do not provide x-amz-server-side-encryption-aws-kms-key-id, Amazon S3 uses the AWS managed CMK in AWS to protect the data.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.s3Mod.SSEKMSKeyId] = js.undefined
  
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.s3Mod.ServerSideEncryption] = js.undefined
  
  /**
    * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The STANDARD storage class provides high durability and high availability. Depending on performance needs, you can specify a different Storage Class. Amazon S3 on Outposts only uses the OUTPOSTS Storage Class. For more information, see Storage Classes in the Amazon S3 Service Developer Guide.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.s3Mod.StorageClass] = js.undefined
  
  /**
    * The tag-set for the object. The tag-set must be encoded as URL Query parameters. (For example, "Key1=Value1")
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.undefined
  
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata. For information about object metadata, see Object Key and Metadata. In the following example, the request header sets the redirect to an object (anotherPage.html) in the same bucket:  x-amz-website-redirect-location: /anotherPage.html  In the following example, the request header sets the object redirect to another website:  x-amz-website-redirect-location: http://www.example.com/  For more information about website hosting in Amazon S3, see Hosting Websites on Amazon S3 and How to Configure Website Page Redirects. 
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsSdk.s3Mod.WebsiteRedirectLocation] = js.undefined
}
object PutObjectRequest {
  
  inline def apply(Bucket: BucketName, Key: ObjectKey): PutObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectRequest]
  }
  
  extension [Self <: PutObjectRequest](x: Self) {
    
    inline def setACL(value: ObjectCannedACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
    
    inline def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setCacheControl(value: CacheControl): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setContentDisposition(value: ContentDisposition): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    inline def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    inline def setContentLanguage(value: ContentLanguage): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    inline def setContentLength(value: ContentLength): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setExpires(value: Expires): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    inline def setGrantFullControl(value: GrantFullControl): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
    
    inline def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
    
    inline def setGrantRead(value: GrantRead): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
    
    inline def setGrantReadACP(value: GrantReadACP): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
    
    inline def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
    
    inline def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
    
    inline def setGrantWriteACP(value: GrantWriteACP): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
    
    inline def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    inline def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    inline def setObjectLockMode(value: ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    inline def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    inline def setObjectLockRetainUntilDate(value: ObjectLockRetainUntilDate): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    inline def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    inline def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKey(value: SSECustomerKey): Self = StObject.set(x, "SSECustomerKey", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSECustomerKeyUndefined: Self = StObject.set(x, "SSECustomerKey", js.undefined)
    
    inline def setSSEKMSEncryptionContext(value: SSEKMSEncryptionContext): Self = StObject.set(x, "SSEKMSEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSEncryptionContextUndefined: Self = StObject.set(x, "SSEKMSEncryptionContext", js.undefined)
    
    inline def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    inline def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setTagging(value: TaggingHeader): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
    
    inline def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
    
    inline def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = StObject.set(x, "WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    
    inline def setWebsiteRedirectLocationUndefined: Self = StObject.set(x, "WebsiteRedirectLocation", js.undefined)
  }
}
