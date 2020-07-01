package typings.circularDependencyPlugin.mod

import typings.circularDependencyPlugin.anon.Compilation
import typings.circularDependencyPlugin.anon.CompilationCompilation
import typings.circularDependencyPlugin.circularDependencyPluginBooleans.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * @default false
    */
  var allowAsyncCycles: js.UndefOr[Boolean] = js.undefined
  /**
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * @default /$^/
    */
  var exclude: js.UndefOr[RegExp] = js.undefined
  /**
    * @default false
    */
  var failOnError: js.UndefOr[Boolean] = js.undefined
  /**
    * @default /.*\/
    */
  var include: js.UndefOr[RegExp] = js.undefined
  /**
    * @default false
    */
  var onDetected: js.UndefOr[`false` | (js.Function1[/* x */ Compilation, Unit])] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* x */ CompilationCompilation, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* x */ CompilationCompilation, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowAsyncCycles: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    exclude: RegExp = null,
    failOnError: js.UndefOr[Boolean] = js.undefined,
    include: RegExp = null,
    onDetected: `false` | (js.Function1[/* x */ Compilation, Unit]) = null,
    onEnd: /* x */ CompilationCompilation => Unit = null,
    onStart: /* x */ CompilationCompilation => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAsyncCycles)) __obj.updateDynamic("allowAsyncCycles")(allowAsyncCycles.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnError)) __obj.updateDynamic("failOnError")(failOnError.get.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (onDetected != null) __obj.updateDynamic("onDetected")(onDetected.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    __obj.asInstanceOf[Options]
  }
}

