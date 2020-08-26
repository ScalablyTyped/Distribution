package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectsRequest extends js.Object {
  /**
    * The bucket name containing the objects to delete.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Specifies whether you want to delete this object even if it has a Governance-type Object Lock in place. You must have sufficient permissions to perform this operation.
    */
  var BypassGovernanceRetention: js.UndefOr[typings.awsSdk.s3Mod.BypassGovernanceRetention] = js.native
  /**
    * Container for the request.
    */
  var Delete: typings.awsSdk.s3Mod.Delete = js.native
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device. Required to permanently delete a versioned object if versioning is configured with MFA delete enabled.
    */
  var MFA: js.UndefOr[typings.awsSdk.s3Mod.MFA] = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
}

object DeleteObjectsRequest {
  @scala.inline
  def apply(Bucket: BucketName, Delete: Delete): DeleteObjectsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsRequest]
  }
  @scala.inline
  implicit class DeleteObjectsRequestOps[Self <: DeleteObjectsRequest] (val x: Self) extends AnyVal {
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
    def setDelete(value: Delete): Self = this.set("Delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setBypassGovernanceRetention(value: BypassGovernanceRetention): Self = this.set("BypassGovernanceRetention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypassGovernanceRetention: Self = this.set("BypassGovernanceRetention", js.undefined)
    @scala.inline
    def setMFA(value: MFA): Self = this.set("MFA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMFA: Self = this.set("MFA", js.undefined)
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = this.set("RequestPayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPayer: Self = this.set("RequestPayer", js.undefined)
  }
  
}

