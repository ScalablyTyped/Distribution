package typings
package backoffLib.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExponentialOptions extends Options {
  var factor: js.UndefOr[scala.Double] = js.undefined
}

object ExponentialOptions {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    initialDelay: scala.Int | scala.Double = null,
    maxDelay: scala.Int | scala.Double = null,
    randomisationFactor: scala.Int | scala.Double = null
  ): ExponentialOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (randomisationFactor != null) __obj.updateDynamic("randomisationFactor")(randomisationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExponentialOptions]
  }
}

