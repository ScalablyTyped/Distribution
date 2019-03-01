package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod.DatabaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationOptions extends js.Object {
  var deterministic: js.UndefOr[scala.Boolean] = js.undefined
  var safeIntegers: js.UndefOr[scala.Boolean] = js.undefined
  var varargs: js.UndefOr[scala.Boolean] = js.undefined
}

object RegistrationOptions {
  @scala.inline
  def apply(
    deterministic: js.UndefOr[scala.Boolean] = js.undefined,
    safeIntegers: js.UndefOr[scala.Boolean] = js.undefined,
    varargs: js.UndefOr[scala.Boolean] = js.undefined
  ): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deterministic)) __obj.updateDynamic("deterministic")(deterministic)
    if (!js.isUndefined(safeIntegers)) __obj.updateDynamic("safeIntegers")(safeIntegers)
    if (!js.isUndefined(varargs)) __obj.updateDynamic("varargs")(varargs)
    __obj.asInstanceOf[RegistrationOptions]
  }
}

