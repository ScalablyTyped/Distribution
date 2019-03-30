package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod.DatabaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fileMustExist: js.UndefOr[scala.Boolean] = js.undefined
  var memory: js.UndefOr[scala.Boolean] = js.undefined
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var verbose: js.UndefOr[
    js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fileMustExist: js.UndefOr[scala.Boolean] = js.undefined,
    memory: js.UndefOr[scala.Boolean] = js.undefined,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    verbose: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileMustExist)) __obj.updateDynamic("fileMustExist")(fileMustExist)
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(js.Any.fromFunction2(verbose))
    __obj.asInstanceOf[Options]
  }
}

