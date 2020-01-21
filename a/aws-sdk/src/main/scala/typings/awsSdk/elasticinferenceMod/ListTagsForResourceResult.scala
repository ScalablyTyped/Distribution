package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResult extends js.Object {
  /**
    * The tags of the Elastic Inference Accelerator.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object ListTagsForResourceResult {
  @scala.inline
  def apply(tags: TagMap = null): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
}

