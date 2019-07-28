package typings.cypress.MochaNs

import typings.cypress.MochaDone
import typings.cypress.cypressStrings.failed
import typings.cypress.cypressStrings.passed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITestDefinition extends js.Object {
  var state: failed | passed = js.native
  def apply(expectation: String): ITest = js.native
  def apply(
    expectation: String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ MochaDone, _]
  ): ITest = js.native
  def only(expectation: String): ITest = js.native
  def only(
    expectation: String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ MochaDone, _]
  ): ITest = js.native
  def skip(expectation: String): Unit = js.native
  def skip(
    expectation: String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ MochaDone, _]
  ): Unit = js.native
  def timeout(ms: Double): Unit = js.native
}

