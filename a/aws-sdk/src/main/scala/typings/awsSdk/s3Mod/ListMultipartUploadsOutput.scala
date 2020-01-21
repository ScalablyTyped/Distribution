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
  def apply(
    Bucket: BucketName = null,
    CommonPrefixes: CommonPrefixList = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    KeyMarker: KeyMarker = null,
    MaxUploads: Int | Double = null,
    NextKeyMarker: NextKeyMarker = null,
    NextUploadIdMarker: NextUploadIdMarker = null,
    Prefix: Prefix = null,
    UploadIdMarker: UploadIdMarker = null,
    Uploads: MultipartUploadList = null
  ): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket.asInstanceOf[js.Any])
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes.asInstanceOf[js.Any])
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter.asInstanceOf[js.Any])
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (KeyMarker != null) __obj.updateDynamic("KeyMarker")(KeyMarker.asInstanceOf[js.Any])
    if (MaxUploads != null) __obj.updateDynamic("MaxUploads")(MaxUploads.asInstanceOf[js.Any])
    if (NextKeyMarker != null) __obj.updateDynamic("NextKeyMarker")(NextKeyMarker.asInstanceOf[js.Any])
    if (NextUploadIdMarker != null) __obj.updateDynamic("NextUploadIdMarker")(NextUploadIdMarker.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (UploadIdMarker != null) __obj.updateDynamic("UploadIdMarker")(UploadIdMarker.asInstanceOf[js.Any])
    if (Uploads != null) __obj.updateDynamic("Uploads")(Uploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
}

