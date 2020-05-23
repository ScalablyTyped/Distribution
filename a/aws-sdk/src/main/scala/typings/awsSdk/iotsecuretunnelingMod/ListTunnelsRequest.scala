package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTunnelsRequest extends js.Object {
  /**
    * The maximum number of results to return at once.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the IoT thing associated with the destination device.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object ListTunnelsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    thingName: ThingName = null
  ): ListTunnelsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTunnelsRequest]
  }
}

