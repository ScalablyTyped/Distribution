package typings.baseui.tableSemanticMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProps extends js.Object {
  var columns: js.Array[ReactNode] = js.native
  var data: js.Array[js.Array[ReactNode]] = js.native
  var horizontalScrollWidth: js.UndefOr[String] = js.native
  var overrides: js.UndefOr[Overrides] = js.native
}

object TableProps {
  @scala.inline
  def apply(columns: js.Array[ReactNode], data: js.Array[js.Array[ReactNode]]): TableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: ReactNode*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ReactNode]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Array[ReactNode]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[ReactNode]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalScrollWidth(value: String): Self = this.set("horizontalScrollWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalScrollWidth: Self = this.set("horizontalScrollWidth", js.undefined)
    @scala.inline
    def setOverrides(value: Overrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

