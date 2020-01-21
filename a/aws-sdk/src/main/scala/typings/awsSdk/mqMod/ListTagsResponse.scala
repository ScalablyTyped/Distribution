package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsResponse extends js.Object {
  /**
    * The key-value pair for the resource tag.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object ListTagsResponse {
  @scala.inline
  def apply(Tags: mapOfString = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResponse]
  }
}

