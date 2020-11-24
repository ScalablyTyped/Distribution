package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotebookExecutionOutput extends js.Object {
  
  /**
    * Properties of the notebook execution.
    */
  var NotebookExecution: js.UndefOr[typings.awsSdk.emrMod.NotebookExecution] = js.native
}
object DescribeNotebookExecutionOutput {
  
  @scala.inline
  def apply(): DescribeNotebookExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotebookExecutionOutput]
  }
  
  @scala.inline
  implicit class DescribeNotebookExecutionOutputOps[Self <: DescribeNotebookExecutionOutput] (val x: Self) extends AnyVal {
    
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
    def setNotebookExecution(value: NotebookExecution): Self = this.set("NotebookExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookExecution: Self = this.set("NotebookExecution", js.undefined)
  }
}
