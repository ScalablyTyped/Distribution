package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceConfigurationsResult extends js.Object {
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
  implicit class DataSourceConfigurationsResultOps[Self <: DataSourceConfigurationsResult] (val x: Self) extends AnyVal {
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
    def setCloudTrail(value: CloudTrailConfigurationResult): Self = this.set("CloudTrail", value.asInstanceOf[js.Any])
    @scala.inline
    def setDNSLogs(value: DNSLogsConfigurationResult): Self = this.set("DNSLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlowLogs(value: FlowLogsConfigurationResult): Self = this.set("FlowLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Logs(value: S3LogsConfigurationResult): Self = this.set("S3Logs", value.asInstanceOf[js.Any])
  }
  
}

