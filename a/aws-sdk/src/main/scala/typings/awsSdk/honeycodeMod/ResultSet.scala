package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSet extends js.Object {
  /**
    *  List of headers for all the data cells in the block. The header identifies the name and default format of the data cell. Data cells appear in the same order in all rows as defined in the header. The names and formats are not repeated in the rows. If a particular row does not have a value for a data cell, a blank value is used.   For example, a task list that displays the task name, due date and assigned person might have headers [ { "name": "Task Name"}, {"name": "Due Date", "format": "DATE"}, {"name": "Assigned", "format": "CONTACT"} ]. Every row in the result will have the task name as the first item, due date as the second item and assigned person as the third item. If a particular task does not have a due date, that row will still have a blank value in the second element and the assigned person will still be in the third element. 
    */
  var headers: ResultHeader = js.native
  /**
    *  List of rows returned by the request. Each row has a row Id and a list of data cells in that row. The data cells will be present in the same order as they are defined in the header. 
    */
  var rows: ResultRows = js.native
}

object ResultSet {
  @scala.inline
  def apply(headers: ResultHeader, rows: ResultRows): ResultSet = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSet]
  }
  @scala.inline
  implicit class ResultSetOps[Self <: ResultSet] (val x: Self) extends AnyVal {
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
    def setHeadersVarargs(value: ColumnMetadata*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: ResultHeader): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: ResultRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: ResultRows): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

