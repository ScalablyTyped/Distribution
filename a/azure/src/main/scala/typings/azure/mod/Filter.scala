package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  def handle(requestOptions: js.Any, next: js.Function): Unit = js.native
}

object Filter {
  @scala.inline
  def apply(handle: (js.Any, js.Function) => Unit): Filter = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setHandle(value: (js.Any, js.Function) => Unit): Self = this.set("handle", js.Any.fromFunction2(value))
  }
  
}

