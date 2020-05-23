package typings.awsSdkClientXrayNode.typesEdgeStatisticsMod

import typings.awsSdkClientXrayNode.typesErrorStatisticsMod.UnmarshalledErrorStatistics
import typings.awsSdkClientXrayNode.typesFaultStatisticsMod.UnmarshalledFaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledEdgeStatistics extends EdgeStatistics {
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  @JSName("ErrorStatistics")
  var ErrorStatistics_UnmarshalledEdgeStatistics: js.UndefOr[UnmarshalledErrorStatistics] = js.undefined
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  @JSName("FaultStatistics")
  var FaultStatistics_UnmarshalledEdgeStatistics: js.UndefOr[UnmarshalledFaultStatistics] = js.undefined
}

object UnmarshalledEdgeStatistics {
  @scala.inline
  def apply(
    ErrorStatistics: UnmarshalledErrorStatistics = null,
    FaultStatistics: UnmarshalledFaultStatistics = null,
    OkCount: js.UndefOr[Double] = js.undefined,
    TotalCount: js.UndefOr[Double] = js.undefined,
    TotalResponseTime: js.UndefOr[Double] = js.undefined
  ): UnmarshalledEdgeStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorStatistics != null) __obj.updateDynamic("ErrorStatistics")(ErrorStatistics.asInstanceOf[js.Any])
    if (FaultStatistics != null) __obj.updateDynamic("FaultStatistics")(FaultStatistics.asInstanceOf[js.Any])
    if (!js.isUndefined(OkCount)) __obj.updateDynamic("OkCount")(OkCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalResponseTime)) __obj.updateDynamic("TotalResponseTime")(TotalResponseTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledEdgeStatistics]
  }
}

