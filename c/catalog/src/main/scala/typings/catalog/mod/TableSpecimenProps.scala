package typings.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableSpecimenProps extends js.Object {
  var columns: js.UndefOr[js.Array[String]] = js.native
  var rows: js.Array[StringDictionary[ReactNode]] = js.native
}

object TableSpecimenProps {
  @scala.inline
  def apply(rows: js.Array[StringDictionary[ReactNode]]): TableSpecimenProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSpecimenProps]
  }
  @scala.inline
  implicit class TableSpecimenPropsOps[Self <: TableSpecimenProps] (val x: Self) extends AnyVal {
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
    def setRowsVarargs(value: StringDictionary[ReactNode]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[StringDictionary[ReactNode]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
  }
  
}

