package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * Root level tag for the Tags parameters.
    */
  var Tags: js.UndefOr[typings.awsSdk.globalacceleratorMod.Tags] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: Tags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

