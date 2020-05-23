package typings.awsSdkClientXrayNode.typesServiceStatisticsMod

import typings.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics
import typings.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceStatistics extends js.Object {
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  var ErrorStatistics: js.UndefOr[typings.awsSdkClientXrayNode.typesErrorStatisticsMod.ErrorStatistics] = js.undefined
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  var FaultStatistics: js.UndefOr[typings.awsSdkClientXrayNode.typesFaultStatisticsMod.FaultStatistics] = js.undefined
  /**
    * <p>The number of requests that completed with a 2xx Success status code.</p>
    */
  var OkCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The total number of completed requests.</p>
    */
  var TotalCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The aggregate response time of completed requests.</p>
    */
  var TotalResponseTime: js.UndefOr[Double] = js.undefined
}

object ServiceStatistics {
  @scala.inline
  def apply(
    ErrorStatistics: ErrorStatistics = null,
    FaultStatistics: FaultStatistics = null,
    OkCount: js.UndefOr[Double] = js.undefined,
    TotalCount: js.UndefOr[Double] = js.undefined,
    TotalResponseTime: js.UndefOr[Double] = js.undefined
  ): ServiceStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorStatistics != null) __obj.updateDynamic("ErrorStatistics")(ErrorStatistics.asInstanceOf[js.Any])
    if (FaultStatistics != null) __obj.updateDynamic("FaultStatistics")(FaultStatistics.asInstanceOf[js.Any])
    if (!js.isUndefined(OkCount)) __obj.updateDynamic("OkCount")(OkCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalResponseTime)) __obj.updateDynamic("TotalResponseTime")(TotalResponseTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatistics]
  }
}

