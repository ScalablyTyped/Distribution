package typings.circularDashDependencyDashPlugin.circularDashDependencyDashPluginMod

import typings.circularDashDependencyDashPlugin.Anon_Compilation
import typings.circularDashDependencyDashPlugin.Anon_Compilation_1566266350
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowAsyncCycles: js.UndefOr[Boolean] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var exclude: js.UndefOr[RegExp] = js.undefined
  var failOnError: js.UndefOr[Boolean] = js.undefined
  var onDetected: js.UndefOr[js.Function1[/* x */ Anon_Compilation, Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* x */ Anon_Compilation_1566266350, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* x */ Anon_Compilation_1566266350, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowAsyncCycles: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    exclude: RegExp = null,
    failOnError: js.UndefOr[Boolean] = js.undefined,
    onDetected: /* x */ Anon_Compilation => Unit = null,
    onEnd: /* x */ Anon_Compilation_1566266350 => Unit = null,
    onStart: /* x */ Anon_Compilation_1566266350 => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAsyncCycles)) __obj.updateDynamic("allowAsyncCycles")(allowAsyncCycles.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError.asInstanceOf[js.Any])
    if (onDetected != null) __obj.updateDynamic("onDetected")(js.Any.fromFunction1(onDetected))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    __obj.asInstanceOf[Options]
  }
}

