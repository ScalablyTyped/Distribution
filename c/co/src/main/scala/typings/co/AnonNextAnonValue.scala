package typings.co

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextAnonValue extends js.Object {
  def next(): AnonValue
}

object AnonNextAnonValue {
  @scala.inline
  def apply(next: () => AnonValue): AnonNextAnonValue = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[AnonNextAnonValue]
  }
}

