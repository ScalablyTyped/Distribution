package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provisioned extends StObject {
  
  /**
    * 
    Information about the brokers.
    
    */
  var BrokerNodeGroupInfo: typings.awsSdk.kafkaMod.BrokerNodeGroupInfo
  
  /**
    * 
    Includes all client authentication information.
    
    */
  var ClientAuthentication: js.UndefOr[typings.awsSdk.kafkaMod.ClientAuthentication] = js.undefined
  
  /**
    * 
    Information about the Apache Kafka version deployed on the brokers.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined
  
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typings.awsSdk.kafkaMod.EncryptionInfo] = js.undefined
  
  /**
    * 
    Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.EnhancedMonitoring] = js.undefined
  
  /**
    * 
    Log delivery information for the cluster.
    
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.kafkaMod.LoggingInfo] = js.undefined
  
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: integerMin1Max15
  
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.undefined
  
  /**
    * 
    The connection string to use to connect to the Apache ZooKeeper cluster.
    
    */
  var ZookeeperConnectString: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The connection string to use to connect to the Apache ZooKeeper cluster on a TLS port.
    
    */
  var ZookeeperConnectStringTls: js.UndefOr[string] = js.undefined
}
object Provisioned {
  
  inline def apply(BrokerNodeGroupInfo: BrokerNodeGroupInfo, NumberOfBrokerNodes: integerMin1Max15): Provisioned = {
    val __obj = js.Dynamic.literal(BrokerNodeGroupInfo = BrokerNodeGroupInfo.asInstanceOf[js.Any], NumberOfBrokerNodes = NumberOfBrokerNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provisioned]
  }
  
  extension [Self <: Provisioned](x: Self) {
    
    inline def setBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = StObject.set(x, "BrokerNodeGroupInfo", value.asInstanceOf[js.Any])
    
    inline def setClientAuthentication(value: ClientAuthentication): Self = StObject.set(x, "ClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setClientAuthenticationUndefined: Self = StObject.set(x, "ClientAuthentication", js.undefined)
    
    inline def setCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = StObject.set(x, "CurrentBrokerSoftwareInfo", value.asInstanceOf[js.Any])
    
    inline def setCurrentBrokerSoftwareInfoUndefined: Self = StObject.set(x, "CurrentBrokerSoftwareInfo", js.undefined)
    
    inline def setEncryptionInfo(value: EncryptionInfo): Self = StObject.set(x, "EncryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "EncryptionInfo", js.undefined)
    
    inline def setEnhancedMonitoring(value: EnhancedMonitoring): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnhancedMonitoringUndefined: Self = StObject.set(x, "EnhancedMonitoring", js.undefined)
    
    inline def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    inline def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    inline def setNumberOfBrokerNodes(value: integerMin1Max15): Self = StObject.set(x, "NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    inline def setOpenMonitoring(value: OpenMonitoringInfo): Self = StObject.set(x, "OpenMonitoring", value.asInstanceOf[js.Any])
    
    inline def setOpenMonitoringUndefined: Self = StObject.set(x, "OpenMonitoring", js.undefined)
    
    inline def setZookeeperConnectString(value: string): Self = StObject.set(x, "ZookeeperConnectString", value.asInstanceOf[js.Any])
    
    inline def setZookeeperConnectStringTls(value: string): Self = StObject.set(x, "ZookeeperConnectStringTls", value.asInstanceOf[js.Any])
    
    inline def setZookeeperConnectStringTlsUndefined: Self = StObject.set(x, "ZookeeperConnectStringTls", js.undefined)
    
    inline def setZookeeperConnectStringUndefined: Self = StObject.set(x, "ZookeeperConnectString", js.undefined)
  }
}
