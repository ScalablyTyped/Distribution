package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetSubset extends js.Object {
  var rowCount: Double
  var rows: js.Array[js.Array[DbCellValue]]
}

object ResultSetSubset {
  @scala.inline
  def apply(rowCount: Double, rows: js.Array[js.Array[DbCellValue]]): ResultSetSubset = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetSubset]
  }
}

