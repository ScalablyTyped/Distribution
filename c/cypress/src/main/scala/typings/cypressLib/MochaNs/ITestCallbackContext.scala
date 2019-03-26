package typings
package cypressLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestCallbackContext
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def retries(n: scala.Double): this.type
  def skip(): this.type
  def slow(ms: scala.Double): this.type
  def timeout(ms: scala.Double): this.type
}

object ITestCallbackContext {
  @scala.inline
  def apply(
    retries: scala.Double => ITestCallbackContext,
    skip: () => ITestCallbackContext,
    slow: scala.Double => ITestCallbackContext,
    timeout: scala.Double => ITestCallbackContext,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ITestCallbackContext = {
    val __obj = js.Dynamic.literal(retries = js.Any.fromFunction1(retries), skip = js.Any.fromFunction0(skip), slow = js.Any.fromFunction1(slow), timeout = js.Any.fromFunction1(timeout))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ITestCallbackContext]
  }
}

