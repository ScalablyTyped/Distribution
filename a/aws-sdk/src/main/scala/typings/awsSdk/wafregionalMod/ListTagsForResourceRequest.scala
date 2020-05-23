package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * 
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * 
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
  /**
    * 
    */
  var ResourceARN: ResourceArn = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(
    ResourceARN: ResourceArn,
    Limit: js.UndefOr[PaginationLimit] = js.undefined,
    NextMarker: NextMarker = null
  ): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

