package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopJobRunRequest extends js.Object {
  
  /**
    * The name of the job to be stopped.
    */
  var Name: JobName = js.native
  
  /**
    * The ID of the job run to be stopped.
    */
  var RunId: JobRunId = js.native
}
object StopJobRunRequest {
  
  @scala.inline
  def apply(Name: JobName, RunId: JobRunId): StopJobRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobRunRequest]
  }
  
  @scala.inline
  implicit class StopJobRunRequestOps[Self <: StopJobRunRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: JobName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: JobRunId): Self = this.set("RunId", value.asInstanceOf[js.Any])
  }
}
