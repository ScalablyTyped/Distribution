package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagsRequest extends js.Object {
  var ResourceArn: string = js.native
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
}

object CreateTagsRequest {
  @scala.inline
  def apply(ResourceArn: string, Tags: Tags = null): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

