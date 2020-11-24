package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSummary extends js.Object {
  
  var executionElapsed: String = js.native
  
  var executionEnd: String = js.native
  
  var executionStart: String = js.native
  
  var hasError: Boolean = js.native
  
  var id: Double = js.native
  
  var resultSetSummaries: js.Array[ResultSetSummary] = js.native
  
  var selection: ISelectionData = js.native
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
  
  @scala.inline
  implicit class BatchSummaryOps[Self <: BatchSummary] (val x: Self) extends AnyVal {
    
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
    def setExecutionElapsed(value: String): Self = this.set("executionElapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionEnd(value: String): Self = this.set("executionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStart(value: String): Self = this.set("executionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasError(value: Boolean): Self = this.set("hasError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSetSummariesVarargs(value: ResultSetSummary*): Self = this.set("resultSetSummaries", js.Array(value :_*))
    
    @scala.inline
    def setResultSetSummaries(value: js.Array[ResultSetSummary]): Self = this.set("resultSetSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: ISelectionData): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
}
