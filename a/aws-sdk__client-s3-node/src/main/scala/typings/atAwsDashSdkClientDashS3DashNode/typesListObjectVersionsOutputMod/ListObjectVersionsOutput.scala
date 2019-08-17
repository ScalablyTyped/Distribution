package typings.atAwsDashSdkClientDashS3DashNode.typesListObjectVersionsOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.url
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCommonPrefixMod._UnmarshalledCommonPrefix
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDeleteMarkerEntryMod._UnmarshalledDeleteMarkerEntry
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreObjectVersionMod._UnmarshalledObjectVersion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectVersionsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CommonPrefixList shape
    */
  var CommonPrefixes: js.UndefOr[js.Array[_UnmarshalledCommonPrefix]] = js.undefined
  /**
    * _DeleteMarkers shape
    */
  var DeleteMarkers: js.UndefOr[js.Array[_UnmarshalledDeleteMarkerEntry]] = js.undefined
  /**
    * _Delimiter shape
    */
  var Delimiter: js.UndefOr[String] = js.undefined
  /**
    * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
    */
  var EncodingType: js.UndefOr[url | String] = js.undefined
  /**
    * <p>A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>Marks the last Key returned in a truncated response.</p>
    */
  var KeyMarker: js.UndefOr[String] = js.undefined
  /**
    * _MaxKeys shape
    */
  var MaxKeys: js.UndefOr[Double] = js.undefined
  /**
    * _BucketName shape
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p>Use this value for the key marker request parameter in a subsequent request.</p>
    */
  var NextKeyMarker: js.UndefOr[String] = js.undefined
  /**
    * <p>Use this value for the next version id marker parameter in a subsequent request.</p>
    */
  var NextVersionIdMarker: js.UndefOr[String] = js.undefined
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * _VersionIdMarker shape
    */
  var VersionIdMarker: js.UndefOr[String] = js.undefined
  /**
    * _ObjectVersionList shape
    */
  var Versions: js.UndefOr[js.Array[_UnmarshalledObjectVersion]] = js.undefined
}

object ListObjectVersionsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CommonPrefixes: js.Array[_UnmarshalledCommonPrefix] = null,
    DeleteMarkers: js.Array[_UnmarshalledDeleteMarkerEntry] = null,
    Delimiter: String = null,
    EncodingType: url | String = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    KeyMarker: String = null,
    MaxKeys: Int | Double = null,
    Name: String = null,
    NextKeyMarker: String = null,
    NextVersionIdMarker: String = null,
    Prefix: String = null,
    VersionIdMarker: String = null,
    Versions: js.Array[_UnmarshalledObjectVersion] = null
  ): ListObjectVersionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes)
    if (DeleteMarkers != null) __obj.updateDynamic("DeleteMarkers")(DeleteMarkers)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (KeyMarker != null) __obj.updateDynamic("KeyMarker")(KeyMarker)
    if (MaxKeys != null) __obj.updateDynamic("MaxKeys")(MaxKeys.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextKeyMarker != null) __obj.updateDynamic("NextKeyMarker")(NextKeyMarker)
    if (NextVersionIdMarker != null) __obj.updateDynamic("NextVersionIdMarker")(NextVersionIdMarker)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (VersionIdMarker != null) __obj.updateDynamic("VersionIdMarker")(VersionIdMarker)
    if (Versions != null) __obj.updateDynamic("Versions")(Versions)
    __obj.asInstanceOf[ListObjectVersionsOutput]
  }
}

