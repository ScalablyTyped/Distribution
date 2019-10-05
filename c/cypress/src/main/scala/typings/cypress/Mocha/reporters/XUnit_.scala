package typings.cypress.Mocha.reporters

import typings.cypress.Mocha.IRunner
import typings.cypress.Mocha.Runner
import typings.cypress.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `XUnit` test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
  */
@JSGlobal("Mocha.reporters.XUnit")
@js.native
class XUnit_ protected () extends Base {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: typings.cypress.Mocha.reporters.XUnit.MochaOptions) = this()
  def this(runner: Runner, options: typings.cypress.Mocha.reporters.XUnit.MochaOptions) = this()
  /**
    * Override done to close the stream (if it's a file).
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#done
    */
  @JSName("done")
  def done_MXUnit_(failures: Double, fn: js.Function1[/* failures */ Double, Unit]): Unit = js.native
  /**
    * Output tag for the given `test.`
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#test
    */
  def test(test: Test): Unit = js.native
  /**
    * Write out the given line.
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#write
    */
  def write(line: String): Unit = js.native
}

