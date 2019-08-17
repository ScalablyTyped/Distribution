package typings.atAwsDashSdkClientDashS3DashBrowser.typesListObjectsOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.url
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCommonPrefixMod._UnmarshalledCommonPrefix
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreObjectMod._UnmarshalledObject
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CommonPrefixList shape
    */
  var CommonPrefixes: js.UndefOr[js.Array[_UnmarshalledCommonPrefix]] = js.undefined
  /**
    * _ObjectList shape
    */
  var Contents: js.UndefOr[js.Array[_UnmarshalledObject]] = js.undefined
  /**
    * _Delimiter shape
    */
  var Delimiter: js.UndefOr[String] = js.undefined
  /**
    * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
    */
  var EncodingType: js.UndefOr[url | String] = js.undefined
  /**
    * <p>A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * _Marker shape
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * _MaxKeys shape
    */
  var MaxKeys: js.UndefOr[Double] = js.undefined
  /**
    * _BucketName shape
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p>When response is truncated (the IsTruncated element value in the response is true), you can use the key name in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists objects in alphabetical order Note: This element is returned only if you have delimiter request parameter specified. If response does not include the NextMaker and it is truncated, you can use the value of the last Key in the response as the marker in the subsequent request to get the next set of object keys.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
}

object ListObjectsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CommonPrefixes: js.Array[_UnmarshalledCommonPrefix] = null,
    Contents: js.Array[_UnmarshalledObject] = null,
    Delimiter: String = null,
    EncodingType: url | String = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    Marker: String = null,
    MaxKeys: Int | Double = null,
    Name: String = null,
    NextMarker: String = null,
    Prefix: String = null
  ): ListObjectsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes)
    if (Contents != null) __obj.updateDynamic("Contents")(Contents)
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxKeys != null) __obj.updateDynamic("MaxKeys")(MaxKeys.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    __obj.asInstanceOf[ListObjectsOutput]
  }
}

