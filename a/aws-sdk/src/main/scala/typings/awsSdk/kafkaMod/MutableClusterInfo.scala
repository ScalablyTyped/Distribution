package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutableClusterInfo extends StObject {
  
  /**
    * 
    Specifies the size of the EBS volume and the ID of the associated broker.
    
    */
  var BrokerEBSVolumeInfo: js.UndefOr[listOfBrokerEBSVolumeInfo] = js.undefined
  
  /**
    * 
    Information about the changes in the configuration of the brokers.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsSdk.kafkaMod.ConfigurationInfo] = js.undefined
  
  /**
    * 
    Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.EnhancedMonitoring] = js.undefined
  
  /**
    * 
    The Kafka version.
    
    */
  var KafkaVersion: js.UndefOr[string] = js.undefined
  
  var LoggingInfo: js.UndefOr[typings.awsSdk.kafkaMod.LoggingInfo] = js.undefined
  
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[integer] = js.undefined
  
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.OpenMonitoring] = js.undefined
}
object MutableClusterInfo {
  
  inline def apply(): MutableClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutableClusterInfo]
  }
  
  extension [Self <: MutableClusterInfo](x: Self) {
    
    inline def setBrokerEBSVolumeInfo(value: listOfBrokerEBSVolumeInfo): Self = StObject.set(x, "BrokerEBSVolumeInfo", value.asInstanceOf[js.Any])
    
    inline def setBrokerEBSVolumeInfoUndefined: Self = StObject.set(x, "BrokerEBSVolumeInfo", js.undefined)
    
    inline def setBrokerEBSVolumeInfoVarargs(value: BrokerEBSVolumeInfo*): Self = StObject.set(x, "BrokerEBSVolumeInfo", js.Array(value :_*))
    
    inline def setConfigurationInfo(value: ConfigurationInfo): Self = StObject.set(x, "ConfigurationInfo", value.asInstanceOf[js.Any])
    
    inline def setConfigurationInfoUndefined: Self = StObject.set(x, "ConfigurationInfo", js.undefined)
    
    inline def setEnhancedMonitoring(value: EnhancedMonitoring): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnhancedMonitoringUndefined: Self = StObject.set(x, "EnhancedMonitoring", js.undefined)
    
    inline def setKafkaVersion(value: string): Self = StObject.set(x, "KafkaVersion", value.asInstanceOf[js.Any])
    
    inline def setKafkaVersionUndefined: Self = StObject.set(x, "KafkaVersion", js.undefined)
    
    inline def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    inline def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    inline def setNumberOfBrokerNodes(value: integer): Self = StObject.set(x, "NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBrokerNodesUndefined: Self = StObject.set(x, "NumberOfBrokerNodes", js.undefined)
    
    inline def setOpenMonitoring(value: OpenMonitoring): Self = StObject.set(x, "OpenMonitoring", value.asInstanceOf[js.Any])
    
    inline def setOpenMonitoringUndefined: Self = StObject.set(x, "OpenMonitoring", js.undefined)
  }
}
