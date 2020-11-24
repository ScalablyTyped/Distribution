package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNotebookInstanceLifecycleConfigsOutput extends js.Object {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To get the next set of lifecycle configurations, use it in the next request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * An array of NotebookInstanceLifecycleConfiguration objects, each listing a lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigs: js.UndefOr[NotebookInstanceLifecycleConfigSummaryList] = js.native
}
object ListNotebookInstanceLifecycleConfigsOutput {
  
  @scala.inline
  def apply(): ListNotebookInstanceLifecycleConfigsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsOutput]
  }
  
  @scala.inline
  implicit class ListNotebookInstanceLifecycleConfigsOutputOps[Self <: ListNotebookInstanceLifecycleConfigsOutput] (val x: Self) extends AnyVal {
    
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
    def setNotebookInstanceLifecycleConfigsVarargs(value: NotebookInstanceLifecycleConfigSummary*): Self = this.set("NotebookInstanceLifecycleConfigs", js.Array(value :_*))
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigs(value: NotebookInstanceLifecycleConfigSummaryList): Self = this.set("NotebookInstanceLifecycleConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookInstanceLifecycleConfigs: Self = this.set("NotebookInstanceLifecycleConfigs", js.undefined)
  }
}
