package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTableOptions extends ListOptions[StyleListTable] {
  var data: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /**
    * Do not draw inner cells.
    */
  var noCellBorders: js.UndefOr[Boolean] = js.native
  /**
    * Spaces to attempt to pad on the sides of each cell. 2 by default: one space on each side
    * (only useful if the width is shrunken).
    */
  var pad: js.UndefOr[Double] = js.native
  /**
    * Array of array of strings representing rows.
    */
  var rows: js.UndefOr[js.Array[String]] = js.native
}

object ListTableOptions {
  @scala.inline
  def apply(): ListTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTableOptions]
  }
  @scala.inline
  implicit class ListTableOptionsOps[Self <: ListTableOptions] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Array[String]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[String]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setNoCellBorders(value: Boolean): Self = this.set("noCellBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCellBorders: Self = this.set("noCellBorders", js.undefined)
    @scala.inline
    def setPad(value: Double): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setRowsVarargs(value: String*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[String]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

