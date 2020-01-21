package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsLogGroupResponse extends js.Object {
  /**
    * The tags for the log group.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object ListTagsLogGroupResponse {
  @scala.inline
  def apply(tags: Tags = null): ListTagsLogGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsLogGroupResponse]
  }
}

