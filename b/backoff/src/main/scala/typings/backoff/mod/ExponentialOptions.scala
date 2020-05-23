package typings.backoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExponentialOptions extends Options {
  var factor: js.UndefOr[Double] = js.undefined
}

object ExponentialOptions {
  @scala.inline
  def apply(
    factor: js.UndefOr[Double] = js.undefined,
    initialDelay: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined,
    randomisationFactor: js.UndefOr[Double] = js.undefined
  ): ExponentialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialDelay)) __obj.updateDynamic("initialDelay")(initialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelay)) __obj.updateDynamic("maxDelay")(maxDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomisationFactor)) __obj.updateDynamic("randomisationFactor")(randomisationFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExponentialOptions]
  }
}

