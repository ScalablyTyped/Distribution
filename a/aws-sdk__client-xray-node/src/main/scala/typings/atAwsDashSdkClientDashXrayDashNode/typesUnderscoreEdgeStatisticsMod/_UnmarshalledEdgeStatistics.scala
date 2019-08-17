package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEdgeStatisticsMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreErrorStatisticsMod._UnmarshalledErrorStatistics
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreFaultStatisticsMod._UnmarshalledFaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEdgeStatistics extends _EdgeStatistics {
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  @JSName("ErrorStatistics")
  var ErrorStatistics__UnmarshalledEdgeStatistics: js.UndefOr[_UnmarshalledErrorStatistics] = js.undefined
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  @JSName("FaultStatistics")
  var FaultStatistics__UnmarshalledEdgeStatistics: js.UndefOr[_UnmarshalledFaultStatistics] = js.undefined
}

object _UnmarshalledEdgeStatistics {
  @scala.inline
  def apply(
    ErrorStatistics: _UnmarshalledErrorStatistics = null,
    FaultStatistics: _UnmarshalledFaultStatistics = null,
    OkCount: Int | Double = null,
    TotalCount: Int | Double = null,
    TotalResponseTime: Int | Double = null
  ): _UnmarshalledEdgeStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorStatistics != null) __obj.updateDynamic("ErrorStatistics")(ErrorStatistics)
    if (FaultStatistics != null) __obj.updateDynamic("FaultStatistics")(FaultStatistics)
    if (OkCount != null) __obj.updateDynamic("OkCount")(OkCount.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    if (TotalResponseTime != null) __obj.updateDynamic("TotalResponseTime")(TotalResponseTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEdgeStatistics]
  }
}

