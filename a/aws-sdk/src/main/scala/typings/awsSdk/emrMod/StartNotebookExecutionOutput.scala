package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartNotebookExecutionOutput extends js.Object {
  
  /**
    * The unique identifier of the notebook execution.
    */
  var NotebookExecutionId: js.UndefOr[XmlStringMaxLen256] = js.native
}
object StartNotebookExecutionOutput {
  
  @scala.inline
  def apply(): StartNotebookExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartNotebookExecutionOutput]
  }
  
  @scala.inline
  implicit class StartNotebookExecutionOutputOps[Self <: StartNotebookExecutionOutput] (val x: Self) extends AnyVal {
    
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
    def setNotebookExecutionId(value: XmlStringMaxLen256): Self = this.set("NotebookExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookExecutionId: Self = this.set("NotebookExecutionId", js.undefined)
  }
}
