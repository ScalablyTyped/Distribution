package typings.blueprintjsTable.headerCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderCellState extends js.Object {
  var isActive: Boolean = js.native
}

object IHeaderCellState {
  @scala.inline
  def apply(isActive: Boolean): IHeaderCellState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeaderCellState]
  }
  @scala.inline
  implicit class IHeaderCellStateOps[Self <: IHeaderCellState] (val x: Self) extends AnyVal {
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
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
  }
  
}

