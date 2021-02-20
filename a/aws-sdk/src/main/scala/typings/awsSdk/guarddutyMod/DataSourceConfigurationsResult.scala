package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceConfigurationsResult extends StObject {
  
  /**
    * An object that contains information on the status of CloudTrail as a data source.
    */
  var CloudTrail: CloudTrailConfigurationResult = js.native
  
  /**
    * An object that contains information on the status of DNS logs as a data source.
    */
  var DNSLogs: DNSLogsConfigurationResult = js.native
  
  /**
    * An object that contains information on the status of VPC flow logs as a data source.
    */
  var FlowLogs: FlowLogsConfigurationResult = js.native
  
  /**
    * An object that contains information on the status of S3 Data event logs as a data source.
    */
  var S3Logs: S3LogsConfigurationResult = js.native
}
object DataSourceConfigurationsResult {
  
  @scala.inline
  def apply(
    CloudTrail: CloudTrailConfigurationResult,
    DNSLogs: DNSLogsConfigurationResult,
    FlowLogs: FlowLogsConfigurationResult,
    S3Logs: S3LogsConfigurationResult
  ): DataSourceConfigurationsResult = {
    val __obj = js.Dynamic.literal(CloudTrail = CloudTrail.asInstanceOf[js.Any], DNSLogs = DNSLogs.asInstanceOf[js.Any], FlowLogs = FlowLogs.asInstanceOf[js.Any], S3Logs = S3Logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfigurationsResult]
  }
  
  @scala.inline
  implicit class DataSourceConfigurationsResultMutableBuilder[Self <: DataSourceConfigurationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudTrail(value: CloudTrailConfigurationResult): Self = StObject.set(x, "CloudTrail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNSLogs(value: DNSLogsConfigurationResult): Self = StObject.set(x, "DNSLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowLogs(value: FlowLogsConfigurationResult): Self = StObject.set(x, "FlowLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Logs(value: S3LogsConfigurationResult): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
  }
}
