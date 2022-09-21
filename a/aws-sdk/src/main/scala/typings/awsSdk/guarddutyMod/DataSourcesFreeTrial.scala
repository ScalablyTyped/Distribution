package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourcesFreeTrial extends StObject {
  
  /**
    * Describes whether any AWS CloudTrail management event logs are enabled as data sources.
    */
  var CloudTrail: js.UndefOr[DataSourceFreeTrial] = js.undefined
  
  /**
    * Describes whether any DNS logs are enabled as data sources.
    */
  var DnsLogs: js.UndefOr[DataSourceFreeTrial] = js.undefined
  
  /**
    * Describes whether any VPC Flow logs are enabled as data sources.
    */
  var FlowLogs: js.UndefOr[DataSourceFreeTrial] = js.undefined
  
  /**
    * Describes whether any Kubernetes logs are enabled as data sources.
    */
  var Kubernetes: js.UndefOr[KubernetesDataSourceFreeTrial] = js.undefined
  
  /**
    * Describes whether Malware Protection is enabled as a data source.
    */
  var MalwareProtection: js.UndefOr[MalwareProtectionDataSourceFreeTrial] = js.undefined
  
  /**
    * Describes whether any S3 data event logs are enabled as data sources.
    */
  var S3Logs: js.UndefOr[DataSourceFreeTrial] = js.undefined
}
object DataSourcesFreeTrial {
  
  inline def apply(): DataSourcesFreeTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourcesFreeTrial]
  }
  
  extension [Self <: DataSourcesFreeTrial](x: Self) {
    
    inline def setCloudTrail(value: DataSourceFreeTrial): Self = StObject.set(x, "CloudTrail", value.asInstanceOf[js.Any])
    
    inline def setCloudTrailUndefined: Self = StObject.set(x, "CloudTrail", js.undefined)
    
    inline def setDnsLogs(value: DataSourceFreeTrial): Self = StObject.set(x, "DnsLogs", value.asInstanceOf[js.Any])
    
    inline def setDnsLogsUndefined: Self = StObject.set(x, "DnsLogs", js.undefined)
    
    inline def setFlowLogs(value: DataSourceFreeTrial): Self = StObject.set(x, "FlowLogs", value.asInstanceOf[js.Any])
    
    inline def setFlowLogsUndefined: Self = StObject.set(x, "FlowLogs", js.undefined)
    
    inline def setKubernetes(value: KubernetesDataSourceFreeTrial): Self = StObject.set(x, "Kubernetes", value.asInstanceOf[js.Any])
    
    inline def setKubernetesUndefined: Self = StObject.set(x, "Kubernetes", js.undefined)
    
    inline def setMalwareProtection(value: MalwareProtectionDataSourceFreeTrial): Self = StObject.set(x, "MalwareProtection", value.asInstanceOf[js.Any])
    
    inline def setMalwareProtectionUndefined: Self = StObject.set(x, "MalwareProtection", js.undefined)
    
    inline def setS3Logs(value: DataSourceFreeTrial): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
    
    inline def setS3LogsUndefined: Self = StObject.set(x, "S3Logs", js.undefined)
  }
}
