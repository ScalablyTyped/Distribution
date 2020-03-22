package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterRequest extends js.Object {
  /**
    * 
    Information about the broker nodes in the cluster.
    
    */
  var BrokerNodeGroupInfo: typings.awsSdk.kafkaMod.BrokerNodeGroupInfo = js.native
  /**
    * 
    Includes all client authentication related information.
    
    */
  var ClientAuthentication: js.UndefOr[typings.awsSdk.kafkaMod.ClientAuthentication] = js.native
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: stringMin1Max64 = js.native
  /**
    * 
    Represents the configuration that you want MSK to use for the brokers in a cluster.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsSdk.kafkaMod.ConfigurationInfo] = js.native
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typings.awsSdk.kafkaMod.EncryptionInfo] = js.native
  /**
    * 
    Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.EnhancedMonitoring] = js.native
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: stringMin1Max128 = js.native
  var LoggingInfo: js.UndefOr[typings.awsSdk.kafkaMod.LoggingInfo] = js.native
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: integerMin1Max15 = js.native
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.native
  /**
    * 
    Create tags when creating the cluster.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.native
}

object CreateClusterRequest {
  @scala.inline
  def apply(
    BrokerNodeGroupInfo: BrokerNodeGroupInfo,
    ClusterName: stringMin1Max64,
    KafkaVersion: stringMin1Max128,
    NumberOfBrokerNodes: integerMin1Max15,
    ClientAuthentication: ClientAuthentication = null,
    ConfigurationInfo: ConfigurationInfo = null,
    EncryptionInfo: EncryptionInfo = null,
    EnhancedMonitoring: EnhancedMonitoring = null,
    LoggingInfo: LoggingInfo = null,
    OpenMonitoring: OpenMonitoringInfo = null,
    Tags: mapOfString = null
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(BrokerNodeGroupInfo = BrokerNodeGroupInfo.asInstanceOf[js.Any], ClusterName = ClusterName.asInstanceOf[js.Any], KafkaVersion = KafkaVersion.asInstanceOf[js.Any], NumberOfBrokerNodes = NumberOfBrokerNodes.asInstanceOf[js.Any])
    if (ClientAuthentication != null) __obj.updateDynamic("ClientAuthentication")(ClientAuthentication.asInstanceOf[js.Any])
    if (ConfigurationInfo != null) __obj.updateDynamic("ConfigurationInfo")(ConfigurationInfo.asInstanceOf[js.Any])
    if (EncryptionInfo != null) __obj.updateDynamic("EncryptionInfo")(EncryptionInfo.asInstanceOf[js.Any])
    if (EnhancedMonitoring != null) __obj.updateDynamic("EnhancedMonitoring")(EnhancedMonitoring.asInstanceOf[js.Any])
    if (LoggingInfo != null) __obj.updateDynamic("LoggingInfo")(LoggingInfo.asInstanceOf[js.Any])
    if (OpenMonitoring != null) __obj.updateDynamic("OpenMonitoring")(OpenMonitoring.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

