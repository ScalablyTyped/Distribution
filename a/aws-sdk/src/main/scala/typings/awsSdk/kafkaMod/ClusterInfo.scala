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
  def apply(
    ActiveOperationArn: string = null,
    BrokerNodeGroupInfo: BrokerNodeGroupInfo = null,
    ClientAuthentication: ClientAuthentication = null,
    ClusterArn: string = null,
    ClusterName: string = null,
    CreationTime: timestampIso8601 = null,
    CurrentBrokerSoftwareInfo: BrokerSoftwareInfo = null,
    CurrentVersion: string = null,
    EncryptionInfo: EncryptionInfo = null,
    EnhancedMonitoring: EnhancedMonitoring = null,
    NumberOfBrokerNodes: Int | Double = null,
    OpenMonitoring: OpenMonitoring = null,
    State: ClusterState = null,
    Tags: mapOfString = null,
    ZookeeperConnectString: string = null
  ): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    if (ActiveOperationArn != null) __obj.updateDynamic("ActiveOperationArn")(ActiveOperationArn.asInstanceOf[js.Any])
    if (BrokerNodeGroupInfo != null) __obj.updateDynamic("BrokerNodeGroupInfo")(BrokerNodeGroupInfo.asInstanceOf[js.Any])
    if (ClientAuthentication != null) __obj.updateDynamic("ClientAuthentication")(ClientAuthentication.asInstanceOf[js.Any])
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (ClusterName != null) __obj.updateDynamic("ClusterName")(ClusterName.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (CurrentBrokerSoftwareInfo != null) __obj.updateDynamic("CurrentBrokerSoftwareInfo")(CurrentBrokerSoftwareInfo.asInstanceOf[js.Any])
    if (CurrentVersion != null) __obj.updateDynamic("CurrentVersion")(CurrentVersion.asInstanceOf[js.Any])
    if (EncryptionInfo != null) __obj.updateDynamic("EncryptionInfo")(EncryptionInfo.asInstanceOf[js.Any])
    if (EnhancedMonitoring != null) __obj.updateDynamic("EnhancedMonitoring")(EnhancedMonitoring.asInstanceOf[js.Any])
    if (NumberOfBrokerNodes != null) __obj.updateDynamic("NumberOfBrokerNodes")(NumberOfBrokerNodes.asInstanceOf[js.Any])
    if (OpenMonitoring != null) __obj.updateDynamic("OpenMonitoring")(OpenMonitoring.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (ZookeeperConnectString != null) __obj.updateDynamic("ZookeeperConnectString")(ZookeeperConnectString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInfo]
  }
}

