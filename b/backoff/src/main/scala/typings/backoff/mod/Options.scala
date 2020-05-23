package typings.backoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var initialDelay: js.UndefOr[Double] = js.undefined
  var maxDelay: js.UndefOr[Double] = js.undefined
  var randomisationFactor: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    initialDelay: js.UndefOr[Double] = js.undefined,
    maxDelay: js.UndefOr[Double] = js.undefined,
    randomisationFactor: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialDelay)) __obj.updateDynamic("initialDelay")(initialDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelay)) __obj.updateDynamic("maxDelay")(maxDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomisationFactor)) __obj.updateDynamic("randomisationFactor")(randomisationFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

