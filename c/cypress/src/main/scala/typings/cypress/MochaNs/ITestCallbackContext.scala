package typings.cypress.MochaNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestCallbackContext
  extends /* index */ StringDictionary[js.Any] {
  def retries(n: Double): this.type
  def skip(): this.type
  def slow(ms: Double): this.type
  def timeout(ms: Double): this.type
}

object ITestCallbackContext {
  @scala.inline
  def apply(
    retries: Double => ITestCallbackContext,
    skip: () => ITestCallbackContext,
    slow: Double => ITestCallbackContext,
    timeout: Double => ITestCallbackContext,
    StringDictionary: /* index */ StringDictionary[js.Any] = null
  ): ITestCallbackContext = {
    val __obj = js.Dynamic.literal(retries = js.Any.fromFunction1(retries), skip = js.Any.fromFunction0(skip), slow = js.Any.fromFunction1(slow), timeout = js.Any.fromFunction1(timeout))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ITestCallbackContext]
  }
}

