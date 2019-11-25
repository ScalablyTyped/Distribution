package typings.atAwsDashSdkClientDashS3DashNode.typesListObjectsV2OutputMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.url
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCommonPrefixMod._UnmarshalledCommonPrefix
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreObjectMod._UnmarshalledObject
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectsV2Output
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by delimiter</p>
    */
  var CommonPrefixes: js.UndefOr[js.Array[_UnmarshalledCommonPrefix]] = js.undefined
  /**
    * <p>Metadata about each object returned.</p>
    */
  var Contents: js.UndefOr[js.Array[_UnmarshalledObject]] = js.undefined
  /**
    * <p>ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.undefined
  /**
    * <p>A delimiter is a character you use to group keys.</p>
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
    * <p>KeyCount is the number of keys returned with this request. KeyCount will always be less than equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys </p>
    */
  var KeyCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.</p>
    */
  var MaxKeys: js.UndefOr[Double] = js.undefined
  /**
    * <p>Name of the bucket to list.</p>
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p>NextContinuationToken is sent when isTruncated is true which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.undefined
  /**
    * <p>Limits the response to keys that begin with the specified prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket</p>
    */
  var StartAfter: js.UndefOr[String] = js.undefined
}

object ListObjectsV2Output {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    CommonPrefixes: js.Array[_UnmarshalledCommonPrefix] = null,
    Contents: js.Array[_UnmarshalledObject] = null,
    ContinuationToken: String = null,
    Delimiter: String = null,
    EncodingType: url | String = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    KeyCount: Int | Double = null,
    MaxKeys: Int | Double = null,
    Name: String = null,
    NextContinuationToken: String = null,
    Prefix: String = null,
    StartAfter: String = null
  ): ListObjectsV2Output = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CommonPrefixes != null) __obj.updateDynamic("CommonPrefixes")(CommonPrefixes.asInstanceOf[js.Any])
    if (Contents != null) __obj.updateDynamic("Contents")(Contents.asInstanceOf[js.Any])
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter.asInstanceOf[js.Any])
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (KeyCount != null) __obj.updateDynamic("KeyCount")(KeyCount.asInstanceOf[js.Any])
    if (MaxKeys != null) __obj.updateDynamic("MaxKeys")(MaxKeys.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (StartAfter != null) __obj.updateDynamic("StartAfter")(StartAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsV2Output]
  }
}

