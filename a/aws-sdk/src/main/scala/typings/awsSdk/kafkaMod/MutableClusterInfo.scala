package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableClusterInfo extends js.Object {
  /**
    * 
    Specifies the size of the EBS volume and the ID of the associated broker.
    
    */
  var BrokerEBSVolumeInfo: js.UndefOr[listOfBrokerEBSVolumeInfo] = js.native
  /**
    * 
    Information about the changes in the configuration of the brokers.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsSdk.kafkaMod.ConfigurationInfo] = js.native
  /**
    * 
    Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.EnhancedMonitoring] = js.native
  /**
    * 
    The Kafka version.
    
    */
  var KafkaVersion: js.UndefOr[string] = js.native
  var LoggingInfo: js.UndefOr[typings.awsSdk.kafkaMod.LoggingInfo] = js.native
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[integer] = js.native
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.OpenMonitoring] = js.native
}

object MutableClusterInfo {
  @scala.inline
  def apply(): MutableClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutableClusterInfo]
  }
  @scala.inline
  implicit class MutableClusterInfoOps[Self <: MutableClusterInfo] (val x: Self) extends AnyVal {
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
    def setBrokerEBSVolumeInfoVarargs(value: BrokerEBSVolumeInfo*): Self = this.set("BrokerEBSVolumeInfo", js.Array(value :_*))
    @scala.inline
    def setBrokerEBSVolumeInfo(value: listOfBrokerEBSVolumeInfo): Self = this.set("BrokerEBSVolumeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerEBSVolumeInfo: Self = this.set("BrokerEBSVolumeInfo", js.undefined)
    @scala.inline
    def setConfigurationInfo(value: ConfigurationInfo): Self = this.set("ConfigurationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationInfo: Self = this.set("ConfigurationInfo", js.undefined)
    @scala.inline
    def setEnhancedMonitoring(value: EnhancedMonitoring): Self = this.set("EnhancedMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhancedMonitoring: Self = this.set("EnhancedMonitoring", js.undefined)
    @scala.inline
    def setKafkaVersion(value: string): Self = this.set("KafkaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKafkaVersion: Self = this.set("KafkaVersion", js.undefined)
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = this.set("LoggingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingInfo: Self = this.set("LoggingInfo", js.undefined)
    @scala.inline
    def setNumberOfBrokerNodes(value: integer): Self = this.set("NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfBrokerNodes: Self = this.set("NumberOfBrokerNodes", js.undefined)
    @scala.inline
    def setOpenMonitoring(value: OpenMonitoring): Self = this.set("OpenMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMonitoring: Self = this.set("OpenMonitoring", js.undefined)
  }
  
}

