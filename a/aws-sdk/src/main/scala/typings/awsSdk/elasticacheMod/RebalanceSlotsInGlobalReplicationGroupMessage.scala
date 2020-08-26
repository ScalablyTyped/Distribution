package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebalanceSlotsInGlobalReplicationGroupMessage extends js.Object {
  /**
    * If True, redistribution is applied immediately.
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
}

object RebalanceSlotsInGlobalReplicationGroupMessage {
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String): RebalanceSlotsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebalanceSlotsInGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class RebalanceSlotsInGlobalReplicationGroupMessageOps[Self <: RebalanceSlotsInGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
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
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = this.set("GlobalReplicationGroupId", value.asInstanceOf[js.Any])
  }
  
}

