package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridResultSet extends js.Object {
  var columns: js.Array[IDbColumn]
  var numberOfRows: Double
  var rowsUri: String
}

object IGridResultSet {
  @scala.inline
  def apply(columns: js.Array[IDbColumn], numberOfRows: Double, rowsUri: String): IGridResultSet = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], numberOfRows = numberOfRows.asInstanceOf[js.Any], rowsUri = rowsUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGridResultSet]
  }
}

