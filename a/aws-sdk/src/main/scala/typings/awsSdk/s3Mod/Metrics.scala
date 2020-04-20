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
}

