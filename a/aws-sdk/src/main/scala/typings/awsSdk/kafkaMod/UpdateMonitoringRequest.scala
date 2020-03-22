package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMonitoringRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string = js.native
  /**
    * 
    The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK cluster to find its version. When this update operation is successful, it generates a new cluster version.
    
    */
  var CurrentVersion: string = js.native
  /**
    * 
    Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.EnhancedMonitoring] = js.native
  var LoggingInfo: js.UndefOr[typings.awsSdk.kafkaMod.LoggingInfo] = js.native
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.native
}

object UpdateMonitoringRequest {
  @scala.inline
  def apply(
    ClusterArn: string,
    CurrentVersion: string,
    EnhancedMonitoring: EnhancedMonitoring = null,
    LoggingInfo: LoggingInfo = null,
    OpenMonitoring: OpenMonitoringInfo = null
  ): UpdateMonitoringRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    if (EnhancedMonitoring != null) __obj.updateDynamic("EnhancedMonitoring")(EnhancedMonitoring.asInstanceOf[js.Any])
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo.asInstanceOf[js.Any])
    if (OpenMonitoring != null) __obj.updateDynamic("OpenMonitoring")(OpenMonitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitoringRequest]
  }
}

