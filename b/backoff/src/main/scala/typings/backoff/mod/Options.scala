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
    initialDelay: Int | Double = null,
    maxDelay: Int | Double = null,
    randomisationFactor: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (randomisationFactor != null) __obj.updateDynamic("randomisationFactor")(randomisationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

