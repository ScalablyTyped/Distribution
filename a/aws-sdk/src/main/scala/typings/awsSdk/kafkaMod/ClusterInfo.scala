package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterInfo extends StObject {
  
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
    Specifies which metrics are gathered for the MSK cluster. This property has the following possible values: DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION. For a list of the metrics associated with each of these levels of monitoring, see Monitoring.
    
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
  
  /**
    * 
    The connection string to use to connect to zookeeper cluster on Tls port.
    
    */
  var ZookeeperConnectStringTls: js.UndefOr[string] = js.native
}
object ClusterInfo {
  
  @scala.inline
  def apply(): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterInfo]
  }
  
  @scala.inline
  implicit class ClusterInfoMutableBuilder[Self <: ClusterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOperationArn(value: string): Self = StObject.set(x, "ActiveOperationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOperationArnUndefined: Self = StObject.set(x, "ActiveOperationArn", js.undefined)
    
    @scala.inline
    def setBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = StObject.set(x, "BrokerNodeGroupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerNodeGroupInfoUndefined: Self = StObject.set(x, "BrokerNodeGroupInfo", js.undefined)
    
    @scala.inline
    def setClientAuthentication(value: ClientAuthentication): Self = StObject.set(x, "ClientAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAuthenticationUndefined: Self = StObject.set(x, "ClientAuthentication", js.undefined)
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setClusterName(value: string): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = StObject.set(x, "CurrentBrokerSoftwareInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBrokerSoftwareInfoUndefined: Self = StObject.set(x, "CurrentBrokerSoftwareInfo", js.undefined)
    
    @scala.inline
    def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    @scala.inline
    def setEncryptionInfo(value: EncryptionInfo): Self = StObject.set(x, "EncryptionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionInfoUndefined: Self = StObject.set(x, "EncryptionInfo", js.undefined)
    
    @scala.inline
    def setEnhancedMonitoring(value: EnhancedMonitoring): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedMonitoringUndefined: Self = StObject.set(x, "EnhancedMonitoring", js.undefined)
    
    @scala.inline
    def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    @scala.inline
    def setNumberOfBrokerNodes(value: integer): Self = StObject.set(x, "NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfBrokerNodesUndefined: Self = StObject.set(x, "NumberOfBrokerNodes", js.undefined)
    
    @scala.inline
    def setOpenMonitoring(value: OpenMonitoring): Self = StObject.set(x, "OpenMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenMonitoringUndefined: Self = StObject.set(x, "OpenMonitoring", js.undefined)
    
    @scala.inline
    def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateInfo(value: StateInfo): Self = StObject.set(x, "StateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateInfoUndefined: Self = StObject.set(x, "StateInfo", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setZookeeperConnectString(value: string): Self = StObject.set(x, "ZookeeperConnectString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZookeeperConnectStringTls(value: string): Self = StObject.set(x, "ZookeeperConnectStringTls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZookeeperConnectStringTlsUndefined: Self = StObject.set(x, "ZookeeperConnectStringTls", js.undefined)
    
    @scala.inline
    def setZookeeperConnectStringUndefined: Self = StObject.set(x, "ZookeeperConnectString", js.undefined)
  }
}
