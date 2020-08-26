package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemOption extends js.Object {
  var item: typings.baseui.selectMod.Option = js.native
}

object ItemOption {
  @scala.inline
  def apply(item: typings.baseui.selectMod.Option): ItemOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOption]
  }
  @scala.inline
  implicit class ItemOptionOps[Self <: ItemOption] (val x: Self) extends AnyVal {
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
    def setItem(value: typings.baseui.selectMod.Option): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

