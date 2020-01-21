package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceResponse extends js.Object {
  /**
    * The identifier of the new resource.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.workmailMod.ResourceId] = js.native
}

object CreateResourceResponse {
  @scala.inline
  def apply(ResourceId: ResourceId = null): CreateResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceResponse]
  }
}

