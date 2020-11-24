package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReplicationTaskAssessmentRunResponse extends js.Object {
  
  /**
    * The ReplicationTaskAssessmentRun object for the deleted assessment run.
    */
  var ReplicationTaskAssessmentRun: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTaskAssessmentRun] = js.native
}
object DeleteReplicationTaskAssessmentRunResponse {
  
  @scala.inline
  def apply(): DeleteReplicationTaskAssessmentRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationTaskAssessmentRunResponse]
  }
  
  @scala.inline
  implicit class DeleteReplicationTaskAssessmentRunResponseOps[Self <: DeleteReplicationTaskAssessmentRunResponse] (val x: Self) extends AnyVal {
    
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
    def setReplicationTaskAssessmentRun(value: ReplicationTaskAssessmentRun): Self = this.set("ReplicationTaskAssessmentRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTaskAssessmentRun: Self = this.set("ReplicationTaskAssessmentRun", js.undefined)
  }
}
