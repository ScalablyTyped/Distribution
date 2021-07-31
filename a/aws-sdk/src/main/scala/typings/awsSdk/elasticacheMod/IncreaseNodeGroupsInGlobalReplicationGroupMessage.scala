package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncreaseNodeGroupsInGlobalReplicationGroupMessage extends StObject {
  
  /**
    * Indicates that the process begins immediately. At present, the only permitted value for this parameter is true.
    */
  var ApplyImmediately: Boolean
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String
  
  /**
    * The number of node groups you wish to add
    */
  var NodeGroupCount: Integer
  
  /**
    * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each that comprise the Global Datastore
    */
  var RegionalConfigurations: js.UndefOr[RegionalConfigurationList] = js.undefined
}
object IncreaseNodeGroupsInGlobalReplicationGroupMessage {
  
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String, NodeGroupCount: Integer): IncreaseNodeGroupsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseNodeGroupsInGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class IncreaseNodeGroupsInGlobalReplicationGroupMessageMutableBuilder[Self <: IncreaseNodeGroupsInGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupCount(value: Integer): Self = StObject.set(x, "NodeGroupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalConfigurations(value: RegionalConfigurationList): Self = StObject.set(x, "RegionalConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalConfigurationsUndefined: Self = StObject.set(x, "RegionalConfigurations", js.undefined)
    
    @scala.inline
    def setRegionalConfigurationsVarargs(value: RegionalConfiguration*): Self = StObject.set(x, "RegionalConfigurations", js.Array(value :_*))
  }
}
