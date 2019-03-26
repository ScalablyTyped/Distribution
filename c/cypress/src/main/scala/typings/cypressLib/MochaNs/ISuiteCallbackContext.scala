package typings
package cypressLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuiteCallbackContext extends js.Object {
  def retries(n: scala.Double): this.type
  def slow(ms: scala.Double): this.type
  def timeout(ms: scala.Double): this.type
}

object ISuiteCallbackContext {
  @scala.inline
  def apply(
    retries: scala.Double => ISuiteCallbackContext,
    slow: scala.Double => ISuiteCallbackContext,
    timeout: scala.Double => ISuiteCallbackContext
  ): ISuiteCallbackContext = {
    val __obj = js.Dynamic.literal(retries = js.Any.fromFunction1(retries), slow = js.Any.fromFunction1(slow), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[ISuiteCallbackContext]
  }
}

