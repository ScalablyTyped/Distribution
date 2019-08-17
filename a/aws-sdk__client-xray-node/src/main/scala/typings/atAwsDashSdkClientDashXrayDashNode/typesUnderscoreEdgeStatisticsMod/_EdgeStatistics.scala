package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEdgeStatisticsMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreErrorStatisticsMod._ErrorStatistics
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreFaultStatisticsMod._FaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EdgeStatistics extends js.Object {
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  var ErrorStatistics: js.UndefOr[_ErrorStatistics] = js.undefined
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  var FaultStatistics: js.UndefOr[_FaultStatistics] = js.undefined
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

object _EdgeStatistics {
  @scala.inline
  def apply(
    ErrorStatistics: _ErrorStatistics = null,
    FaultStatistics: _FaultStatistics = null,
    OkCount: Int | Double = null,
    TotalCount: Int | Double = null,
    TotalResponseTime: Int | Double = null
  ): _EdgeStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorStatistics != null) __obj.updateDynamic("ErrorStatistics")(ErrorStatistics)
    if (FaultStatistics != null) __obj.updateDynamic("FaultStatistics")(FaultStatistics)
    if (OkCount != null) __obj.updateDynamic("OkCount")(OkCount.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    if (TotalResponseTime != null) __obj.updateDynamic("TotalResponseTime")(TotalResponseTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EdgeStatistics]
  }
}

