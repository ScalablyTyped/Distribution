package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectTaggingRequest extends js.Object {
  /**
    * The bucket name containing the object.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * The MD5 hash for the request body.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * Name of the tag.
    */
  var Key: ObjectKey = js.native
  /**
    * Container for the TagSet and Tag elements
    */
  var Tagging: typings.awsSdk.s3Mod.Tagging = js.native
  /**
    * The versionId of the object that the tag-set will be added to.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object PutObjectTaggingRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    Tagging: Tagging,
    ContentMD5: ContentMD5 = null,
    VersionId: ObjectVersionId = null
  ): PutObjectTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectTaggingRequest]
  }
}

