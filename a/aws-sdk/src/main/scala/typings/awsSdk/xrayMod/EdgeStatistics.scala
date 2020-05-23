package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeStatistics extends js.Object {
  /**
    * Information about requests that failed with a 4xx Client Error status code.
    */
  var ErrorStatistics: js.UndefOr[typings.awsSdk.xrayMod.ErrorStatistics] = js.native
  /**
    * Information about requests that failed with a 5xx Server Error status code.
    */
  var FaultStatistics: js.UndefOr[typings.awsSdk.xrayMod.FaultStatistics] = js.native
  /**
    * The number of requests that completed with a 2xx Success status code.
    */
  var OkCount: js.UndefOr[NullableLong] = js.native
  /**
    * The total number of completed requests.
    */
  var TotalCount: js.UndefOr[NullableLong] = js.native
  /**
    * The aggregate response time of completed requests.
    */
  var TotalResponseTime: js.UndefOr[NullableDouble] = js.native
}

object EdgeStatistics {
  @scala.inline
  def apply(
    ErrorStatistics: ErrorStatistics = null,
    FaultStatistics: FaultStatistics = null,
    OkCount: js.UndefOr[NullableLong] = js.undefined,
    TotalCount: js.UndefOr[NullableLong] = js.undefined,
    TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
  ): EdgeStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorStatistics != null) __obj.updateDynamic("ErrorStatistics")(ErrorStatistics.asInstanceOf[js.Any])
    if (FaultStatistics != null) __obj.updateDynamic("FaultStatistics")(FaultStatistics.asInstanceOf[js.Any])
    if (!js.isUndefined(OkCount)) __obj.updateDynamic("OkCount")(OkCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalResponseTime)) __obj.updateDynamic("TotalResponseTime")(TotalResponseTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeStatistics]
  }
}

