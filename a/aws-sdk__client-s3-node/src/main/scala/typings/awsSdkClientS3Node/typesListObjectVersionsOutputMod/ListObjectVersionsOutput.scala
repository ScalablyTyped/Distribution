package typings.awsSdkClientS3Node.typesListObjectVersionsOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCommonPrefixMod.UnmarshalledCommonPrefix
import typings.awsSdkClientS3Node.typesDeleteMarkerEntryMod.UnmarshalledDeleteMarkerEntry
import typings.awsSdkClientS3Node.typesObjectVersionMod.UnmarshalledObjectVersion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectVersionsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CommonPrefixList shape
    */
  var CommonPrefixes: js.UndefOr[js.Array[UnmarshalledCommonPrefix]] = js.undefined
  /**
    * _DeleteMarkers shape
    */
  var DeleteMarkers: js.UndefOr[js.Array[UnmarshalledDeleteMarkerEntry]] = js.undefined
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
  var Versions: js.UndefOr[js.Array[UnmarshalledObjectVersion]] = js.undefined
}

object ListObjectVersionsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CommonPrefixes: js.Array[UnmarshalledCommonPrefix] = null,
    DeleteMarkers: js.Array[UnmarshalledDeleteMarkerEntry] = null,
    Delimiter: String = null,
    EncodingType: url | String = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    KeyMarker: String = null,
    MaxKeys: js.UndefOr[Double] = js.undefined,
    Name: String = null,
    NextKeyMarker: String = null,
    NextVersionIdMarker: String = null,
    Prefix: String = null,
    VersionIdMarker: String = null,
    Versions: js.Array[UnmarshalledObjectVersion] = null
  ): ListObjectVersionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes.asInstanceOf[js.Any])
    if (DeleteMarkers != null) __obj.updateDynamic("DeleteMarkers")(DeleteMarkers.asInstanceOf[js.Any])
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter.asInstanceOf[js.Any])
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.get.asInstanceOf[js.Any])
    if (KeyMarker != null) __obj.updateDynamic("KeyMarker")(KeyMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxKeys)) __obj.updateDynamic("MaxKeys")(MaxKeys.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NextKeyMarker != null) __obj.updateDynamic("NextKeyMarker")(NextKeyMarker.asInstanceOf[js.Any])
    if (NextVersionIdMarker != null) __obj.updateDynamic("NextVersionIdMarker")(NextVersionIdMarker.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (VersionIdMarker != null) __obj.updateDynamic("VersionIdMarker")(VersionIdMarker.asInstanceOf[js.Any])
    if (Versions != null) __obj.updateDynamic("Versions")(Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectVersionsOutput]
  }
}

