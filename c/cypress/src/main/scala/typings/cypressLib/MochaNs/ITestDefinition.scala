package typings
package cypressLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITestDefinition extends js.Object {
  var state: cypressLib.cypressLibStrings.failed | cypressLib.cypressLibStrings.passed = js.native
  def apply(expectation: java.lang.String): ITest = js.native
  def apply(
    expectation: java.lang.String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ cypressLib.MochaDone, _]
  ): ITest = js.native
  def only(expectation: java.lang.String): ITest = js.native
  def only(
    expectation: java.lang.String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ cypressLib.MochaDone, _]
  ): ITest = js.native
  def skip(expectation: java.lang.String): scala.Unit = js.native
  def skip(
    expectation: java.lang.String,
    callback: js.ThisFunction1[/* this */ ITestCallbackContext, /* done */ cypressLib.MochaDone, _]
  ): scala.Unit = js.native
  def timeout(ms: scala.Double): scala.Unit = js.native
}

