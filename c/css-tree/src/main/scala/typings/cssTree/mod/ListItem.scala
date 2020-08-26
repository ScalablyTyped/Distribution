package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem[TData] extends js.Object {
  var data: TData = js.native
  var next: ListItem[TData] | Null = js.native
  var prev: ListItem[TData] | Null = js.native
}

object ListItem {
  @scala.inline
  def apply[TData](data: TData): ListItem[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem[TData]]
  }
  @scala.inline
  implicit class ListItemOps[Self <: ListItem[_], TData] (val x: Self with ListItem[TData]) extends AnyVal {
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
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: ListItem[TData]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setPrev(value: ListItem[TData]): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevNull: Self = this.set("prev", null)
  }
  
}

