package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectVersionsRequest extends js.Object {
  /**
    * The bucket name that contains the objects.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * A delimiter is a character that you specify to group keys. All keys that contain the same string between the prefix and the first occurrence of the delimiter are grouped under a single result element in CommonPrefixes. These groups are counted as one result against the max-keys limitation. These keys are not returned elsewhere in the response.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.s3Mod.Delimiter] = js.native
  var EncodingType: js.UndefOr[typings.awsSdk.s3Mod.EncodingType] = js.native
  /**
    * Specifies the key to start with when listing objects in a bucket.
    */
  var KeyMarker: js.UndefOr[typings.awsSdk.s3Mod.KeyMarker] = js.native
  /**
    * Sets the maximum number of keys returned in the response. By default the API returns up to 1,000 key names. The response might contain fewer keys but will never contain more. If additional keys satisfy the search criteria, but were not returned because max-keys was exceeded, the response contains &lt;isTruncated&gt;true&lt;/isTruncated&gt;. To return the additional keys, see key-marker and version-id-marker.
    */
  var MaxKeys: js.UndefOr[typings.awsSdk.s3Mod.MaxKeys] = js.native
  /**
    * Use this parameter to select only those keys that begin with the specified prefix. You can use prefixes to separate a bucket into different groupings of keys. (You can think of using prefix to make groups in the same way you'd use a folder in a file system.) You can use prefix with delimiter to roll up numerous objects into a single result under CommonPrefixes. 
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * Specifies the object version you want to start listing from.
    */
  var VersionIdMarker: js.UndefOr[typings.awsSdk.s3Mod.VersionIdMarker] = js.native
}

object ListObjectVersionsRequest {
  @scala.inline
  def apply(Bucket: BucketName): ListObjectVersionsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectVersionsRequest]
  }
  @scala.inline
  implicit class ListObjectVersionsRequestOps[Self <: ListObjectVersionsRequest] (val x: Self) extends AnyVal {
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiter(value: Delimiter): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    @scala.inline
    def setEncodingType(value: EncodingType): Self = this.set("EncodingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodingType: Self = this.set("EncodingType", js.undefined)
    @scala.inline
    def setKeyMarker(value: KeyMarker): Self = this.set("KeyMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMarker: Self = this.set("KeyMarker", js.undefined)
    @scala.inline
    def setMaxKeys(value: MaxKeys): Self = this.set("MaxKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxKeys: Self = this.set("MaxKeys", js.undefined)
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setVersionIdMarker(value: VersionIdMarker): Self = this.set("VersionIdMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionIdMarker: Self = this.set("VersionIdMarker", js.undefined)
  }
  
}

