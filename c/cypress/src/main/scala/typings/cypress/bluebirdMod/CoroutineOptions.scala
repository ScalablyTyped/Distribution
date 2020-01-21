package typings.cypress.bluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoroutineOptions extends js.Object {
  def yieldHandler(value: js.Any): js.Any
}

object CoroutineOptions {
  @scala.inline
  def apply(yieldHandler: js.Any => js.Any): CoroutineOptions = {
    val __obj = js.Dynamic.literal(yieldHandler = js.Any.fromFunction1(yieldHandler))
  
    __obj.asInstanceOf[CoroutineOptions]
  }
}

