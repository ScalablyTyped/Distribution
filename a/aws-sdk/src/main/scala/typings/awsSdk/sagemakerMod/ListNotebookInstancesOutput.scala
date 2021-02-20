package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotebookInstancesOutput extends StObject {
  
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
  implicit class ListNotebookInstancesOutputMutableBuilder[Self <: ListNotebookInstancesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNotebookInstances(value: NotebookInstanceSummaryList): Self = StObject.set(x, "NotebookInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstancesUndefined: Self = StObject.set(x, "NotebookInstances", js.undefined)
    
    @scala.inline
    def setNotebookInstancesVarargs(value: NotebookInstanceSummary*): Self = StObject.set(x, "NotebookInstances", js.Array(value :_*))
  }
}
