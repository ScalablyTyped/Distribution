package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionalConfiguration extends js.Object {
  /**
    * The name of the secondary cluster
    */
  var ReplicationGroupId: String = js.native
  /**
    * The AWS region where the cluster is stored
    */
  var ReplicationGroupRegion: String = js.native
  /**
    * A list of PreferredAvailabilityZones objects that specifies the configuration of a node group in the resharded cluster. 
    */
  var ReshardingConfiguration: ReshardingConfigurationList = js.native
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
}

