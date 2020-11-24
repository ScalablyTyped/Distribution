package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotebookExecutionsOutput extends js.Object {
  
  /**
    * A pagination token that a subsequent ListNotebookExecutions can use to determine the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
  
  /**
    * A list of notebook executions.
    */
  var NotebookExecutions: js.UndefOr[NotebookExecutionSummaryList] = js.native
}
object ListNotebookExecutionsOutput {
  
  @scala.inline
  def apply(): ListNotebookExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookExecutionsOutput]
  }
  
  @scala.inline
  implicit class ListNotebookExecutionsOutputOps[Self <: ListNotebookExecutionsOutput] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setNotebookExecutionsVarargs(value: NotebookExecutionSummary*): Self = this.set("NotebookExecutions", js.Array(value :_*))
    
    @scala.inline
    def setNotebookExecutions(value: NotebookExecutionSummaryList): Self = this.set("NotebookExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookExecutions: Self = this.set("NotebookExecutions", js.undefined)
  }
}
