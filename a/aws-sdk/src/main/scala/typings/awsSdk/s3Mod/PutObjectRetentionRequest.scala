package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectRetentionRequest extends js.Object {
  /**
    * The bucket name that contains the object you want to apply this Object Retention configuration to.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Indicates whether this operation should bypass Governance-mode restrictions.
    */
  var BypassGovernanceRetention: js.UndefOr[typings.awsSdk.s3Mod.BypassGovernanceRetention] = js.native
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The key name for the object that you want to apply this Object Retention configuration to.
    */
  var Key: ObjectKey = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * The container element for the Object Retention configuration.
    */
  var Retention: js.UndefOr[ObjectLockRetention] = js.native
  /**
    * The version ID for the object that you want to apply this Object Retention configuration to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectRetentionRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined,
    ContentMD5: ContentMD5 = null,
    RequestPayer: RequestPayer = null,
    Retention: ObjectLockRetention = null,
    VersionId: ObjectVersionId = null
  ): PutObjectRetentionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if (!js.isUndefined(BypassGovernanceRetention)) __obj.updateDynamic("BypassGovernanceRetention")(BypassGovernanceRetention.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (Retention != null) __obj.updateDynamic("Retention")(Retention.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectRetentionRequest]
  }
}

