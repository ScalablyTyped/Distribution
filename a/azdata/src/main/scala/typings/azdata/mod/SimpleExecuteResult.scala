package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleExecuteResult extends js.Object {
  var columnInfo: js.Array[IDbColumn]
  var rowCount: Double
  var rows: js.Array[js.Array[DbCellValue]]
}

object SimpleExecuteResult {
  @scala.inline
  def apply(columnInfo: js.Array[IDbColumn], rowCount: Double, rows: js.Array[js.Array[DbCellValue]]): SimpleExecuteResult = {
    val __obj = js.Dynamic.literal(columnInfo = columnInfo.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SimpleExecuteResult]
  }
}

