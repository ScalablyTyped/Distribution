package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTaskExecutionRequest extends js.Object {
  
  /**
    * A list of filter rules that determines which files to include when running a task. The pattern should contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that is, a pipe). For example: "/folder1|/folder2"   
    */
  var Includes: js.UndefOr[FilterList] = js.native
  
  var OverrideOptions: js.UndefOr[Options] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the task to start.
    */
  var TaskArn: typings.awsSdk.datasyncMod.TaskArn = js.native
}
object StartTaskExecutionRequest {
  
  @scala.inline
  def apply(TaskArn: TaskArn): StartTaskExecutionRequest = {
    val __obj = js.Dynamic.literal(TaskArn = TaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskExecutionRequest]
  }
  
  @scala.inline
  implicit class StartTaskExecutionRequestOps[Self <: StartTaskExecutionRequest] (val x: Self) extends AnyVal {
    
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
    def setTaskArn(value: TaskArn): Self = this.set("TaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesVarargs(value: FilterRule*): Self = this.set("Includes", js.Array(value :_*))
    
    @scala.inline
    def setIncludes(value: FilterList): Self = this.set("Includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludes: Self = this.set("Includes", js.undefined)
    
    @scala.inline
    def setOverrideOptions(value: Options): Self = this.set("OverrideOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideOptions: Self = this.set("OverrideOptions", js.undefined)
  }
}
