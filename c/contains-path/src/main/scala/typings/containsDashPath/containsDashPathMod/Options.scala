package typings.containsDashPath.containsDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var nocase: js.UndefOr[Boolean] = js.undefined
  var partialMatch: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(nocase: js.UndefOr[Boolean] = js.undefined, partialMatch: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(partialMatch)) __obj.updateDynamic("partialMatch")(partialMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

