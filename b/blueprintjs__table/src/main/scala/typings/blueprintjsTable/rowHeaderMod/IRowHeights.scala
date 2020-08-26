package typings.blueprintjsTable.rowHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowHeights extends js.Object {
  var defaultRowHeight: js.UndefOr[Double] = js.native
  var maxRowHeight: js.UndefOr[Double] = js.native
  var minRowHeight: js.UndefOr[Double] = js.native
}

object IRowHeights {
  @scala.inline
  def apply(): IRowHeights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowHeights]
  }
  @scala.inline
  implicit class IRowHeightsOps[Self <: IRowHeights] (val x: Self) extends AnyVal {
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
    def setDefaultRowHeight(value: Double): Self = this.set("defaultRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRowHeight: Self = this.set("defaultRowHeight", js.undefined)
    @scala.inline
    def setMaxRowHeight(value: Double): Self = this.set("maxRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRowHeight: Self = this.set("maxRowHeight", js.undefined)
    @scala.inline
    def setMinRowHeight(value: Double): Self = this.set("minRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRowHeight: Self = this.set("minRowHeight", js.undefined)
  }
  
}

