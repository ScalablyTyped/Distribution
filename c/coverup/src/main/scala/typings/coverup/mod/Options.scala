package typings.coverup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var char: js.UndefOr[String] = js.undefined
  var compactTo: js.UndefOr[Double] = js.undefined
  var keepLeft: js.UndefOr[Double] = js.undefined
  var keepRight: js.UndefOr[Double] = js.undefined
  var keepSymbols: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    char: String = null,
    compactTo: js.UndefOr[Double] = js.undefined,
    keepLeft: js.UndefOr[Double] = js.undefined,
    keepRight: js.UndefOr[Double] = js.undefined,
    keepSymbols: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (!js.isUndefined(compactTo)) __obj.updateDynamic("compactTo")(compactTo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLeft)) __obj.updateDynamic("keepLeft")(keepLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepRight)) __obj.updateDynamic("keepRight")(keepRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSymbols)) __obj.updateDynamic("keepSymbols")(keepSymbols.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

