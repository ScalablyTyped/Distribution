package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartReplicationTaskAssessmentResponse extends js.Object {
  /**
    *  The assessed replication task. 
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTask] = js.native
}

object StartReplicationTaskAssessmentResponse {
  @scala.inline
  def apply(): StartReplicationTaskAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplicationTaskAssessmentResponse]
  }
  @scala.inline
  implicit class StartReplicationTaskAssessmentResponseOps[Self <: StartReplicationTaskAssessmentResponse] (val x: Self) extends AnyVal {
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
    def setReplicationTask(value: ReplicationTask): Self = this.set("ReplicationTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTask: Self = this.set("ReplicationTask", js.undefined)
  }
  
}

