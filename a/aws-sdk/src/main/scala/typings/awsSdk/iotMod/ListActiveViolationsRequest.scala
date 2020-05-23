package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActiveViolationsRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the Device Defender security profile for which violations are listed.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  /**
    * The name of the thing whose active violations are listed.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.native
}

object ListActiveViolationsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    securityProfileName: SecurityProfileName = null,
    thingName: DeviceDefenderThingName = null
  ): ListActiveViolationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (securityProfileName != null) __obj.updateDynamic("securityProfileName")(securityProfileName.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActiveViolationsRequest]
  }
}

