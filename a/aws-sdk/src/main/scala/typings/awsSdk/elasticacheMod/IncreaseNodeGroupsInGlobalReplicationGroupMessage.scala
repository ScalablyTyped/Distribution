package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncreaseNodeGroupsInGlobalReplicationGroupMessage extends js.Object {
  /**
    * Indicates that the process begins immediately. At present, the only permitted value for this parameter is true.
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * The number of node groups you wish to add
    */
  var NodeGroupCount: Integer = js.native
  /**
    * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each that comprise the Global Datastore
    */
  var RegionalConfigurations: js.UndefOr[RegionalConfigurationList] = js.native
}

object IncreaseNodeGroupsInGlobalReplicationGroupMessage {
  @scala.inline
  def apply(
    ApplyImmediately: Boolean,
    GlobalReplicationGroupId: String,
    NodeGroupCount: Integer,
    RegionalConfigurations: RegionalConfigurationList = null
  ): IncreaseNodeGroupsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any])
    if (RegionalConfigurations != null) __obj.updateDynamic("RegionalConfigurations")(RegionalConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseNodeGroupsInGlobalReplicationGroupMessage]
  }
}

