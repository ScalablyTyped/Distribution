package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchSummary extends js.Object {
  var executionElapsed: String
  var executionEnd: String
  var executionStart: String
  var hasError: Boolean
  var id: Double
  var resultSetSummaries: js.Array[ResultSetSummary]
  var selection: ISelectionData
}

object BatchSummary {
  @scala.inline
  def apply(
    executionElapsed: String,
    executionEnd: String,
    executionStart: String,
    hasError: Boolean,
    id: Double,
    resultSetSummaries: js.Array[ResultSetSummary],
    selection: ISelectionData
  ): BatchSummary = {
    val __obj = js.Dynamic.literal(executionElapsed = executionElapsed.asInstanceOf[js.Any], executionEnd = executionEnd.asInstanceOf[js.Any], executionStart = executionStart.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resultSetSummaries = resultSetSummaries.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchSummary]
  }
}

