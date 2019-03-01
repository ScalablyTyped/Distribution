package typings
package backoffLib.backoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var initialDelay: js.UndefOr[scala.Double] = js.undefined
  var maxDelay: js.UndefOr[scala.Double] = js.undefined
  var randomisationFactor: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    initialDelay: scala.Int | scala.Double = null,
    maxDelay: scala.Int | scala.Double = null,
    randomisationFactor: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (initialDelay != null) __obj.updateDynamic("initialDelay")(initialDelay.asInstanceOf[js.Any])
    if (maxDelay != null) __obj.updateDynamic("maxDelay")(maxDelay.asInstanceOf[js.Any])
    if (randomisationFactor != null) __obj.updateDynamic("randomisationFactor")(randomisationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

