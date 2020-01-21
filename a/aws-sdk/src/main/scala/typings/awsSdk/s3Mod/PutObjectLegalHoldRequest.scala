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
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    ContentMD5: ContentMD5 = null,
    LegalHold: ObjectLockLegalHold = null,
    RequestPayer: RequestPayer = null,
    VersionId: ObjectVersionId = null
  ): PutObjectLegalHoldRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (LegalHold != null) __obj.updateDynamic("LegalHold")(LegalHold.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLegalHoldRequest]
  }
}

