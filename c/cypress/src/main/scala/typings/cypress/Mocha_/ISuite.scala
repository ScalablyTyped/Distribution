package typings.cypress.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Suite` class. */
/** @deprecated use `Mocha.Suite` instead. */
@js.native
trait ISuite extends js.Object {
  /** @deprecated `.ctx` has type `Mocha.Context` in `Mocha.Suite`. */
  var ctx: IContext = js.native
  /** @deprecated `.parent` has type `Mocha.Suite | undefined` in `Mocha.Suite`. */
  var parent: js.UndefOr[ISuite] = js.native
  var root: Boolean = js.native
  /** @deprecated `.suites` has type `Mocha.Suite[]` in `Mocha.Suite`. */
  var suites: js.Array[ISuite] = js.native
  /** @deprecated `.tests` has type `Mocha.Test[]` in `Mocha.Suite`. */
  var tests: js.Array[ITest] = js.native
  var title: String = js.native
  def bail(): Boolean = js.native
  /** @deprecated `.bail()` returns `this` in `Mocha.Suite`. */
  def bail(bail: Boolean): ISuite = js.native
  def fullTitle(): String = js.native
  def retries(): Double = js.native
  /** @deprecated `.retries()` returns `this` in `Mocha.Suite`. */
  def retries(retries: Double): ISuite = js.native
  def slow(): Double = js.native
  /** @deprecated `.slow()` returns `this` in `Mocha.Suite`. */
  def slow(slow: Double): ISuite = js.native
  def timeout(): Double = js.native
  /** @deprecated `.timeout()` returns `this` in `Mocha.Suite`. */
  def timeout(timeout: Double): ISuite = js.native
}

