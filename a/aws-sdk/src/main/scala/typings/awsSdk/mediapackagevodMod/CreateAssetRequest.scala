package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssetRequest extends js.Object {
  /**
    * The unique identifier for the Asset.
    */
  var Id: string = js.native
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: string = js.native
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[string] = js.native
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: string = js.native
  /**
    * The IAM role ARN used to access the source S3 bucket.
    */
  var SourceRoleArn: string = js.native
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.native
}

object CreateAssetRequest {
  @scala.inline
  def apply(
    Id: string,
    PackagingGroupId: string,
    SourceArn: string,
    SourceRoleArn: string,
    ResourceId: string = null,
    Tags: Tags = null
  ): CreateAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any], SourceRoleArn = SourceRoleArn.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetRequest]
  }
}

