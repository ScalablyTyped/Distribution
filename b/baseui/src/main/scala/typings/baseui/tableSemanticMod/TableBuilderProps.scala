package typings.baseui.tableSemanticMod

import typings.baseui.baseuiStrings.ASC
import typings.baseui.baseuiStrings.DESC
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilderProps[RowT] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var data: js.Array[RowT] = js.native
  var horizontalScrollWidth: js.UndefOr[String] = js.native
  var onSort: js.UndefOr[js.Function1[/* columnId */ String, Unit]] = js.native
  var overrides: js.UndefOr[BuilderOverrides] = js.native
  var sortColumn: js.UndefOr[String | Null] = js.native
  var sortOrder: js.UndefOr[ASC | DESC | Null] = js.native
}

object TableBuilderProps {
  @scala.inline
  def apply[RowT](data: js.Array[RowT]): TableBuilderProps[RowT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBuilderProps[RowT]]
  }
  @scala.inline
  implicit class TableBuilderPropsOps[Self <: TableBuilderProps[_], RowT] (val x: Self with TableBuilderProps[RowT]) extends AnyVal {
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
    def setDataVarargs(value: RowT*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[RowT]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setHorizontalScrollWidth(value: String): Self = this.set("horizontalScrollWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalScrollWidth: Self = this.set("horizontalScrollWidth", js.undefined)
    @scala.inline
    def setOnSort(value: /* columnId */ String => Unit): Self = this.set("onSort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSort: Self = this.set("onSort", js.undefined)
    @scala.inline
    def setOverrides(value: BuilderOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setSortColumn(value: String): Self = this.set("sortColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortColumn: Self = this.set("sortColumn", js.undefined)
    @scala.inline
    def setSortColumnNull: Self = this.set("sortColumn", null)
    @scala.inline
    def setSortOrder(value: ASC | DESC): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSortOrderNull: Self = this.set("sortOrder", null)
  }
  
}

