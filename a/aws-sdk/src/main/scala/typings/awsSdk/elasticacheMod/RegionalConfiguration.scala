package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalConfiguration extends StObject {
  
  /**
    * The name of the secondary cluster
    */
  var ReplicationGroupId: String
  
  /**
    * The AWS region where the cluster is stored
    */
  var ReplicationGroupRegion: String
  
  /**
    * A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster. 
    */
  var ReshardingConfiguration: ReshardingConfigurationList
}
object RegionalConfiguration {
  
  @scala.inline
  def apply(
    ReplicationGroupId: String,
    ReplicationGroupRegion: String,
    ReshardingConfiguration: ReshardingConfigurationList
  ): RegionalConfiguration = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupRegion = ReplicationGroupRegion.asInstanceOf[js.Any], ReshardingConfiguration = ReshardingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionalConfiguration]
  }
  
  @scala.inline
  implicit class RegionalConfigurationMutableBuilder[Self <: RegionalConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupRegion(value: String): Self = StObject.set(x, "ReplicationGroupRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReshardingConfiguration(value: ReshardingConfigurationList): Self = StObject.set(x, "ReshardingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReshardingConfigurationVarargs(value: ReshardingConfiguration*): Self = StObject.set(x, "ReshardingConfiguration", js.Array(value :_*))
  }
}
