package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectLegalHoldRequest extends js.Object {
  /**
    * The bucket name containing the object whose Legal Hold status you want to retrieve.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * The key name for the object whose Legal Hold status you want to retrieve.
    */
  var Key: ObjectKey = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * The version ID of the object whose Legal Hold status you want to retrieve.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object GetObjectLegalHoldRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    RequestPayer: RequestPayer = null,
    VersionId: ObjectVersionId = null
  ): GetObjectLegalHoldRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectLegalHoldRequest]
  }
}

