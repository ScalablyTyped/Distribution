package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String, NodeGroupCount: Integer): IncreaseNodeGroupsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseNodeGroupsInGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class IncreaseNodeGroupsInGlobalReplicationGroupMessageOps[Self <: IncreaseNodeGroupsInGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setNodeGroupCount(value: Integer): Self = this.set("NodeGroupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalConfigurationsVarargs(value: RegionalConfiguration*): Self = this.set("RegionalConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setRegionalConfigurations(value: RegionalConfigurationList): Self = this.set("RegionalConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalConfigurations: Self = this.set("RegionalConfigurations", js.undefined)
  }
}
