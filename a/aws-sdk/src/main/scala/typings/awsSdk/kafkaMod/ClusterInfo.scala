package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterInfo extends js.Object {
  /**
    * 
    Arn of active cluster operation.
    
    */
  var ActiveOperationArn: js.UndefOr[string] = js.native
  /**
    * 
    Information about the broker nodes.
    
    */
  var BrokerNodeGroupInfo: js.UndefOr[typings.awsSdk.kafkaMod.BrokerNodeGroupInfo] = js.native
  /**
    * 
    Includes all client authentication information.
    
    */
  var ClientAuthentication: js.UndefOr[typings.awsSdk.kafkaMod.ClientAuthentication] = js.native
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: js.UndefOr[string] = js.native
  /**
    * 
    The time when the cluster was created.
    
    */
  var CreationTime: js.UndefOr[timestampIso8601] = js.native
  /**
    * 
    Information about the version of software currently deployed on the Kafka brokers in the cluster.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.native
  /**
    * 
    The current version of the MSK cluster.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.native
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typings.awsSdk.kafkaMod.EncryptionInfo] = js.native
  /**
    * 
    Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of monitoring, see Monitoring.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.EnhancedMonitoring] = js.native
  var LoggingInfo: js.UndefOr[typings.awsSdk.kafkaMod.LoggingInfo] = js.native
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[integer] = js.native
  /**
    * 
    Settings for open monitoring using Prometheus.
    
    */
  var OpenMonitoring: js.UndefOr[typings.awsSdk.kafkaMod.OpenMonitoring] = js.native
  /**
    * 
    The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
    
    */
  var State: js.UndefOr[ClusterState] = js.native
  var StateInfo: js.UndefOr[typings.awsSdk.kafkaMod.StateInfo] = js.native
  /**
    * 
    Tags attached to the cluster.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * 
    The connection string to use to connect to the Apache ZooKeeper cluster.
    
    */
  var ZookeeperConnectString: js.UndefOr[string] = js.native
}

object ClusterInfo {
  @scala.inline
  def apply(): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterInfo]
  }
  @scala.inline
  implicit class ClusterInfoOps[Self <: ClusterInfo] (val x: Self) extends AnyVal {
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
    def setActiveOperationArn(value: string): Self = this.set("ActiveOperationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOperationArn: Self = this.set("ActiveOperationArn", js.undefined)
    @scala.inline
    def setBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = this.set("BrokerNodeGroupInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerNodeGroupInfo: Self = this.set("BrokerNodeGroupInfo", js.undefined)
    @scala.inline
    def setClientAuthentication(value: ClientAuthentication): Self = this.set("ClientAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAuthentication: Self = this.set("ClientAuthentication", js.undefined)
    @scala.inline
    def setClusterArn(value: string): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    @scala.inline
    def setClusterName(value: string): Self = this.set("ClusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterName: Self = this.set("ClusterName", js.undefined)
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = this.set("CurrentBrokerSoftwareInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentBrokerSoftwareInfo: Self = this.set("CurrentBrokerSoftwareInfo", js.undefined)
    @scala.inline
    def setCurrentVersion(value: string): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentVersion: Self = this.set("CurrentVersion", js.undefined)
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
    def setNumberOfBrokerNodes(value: integer): Self = this.set("NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfBrokerNodes: Self = this.set("NumberOfBrokerNodes", js.undefined)
    @scala.inline
    def setOpenMonitoring(value: OpenMonitoring): Self = this.set("OpenMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMonitoring: Self = this.set("OpenMonitoring", js.undefined)
    @scala.inline
    def setState(value: ClusterState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateInfo(value: StateInfo): Self = this.set("StateInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateInfo: Self = this.set("StateInfo", js.undefined)
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setZookeeperConnectString(value: string): Self = this.set("ZookeeperConnectString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZookeeperConnectString: Self = this.set("ZookeeperConnectString", js.undefined)
  }
  
}

