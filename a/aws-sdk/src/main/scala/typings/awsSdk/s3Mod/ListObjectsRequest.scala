package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectsRequest extends js.Object {
  /**
    * The name of the bucket containing the objects.
    */
  var Bucket: BucketName = js.native
  /**
    * A delimiter is a character you use to group keys.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.native
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.native
  /**
    * Specifies the key to start with when listing objects in a bucket.
    */
  var Marker: js.UndefOr[typings.awsSdk.s3Mod.Marker] = js.native
  /**
    * Sets the maximum number of keys returned in the response. By default the API returns up to 1,000 key names. The response might contain fewer keys but will never contain more. 
    */
  var MaxKeys: js.UndefOr[typings.awsSdk.s3Mod.MaxKeys] = js.native
  /**
    * Limits the response to keys that begin with the specified prefix.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * Confirms that the requester knows that she or he will be charged for the list objects request. Bucket owners need not specify this parameter in their requests.
    */
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
}

object ListObjectsRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    Marker: Marker = null,
    MaxKeys: js.UndefOr[MaxKeys] = js.undefined,
    Prefix: Prefix = null,
    RequestPayer: RequestPayer = null
  ): ListObjectsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter.asInstanceOf[js.Any])
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxKeys)) __obj.updateDynamic("MaxKeys")(MaxKeys.get.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsRequest]
  }
}

