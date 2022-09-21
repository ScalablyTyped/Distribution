package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainClusterConfigDetails extends StObject {
  
  /**
    * The number of instances to use for the master node. If this attribute is specified, then DedicatedMasterEnabled must be true.
    */
  var DedicatedMasterCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs cluster management tasks, but does not hold data or respond to data upload requests.
    */
  var DedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The hardware configuration of the computer that hosts the dedicated master node. If this attribute is specified, then DedicatedMasterEnabled must be true. 
    */
  var DedicatedMasterType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of data nodes to use in the OpenSearch domain.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The instance type for your data nodes. For a list of valid values, see Supported instance types in Amazon OpenSearch Service in the Amazon OpenSearch Service Developer Guide.
    */
  var InstanceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of UltraWarm instances.
    */
  var WarmCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Whether UltraWarm is enabled.
    */
  var WarmEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of UltraWarm instance.
    */
  var WarmType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Configuration options for zone awareness. Provided if ZoneAwarenessEnabled is true.
    */
  var ZoneAwarenessConfig: js.UndefOr[AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails] = js.undefined
  
  /**
    * Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch Service allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the same Region. This prevents data loss and minimizes downtime if a node or data center fails.
    */
  var ZoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
}
object AwsOpenSearchServiceDomainClusterConfigDetails {
  
  inline def apply(): AwsOpenSearchServiceDomainClusterConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainClusterConfigDetails]
  }
  
  extension [Self <: AwsOpenSearchServiceDomainClusterConfigDetails](x: Self) {
    
    inline def setDedicatedMasterCount(value: Integer): Self = StObject.set(x, "DedicatedMasterCount", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterCountUndefined: Self = StObject.set(x, "DedicatedMasterCount", js.undefined)
    
    inline def setDedicatedMasterEnabled(value: Boolean): Self = StObject.set(x, "DedicatedMasterEnabled", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterEnabledUndefined: Self = StObject.set(x, "DedicatedMasterEnabled", js.undefined)
    
    inline def setDedicatedMasterType(value: NonEmptyString): Self = StObject.set(x, "DedicatedMasterType", value.asInstanceOf[js.Any])
    
    inline def setDedicatedMasterTypeUndefined: Self = StObject.set(x, "DedicatedMasterType", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceType(value: NonEmptyString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setWarmCount(value: Integer): Self = StObject.set(x, "WarmCount", value.asInstanceOf[js.Any])
    
    inline def setWarmCountUndefined: Self = StObject.set(x, "WarmCount", js.undefined)
    
    inline def setWarmEnabled(value: Boolean): Self = StObject.set(x, "WarmEnabled", value.asInstanceOf[js.Any])
    
    inline def setWarmEnabledUndefined: Self = StObject.set(x, "WarmEnabled", js.undefined)
    
    inline def setWarmType(value: NonEmptyString): Self = StObject.set(x, "WarmType", value.asInstanceOf[js.Any])
    
    inline def setWarmTypeUndefined: Self = StObject.set(x, "WarmType", js.undefined)
    
    inline def setZoneAwarenessConfig(value: AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails): Self = StObject.set(x, "ZoneAwarenessConfig", value.asInstanceOf[js.Any])
    
    inline def setZoneAwarenessConfigUndefined: Self = StObject.set(x, "ZoneAwarenessConfig", js.undefined)
    
    inline def setZoneAwarenessEnabled(value: Boolean): Self = StObject.set(x, "ZoneAwarenessEnabled", value.asInstanceOf[js.Any])
    
    inline def setZoneAwarenessEnabledUndefined: Self = StObject.set(x, "ZoneAwarenessEnabled", js.undefined)
  }
}
