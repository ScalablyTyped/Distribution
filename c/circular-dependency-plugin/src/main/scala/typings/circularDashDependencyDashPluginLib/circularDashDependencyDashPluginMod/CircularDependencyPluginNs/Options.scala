package typings
package circularDashDependencyDashPluginLib.circularDashDependencyDashPluginMod.CircularDependencyPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowAsyncCycles: js.UndefOr[scala.Boolean] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var exclude: js.UndefOr[stdLib.RegExp] = js.undefined
  var failOnError: js.UndefOr[scala.Boolean] = js.undefined
  var onDetected: js.UndefOr[
    js.Function1[/* x */ circularDashDependencyDashPluginLib.Anon_Compilation, scala.Unit]
  ] = js.undefined
  var onEnd: js.UndefOr[
    js.Function1[
      /* x */ circularDashDependencyDashPluginLib.Anon_Compilation_1970258025, 
      scala.Unit
    ]
  ] = js.undefined
  var onStart: js.UndefOr[
    js.Function1[
      /* x */ circularDashDependencyDashPluginLib.Anon_Compilation_1970258025, 
      scala.Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowAsyncCycles: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    exclude: stdLib.RegExp = null,
    failOnError: js.UndefOr[scala.Boolean] = js.undefined,
    onDetected: /* x */ circularDashDependencyDashPluginLib.Anon_Compilation => scala.Unit = null,
    onEnd: /* x */ circularDashDependencyDashPluginLib.Anon_Compilation_1970258025 => scala.Unit = null,
    onStart: /* x */ circularDashDependencyDashPluginLib.Anon_Compilation_1970258025 => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAsyncCycles)) __obj.updateDynamic("allowAsyncCycles")(allowAsyncCycles)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError)
    if (onDetected != null) __obj.updateDynamic("onDetected")(js.Any.fromFunction1(onDetected))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    __obj.asInstanceOf[Options]
  }
}

