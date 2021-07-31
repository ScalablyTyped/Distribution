package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyObjectRequest extends StObject {
  
  /**
    * The canned ACL to apply to the object. This action is not supported by Amazon S3 on Outposts.
    */
  var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
  
  /**
    * The name of the destination bucket. When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName
  
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typings.awsSdk.s3Mod.CacheControl] = js.undefined
  
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typings.awsSdk.s3Mod.ContentDisposition] = js.undefined
  
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk.s3Mod.ContentEncoding] = js.undefined
  
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsSdk.s3Mod.ContentLanguage] = js.undefined
  
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typings.awsSdk.s3Mod.ContentType] = js.undefined
  
  /**
    * Specifies the source object for the copy operation. You specify the value in one of two formats, depending on whether you want to access the source object through an access point:   For objects not accessed through an access point, specify the name of the source bucket and the key of the source object, separated by a slash (/). For example, to copy the object reports/january.pdf from the bucket awsexamplebucket, use awsexamplebucket/reports/january.pdf. The value must be URL encoded.   For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as accessed through the access point, in the format arn:aws:s3:&lt;Region&gt;:&lt;account-id&gt;:accesspoint/&lt;access-point-name&gt;/object/&lt;key&gt;. For example, to copy the object reports/january.pdf through access point my-access-point owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf. The value must be URL encoded.  Amazon S3 supports copy operations using access points only when the source and destination buckets are in the same AWS Region.  Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/object/&lt;key&gt;. For example, to copy the object reports/january.pdf through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf. The value must be URL encoded.    To copy a specific version of an object, append ?versionId=&lt;version-id&gt; to the value (for example, awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893). If you don't specify a version ID, Amazon S3 copies the latest version of the source object.
    */
  var CopySource: typings.awsSdk.s3Mod.CopySource
  
  /**
    * Copies the object if its entity tag (ETag) matches the specified tag.
    */
  var CopySourceIfMatch: js.UndefOr[typings.awsSdk.s3Mod.CopySourceIfMatch] = js.undefined
  
  /**
    * Copies the object if it has been modified since the specified time.
    */
  var CopySourceIfModifiedSince: js.UndefOr[typings.awsSdk.s3Mod.CopySourceIfModifiedSince] = js.undefined
  
  /**
    * Copies the object if its entity tag (ETag) is different than the specified ETag.
    */
  var CopySourceIfNoneMatch: js.UndefOr[typings.awsSdk.s3Mod.CopySourceIfNoneMatch] = js.undefined
  
  /**
    * Copies the object if it hasn't been modified since the specified time.
    */
  var CopySourceIfUnmodifiedSince: js.UndefOr[typings.awsSdk.s3Mod.CopySourceIfUnmodifiedSince] = js.undefined
  
  /**
    * Specifies the algorithm to use when decrypting the source object (for example, AES256).
    */
  var CopySourceSSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.CopySourceSSECustomerAlgorithm] = js.undefined
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
    */
  var CopySourceSSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.CopySourceSSECustomerKey] = js.undefined
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var CopySourceSSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.CopySourceSSECustomerKeyMD5] = js.undefined
  
  /**
    * The account id of the expected destination bucket owner. If the destination bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The account id of the expected source bucket owner. If the source bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedSourceBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The date and time at which the object is no longer cacheable.
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
    * The key of the destination object.
    */
  var Key: ObjectKey
  
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsSdk.s3Mod.Metadata] = js.undefined
  
  /**
    * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
    */
  var MetadataDirective: js.UndefOr[typings.awsSdk.s3Mod.MetadataDirective] = js.undefined
  
  /**
    * Specifies whether you want to apply a Legal Hold to the copied object.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockLegalHoldStatus] = js.undefined
  
  /**
    * The Object Lock mode that you want to apply to the copied object.
    */
  var ObjectLockMode: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockMode] = js.undefined
  
  /**
    * The date and time when you want the copied object's Object Lock to expire.
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
    * Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. For information about configuring using any of the officially supported AWS SDKs and AWS CLI, see Specifying the Signature Version in Request Authentication in the Amazon S3 Developer Guide.
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
    * The tag-set for the object destination object this value must be used in conjunction with the TaggingDirective. The tag-set must be encoded as URL Query parameters.
    */
  var Tagging: js.UndefOr[TaggingHeader] = js.undefined
  
  /**
    * Specifies whether the object tag-set are copied from the source object or replaced with tag-set provided in the request.
    */
  var TaggingDirective: js.UndefOr[typings.awsSdk.s3Mod.TaggingDirective] = js.undefined
  
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsSdk.s3Mod.WebsiteRedirectLocation] = js.undefined
}
object CopyObjectRequest {
  
  @scala.inline
  def apply(Bucket: BucketName, CopySource: CopySource, Key: ObjectKey): CopyObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectRequest]
  }
  
  @scala.inline
  implicit class CopyObjectRequestMutableBuilder[Self <: CopyObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACL(value: ObjectCannedACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControl(value: CacheControl): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: ContentDisposition): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: ContentLanguage): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setCopySource(value: CopySource): Self = StObject.set(x, "CopySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceIfMatch(value: CopySourceIfMatch): Self = StObject.set(x, "CopySourceIfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceIfMatchUndefined: Self = StObject.set(x, "CopySourceIfMatch", js.undefined)
    
    @scala.inline
    def setCopySourceIfModifiedSince(value: CopySourceIfModifiedSince): Self = StObject.set(x, "CopySourceIfModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceIfModifiedSinceUndefined: Self = StObject.set(x, "CopySourceIfModifiedSince", js.undefined)
    
    @scala.inline
    def setCopySourceIfNoneMatch(value: CopySourceIfNoneMatch): Self = StObject.set(x, "CopySourceIfNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceIfNoneMatchUndefined: Self = StObject.set(x, "CopySourceIfNoneMatch", js.undefined)
    
    @scala.inline
    def setCopySourceIfUnmodifiedSince(value: CopySourceIfUnmodifiedSince): Self = StObject.set(x, "CopySourceIfUnmodifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceIfUnmodifiedSinceUndefined: Self = StObject.set(x, "CopySourceIfUnmodifiedSince", js.undefined)
    
    @scala.inline
    def setCopySourceSSECustomerAlgorithm(value: CopySourceSSECustomerAlgorithm): Self = StObject.set(x, "CopySourceSSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceSSECustomerAlgorithmUndefined: Self = StObject.set(x, "CopySourceSSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setCopySourceSSECustomerKey(value: CopySourceSSECustomerKey): Self = StObject.set(x, "CopySourceSSECustomerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceSSECustomerKeyMD5(value: CopySourceSSECustomerKeyMD5): Self = StObject.set(x, "CopySourceSSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopySourceSSECustomerKeyMD5Undefined: Self = StObject.set(x, "CopySourceSSECustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setCopySourceSSECustomerKeyUndefined: Self = StObject.set(x, "CopySourceSSECustomerKey", js.undefined)
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setExpectedSourceBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedSourceBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedSourceBucketOwnerUndefined: Self = StObject.set(x, "ExpectedSourceBucketOwner", js.undefined)
    
    @scala.inline
    def setExpires(value: Expires): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    @scala.inline
    def setGrantFullControl(value: GrantFullControl): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
    
    @scala.inline
    def setGrantRead(value: GrantRead): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantReadACP(value: GrantReadACP): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
    
    @scala.inline
    def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
    
    @scala.inline
    def setGrantWriteACP(value: GrantWriteACP): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataDirective(value: MetadataDirective): Self = StObject.set(x, "MetadataDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataDirectiveUndefined: Self = StObject.set(x, "MetadataDirective", js.undefined)
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    @scala.inline
    def setObjectLockMode(value: ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    @scala.inline
    def setObjectLockRetainUntilDate(value: ObjectLockRetainUntilDate): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setSSECustomerKey(value: SSECustomerKey): Self = StObject.set(x, "SSECustomerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setSSECustomerKeyUndefined: Self = StObject.set(x, "SSECustomerKey", js.undefined)
    
    @scala.inline
    def setSSEKMSEncryptionContext(value: SSEKMSEncryptionContext): Self = StObject.set(x, "SSEKMSEncryptionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEKMSEncryptionContextUndefined: Self = StObject.set(x, "SSEKMSEncryptionContext", js.undefined)
    
    @scala.inline
    def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    @scala.inline
    def setTagging(value: TaggingHeader): Self = StObject.set(x, "Tagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggingDirective(value: TaggingDirective): Self = StObject.set(x, "TaggingDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggingDirectiveUndefined: Self = StObject.set(x, "TaggingDirective", js.undefined)
    
    @scala.inline
    def setTaggingUndefined: Self = StObject.set(x, "Tagging", js.undefined)
    
    @scala.inline
    def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = StObject.set(x, "WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteRedirectLocationUndefined: Self = StObject.set(x, "WebsiteRedirectLocation", js.undefined)
  }
}
