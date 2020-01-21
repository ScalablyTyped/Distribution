package typings.bitcoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonA extends js.Object {
  def reverse(a: js.Any): js.Any
}

object AnonA {
  @scala.inline
  def apply(reverse: js.Any => js.Any): AnonA = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
  
    __obj.asInstanceOf[AnonA]
  }
}

