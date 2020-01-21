package typings.awsSdkClientXrayNode.typesServiceStatisticsMod

import typings.awsSdkClientXrayNode.typesErrorStatisticsMod.UnmarshalledErrorStatistics
import typings.awsSdkClientXrayNode.typesFaultStatisticsMod.UnmarshalledFaultStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledServiceStatistics extends ServiceStatistics {
  /**
    * <p>Information about requests that failed with a 4xx Client Error status code.</p>
    */
  @JSName("ErrorStatistics")
  var ErrorStatistics_UnmarshalledServiceStatistics: js.UndefOr[UnmarshalledErrorStatistics] = js.undefined
  /**
    * <p>Information about requests that failed with a 5xx Server Error status code.</p>
    */
  @JSName("FaultStatistics")
  var FaultStatistics_UnmarshalledServiceStatistics: js.UndefOr[UnmarshalledFaultStatistics] = js.undefined
}

object UnmarshalledServiceStatistics {
  @scala.inline
  def apply(
    ErrorStatistics: UnmarshalledErrorStatistics = null,
    FaultStatistics: UnmarshalledFaultStatistics = null,
    OkCount: Int | Double = null,
    TotalCount: Int | Double = null,
    TotalResponseTime: Int | Double = null
  ): UnmarshalledServiceStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorStatistics != null) __obj.updateDynamic("ErrorStatistics")(ErrorStatistics.asInstanceOf[js.Any])
    if (FaultStatistics != null) __obj.updateDynamic("FaultStatistics")(FaultStatistics.asInstanceOf[js.Any])
    if (OkCount != null) __obj.updateDynamic("OkCount")(OkCount.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    if (TotalResponseTime != null) __obj.updateDynamic("TotalResponseTime")(TotalResponseTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledServiceStatistics]
  }
}

