package typings.cypress.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuiteCallbackContext extends js.Object {
  def retries(n: Double): this.type
  def slow(ms: Double): this.type
  def timeout(ms: Double): this.type
}

object ISuiteCallbackContext {
  @scala.inline
  def apply(
    retries: Double => ISuiteCallbackContext,
    slow: Double => ISuiteCallbackContext,
    timeout: Double => ISuiteCallbackContext
  ): ISuiteCallbackContext = {
    val __obj = js.Dynamic.literal(retries = js.Any.fromFunction1(retries), slow = js.Any.fromFunction1(slow), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[ISuiteCallbackContext]
  }
}

