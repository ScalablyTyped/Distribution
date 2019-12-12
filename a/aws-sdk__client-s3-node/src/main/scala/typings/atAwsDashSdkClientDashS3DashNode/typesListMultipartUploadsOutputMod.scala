package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.url
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCommonPrefixMod._UnmarshalledCommonPrefix
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMultipartUploadMod._UnmarshalledMultipartUpload
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/ListMultipartUploadsOutput", JSImport.Namespace)
@js.native
object typesListMultipartUploadsOutputMod extends js.Object {
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
    var CommonPrefixes: js.UndefOr[js.Array[_UnmarshalledCommonPrefix]] = js.native
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
    var Uploads: js.UndefOr[js.Array[_UnmarshalledMultipartUpload]] = js.native
  }
  
}

