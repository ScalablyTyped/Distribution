package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableToReload extends js.Object {
  /**
    * The schema name of the table to be reloaded.
    */
  var SchemaName: String = js.native
  /**
    * The table name of the table to be reloaded.
    */
  var TableName: String = js.native
}

object TableToReload {
  @scala.inline
  def apply(SchemaName: String, TableName: String): TableToReload = {
    val __obj = js.Dynamic.literal(SchemaName = SchemaName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableToReload]
  }
  @scala.inline
  implicit class TableToReloadOps[Self <: TableToReload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSchemaName(value: String): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: String): Self = this.set("TableName", value.asInstanceOf[js.Any])
  }
  
}

