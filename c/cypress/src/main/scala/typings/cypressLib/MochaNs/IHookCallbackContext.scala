package typings
package cypressLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHookCallbackContext
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def skip(): this.type
  def timeout(ms: scala.Double): this.type
}

object IHookCallbackContext {
  @scala.inline
  def apply(
    skip: () => IHookCallbackContext,
    timeout: scala.Double => IHookCallbackContext,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IHookCallbackContext = {
    val __obj = js.Dynamic.literal(skip = js.Any.fromFunction0(skip), timeout = js.Any.fromFunction1(timeout))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IHookCallbackContext]
  }
}

