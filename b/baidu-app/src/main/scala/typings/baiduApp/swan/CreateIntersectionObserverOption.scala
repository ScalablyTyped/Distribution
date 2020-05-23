package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * swan节点布局相交状态
  */
trait CreateIntersectionObserverOption extends js.Object {
  var initialRatio: js.UndefOr[Double] = js.undefined
  var selectAll: js.UndefOr[Boolean] = js.undefined
  var thresholds: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object CreateIntersectionObserverOption {
  @scala.inline
  def apply(
    initialRatio: js.UndefOr[Double] = js.undefined,
    selectAll: js.UndefOr[Boolean] = js.undefined,
    thresholds: js.Tuple2[Double, Double] = null
  ): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialRatio)) __obj.updateDynamic("initialRatio")(initialRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAll)) __obj.updateDynamic("selectAll")(selectAll.get.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
}

