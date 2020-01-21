package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The maximum number of objects that you want AWS WAF to return for this request. If more objects are available, in the response, AWS WAF provides a NextMarker value that you can use in a subsequent call to get the next batch of objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.native
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
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

