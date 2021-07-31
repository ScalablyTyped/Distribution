package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotebookInstanceLifecycleConfigsOutput extends StObject {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle configurations, use it in the next request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * An array of NotebookInstanceLifecycleConfiguration objects, each listing a lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList] = js.undefined
}
object ListNotebookInstanceLifecycleConfigsOutput {
  
  @scala.inline
  def apply(): ListNotebookInstanceLifecycleConfigsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsOutput]
  }
  
  @scala.inline
  implicit class ListNotebookInstanceLifecycleConfigsOutputMutableBuilder[Self <: ListNotebookInstanceLifecycleConfigsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigs(value: NotebookInstanceLifecycleConfigSummaryList): Self = StObject.set(x, "NotebookInstanceLifecycleConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigsUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigs", js.undefined)
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigsVarargs(value: NotebookInstanceLifecycleConfigSummary*): Self = StObject.set(x, "NotebookInstanceLifecycleConfigs", js.Array(value :_*))
  }
}
