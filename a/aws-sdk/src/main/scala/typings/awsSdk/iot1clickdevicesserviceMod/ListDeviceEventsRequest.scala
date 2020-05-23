package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceEventsRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: string = js.native
  /**
    * The start date for the device event query, in ISO8061 format. For example,
    2018-03-28T15:45:12.880Z
    
    */
  var FromTimeStamp: timestampIso8601 = js.native
  /**
    * The maximum number of results to return per request. If not set, a default value of
    100 is used.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.MaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The end date for the device event query, in ISO8061 format. For example,
    2018-03-28T15:45:12.880Z
    
    */
  var ToTimeStamp: timestampIso8601 = js.native
}

object ListDeviceEventsRequest {
  @scala.inline
  def apply(
    DeviceId: string,
    FromTimeStamp: timestampIso8601,
    ToTimeStamp: timestampIso8601,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: string = null
  ): ListDeviceEventsRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], FromTimeStamp = FromTimeStamp.asInstanceOf[js.Any], ToTimeStamp = ToTimeStamp.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceEventsRequest]
  }
}

