package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReplicationTaskAssessmentRunMessage extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the premigration assessment run to be deleted.
    */
  var ReplicationTaskAssessmentRunArn: String = js.native
}
object DeleteReplicationTaskAssessmentRunMessage {
  
  @scala.inline
  def apply(ReplicationTaskAssessmentRunArn: String): DeleteReplicationTaskAssessmentRunMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskAssessmentRunArn = ReplicationTaskAssessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationTaskAssessmentRunMessage]
  }
  
  @scala.inline
  implicit class DeleteReplicationTaskAssessmentRunMessageOps[Self <: DeleteReplicationTaskAssessmentRunMessage] (val x: Self) extends AnyVal {
    
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
    def setReplicationTaskAssessmentRunArn(value: String): Self = this.set("ReplicationTaskAssessmentRunArn", value.asInstanceOf[js.Any])
  }
}
