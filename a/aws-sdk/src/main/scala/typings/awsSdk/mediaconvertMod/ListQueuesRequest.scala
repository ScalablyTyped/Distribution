package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesRequest extends js.Object {
  /**
    * Optional. When you request a list of queues, you can choose to list them alphabetically by NAME or chronologically by CREATION_DATE. If you don't specify, the service will list them by creation date.
    */
  var ListBy: js.UndefOr[QueueListBy] = js.native
  /**
    * Optional. Number of queues, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[integerMin1Max20] = js.native
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of queues.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Optional. When you request lists of resources, you can specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typings.awsSdk.mediaconvertMod.Order] = js.native
}

object ListQueuesRequest {
  @scala.inline
  def apply(
    ListBy: QueueListBy = null,
    MaxResults: js.UndefOr[integerMin1Max20] = js.undefined,
    NextToken: string = null,
    Order: Order = null
  ): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    if (ListBy != null) __obj.updateDynamic("ListBy")(ListBy.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesRequest]
  }
}

