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
  @scala.inline
  implicit class RegionalConfigurationOps[Self <: RegionalConfiguration] (val x: Self) extends AnyVal {
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
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationGroupRegion(value: String): Self = this.set("ReplicationGroupRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setReshardingConfigurationVarargs(value: ReshardingConfiguration*): Self = this.set("ReshardingConfiguration", js.Array(value :_*))
    @scala.inline
    def setReshardingConfiguration(value: ReshardingConfigurationList): Self = this.set("ReshardingConfiguration", value.asInstanceOf[js.Any])
  }
  
}

