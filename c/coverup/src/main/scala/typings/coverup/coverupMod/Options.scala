package typings.coverup.coverupMod

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
    compactTo: Int | Double = null,
    keepLeft: Int | Double = null,
    keepRight: Int | Double = null,
    keepSymbols: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (char != null) __obj.updateDynamic("char")(char)
    if (compactTo != null) __obj.updateDynamic("compactTo")(compactTo.asInstanceOf[js.Any])
    if (keepLeft != null) __obj.updateDynamic("keepLeft")(keepLeft.asInstanceOf[js.Any])
    if (keepRight != null) __obj.updateDynamic("keepRight")(keepRight.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSymbols)) __obj.updateDynamic("keepSymbols")(keepSymbols)
    __obj.asInstanceOf[Options]
  }
}

