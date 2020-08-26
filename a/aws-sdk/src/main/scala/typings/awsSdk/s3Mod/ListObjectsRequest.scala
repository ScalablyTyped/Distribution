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
  def apply(Bucket: BucketName): ListObjectsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsRequest]
  }
  @scala.inline
  implicit class ListObjectsRequestOps[Self <: ListObjectsRequest] (val x: Self) extends AnyVal {
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
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxKeys(value: MaxKeys): Self = this.set("MaxKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxKeys: Self = this.set("MaxKeys", js.undefined)
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
  }
  
}

