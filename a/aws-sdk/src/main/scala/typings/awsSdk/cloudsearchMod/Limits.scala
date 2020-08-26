package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limits extends js.Object {
  var MaximumPartitionCount: typings.awsSdk.cloudsearchMod.MaximumPartitionCount = js.native
  var MaximumReplicationCount: typings.awsSdk.cloudsearchMod.MaximumReplicationCount = js.native
}

object Limits {
  @scala.inline
  def apply(MaximumPartitionCount: MaximumPartitionCount, MaximumReplicationCount: MaximumReplicationCount): Limits = {
    val __obj = js.Dynamic.literal(MaximumPartitionCount = MaximumPartitionCount.asInstanceOf[js.Any], MaximumReplicationCount = MaximumReplicationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limits]
  }
  @scala.inline
  implicit class LimitsOps[Self <: Limits] (val x: Self) extends AnyVal {
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
    def setMaximumPartitionCount(value: MaximumPartitionCount): Self = this.set("MaximumPartitionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumReplicationCount(value: MaximumReplicationCount): Self = this.set("MaximumReplicationCount", value.asInstanceOf[js.Any])
  }
  
}

