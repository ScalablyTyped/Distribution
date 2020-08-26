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
    NumberOfBrokerNodes: integerMin1Max15
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(BrokerNodeGroupInfo = BrokerNodeGroupInfo.asInstanceOf[js.Any], ClusterName = ClusterName.asInstanceOf[js.Any], KafkaVersion = KafkaVersion.asInstanceOf[js.Any], NumberOfBrokerNodes = NumberOfBrokerNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
  @scala.inline
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = this.set("BrokerNodeGroupInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterName(value: stringMin1Max64): Self = this.set("ClusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKafkaVersion(value: stringMin1Max128): Self = this.set("KafkaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfBrokerNodes(value: integerMin1Max15): Self = this.set("NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientAuthentication(value: ClientAuthentication): Self = this.set("ClientAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAuthentication: Self = this.set("ClientAuthentication", js.undefined)
    @scala.inline
    def setConfigurationInfo(value: ConfigurationInfo): Self = this.set("ConfigurationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationInfo: Self = this.set("ConfigurationInfo", js.undefined)
    @scala.inline
    def setEncryptionInfo(value: EncryptionInfo): Self = this.set("EncryptionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionInfo: Self = this.set("EncryptionInfo", js.undefined)
    @scala.inline
    def setEnhancedMonitoring(value: EnhancedMonitoring): Self = this.set("EnhancedMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedMonitoring: Self = this.set("EnhancedMonitoring", js.undefined)
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = this.set("LoggingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingInfo: Self = this.set("LoggingInfo", js.undefined)
    @scala.inline
    def setOpenMonitoring(value: OpenMonitoringInfo): Self = this.set("OpenMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMonitoring: Self = this.set("OpenMonitoring", js.undefined)
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

