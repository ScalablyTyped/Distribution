package typings.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevicesRequest extends js.Object {
  /**
    * The type of the device, such as "button".
    */
  var DeviceType: js.UndefOr[string] = js.native
  /**
    * The maximum number of results to return per request. If not set, a default value of
    100 is used.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.iot1clickdevicesserviceMod.MaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListDevicesRequest {
  @scala.inline
  def apply(DeviceType: string = null, MaxResults: Int | Double = null, NextToken: string = null): ListDevicesRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicesRequest]
  }
}

