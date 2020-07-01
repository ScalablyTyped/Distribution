package typings.awsSdk.iotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamedShadowsForThingRequest extends js.Object {
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}

object ListNamedShadowsForThingRequest {
  @scala.inline
  def apply(thingName: ThingName, nextToken: NextToken = null, pageSize: js.UndefOr[PageSize] = js.undefined): ListNamedShadowsForThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNamedShadowsForThingRequest]
  }
}

