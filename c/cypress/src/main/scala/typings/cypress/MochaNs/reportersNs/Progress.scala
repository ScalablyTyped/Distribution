package typings.cypress.MochaNs.reportersNs

import typings.cypress.MochaNs.IRunner
import typings.cypress.MochaNs.Runner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Progress` bar test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Progress.html
  */
@JSGlobal("Mocha.reporters.Progress")
@js.native
class Progress protected () extends Base {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: typings.cypress.MochaNs.reportersNs.ProgressNs.MochaOptions) = this()
  def this(runner: Runner, options: typings.cypress.MochaNs.reportersNs.ProgressNs.MochaOptions) = this()
}

