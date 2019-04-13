package typings
package coverupLib.coverupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var char: js.UndefOr[java.lang.String] = js.undefined
  var compactTo: js.UndefOr[scala.Double] = js.undefined
  var keepLeft: js.UndefOr[scala.Double] = js.undefined
  var keepRight: js.UndefOr[scala.Double] = js.undefined
  var keepSymbols: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    char: java.lang.String = null,
    compactTo: scala.Int | scala.Double = null,
    keepLeft: scala.Int | scala.Double = null,
    keepRight: scala.Int | scala.Double = null,
    keepSymbols: js.UndefOr[scala.Boolean] = js.undefined
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

