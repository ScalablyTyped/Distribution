package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetSummary extends js.Object {
  var batchId: Double
  var columnInfo: js.Array[IDbColumn]
  var complete: Boolean
  var id: Double
  var rowCount: Double
}

object ResultSetSummary {
  @scala.inline
  def apply(batchId: Double, columnInfo: js.Array[IDbColumn], complete: Boolean, id: Double, rowCount: Double): ResultSetSummary = {
    val __obj = js.Dynamic.literal(batchId = batchId.asInstanceOf[js.Any], columnInfo = columnInfo.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultSetSummary]
  }
}

