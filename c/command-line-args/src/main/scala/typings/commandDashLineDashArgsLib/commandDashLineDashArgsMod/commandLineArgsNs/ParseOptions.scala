package typings
package commandDashLineDashArgsLib.commandDashLineDashArgsMod.commandLineArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * An array of strings which if present will be parsed instead of `process.argv`.
    */
  var argv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If `true`, options with hypenated names (e.g. `move-to`) will be returned in camel-case (e.g. `moveTo`).
    */
  var camelCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, `commandLineArgs` will not throw on unknown options or values, instead returning them in the `_unknown` property of the output.
    */
  var partial: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, `commandLineArgs` will not throw on unknown options or values. Instead, parsing will stop at the first unknown argument
    * and the remaining arguments returned in the `_unknown` property of the output. If set, `partial: true` is implied.
    */
  var stopAtFirstUnknown: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    argv: js.Array[java.lang.String] = null,
    camelCase: js.UndefOr[scala.Boolean] = js.undefined,
    partial: js.UndefOr[scala.Boolean] = js.undefined,
    stopAtFirstUnknown: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (argv != null) __obj.updateDynamic("argv")(argv)
    if (!js.isUndefined(camelCase)) __obj.updateDynamic("camelCase")(camelCase)
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    if (!js.isUndefined(stopAtFirstUnknown)) __obj.updateDynamic("stopAtFirstUnknown")(stopAtFirstUnknown)
    __obj.asInstanceOf[ParseOptions]
  }
}

