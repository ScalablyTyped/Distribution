package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * swan节点布局相交状态
	 */
trait CreateIntersectionObserverOption extends js.Object {
  var initialRatio: js.UndefOr[scala.Double] = js.undefined
  var selectAll: js.UndefOr[scala.Boolean] = js.undefined
  var thresholds: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object CreateIntersectionObserverOption {
  @scala.inline
  def apply(
    initialRatio: scala.Int | scala.Double = null,
    selectAll: js.UndefOr[scala.Boolean] = js.undefined,
    thresholds: js.Tuple2[scala.Double, scala.Double] = null
  ): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    if (initialRatio != null) __obj.updateDynamic("initialRatio")(initialRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAll)) __obj.updateDynamic("selectAll")(selectAll)
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds)
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
}

