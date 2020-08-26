package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadObjectRequest extends js.Object {
  /**
    * The name of the bucket containing the object.
    */
  var Bucket: BucketName = js.native
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
    */
  var IfMatch: js.UndefOr[typings.awsSdk.s3Mod.IfMatch] = js.native
  /**
    * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
    */
  var IfModifiedSince: js.UndefOr[typings.awsSdk.s3Mod.IfModifiedSince] = js.native
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
    */
  var IfNoneMatch: js.UndefOr[typings.awsSdk.s3Mod.IfNoneMatch] = js.native
  /**
    * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
    */
  var IfUnmodifiedSince: js.UndefOr[typings.awsSdk.s3Mod.IfUnmodifiedSince] = js.native
  /**
    * The object key.
    */
  var Key: ObjectKey = js.native
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' HEAD request for the part specified. Useful querying about the size of the part and the number of parts in this object.
    */
  var PartNumber: js.UndefOr[typings.awsSdk.s3Mod.PartNumber] = js.native
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.  Amazon S3 doesn't support retrieving multiple ranges of data per GET request. 
    */
  var Range: js.UndefOr[typings.awsSdk.s3Mod.Range] = js.native
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
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object HeadObjectRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): HeadObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadObjectRequest]
  }
  @scala.inline
  implicit class HeadObjectRequestOps[Self <: HeadObjectRequest] (val x: Self) extends AnyVal {
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
    def setIfMatch(value: IfMatch): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
    @scala.inline
    def setIfModifiedSince(value: IfModifiedSince): Self = this.set("IfModifiedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfModifiedSince: Self = this.set("IfModifiedSince", js.undefined)
    @scala.inline
    def setIfNoneMatch(value: IfNoneMatch): Self = this.set("IfNoneMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfNoneMatch: Self = this.set("IfNoneMatch", js.undefined)
    @scala.inline
    def setIfUnmodifiedSince(value: IfUnmodifiedSince): Self = this.set("IfUnmodifiedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfUnmodifiedSince: Self = this.set("IfUnmodifiedSince", js.undefined)
    @scala.inline
    def setPartNumber(value: PartNumber): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartNumber: Self = this.set("PartNumber", js.undefined)
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("Range", js.undefined)
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
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

