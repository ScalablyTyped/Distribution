package typings.awsSdkClientS3Node.typesListMultipartUploadsOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Node.typesMultipartUploadMod.UnmarshalledMultipartUpload
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMultipartUploadsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Name of the bucket to which the multipart upload was initiated.</p>
    */
  var Bucket: js.UndefOr[String] = js.undefined
  /**
    * _CommonPrefixList shape
    */
  var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.undefined
  /**
    * _Delimiter shape
    */
  var Delimiter: js.UndefOr[String] = js.undefined
  /**
    * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
    */
  var EncodingType: js.UndefOr[url | String] = js.undefined
  /**
    * <p>Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The key at or after which the listing began.</p>
    */
  var KeyMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>Maximum number of multipart uploads that could have been included in the response.</p>
    */
  var MaxUploads: js.UndefOr[Double] = js.undefined
  /**
    * <p>When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.</p>
    */
  var NextKeyMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.</p>
    */
  var NextUploadIdMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>Upload ID after which listing began.</p>
    */
  var UploadIdMarker: js.UndefOr[String] = js.undefined
  /**
    * _MultipartUploadList shape
    */
  var Uploads: js.UndefOr[js.Array[UnmarshalledMultipartUpload]] = js.undefined
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Bucket: String = null,
    CommonPrefixes: js.Array[UnmarshalledCommonPrefix] = null,
    Delimiter: String = null,
    EncodingType: url | String = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    KeyMarker: String = null,
    MaxUploads: Int | Double = null,
    NextKeyMarker: String = null,
    NextUploadIdMarker: String = null,
    Prefix: String = null,
    UploadIdMarker: String = null,
    Uploads: js.Array[UnmarshalledMultipartUpload] = null
  ): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
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

