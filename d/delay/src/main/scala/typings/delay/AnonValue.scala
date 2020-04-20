package typings.delay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[T] extends js.Object {
  /**
  			Value to resolve in the returned promise.
  			*/
  var value: T
}

object AnonValue {
  @scala.inline
  def apply[T](value: T): AnonValue[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue[T]]
  }
}

