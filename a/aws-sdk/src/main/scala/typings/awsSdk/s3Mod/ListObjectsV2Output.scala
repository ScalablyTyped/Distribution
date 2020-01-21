package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectsV2Output extends js.Object {
  /**
    * All of the keys rolled up into a common prefix count as a single return when calculating the number of returns. A response can contain CommonPrefixes only if you specify a delimiter.  CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by a delimiter.  CommonPrefixes lists keys that act like subdirectories in the directory specified by Prefix. For example, if the prefix is notes/ and the delimiter is a slash (/) as in notes/summer/july, the common prefix is notes/summer/. All of the keys that roll up into a common prefix count as a single return when calculating the number of returns. 
    */
  var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.native
  /**
    * Metadata about each object returned.
    */
  var Contents: js.UndefOr[ObjectList] = js.native
  /**
    *  If ContinuationToken was sent with the request, it is included in the response.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * Causes keys that contain the same string between the prefix and the first occurrence of the delimiter to be rolled up into a single result element in the CommonPrefixes collection. These rolled-up keys are not returned elsewhere in the response. Each rolled-up result counts as only one return against the MaxKeys value.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.native
  /**
    * Encoding type used by Amazon S3 to encode object key names in the XML response. If you specify the encoding-type request parameter, Amazon S3 includes this element in the response, and returns encoded key name values in the following response elements:  Delimiter, Prefix, Key, and StartAfter.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.native
  /**
    * Set to false if all of the results were returned. Set to true if more keys are available to return. If the number of results exceeds that specified by MaxKeys, all of the results might not be returned.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    * KeyCount is the number of keys returned with this request. KeyCount will always be less than equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys 
    */
  var KeyCount: js.UndefOr[typings.awsSdk.s3Mod.KeyCount] = js.native
  /**
    * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[typings.awsSdk.s3Mod.MaxKeys] = js.native
  /**
    * Bucket name.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Name: js.UndefOr[BucketName] = js.native
  /**
    *  NextContinuationToken is sent when isTruncated is true, which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
  /**
    *  Keys that begin with the indicated prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * If StartAfter was sent with the request, it is included in the response.
    */
  var StartAfter: js.UndefOr[typings.awsSdk.s3Mod.StartAfter] = js.native
}

object ListObjectsV2Output {
  @scala.inline
  def apply(
    CommonPrefixes: CommonPrefixList = null,
    Contents: ObjectList = null,
    ContinuationToken: Token = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    KeyCount: Int | Double = null,
    MaxKeys: Int | Double = null,
    Name: BucketName = null,
    NextContinuationToken: NextToken = null,
    Prefix: Prefix = null,
    StartAfter: StartAfter = null
  ): ListObjectsV2Output = {
    val __obj = js.Dynamic.literal()
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

