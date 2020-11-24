package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopJobRunResponse extends js.Object {
  
  /**
    * The ID of the job run that you stopped.
    */
  var RunId: JobRunId = js.native
}
object StopJobRunResponse {
  
  @scala.inline
  def apply(RunId: JobRunId): StopJobRunResponse = {
    val __obj = js.Dynamic.literal(RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobRunResponse]
  }
  
  @scala.inline
  implicit class StopJobRunResponseOps[Self <: StopJobRunResponse] (val x: Self) extends AnyVal {
    
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
    def setRunId(value: JobRunId): Self = this.set("RunId", value.asInstanceOf[js.Any])
  }
}
