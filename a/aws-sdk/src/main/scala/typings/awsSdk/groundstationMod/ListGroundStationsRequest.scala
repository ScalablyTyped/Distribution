package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroundStationsRequest extends js.Object {
  /**
    * Maximum number of ground stations returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * Satellite ID to retrieve on-boarded ground stations.
    */
  var satelliteId: js.UndefOr[String] = js.native
}

object ListGroundStationsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[Integer] = js.undefined,
    nextToken: String = null,
    satelliteId: String = null
  ): ListGroundStationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (satelliteId != null) __obj.updateDynamic("satelliteId")(satelliteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroundStationsRequest]
  }
}

