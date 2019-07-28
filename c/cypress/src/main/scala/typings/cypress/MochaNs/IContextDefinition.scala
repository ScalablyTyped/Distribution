package typings.cypress.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextDefinition extends js.Object {
  def apply(description: String, callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): ISuite = js.native
  def only(description: String, callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): ISuite = js.native
  def skip(description: String, callback: js.ThisFunction0[/* this */ ISuiteCallbackContext, Unit]): Unit = js.native
  def timeout(ms: Double): Unit = js.native
}

