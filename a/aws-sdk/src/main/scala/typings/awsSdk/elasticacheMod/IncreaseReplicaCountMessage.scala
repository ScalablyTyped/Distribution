package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncreaseReplicaCountMessage extends StObject {
  
  /**
    * If True, the number of replica nodes is increased immediately. ApplyImmediately=False is not currently supported.
    */
  var ApplyImmediately: Boolean
  
  /**
    * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups.
    */
  var NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A list of ConfigureShard objects that can be used to configure each shard in a Redis (cluster mode enabled) replication group. The ConfigureShard has three members: NewReplicaCount, NodeGroupId, and PreferredAvailabilityZones.
    */
  var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.undefined
  
  /**
    * The id of the replication group to which you want to add replica nodes.
    */
  var ReplicationGroupId: String
}
object IncreaseReplicaCountMessage {
  
  @scala.inline
  def apply(ApplyImmediately: Boolean, ReplicationGroupId: String): IncreaseReplicaCountMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncreaseReplicaCountMessage]
  }
  
  @scala.inline
  implicit class IncreaseReplicaCountMessageMutableBuilder[Self <: IncreaseReplicaCountMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewReplicaCount(value: IntegerOptional): Self = StObject.set(x, "NewReplicaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewReplicaCountUndefined: Self = StObject.set(x, "NewReplicaCount", js.undefined)
    
    @scala.inline
    def setReplicaConfiguration(value: ReplicaConfigurationList): Self = StObject.set(x, "ReplicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaConfigurationUndefined: Self = StObject.set(x, "ReplicaConfiguration", js.undefined)
    
    @scala.inline
    def setReplicaConfigurationVarargs(value: ConfigureShard*): Self = StObject.set(x, "ReplicaConfiguration", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
