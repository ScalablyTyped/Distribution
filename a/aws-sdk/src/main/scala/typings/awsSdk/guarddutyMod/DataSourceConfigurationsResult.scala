package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceConfigurationsResult extends StObject {
  
  /**
    * An object that contains information on the status of CloudTrail as a data source.
    */
  var CloudTrail: CloudTrailConfigurationResult
  
  /**
    * An object that contains information on the status of DNS logs as a data source.
    */
  var DNSLogs: DNSLogsConfigurationResult
  
  /**
    * An object that contains information on the status of VPC flow logs as a data source.
    */
  var FlowLogs: FlowLogsConfigurationResult
  
  /**
    * An object that contains information on the status of all Kubernetes data sources.
    */
  var Kubernetes: js.UndefOr[KubernetesConfigurationResult] = js.undefined
  
  /**
    * Describes the configuration of Malware Protection data sources.
    */
  var MalwareProtection: js.UndefOr[MalwareProtectionConfigurationResult] = js.undefined
  
  /**
    * An object that contains information on the status of S3 Data event logs as a data source.
    */
  var S3Logs: S3LogsConfigurationResult
}
object DataSourceConfigurationsResult {
  
  inline def apply(
    CloudTrail: CloudTrailConfigurationResult,
    DNSLogs: DNSLogsConfigurationResult,
    FlowLogs: FlowLogsConfigurationResult,
    S3Logs: S3LogsConfigurationResult
  ): DataSourceConfigurationsResult = {
    val __obj = js.Dynamic.literal(CloudTrail = CloudTrail.asInstanceOf[js.Any], DNSLogs = DNSLogs.asInstanceOf[js.Any], FlowLogs = FlowLogs.asInstanceOf[js.Any], S3Logs = S3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfigurationsResult]
  }
  
  extension [Self <: DataSourceConfigurationsResult](x: Self) {
    
    inline def setCloudTrail(value: CloudTrailConfigurationResult): Self = StObject.set(x, "CloudTrail", value.asInstanceOf[js.Any])
    
    inline def setDNSLogs(value: DNSLogsConfigurationResult): Self = StObject.set(x, "DNSLogs", value.asInstanceOf[js.Any])
    
    inline def setFlowLogs(value: FlowLogsConfigurationResult): Self = StObject.set(x, "FlowLogs", value.asInstanceOf[js.Any])
    
    inline def setKubernetes(value: KubernetesConfigurationResult): Self = StObject.set(x, "Kubernetes", value.asInstanceOf[js.Any])
    
    inline def setKubernetesUndefined: Self = StObject.set(x, "Kubernetes", js.undefined)
    
    inline def setMalwareProtection(value: MalwareProtectionConfigurationResult): Self = StObject.set(x, "MalwareProtection", value.asInstanceOf[js.Any])
    
    inline def setMalwareProtectionUndefined: Self = StObject.set(x, "MalwareProtection", js.undefined)
    
    inline def setS3Logs(value: S3LogsConfigurationResult): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
  }
}
