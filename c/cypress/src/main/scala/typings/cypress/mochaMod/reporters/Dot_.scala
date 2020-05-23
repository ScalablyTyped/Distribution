package typings.cypress.mochaMod.reporters

import typings.cypress.Mocha.Runner
import typings.cypress.Mocha.Stats
import typings.cypress.Mocha.Test
import typings.cypress.Mocha.reporters.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Dot` matrix test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Dot.html
  */
@JSImport("mocha", "reporters.Dot")
@js.native
class Dot_ () extends Base {
  /**
    * Test failures
    */
  /* CompleteClass */
  override var failures: js.Array[Test] = js.native
  /**
    * The configured runner
    */
  /* CompleteClass */
  override var runner: Runner = js.native
  /**
    * Test run statistics
    */
  /* CompleteClass */
  override var stats: Stats = js.native
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  /* CompleteClass */
  override def epilogue(): Unit = js.native
}

