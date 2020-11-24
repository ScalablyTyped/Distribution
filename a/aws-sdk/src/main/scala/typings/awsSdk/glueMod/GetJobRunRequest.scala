package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobRunRequest extends js.Object {
  
  /**
    * Name of the job definition being run.
    */
  var JobName: NameString = js.native
  
  /**
    * True if a list of predecessor runs should be returned.
    */
  var PredecessorsIncluded: js.UndefOr[BooleanValue] = js.native
  
  /**
    * The ID of the job run.
    */
  var RunId: IdString = js.native
}
object GetJobRunRequest {
  
  @scala.inline
  def apply(JobName: NameString, RunId: IdString): GetJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRunRequest]
  }
  
  @scala.inline
  implicit class GetJobRunRequestOps[Self <: GetJobRunRequest] (val x: Self) extends AnyVal {
    
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
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: IdString): Self = this.set("RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredecessorsIncluded(value: BooleanValue): Self = this.set("PredecessorsIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredecessorsIncluded: Self = this.set("PredecessorsIncluded", js.undefined)
  }
}
