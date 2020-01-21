package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  var Limit: js.UndefOr[PaginationLimit] = js.native
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  var ResourceARN: ResourceArn = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: ResourceArn, Limit: Int | Double = null, NextMarker: NextMarker = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

