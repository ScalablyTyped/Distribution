package typings.backoff.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExponentialOptions extends Options {
  var factor: js.UndefOr[Double] = js.undefined
}

object ExponentialOptions {
  @scala.inline
  def apply(
    factor: Int | Double = null,
    initialDelay: Int | Double = null,
    maxDelay: Int | Double = null,
    randomisationFactor: Int | Double = null
  ): ExponentialOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (randomisationFactor != null) __obj.updateDynamic("randomisationFactor")(randomisationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExponentialOptions]
  }
}

