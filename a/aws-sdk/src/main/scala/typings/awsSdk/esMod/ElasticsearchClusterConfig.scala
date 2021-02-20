package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchClusterConfig extends StObject {
  
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
  implicit class ElasticsearchClusterConfigMutableBuilder[Self <: ElasticsearchClusterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedicatedMasterCount(value: IntegerClass): Self = StObject.set(x, "DedicatedMasterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedMasterCountUndefined: Self = StObject.set(x, "DedicatedMasterCount", js.undefined)
    
    @scala.inline
    def setDedicatedMasterEnabled(value: Boolean): Self = StObject.set(x, "DedicatedMasterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedMasterEnabledUndefined: Self = StObject.set(x, "DedicatedMasterEnabled", js.undefined)
    
    @scala.inline
    def setDedicatedMasterType(value: ESPartitionInstanceType): Self = StObject.set(x, "DedicatedMasterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedMasterTypeUndefined: Self = StObject.set(x, "DedicatedMasterType", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: IntegerClass): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setInstanceType(value: ESPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setWarmCount(value: IntegerClass): Self = StObject.set(x, "WarmCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmCountUndefined: Self = StObject.set(x, "WarmCount", js.undefined)
    
    @scala.inline
    def setWarmEnabled(value: Boolean): Self = StObject.set(x, "WarmEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmEnabledUndefined: Self = StObject.set(x, "WarmEnabled", js.undefined)
    
    @scala.inline
    def setWarmType(value: ESWarmPartitionInstanceType): Self = StObject.set(x, "WarmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarmTypeUndefined: Self = StObject.set(x, "WarmType", js.undefined)
    
    @scala.inline
    def setZoneAwarenessConfig(value: ZoneAwarenessConfig): Self = StObject.set(x, "ZoneAwarenessConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneAwarenessConfigUndefined: Self = StObject.set(x, "ZoneAwarenessConfig", js.undefined)
    
    @scala.inline
    def setZoneAwarenessEnabled(value: Boolean): Self = StObject.set(x, "ZoneAwarenessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneAwarenessEnabledUndefined: Self = StObject.set(x, "ZoneAwarenessEnabled", js.undefined)
  }
}
