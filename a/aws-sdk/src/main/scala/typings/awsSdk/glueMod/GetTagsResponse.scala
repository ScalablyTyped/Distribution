package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsResponse extends js.Object {
  /**
    * The requested tags.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}

object GetTagsResponse {
  @scala.inline
  def apply(Tags: TagsMap = null): GetTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsResponse]
  }
}

