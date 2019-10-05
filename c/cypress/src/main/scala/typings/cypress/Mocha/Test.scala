package typings.cypress.Mocha

import org.scalablytyped.runtime.TopLevel
import typings.cypress.cypressStrings.fast
import typings.cypress.cypressStrings.medium
import typings.cypress.cypressStrings.slow
import typings.cypress.cypressStrings.test
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Test` with the given `title` and callback `fn`.
  *
  * @see https://mochajs.org/api/Test.html
  */
@JSGlobal("Mocha.Test")
@js.native
class Test () extends Runnable {
   // added by reporters
  var err: js.UndefOr[Error] = js.native
  var speed: js.UndefOr[slow | medium | fast] = js.native
  var `type`: test = js.native
}

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
@JSGlobal("Mocha.test")
@js.native
object test extends TopLevel[TestFunction]

