package typings
package cypressLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBeforeAndAfterContext extends IHookCallbackContext {
  var currentTest: ITest
}

object IBeforeAndAfterContext {
  @scala.inline
  def apply(
    currentTest: ITest,
    skip: () => IBeforeAndAfterContext,
    timeout: scala.Double => IBeforeAndAfterContext
  ): IBeforeAndAfterContext = {
    val __obj = js.Dynamic.literal(currentTest = currentTest, skip = js.Any.fromFunction0(skip), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[IBeforeAndAfterContext]
  }
}

