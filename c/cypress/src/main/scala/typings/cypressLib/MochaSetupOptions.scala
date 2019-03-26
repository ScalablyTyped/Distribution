package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaSetupOptions extends js.Object {
  // bail on the first test failure
  var bail: js.UndefOr[scala.Boolean] = js.undefined
  //array of accepted globals
  var globals: js.UndefOr[js.Array[_]] = js.undefined
  // grep string or regexp to filter tests with
  var grep: js.UndefOr[js.Any] = js.undefined
  // ignore global leaks
  var ignoreLeaks: js.UndefOr[scala.Boolean] = js.undefined
  // reporter instance (function or string), defaults to `mocha.reporters.Spec`
  var reporter: js.UndefOr[java.lang.String | ReporterConstructor] = js.undefined
  // require modules before running tests
  var require: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  //milliseconds to wait before considering a test slow
  var slow: js.UndefOr[scala.Double] = js.undefined
  // timeout in milliseconds
  var timeout: js.UndefOr[scala.Double] = js.undefined
  // ui name "bdd", "tdd", "exports" etc
  var ui: js.UndefOr[java.lang.String] = js.undefined
}

object MochaSetupOptions {
  @scala.inline
  def apply(
    bail: js.UndefOr[scala.Boolean] = js.undefined,
    globals: js.Array[_] = null,
    grep: js.Any = null,
    ignoreLeaks: js.UndefOr[scala.Boolean] = js.undefined,
    reporter: java.lang.String | ReporterConstructor = null,
    require: js.Array[java.lang.String] = null,
    slow: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    ui: java.lang.String = null
  ): MochaSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (grep != null) __obj.updateDynamic("grep")(grep)
    if (!js.isUndefined(ignoreLeaks)) __obj.updateDynamic("ignoreLeaks")(ignoreLeaks)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require)
    if (slow != null) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[MochaSetupOptions]
  }
}

