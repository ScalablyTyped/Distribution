package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectLegalHoldRequest extends js.Object {
  /**
    * The bucket name containing the object that you want to place a Legal Hold on.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The key name for the object that you want to place a Legal Hold on.
    */
  var Key: ObjectKey = js.native
  /**
    * Container element for the Legal Hold configuration you want to apply to the specified object.
    */
  var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * The version ID of the object that you want to place a Legal Hold on.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectLegalHoldRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): PutObjectLegalHoldRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLegalHoldRequest]
  }
  @scala.inline
  implicit class PutObjectLegalHoldRequestOps[Self <: PutObjectLegalHoldRequest] (val x: Self) extends AnyVal {
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
    def setContentMD5(value: ContentMD5): Self = this.set("ContentMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentMD5: Self = this.set("ContentMD5", js.undefined)
    @scala.inline
    def setLegalHold(value: ObjectLockLegalHold): Self = this.set("LegalHold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegalHold: Self = this.set("LegalHold", js.undefined)
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

