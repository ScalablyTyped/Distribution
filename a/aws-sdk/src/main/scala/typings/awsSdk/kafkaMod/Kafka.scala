package typings.awsSdk.kafkaMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kafka extends Service {
  @JSName("config")
  var config_Kafka: ConfigBase with ClientConfiguration = js.native
  /**
    * 
    Creates a new MSK cluster.
    
    */
  def createCluster(): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * 
    Creates a new MSK cluster.
    
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]
  ): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * 
    Creates a new MSK configuration.
    
    */
  def createConfiguration(): Request[CreateConfigurationResponse, AWSError] = js.native
  def createConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationResponse, Unit]): Request[CreateConfigurationResponse, AWSError] = js.native
  /**
    * 
    Creates a new MSK configuration.
    
    */
  def createConfiguration(params: CreateConfigurationRequest): Request[CreateConfigurationResponse, AWSError] = js.native
  def createConfiguration(
    params: CreateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationResponse, Unit]
  ): Request[CreateConfigurationResponse, AWSError] = js.native
  /**
    * 
    Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
    
    */
  def deleteCluster(): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * 
    Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
    
    */
  def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]
  ): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * 
    Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
    
    */
  def describeCluster(): Request[DescribeClusterResponse, AWSError] = js.native
  def describeCluster(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * 
    Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
    
    */
  def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse, AWSError] = js.native
  def describeCluster(
    params: DescribeClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * 
    Returns a description of the cluster operation specified by the ARN.
    
    */
  def describeClusterOperation(): Request[DescribeClusterOperationResponse, AWSError] = js.native
  def describeClusterOperation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterOperationResponse, Unit]): Request[DescribeClusterOperationResponse, AWSError] = js.native
  /**
    * 
    Returns a description of the cluster operation specified by the ARN.
    
    */
  def describeClusterOperation(params: DescribeClusterOperationRequest): Request[DescribeClusterOperationResponse, AWSError] = js.native
  def describeClusterOperation(
    params: DescribeClusterOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterOperationResponse, Unit]
  ): Request[DescribeClusterOperationResponse, AWSError] = js.native
  /**
    * 
    Returns a description of this MSK configuration.
    
    */
  def describeConfiguration(): Request[DescribeConfigurationResponse, AWSError] = js.native
  def describeConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationResponse, Unit]): Request[DescribeConfigurationResponse, AWSError] = js.native
  /**
    * 
    Returns a description of this MSK configuration.
    
    */
  def describeConfiguration(params: DescribeConfigurationRequest): Request[DescribeConfigurationResponse, AWSError] = js.native
  def describeConfiguration(
    params: DescribeConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationResponse, Unit]
  ): Request[DescribeConfigurationResponse, AWSError] = js.native
  /**
    * 
    Returns a description of this revision of the configuration.
    
    */
  def describeConfigurationRevision(): Request[DescribeConfigurationRevisionResponse, AWSError] = js.native
  def describeConfigurationRevision(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRevisionResponse, Unit]): Request[DescribeConfigurationRevisionResponse, AWSError] = js.native
  /**
    * 
    Returns a description of this revision of the configuration.
    
    */
  def describeConfigurationRevision(params: DescribeConfigurationRevisionRequest): Request[DescribeConfigurationRevisionResponse, AWSError] = js.native
  def describeConfigurationRevision(
    params: DescribeConfigurationRevisionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRevisionResponse, Unit]
  ): Request[DescribeConfigurationRevisionResponse, AWSError] = js.native
  /**
    * 
    A list of brokers that a client application can use to bootstrap.
    
    */
  def getBootstrapBrokers(): Request[GetBootstrapBrokersResponse, AWSError] = js.native
  def getBootstrapBrokers(callback: js.Function2[/* err */ AWSError, /* data */ GetBootstrapBrokersResponse, Unit]): Request[GetBootstrapBrokersResponse, AWSError] = js.native
  /**
    * 
    A list of brokers that a client application can use to bootstrap.
    
    */
  def getBootstrapBrokers(params: GetBootstrapBrokersRequest): Request[GetBootstrapBrokersResponse, AWSError] = js.native
  def getBootstrapBrokers(
    params: GetBootstrapBrokersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBootstrapBrokersResponse, Unit]
  ): Request[GetBootstrapBrokersResponse, AWSError] = js.native
  /**
    * 
    Returns a list of all the operations that have been performed on the specified MSK cluster.
    
    */
  def listClusterOperations(): Request[ListClusterOperationsResponse, AWSError] = js.native
  def listClusterOperations(callback: js.Function2[/* err */ AWSError, /* data */ ListClusterOperationsResponse, Unit]): Request[ListClusterOperationsResponse, AWSError] = js.native
  /**
    * 
    Returns a list of all the operations that have been performed on the specified MSK cluster.
    
    */
  def listClusterOperations(params: ListClusterOperationsRequest): Request[ListClusterOperationsResponse, AWSError] = js.native
  def listClusterOperations(
    params: ListClusterOperationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClusterOperationsResponse, Unit]
  ): Request[ListClusterOperationsResponse, AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK clusters in the current Region.
    
    */
  def listClusters(): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]): Request[ListClustersResponse, AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK clusters in the current Region.
    
    */
  def listClusters(params: ListClustersRequest): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(
    params: ListClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]
  ): Request[ListClustersResponse, AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK configurations in this Region.
    
    */
  def listConfigurationRevisions(): Request[ListConfigurationRevisionsResponse, AWSError] = js.native
  def listConfigurationRevisions(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationRevisionsResponse, Unit]): Request[ListConfigurationRevisionsResponse, AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK configurations in this Region.
    
    */
  def listConfigurationRevisions(params: ListConfigurationRevisionsRequest): Request[ListConfigurationRevisionsResponse, AWSError] = js.native
  def listConfigurationRevisions(
    params: ListConfigurationRevisionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationRevisionsResponse, Unit]
  ): Request[ListConfigurationRevisionsResponse, AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK configurations in this Region.
    
    */
  def listConfigurations(): Request[ListConfigurationsResponse, AWSError] = js.native
  def listConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationsResponse, Unit]): Request[ListConfigurationsResponse, AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK configurations in this Region.
    
    */
  def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse, AWSError] = js.native
  def listConfigurations(
    params: ListConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationsResponse, Unit]
  ): Request[ListConfigurationsResponse, AWSError] = js.native
  /**
    * 
    Returns a list of Kafka versions.
    
    */
  def listKafkaVersions(): Request[ListKafkaVersionsResponse, AWSError] = js.native
  def listKafkaVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListKafkaVersionsResponse, Unit]): Request[ListKafkaVersionsResponse, AWSError] = js.native
  /**
    * 
    Returns a list of Kafka versions.
    
    */
  def listKafkaVersions(params: ListKafkaVersionsRequest): Request[ListKafkaVersionsResponse, AWSError] = js.native
  def listKafkaVersions(
    params: ListKafkaVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListKafkaVersionsResponse, Unit]
  ): Request[ListKafkaVersionsResponse, AWSError] = js.native
  /**
    * 
    Returns a list of the broker nodes in the cluster.
    
    */
  def listNodes(): Request[ListNodesResponse, AWSError] = js.native
  def listNodes(callback: js.Function2[/* err */ AWSError, /* data */ ListNodesResponse, Unit]): Request[ListNodesResponse, AWSError] = js.native
  /**
    * 
    Returns a list of the broker nodes in the cluster.
    
    */
  def listNodes(params: ListNodesRequest): Request[ListNodesResponse, AWSError] = js.native
  def listNodes(
    params: ListNodesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNodesResponse, Unit]
  ): Request[ListNodesResponse, AWSError] = js.native
  /**
    * 
    Returns a list of the tags associated with the specified resource.
    
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * 
    Returns a list of the tags associated with the specified resource.
    
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * 
    Adds tags to the specified MSK resource.
    
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    Adds tags to the specified MSK resource.
    
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    Removes the tags associated with the keys that are provided in the query.
    
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    Removes the tags associated with the keys that are provided in the query.
    
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * 
    Updates the number of broker nodes in the cluster.
    
    */
  def updateBrokerCount(): Request[UpdateBrokerCountResponse, AWSError] = js.native
  def updateBrokerCount(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBrokerCountResponse, Unit]): Request[UpdateBrokerCountResponse, AWSError] = js.native
  /**
    * 
    Updates the number of broker nodes in the cluster.
    
    */
  def updateBrokerCount(params: UpdateBrokerCountRequest): Request[UpdateBrokerCountResponse, AWSError] = js.native
  def updateBrokerCount(
    params: UpdateBrokerCountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBrokerCountResponse, Unit]
  ): Request[UpdateBrokerCountResponse, AWSError] = js.native
  /**
    * 
    Updates the EBS storage associated with MSK brokers.
    
    */
  def updateBrokerStorage(): Request[UpdateBrokerStorageResponse, AWSError] = js.native
  def updateBrokerStorage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBrokerStorageResponse, Unit]): Request[UpdateBrokerStorageResponse, AWSError] = js.native
  /**
    * 
    Updates the EBS storage associated with MSK brokers.
    
    */
  def updateBrokerStorage(params: UpdateBrokerStorageRequest): Request[UpdateBrokerStorageResponse, AWSError] = js.native
  def updateBrokerStorage(
    params: UpdateBrokerStorageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBrokerStorageResponse, Unit]
  ): Request[UpdateBrokerStorageResponse, AWSError] = js.native
  /**
    * 
    Updates the cluster with the configuration that is specified in the request body.
    
    */
  def updateClusterConfiguration(): Request[UpdateClusterConfigurationResponse, AWSError] = js.native
  def updateClusterConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterConfigurationResponse, Unit]): Request[UpdateClusterConfigurationResponse, AWSError] = js.native
  /**
    * 
    Updates the cluster with the configuration that is specified in the request body.
    
    */
  def updateClusterConfiguration(params: UpdateClusterConfigurationRequest): Request[UpdateClusterConfigurationResponse, AWSError] = js.native
  def updateClusterConfiguration(
    params: UpdateClusterConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterConfigurationResponse, Unit]
  ): Request[UpdateClusterConfigurationResponse, AWSError] = js.native
  /**
    * 
    Updates the monitoring settings for the cluster. You can use this operation to specify which Apache Kafka metrics you want Amazon MSK to send to Amazon CloudWatch. You can also specify settings for open monitoring with Prometheus.
    
    */
  def updateMonitoring(): Request[UpdateMonitoringResponse, AWSError] = js.native
  def updateMonitoring(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMonitoringResponse, Unit]): Request[UpdateMonitoringResponse, AWSError] = js.native
  /**
    * 
    Updates the monitoring settings for the cluster. You can use this operation to specify which Apache Kafka metrics you want Amazon MSK to send to Amazon CloudWatch. You can also specify settings for open monitoring with Prometheus.
    
    */
  def updateMonitoring(params: UpdateMonitoringRequest): Request[UpdateMonitoringResponse, AWSError] = js.native
  def updateMonitoring(
    params: UpdateMonitoringRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMonitoringResponse, Unit]
  ): Request[UpdateMonitoringResponse, AWSError] = js.native
}

