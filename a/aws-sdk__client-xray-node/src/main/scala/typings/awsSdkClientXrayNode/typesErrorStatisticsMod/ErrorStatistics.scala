package typings.awsSdkClientXrayNode.typesErrorStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorStatistics extends js.Object {
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

object ErrorStatistics {
  @scala.inline
  def apply(
    OtherCount: js.UndefOr[Double] = js.undefined,
    ThrottleCount: js.UndefOr[Double] = js.undefined,
    TotalCount: js.UndefOr[Double] = js.undefined
  ): ErrorStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(OtherCount)) __obj.updateDynamic("OtherCount")(OtherCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ThrottleCount)) __obj.updateDynamic("ThrottleCount")(ThrottleCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorStatistics]
  }
}

