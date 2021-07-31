package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMonitoringRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK cluster to find its version. When this update operation is successful, it generates a new cluster version.
    
    */
  var CurrentVersion: string
  
  /**
    * 
    Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.EnhancedMonitoring] = js.undefined
  
  var LoggingInfo: js.UndefOr[typings.awsSdk.kafkaMod.LoggingInfo] = js.undefined
  
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.undefined
}
object UpdateMonitoringRequest {
  
  @scala.inline
  def apply(ClusterArn: string, CurrentVersion: string): UpdateMonitoringRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], CurrentVersion = CurrentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitoringRequest]
  }
  
  @scala.inline
  implicit class UpdateMonitoringRequestMutableBuilder[Self <: UpdateMonitoringRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedMonitoring(value: EnhancedMonitoring): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedMonitoringUndefined: Self = StObject.set(x, "EnhancedMonitoring", js.undefined)
    
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    @scala.inline
    def setOpenMonitoring(value: OpenMonitoringInfo): Self = StObject.set(x, "OpenMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenMonitoringUndefined: Self = StObject.set(x, "OpenMonitoring", js.undefined)
  }
}
