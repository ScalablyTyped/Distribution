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
  def apply(Id: string, PackagingGroupId: string, SourceArn: string, SourceRoleArn: string): CreateAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any], SourceRoleArn = SourceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetRequest]
  }
  @scala.inline
  implicit class CreateAssetRequestOps[Self <: CreateAssetRequest] (val x: Self) extends AnyVal {
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackagingGroupId(value: string): Self = this.set("PackagingGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceArn(value: string): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceRoleArn(value: string): Self = this.set("SourceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: string): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

