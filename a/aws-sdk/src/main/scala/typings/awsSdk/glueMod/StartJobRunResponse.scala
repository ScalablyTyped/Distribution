package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartJobRunResponse extends js.Object {
  
  /**
    * The ID assigned to this job run.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}
object StartJobRunResponse {
  
  @scala.inline
  def apply(): StartJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartJobRunResponse]
  }
  
  @scala.inline
  implicit class StartJobRunResponseOps[Self <: StartJobRunResponse] (val x: Self) extends AnyVal {
    
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
    def setJobRunId(value: IdString): Self = this.set("JobRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobRunId: Self = this.set("JobRunId", js.undefined)
  }
}
