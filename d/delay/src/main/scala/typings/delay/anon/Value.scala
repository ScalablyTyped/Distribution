package typings.delay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[T] extends js.Object {
  /**
  			Value to resolve in the returned promise.
  			*/
  var value: T
}

object Value {
  @scala.inline
  def apply[T](value: T): Value[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
}

