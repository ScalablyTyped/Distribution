package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadPartCopyRequest extends js.Object {
  
  /**
    * The bucket name. When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  
  /**
    * Specifies the source object for the copy operation. You specify the value in one of two formats, depending on whether you want to access the source object through an access point:   For objects not accessed through an access point, specify the name of the source bucket and key of the source object, separated by a slash (/). For example, to copy the object reports/january.pdf from the bucket awsexamplebucket, use awsexamplebucket/reports/january.pdf. The value must be URL encoded.   For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as accessed through the access point, in the format arn:aws:s3:&lt;Region&gt;:&lt;account-id&gt;:accesspoint/&lt;access-point-name&gt;/object/&lt;key&gt;. For example, to copy the object reports/january.pdf through access point my-access-point owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf. The value must be URL encoded.  Amazon S3 supports copy operations using access points only when the source and destination buckets are in the same AWS Region.  Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/object/&lt;key&gt;. For example, to copy the object reports/january.pdf through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf. The value must be URL encoded.    To copy a specific version of an object, append ?versionId=&lt;version-id&gt; to the value (for example, awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893). If you don't specify a version ID, Amazon S3 copies the latest version of the source object.
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
    * The range of bytes to copy from the source object. The range value must use the form bytes=first-last, where the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that you want to copy the first 10 bytes of the source. You can copy a range only if the source object is greater than 5 MB.
    */
  var CopySourceRange: js.UndefOr[typings.awsSdk.s3Mod.CopySourceRange] = js.native
  
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
    * The account id of the expected destination bucket owner. If the destination bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The account id of the expected source bucket owner. If the source bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedSourceBucketOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey = js.native
  
  /**
    * Part number of part being copied. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: typings.awsSdk.s3Mod.PartNumber = js.native
  
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header. This must be the same encryption key specified in the initiate multipart upload request.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKey] = js.native
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  
  /**
    * Upload ID identifying the multipart upload whose part is being copied.
    */
  var UploadId: MultipartUploadId = js.native
}
object UploadPartCopyRequest {
  
  @scala.inline
  def apply(
    Bucket: BucketName,
    CopySource: CopySource,
    Key: ObjectKey,
    PartNumber: PartNumber,
    UploadId: MultipartUploadId
  ): UploadPartCopyRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartCopyRequest]
  }
  
  @scala.inline
  implicit class UploadPartCopyRequestOps[Self <: UploadPartCopyRequest] (val x: Self) extends AnyVal {
    
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
    def setPartNumber(value: PartNumber): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadId(value: MultipartUploadId): Self = this.set("UploadId", value.asInstanceOf[js.Any])
    
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
    def setCopySourceRange(value: CopySourceRange): Self = this.set("CopySourceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopySourceRange: Self = this.set("CopySourceRange", js.undefined)
    
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
    def setExpectedBucketOwner(value: AccountId): Self = this.set("ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedBucketOwner: Self = this.set("ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setExpectedSourceBucketOwner(value: AccountId): Self = this.set("ExpectedSourceBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedSourceBucketOwner: Self = this.set("ExpectedSourceBucketOwner", js.undefined)
    
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
  }
}
