package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsRequest extends js.Object {
  /**
    * Name of the bucket to which the parts are being uploaded.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey = js.native
  /**
    * Sets the maximum number of parts to return.
    */
  var MaxParts: js.UndefOr[typings.awsSdk.s3Mod.MaxParts] = js.native
  /**
    * Specifies the part after which listing should begin. Only parts with higher part numbers will be listed.
    */
  var PartNumberMarker: js.UndefOr[typings.awsSdk.s3Mod.PartNumberMarker] = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * Upload ID identifying the multipart upload whose parts are being listed.
    */
  var UploadId: MultipartUploadId = js.native
}

object ListPartsRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, UploadId: MultipartUploadId): ListPartsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsRequest]
  }
  @scala.inline
  implicit class ListPartsRequestOps[Self <: ListPartsRequest] (val x: Self) extends AnyVal {
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
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadId(value: MultipartUploadId): Self = this.set("UploadId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxParts(value: MaxParts): Self = this.set("MaxParts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParts: Self = this.set("MaxParts", js.undefined)
    @scala.inline
    def setPartNumberMarker(value: PartNumberMarker): Self = this.set("PartNumberMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartNumberMarker: Self = this.set("PartNumberMarker", js.undefined)
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
  }
  
}

