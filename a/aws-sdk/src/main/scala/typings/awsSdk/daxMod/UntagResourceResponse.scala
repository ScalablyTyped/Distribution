package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceResponse extends js.Object {
  /**
    * The tag keys that have been removed from the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object UntagResourceResponse {
  @scala.inline
  def apply(Tags: TagList = null): UntagResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceResponse]
  }
}

