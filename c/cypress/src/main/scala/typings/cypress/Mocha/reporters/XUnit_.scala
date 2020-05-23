package typings.cypress.Mocha.reporters

import typings.cypress.Mocha.Runner
import typings.cypress.Mocha.Stats
import typings.cypress.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `XUnit` test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
  */
trait XUnit_ extends Base {
  /**
    * Override done to close the stream (if it's a file).
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#done
    */
  @JSName("done")
  def done_MXUnit_(failures: Double, fn: js.Function1[/* failures */ Double, Unit]): Unit
  /**
    * Output tag for the given `test.`
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#test
    */
  def test(test: Test): Unit
  /**
    * Write out the given line.
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#write
    */
  def write(line: String): Unit
}

object XUnit_ {
  @scala.inline
  def apply(
    done: (Double, js.Function1[/* failures */ Double, Unit]) => Unit,
    epilogue: () => Unit,
    failures: js.Array[Test],
    runner: Runner,
    stats: Stats,
    test: Test => Unit,
    write: String => Unit
  ): XUnit_ = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction2(done), epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], test = js.Any.fromFunction1(test), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[XUnit_]
  }
}

