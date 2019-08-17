package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreErrorStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ErrorStatistics extends js.Object {
  /**
    * <p>The number of requests that failed with untracked 4xx Client Error status codes.</p>
    */
  var OtherCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The number of requests that failed with a 419 throttling status code.</p>
    */
  var ThrottleCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The total number of requests that failed with a 4xx Client Error status code.</p>
    */
  var TotalCount: js.UndefOr[Double] = js.undefined
}

object _ErrorStatistics {
  @scala.inline
  def apply(
    OtherCount: Int | Double = null,
    ThrottleCount: Int | Double = null,
    TotalCount: Int | Double = null
  ): _ErrorStatistics = {
    val __obj = js.Dynamic.literal()
    if (OtherCount != null) __obj.updateDynamic("OtherCount")(OtherCount.asInstanceOf[js.Any])
    if (ThrottleCount != null) __obj.updateDynamic("ThrottleCount")(ThrottleCount.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ErrorStatistics]
  }
}

