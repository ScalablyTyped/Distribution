package typings.awsSdkClientXrayNode.typesFaultStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaultStatistics extends js.Object {
  /**
    * <p>The number of requests that failed with untracked 5xx Server Error status codes.</p>
    */
  var OtherCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>The total number of requests that failed with a 5xx Server Error status code.</p>
    */
  var TotalCount: js.UndefOr[Double] = js.undefined
}

object FaultStatistics {
  @scala.inline
  def apply(OtherCount: js.UndefOr[Double] = js.undefined, TotalCount: js.UndefOr[Double] = js.undefined): FaultStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(OtherCount)) __obj.updateDynamic("OtherCount")(OtherCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaultStatistics]
  }
}

