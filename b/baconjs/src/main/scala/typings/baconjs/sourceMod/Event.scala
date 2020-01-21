package typings.baconjs.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event[V] extends js.Object {
  var value: V
}

object Event {
  @scala.inline
  def apply[V](value: V): Event[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Event[V]]
  }
}

