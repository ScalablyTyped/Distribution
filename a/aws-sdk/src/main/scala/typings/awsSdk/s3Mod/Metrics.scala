package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  /**
    *  A container specifying the time threshold for emitting the s3:Replication:OperationMissedThreshold event. 
    */
  var EventThreshold: ReplicationTimeValue = js.native
  /**
    *  Specifies whether the replication metrics are enabled. 
    */
  var Status: MetricsStatus = js.native
}

object Metrics {
  @scala.inline
  def apply(EventThreshold: ReplicationTimeValue, Status: MetricsStatus): Metrics = {
    val __obj = js.Dynamic.literal(EventThreshold = EventThreshold.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
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
    def setEventThreshold(value: ReplicationTimeValue): Self = this.set("EventThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: MetricsStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

