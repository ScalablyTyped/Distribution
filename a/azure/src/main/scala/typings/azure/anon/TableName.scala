package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableName extends js.Object {
  var TableName: String = js.native
}

object TableName {
  @scala.inline
  def apply(TableName: String): TableName = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableName]
  }
  @scala.inline
  implicit class TableNameOps[Self <: TableName] (val x: Self) extends AnyVal {
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
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
  }
  
}

