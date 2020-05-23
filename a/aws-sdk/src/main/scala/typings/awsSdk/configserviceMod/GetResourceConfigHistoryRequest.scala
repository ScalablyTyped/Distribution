package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceConfigHistoryRequest extends js.Object {
  /**
    * The chronological order for configuration items listed. By default, the results are listed in reverse chronological order.
    */
  var chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.native
  /**
    * The time stamp that indicates an earlier time. If not specified, the action returns paginated results that contain configuration items that start when the first configuration item was recorded.
    */
  var earlierTime: js.UndefOr[EarlierTime] = js.native
  /**
    * The time stamp that indicates a later time. If not specified, current time is taken.
    */
  var laterTime: js.UndefOr[LaterTime] = js.native
  /**
    * The maximum number of configuration items returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: ResourceId = js.native
  /**
    * The resource type.
    */
  var resourceType: ResourceType = js.native
}

object GetResourceConfigHistoryRequest {
  @scala.inline
  def apply(
    resourceId: ResourceId,
    resourceType: ResourceType,
    chronologicalOrder: ChronologicalOrder = null,
    earlierTime: EarlierTime = null,
    laterTime: LaterTime = null,
    limit: js.UndefOr[Limit] = js.undefined,
    nextToken: NextToken = null
  ): GetResourceConfigHistoryRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (chronologicalOrder != null) __obj.updateDynamic("chronologicalOrder")(chronologicalOrder.asInstanceOf[js.Any])
    if (earlierTime != null) __obj.updateDynamic("earlierTime")(earlierTime.asInstanceOf[js.Any])
    if (laterTime != null) __obj.updateDynamic("laterTime")(laterTime.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceConfigHistoryRequest]
  }
}

