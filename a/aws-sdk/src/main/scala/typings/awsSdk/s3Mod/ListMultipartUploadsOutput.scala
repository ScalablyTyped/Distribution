package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultipartUploadsOutput extends js.Object {
  /**
    * Name of the bucket to which the multipart upload was initiated.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  /**
    * If you specify a delimiter in the request, then the result returns each distinct key prefix containing the delimiter in a CommonPrefixes element. The distinct key prefixes are returned in the Prefix child element.
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.native
  /**
    * Contains the delimiter you specified in the request. If you don't specify a delimiter in your request, this element is absent from the response.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.native
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response. If you specify encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  Delimiter, KeyMarker, Prefix, NextKeyMarker, Key.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.native
  /**
    * Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    * The key at or after which the listing began.
    */
  var KeyMarker: js.UndefOr[typings.awsSdk.s3Mod.KeyMarker] = js.native
  /**
    * Maximum number of multipart uploads that could have been included in the response.
    */
  var MaxUploads: js.UndefOr[typings.awsSdk.s3Mod.MaxUploads] = js.native
  /**
    * When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.
    */
  var NextKeyMarker: js.UndefOr[typings.awsSdk.s3Mod.NextKeyMarker] = js.native
  /**
    * When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.
    */
  var NextUploadIdMarker: js.UndefOr[typings.awsSdk.s3Mod.NextUploadIdMarker] = js.native
  /**
    * When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * Upload ID after which listing began.
    */
  var UploadIdMarker: js.UndefOr[typings.awsSdk.s3Mod.UploadIdMarker] = js.native
  /**
    * Container for elements related to a particular multipart upload. A response can contain zero or more Upload elements.
    */
  var Uploads: js.UndefOr[MultipartUploadList] = js.native
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply(): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
  @scala.inline
  implicit class ListMultipartUploadsOutputOps[Self <: ListMultipartUploadsOutput] (val x: Self) extends AnyVal {
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
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setCommonPrefixesVarargs(value: CommonPrefix*): Self = this.set("CommonPrefixes", js.Array(value :_*))
    @scala.inline
    def setCommonPrefixes(value: CommonPrefixList): Self = this.set("CommonPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonPrefixes: Self = this.set("CommonPrefixes", js.undefined)
    @scala.inline
    def setDelimiter(value: Delimiter): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    @scala.inline
    def setEncodingType(value: EncodingType): Self = this.set("EncodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("EncodingType", js.undefined)
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setKeyMarker(value: KeyMarker): Self = this.set("KeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMarker: Self = this.set("KeyMarker", js.undefined)
    @scala.inline
    def setMaxUploads(value: MaxUploads): Self = this.set("MaxUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUploads: Self = this.set("MaxUploads", js.undefined)
    @scala.inline
    def setNextKeyMarker(value: NextKeyMarker): Self = this.set("NextKeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextKeyMarker: Self = this.set("NextKeyMarker", js.undefined)
    @scala.inline
    def setNextUploadIdMarker(value: NextUploadIdMarker): Self = this.set("NextUploadIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextUploadIdMarker: Self = this.set("NextUploadIdMarker", js.undefined)
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setUploadIdMarker(value: UploadIdMarker): Self = this.set("UploadIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadIdMarker: Self = this.set("UploadIdMarker", js.undefined)
    @scala.inline
    def setUploadsVarargs(value: MultipartUpload*): Self = this.set("Uploads", js.Array(value :_*))
    @scala.inline
    def setUploads(value: MultipartUploadList): Self = this.set("Uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploads: Self = this.set("Uploads", js.undefined)
  }
  
}

