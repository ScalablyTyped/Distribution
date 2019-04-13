package typings
package containsDashPathLib.containsDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var nocase: js.UndefOr[scala.Boolean] = js.undefined
  var partialMatch: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    partialMatch: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(partialMatch)) __obj.updateDynamic("partialMatch")(partialMatch)
    __obj.asInstanceOf[Options]
  }
}

