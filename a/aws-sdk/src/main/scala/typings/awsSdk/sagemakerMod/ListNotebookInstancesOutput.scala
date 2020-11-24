package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotebookInstancesOutput extends js.Object {
  
  /**
    * If the response to the previous ListNotebookInstances request was truncated, Amazon SageMaker returns this token. To retrieve the next set of notebook instances, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * An array of NotebookInstanceSummary objects, one for each notebook instance.
    */
  var NotebookInstances: js.UndefOr[NotebookInstanceSummaryList] = js.native
}
object ListNotebookInstancesOutput {
  
  @scala.inline
  def apply(): ListNotebookInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstancesOutput]
  }
  
  @scala.inline
  implicit class ListNotebookInstancesOutputOps[Self <: ListNotebookInstancesOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setNotebookInstancesVarargs(value: NotebookInstanceSummary*): Self = this.set("NotebookInstances", js.Array(value :_*))
    
    @scala.inline
    def setNotebookInstances(value: NotebookInstanceSummaryList): Self = this.set("NotebookInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookInstances: Self = this.set("NotebookInstances", js.undefined)
  }
}
