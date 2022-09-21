package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterConfig extends StObject {
  
  /**
    * Specifies the ColdStorageOptions config for a Domain
    */
  var ColdStorageOptions: js.UndefOr[typings.awsSdk.opensearchMod.ColdStorageOptions] = js.undefined
  
  /**
    * Total number of dedicated master nodes, active and on standby, for the cluster.
    */
  var DedicatedMasterCount: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * A boolean value to indicate whether a dedicated master node is enabled. See Dedicated master nodes in Amazon OpenSearch Service  for more information. 
    */
  var DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance type for a dedicated master node.
    */
  var DedicatedMasterType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined
  
  /**
    * The number of instances in the specified domain cluster.
    */
  var InstanceCount: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * The instance type for an OpenSearch cluster. UltraWarm instance types are not supported for data instances. 
    */
  var InstanceType: js.UndefOr[OpenSearchPartitionInstanceType] = js.undefined
  
  /**
    * The number of UltraWarm nodes in the cluster.
    */
  var WarmCount: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * True to enable UltraWarm storage.
    */
  var WarmEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance type for the OpenSearch cluster's warm nodes.
    */
  var WarmType: js.UndefOr[OpenSearchWarmPartitionInstanceType] = js.undefined
  
  /**
    * The zone awareness configuration for a domain when zone awareness is enabled.
    */
  var ZoneAwarenessConfig: js.UndefOr[typings.awsSdk.opensearchMod.ZoneAwarenessConfig] = js.undefined
  
  /**
    * A boolean value to indicate whether zone awareness is enabled. See Configuring a multi-AZ domain in Amazon OpenSearch Service  for more information. 
    */
  var ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
}
object ClusterConfig {
  
  inline def apply(): ClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfig]
  }
  
  extension [Self <: ClusterConfig](x: Self) {
    
    inline def setColdStorageOptions(value: ColdStorageOptions): Self = StObject.set(x, "ColdStorageOptions", value.asInstanceOf[js.Any])
    
    inline def setColdStorageOptionsUndefined: Self = StObject.set(x, "ColdStorageOptions", js.undefined)
    
    inline def setDedicatedMasterCount(value: IntegerClass): Self = StObject.set(x, "DedicatedMasterCount", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterCountUndefined: Self = StObject.set(x, "DedicatedMasterCount", js.undefined)
    
    inline def setDedicatedMasterEnabled(value: Boolean): Self = StObject.set(x, "DedicatedMasterEnabled", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterEnabledUndefined: Self = StObject.set(x, "DedicatedMasterEnabled", js.undefined)
    
    inline def setDedicatedMasterType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "DedicatedMasterType", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterTypeUndefined: Self = StObject.set(x, "DedicatedMasterType", js.undefined)
    
    inline def setInstanceCount(value: IntegerClass): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceType(value: OpenSearchPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setWarmCount(value: IntegerClass): Self = StObject.set(x, "WarmCount", value.asInstanceOf[js.Any])
    
    inline def setWarmCountUndefined: Self = StObject.set(x, "WarmCount", js.undefined)
    
    inline def setWarmEnabled(value: Boolean): Self = StObject.set(x, "WarmEnabled", value.asInstanceOf[js.Any])
    
    inline def setWarmEnabledUndefined: Self = StObject.set(x, "WarmEnabled", js.undefined)
    
    inline def setWarmType(value: OpenSearchWarmPartitionInstanceType): Self = StObject.set(x, "WarmType", value.asInstanceOf[js.Any])
    
    inline def setWarmTypeUndefined: Self = StObject.set(x, "WarmType", js.undefined)
    
    inline def setZoneAwarenessConfig(value: ZoneAwarenessConfig): Self = StObject.set(x, "ZoneAwarenessConfig", value.asInstanceOf[js.Any])
    
    inline def setZoneAwarenessConfigUndefined: Self = StObject.set(x, "ZoneAwarenessConfig", js.undefined)
    
    inline def setZoneAwarenessEnabled(value: Boolean): Self = StObject.set(x, "ZoneAwarenessEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoneAwarenessEnabledUndefined: Self = StObject.set(x, "ZoneAwarenessEnabled", js.undefined)
  }
}
