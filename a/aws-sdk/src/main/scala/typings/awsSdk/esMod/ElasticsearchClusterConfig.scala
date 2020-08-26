package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchClusterConfig extends js.Object {
  /**
    * Total number of dedicated master nodes, active and on standby, for the cluster.
    */
  var DedicatedMasterCount: js.UndefOr[IntegerClass] = js.native
  /**
    * A boolean value to indicate whether a dedicated master node is enabled. See About Dedicated Master Nodes for more information.
    */
  var DedicatedMasterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The instance type for a dedicated master node.
    */
  var DedicatedMasterType: js.UndefOr[ESPartitionInstanceType] = js.native
  /**
    * The number of instances in the specified domain cluster.
    */
  var InstanceCount: js.UndefOr[IntegerClass] = js.native
  /**
    * The instance type for an Elasticsearch cluster. UltraWarm instance types are not supported for data instances.
    */
  var InstanceType: js.UndefOr[ESPartitionInstanceType] = js.native
  /**
    * The number of warm nodes in the cluster.
    */
  var WarmCount: js.UndefOr[IntegerClass] = js.native
  /**
    * True to enable warm storage.
    */
  var WarmEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The instance type for the Elasticsearch cluster's warm nodes.
    */
  var WarmType: js.UndefOr[ESWarmPartitionInstanceType] = js.native
  /**
    * Specifies the zone awareness configuration for a domain when zone awareness is enabled.
    */
  var ZoneAwarenessConfig: js.UndefOr[typings.awsSdk.esMod.ZoneAwarenessConfig] = js.native
  /**
    * A boolean value to indicate whether zone awareness is enabled. See About Zone Awareness for more information.
    */
  var ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.native
}

object ElasticsearchClusterConfig {
  @scala.inline
  def apply(): ElasticsearchClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchClusterConfig]
  }
  @scala.inline
  implicit class ElasticsearchClusterConfigOps[Self <: ElasticsearchClusterConfig] (val x: Self) extends AnyVal {
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
    def setDedicatedMasterCount(value: IntegerClass): Self = this.set("DedicatedMasterCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedMasterCount: Self = this.set("DedicatedMasterCount", js.undefined)
    @scala.inline
    def setDedicatedMasterEnabled(value: Boolean): Self = this.set("DedicatedMasterEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedMasterEnabled: Self = this.set("DedicatedMasterEnabled", js.undefined)
    @scala.inline
    def setDedicatedMasterType(value: ESPartitionInstanceType): Self = this.set("DedicatedMasterType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedMasterType: Self = this.set("DedicatedMasterType", js.undefined)
    @scala.inline
    def setInstanceCount(value: IntegerClass): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    @scala.inline
    def setInstanceType(value: ESPartitionInstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setWarmCount(value: IntegerClass): Self = this.set("WarmCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarmCount: Self = this.set("WarmCount", js.undefined)
    @scala.inline
    def setWarmEnabled(value: Boolean): Self = this.set("WarmEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarmEnabled: Self = this.set("WarmEnabled", js.undefined)
    @scala.inline
    def setWarmType(value: ESWarmPartitionInstanceType): Self = this.set("WarmType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarmType: Self = this.set("WarmType", js.undefined)
    @scala.inline
    def setZoneAwarenessConfig(value: ZoneAwarenessConfig): Self = this.set("ZoneAwarenessConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneAwarenessConfig: Self = this.set("ZoneAwarenessConfig", js.undefined)
    @scala.inline
    def setZoneAwarenessEnabled(value: Boolean): Self = this.set("ZoneAwarenessEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneAwarenessEnabled: Self = this.set("ZoneAwarenessEnabled", js.undefined)
  }
  
}

