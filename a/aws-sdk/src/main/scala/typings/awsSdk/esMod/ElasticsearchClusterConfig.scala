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
  def apply(
    DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined,
    DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
    DedicatedMasterType: ESPartitionInstanceType = null,
    InstanceCount: js.UndefOr[IntegerClass] = js.undefined,
    InstanceType: ESPartitionInstanceType = null,
    WarmCount: js.UndefOr[IntegerClass] = js.undefined,
    WarmEnabled: js.UndefOr[Boolean] = js.undefined,
    WarmType: ESWarmPartitionInstanceType = null,
    ZoneAwarenessConfig: ZoneAwarenessConfig = null,
    ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
  ): ElasticsearchClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DedicatedMasterCount)) __obj.updateDynamic("DedicatedMasterCount")(DedicatedMasterCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DedicatedMasterEnabled)) __obj.updateDynamic("DedicatedMasterEnabled")(DedicatedMasterEnabled.get.asInstanceOf[js.Any])
    if (DedicatedMasterType != null) __obj.updateDynamic("DedicatedMasterType")(DedicatedMasterType.asInstanceOf[js.Any])
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount.get.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(WarmCount)) __obj.updateDynamic("WarmCount")(WarmCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WarmEnabled)) __obj.updateDynamic("WarmEnabled")(WarmEnabled.get.asInstanceOf[js.Any])
    if (WarmType != null) __obj.updateDynamic("WarmType")(WarmType.asInstanceOf[js.Any])
    if (ZoneAwarenessConfig != null) __obj.updateDynamic("ZoneAwarenessConfig")(ZoneAwarenessConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(ZoneAwarenessEnabled)) __obj.updateDynamic("ZoneAwarenessEnabled")(ZoneAwarenessEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchClusterConfig]
  }
}

