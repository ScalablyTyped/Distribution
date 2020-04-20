package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCheckedEventParameters[T] extends js.Object {
  var checked: Boolean
  var element: T
}

object NodeCheckedEventParameters {
  @scala.inline
  def apply[T](checked: Boolean, element: T): NodeCheckedEventParameters[T] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCheckedEventParameters[T]]
  }
}

