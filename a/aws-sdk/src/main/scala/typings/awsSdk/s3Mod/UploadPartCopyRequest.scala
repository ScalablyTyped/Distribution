package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadPartCopyRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
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
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header. This must be the same encryption key specified in the initiate multipart upload request.
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

