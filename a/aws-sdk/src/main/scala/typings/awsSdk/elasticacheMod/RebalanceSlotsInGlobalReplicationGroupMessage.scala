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
}

