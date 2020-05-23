package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssetResponse extends js.Object {
  /**
    * The ARN of the Asset.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time the Asset was initially submitted for Ingest.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * The list of egress endpoints available for the Asset.
    */
  var EgressEndpoints: js.UndefOr[listOfEgressEndpoint] = js.native
  /**
    * The unique identifier for the Asset.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: js.UndefOr[string] = js.native
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[string] = js.native
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: js.UndefOr[string] = js.native
  /**
    * The IAM role_arn used to access the source S3 bucket.
    */
  var SourceRoleArn: js.UndefOr[string] = js.native
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.native
}

object CreateAssetResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    CreatedAt: string = null,
    EgressEndpoints: listOfEgressEndpoint = null,
    Id: string = null,
    PackagingGroupId: string = null,
    ResourceId: string = null,
    SourceArn: string = null,
    SourceRoleArn: string = null,
    Tags: Tags = null
  ): CreateAssetResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (EgressEndpoints != null) __obj.updateDynamic("EgressEndpoints")(EgressEndpoints.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (PackagingGroupId != null) __obj.updateDynamic("PackagingGroupId")(PackagingGroupId.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn.asInstanceOf[js.Any])
    if (SourceRoleArn != null) __obj.updateDynamic("SourceRoleArn")(SourceRoleArn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetResponse]
  }
}

