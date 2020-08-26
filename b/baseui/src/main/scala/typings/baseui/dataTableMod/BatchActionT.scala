package typings.baseui.dataTableMod

import typings.baseui.anon.ClearSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchActionT extends js.Object {
  var label: String = js.native
  var renderIcon: js.UndefOr[js.Any] = js.native
  def onClick(params: ClearSelection): js.Any = js.native
}

object BatchActionT {
  @scala.inline
  def apply(label: String, onClick: ClearSelection => js.Any): BatchActionT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[BatchActionT]
  }
  @scala.inline
  implicit class BatchActionTOps[Self <: BatchActionT] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: ClearSelection => js.Any): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderIcon(value: js.Any): Self = this.set("renderIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderIcon: Self = this.set("renderIcon", js.undefined)
  }
  
}

