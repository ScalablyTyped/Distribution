package typings.cypress.Mocha

import typings.cypress.Cypress.TestConfigOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
  * nested suites. Indicates this suite should not be executed.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @returns [bdd] `Suite`
  * @returns [tdd] `void`
  */
@js.native
trait PendingSuiteFunction extends js.Object {
  def apply(title: String, config: TestConfigOverrides, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
  def apply(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
}

