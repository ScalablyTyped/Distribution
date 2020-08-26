package typings.blueprintjsTable.esmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRegion extends js.Object {
  /**
    * The first and last column indices in the region, inclusive and
    * zero-indexed. If `cols` is `null`, then all columns are understood to be
    * included in the region.
    */
  var cols: js.UndefOr[ICellInterval | Null] = js.native
  /**
    * The first and last row indices in the region, inclusive and zero-indexed.
    * If `rows` is `null`, then all rows are understood to be included in the
    * region.
    */
  var rows: js.UndefOr[ICellInterval | Null] = js.native
}

object IRegion {
  @scala.inline
  def apply(): IRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegion]
  }
  @scala.inline
  implicit class IRegionOps[Self <: IRegion] (val x: Self) extends AnyVal {
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
    def setCols(value: ICellInterval): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setColsNull: Self = this.set("cols", null)
    @scala.inline
    def setRows(value: ICellInterval): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRowsNull: Self = this.set("rows", null)
  }
  
}

