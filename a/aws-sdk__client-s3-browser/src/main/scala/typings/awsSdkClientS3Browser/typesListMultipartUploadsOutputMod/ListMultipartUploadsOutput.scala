package typings.awsSdkClientS3Browser.typesListMultipartUploadsOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.url
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Browser.typesMultipartUploadMod.UnmarshalledMultipartUpload
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultipartUploadsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Name of the bucket to which the multipart upload was initiated.</p>
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * _CommonPrefixList shape
    */
  var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.native
  /**
    * _Delimiter shape
    */
  var Delimiter: js.UndefOr[String] = js.native
  /**
    * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
    */
  var EncodingType: js.UndefOr[url | String] = js.native
  /**
    * <p>Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.native
  /**
    * <p>The key at or after which the listing began.</p>
    */
  var KeyMarker: js.UndefOr[String] = js.native
  /**
    * <p>Maximum number of multipart uploads that could have been included in the response.</p>
    */
  var MaxUploads: js.UndefOr[Double] = js.native
  /**
    * <p>When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.</p>
    */
  var NextKeyMarker: js.UndefOr[String] = js.native
  /**
    * <p>When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.</p>
    */
  var NextUploadIdMarker: js.UndefOr[String] = js.native
  /**
    * <p>When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>Upload ID after which listing began.</p>
    */
  var UploadIdMarker: js.UndefOr[String] = js.native
  /**
    * _MultipartUploadList shape
    */
  var Uploads: js.UndefOr[js.Array[UnmarshalledMultipartUpload]] = js.native
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
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
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    @scala.inline
    def setCommonPrefixesVarargs(value: UnmarshalledCommonPrefix*): Self = this.set("CommonPrefixes", js.Array(value :_*))
    @scala.inline
    def setCommonPrefixes(value: js.Array[UnmarshalledCommonPrefix]): Self = this.set("CommonPrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonPrefixes: Self = this.set("CommonPrefixes", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    @scala.inline
    def setEncodingType(value: url | String): Self = this.set("EncodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("EncodingType", js.undefined)
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    @scala.inline
    def setKeyMarker(value: String): Self = this.set("KeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMarker: Self = this.set("KeyMarker", js.undefined)
    @scala.inline
    def setMaxUploads(value: Double): Self = this.set("MaxUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUploads: Self = this.set("MaxUploads", js.undefined)
    @scala.inline
    def setNextKeyMarker(value: String): Self = this.set("NextKeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextKeyMarker: Self = this.set("NextKeyMarker", js.undefined)
    @scala.inline
    def setNextUploadIdMarker(value: String): Self = this.set("NextUploadIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextUploadIdMarker: Self = this.set("NextUploadIdMarker", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setUploadIdMarker(value: String): Self = this.set("UploadIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadIdMarker: Self = this.set("UploadIdMarker", js.undefined)
    @scala.inline
    def setUploadsVarargs(value: UnmarshalledMultipartUpload*): Self = this.set("Uploads", js.Array(value :_*))
    @scala.inline
    def setUploads(value: js.Array[UnmarshalledMultipartUpload]): Self = this.set("Uploads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploads: Self = this.set("Uploads", js.undefined)
  }
  
}

