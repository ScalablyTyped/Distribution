package typings.axeDashCore.axeDashCoreMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-core", "run")
@js.native
object run extends js.Object {
  /**
  	 * Runs a number of rules against the provided HTML page and returns the resulting issue list
  	 *
  	 * @param   {ElementContext} context  Optional The `Context` specification object @see Context
  	 * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
  	 * @param   {RunCallback}    callback Optional The function to invoke when analysis is complete.
  	 * @returns {Promise<AxeResults>|void} If the callback was not defined, axe will return a Promise.
  	 */
  def apply(): js.Promise[AxeResults] = js.native
  def apply(callback: js.Function2[/* error */ Error, /* results */ AxeResults, Unit]): Unit = js.native
  def apply(context: ElementContext): js.Promise[AxeResults] = js.native
  def apply(context: ElementContext, callback: RunCallback): Unit = js.native
  def apply(context: ElementContext, options: RunOptions): js.Promise[AxeResults] = js.native
  def apply(context: ElementContext, options: RunOptions, callback: RunCallback): Unit = js.native
  def apply(options: RunOptions): js.Promise[AxeResults] = js.native
  def apply(options: RunOptions, callback: RunCallback): Unit = js.native
}

