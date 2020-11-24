package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunTaskResponse extends js.Object {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  
  /**
    * A full description of the tasks that were run. The tasks that were successfully placed on your cluster are described here.
    */
  var tasks: js.UndefOr[Tasks] = js.native
}
object RunTaskResponse {
  
  @scala.inline
  def apply(): RunTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunTaskResponse]
  }
  
  @scala.inline
  implicit class RunTaskResponseOps[Self <: RunTaskResponse] (val x: Self) extends AnyVal {
    
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
    def setFailuresVarargs(value: Failure*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: Failures): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: Task*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: Tasks): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
}
