package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelReplicationTaskAssessmentRunMessage extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the premigration assessment run to be canceled.
    */
  var ReplicationTaskAssessmentRunArn: String = js.native
}

object CancelReplicationTaskAssessmentRunMessage {
  @scala.inline
  def apply(ReplicationTaskAssessmentRunArn: String): CancelReplicationTaskAssessmentRunMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskAssessmentRunArn = ReplicationTaskAssessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReplicationTaskAssessmentRunMessage]
  }
  @scala.inline
  implicit class CancelReplicationTaskAssessmentRunMessageOps[Self <: CancelReplicationTaskAssessmentRunMessage] (val x: Self) extends AnyVal {
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

