package typings.commandLineArgs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  /**
    * An array of strings which if present will be parsed instead of `process.argv`.
    */
  var argv: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If `true`, options with hypenated names (e.g. `move-to`) will be returned in camel-case (e.g. `moveTo`).
    */
  var camelCase: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, `commandLineArgs` will not throw on unknown options or values, instead returning them in the `_unknown` property of the output.
    */
  var partial: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, `commandLineArgs` will not throw on unknown options or values. Instead, parsing will stop at the first unknown argument
    * and the remaining arguments returned in the `_unknown` property of the output. If set, `partial: true` is implied.
    */
  var stopAtFirstUnknown: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    argv: js.Array[String] = null,
    camelCase: js.UndefOr[Boolean] = js.undefined,
    partial: js.UndefOr[Boolean] = js.undefined,
    stopAtFirstUnknown: js.UndefOr[Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (argv != null) __obj.updateDynamic("argv")(argv.asInstanceOf[js.Any])
    if (!js.isUndefined(camelCase)) __obj.updateDynamic("camelCase")(camelCase.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAtFirstUnknown)) __obj.updateDynamic("stopAtFirstUnknown")(stopAtFirstUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

