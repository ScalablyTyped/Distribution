package typings.cypress.Mocha_

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use `Mocha.Context` instead. */
@js.native
trait ITestCallbackContext
  extends /* index */ StringDictionary[js.Any] {
  /** @deprecated `.retries()` has additional overloads in `Mocha.Context`. */
  def retries(n: Double): this.type = js.native
  /** @deprecated `.skip()` returns `never` in `Mocha.Context`. */
  def skip(): this.type = js.native
  /** @deprecated `.slow()` has additional overloads in `Mocha.Context`. */
  def slow(ms: Double): this.type = js.native
  def timeout(ms: String): this.type = js.native
  /** @deprecated `.timeout()` has additional overloads in `Mocha.Context`. */
  def timeout(ms: Double): this.type = js.native
}

