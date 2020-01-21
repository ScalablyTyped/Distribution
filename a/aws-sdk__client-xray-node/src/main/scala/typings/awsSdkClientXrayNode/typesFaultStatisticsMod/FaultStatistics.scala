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
  def apply(OtherCount: Int | Double = null, TotalCount: Int | Double = null): FaultStatistics = {
    val __obj = js.Dynamic.literal()
    if (OtherCount != null) __obj.updateDynamic("OtherCount")(OtherCount.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaultStatistics]
  }
}

