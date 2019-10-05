package typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecisionInfo extends js.Object {
  var consistency: js.UndefOr[Double] = js.undefined
  var decision: Double
  var useCurrentHost: js.UndefOr[Boolean] = js.undefined
}

object DecisionInfo {
  @scala.inline
  def apply(
    decision: Double,
    consistency: Int | Double = null,
    useCurrentHost: js.UndefOr[Boolean] = js.undefined
  ): DecisionInfo = {
    val __obj = js.Dynamic.literal(decision = decision)
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (!js.isUndefined(useCurrentHost)) __obj.updateDynamic("useCurrentHost")(useCurrentHost)
    __obj.asInstanceOf[DecisionInfo]
  }
}

