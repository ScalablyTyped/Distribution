package typings.circularDependencyPlugin.mod

import typings.circularDependencyPlugin.anon.Compilation
import typings.circularDependencyPlugin.anon.CompilationAny
import typings.circularDependencyPlugin.circularDependencyPluginBooleans.`false`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * @default false
    */
  var allowAsyncCycles: js.UndefOr[Boolean] = js.native
  /**
    * @default process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * @default /$^/
    */
  var exclude: js.UndefOr[RegExp] = js.native
  /**
    * @default false
    */
  var failOnError: js.UndefOr[Boolean] = js.native
  /**
    * @default /.*\/
    */
  var include: js.UndefOr[RegExp] = js.native
  /**
    * @default false
    */
  var onDetected: js.UndefOr[`false` | (js.Function1[/* x */ Compilation, Unit])] = js.native
  var onEnd: js.UndefOr[js.Function1[/* x */ CompilationAny, Unit]] = js.native
  var onStart: js.UndefOr[js.Function1[/* x */ CompilationAny, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowAsyncCycles(value: Boolean): Self = this.set("allowAsyncCycles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAsyncCycles: Self = this.set("allowAsyncCycles", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setExclude(value: RegExp): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setFailOnError(value: Boolean): Self = this.set("failOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailOnError: Self = this.set("failOnError", js.undefined)
    @scala.inline
    def setInclude(value: RegExp): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setOnDetectedFunction1(value: /* x */ Compilation => Unit): Self = this.set("onDetected", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDetected(value: `false` | (js.Function1[/* x */ Compilation, Unit])): Self = this.set("onDetected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDetected: Self = this.set("onDetected", js.undefined)
    @scala.inline
    def setOnEnd(value: /* x */ CompilationAny => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnStart(value: /* x */ CompilationAny => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
  }
  
}

