package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCheckedEventParameters[T] extends js.Object {
  var checked: Boolean = js.native
  var element: T = js.native
}

object NodeCheckedEventParameters {
  @scala.inline
  def apply[T](checked: Boolean, element: T): NodeCheckedEventParameters[T] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCheckedEventParameters[T]]
  }
  @scala.inline
  implicit class NodeCheckedEventParametersOps[Self <: NodeCheckedEventParameters[_], T] (val x: Self with NodeCheckedEventParameters[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: T): Self = this.set("element", value.asInstanceOf[js.Any])
  }
  
}

