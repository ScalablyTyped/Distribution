package typings.awsSdk.emrMod

import typings.awsSdk.anon.DescribeClusterInputwaite
import typings.awsSdk.anon.DescribeStepInputwaiterWa
import typings.awsSdk.awsSdkStrings.clusterRunning
import typings.awsSdk.awsSdkStrings.clusterTerminated
import typings.awsSdk.awsSdkStrings.stepComplete
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EMR extends Service {
  
  /**
    * Adds an instance fleet to a running cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x. 
    */
  def addInstanceFleet(): Request[AddInstanceFleetOutput, AWSError] = js.native
  def addInstanceFleet(callback: js.Function2[/* err */ AWSError, /* data */ AddInstanceFleetOutput, scala.Unit]): Request[AddInstanceFleetOutput, AWSError] = js.native
  /**
    * Adds an instance fleet to a running cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x. 
    */
  def addInstanceFleet(params: AddInstanceFleetInput): Request[AddInstanceFleetOutput, AWSError] = js.native
  def addInstanceFleet(
    params: AddInstanceFleetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AddInstanceFleetOutput, scala.Unit]
  ): Request[AddInstanceFleetOutput, AWSError] = js.native
  
  /**
    * Adds one or more instance groups to a running cluster.
    */
  def addInstanceGroups(): Request[AddInstanceGroupsOutput, AWSError] = js.native
  def addInstanceGroups(callback: js.Function2[/* err */ AWSError, /* data */ AddInstanceGroupsOutput, scala.Unit]): Request[AddInstanceGroupsOutput, AWSError] = js.native
  /**
    * Adds one or more instance groups to a running cluster.
    */
  def addInstanceGroups(params: AddInstanceGroupsInput): Request[AddInstanceGroupsOutput, AWSError] = js.native
  def addInstanceGroups(
    params: AddInstanceGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AddInstanceGroupsOutput, scala.Unit]
  ): Request[AddInstanceGroupsOutput, AWSError] = js.native
  
  /**
    * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each step is performed by the main function of the main class of the JAR file. The main class can be specified either in the manifest of the JAR or by using the MainFunction parameter of the step. Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run successfully. You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.  The string values passed into HadoopJarStep object cannot exceed a total of 10240 characters. 
    */
  def addJobFlowSteps(): Request[AddJobFlowStepsOutput, AWSError] = js.native
  def addJobFlowSteps(callback: js.Function2[/* err */ AWSError, /* data */ AddJobFlowStepsOutput, scala.Unit]): Request[AddJobFlowStepsOutput, AWSError] = js.native
  /**
    * AddJobFlowSteps adds new steps to a running cluster. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using SSH to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. A step specifies the location of a JAR file stored either on the master node of the cluster or in Amazon S3. Each step is performed by the main function of the main class of the JAR file. The main class can be specified either in the manifest of the JAR or by using the MainFunction parameter of the step. Amazon EMR executes each step in the order listed. For a step to be considered complete, the main function must exit with a zero exit code and all Hadoop jobs started while the step was running must have completed and run successfully. You can only add steps to a cluster that is in one of the following states: STARTING, BOOTSTRAPPING, RUNNING, or WAITING.  The string values passed into HadoopJarStep object cannot exceed a total of 10240 characters. 
    */
  def addJobFlowSteps(params: AddJobFlowStepsInput): Request[AddJobFlowStepsOutput, AWSError] = js.native
  def addJobFlowSteps(
    params: AddJobFlowStepsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AddJobFlowStepsOutput, scala.Unit]
  ): Request[AddJobFlowStepsOutput, AWSError] = js.native
  
  /**
    * Adds tags to an Amazon EMR resource, such as a cluster or an Amazon EMR Studio. Tags make it easier to associate resources in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters. 
    */
  def addTags(): Request[AddTagsOutput, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, scala.Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Adds tags to an Amazon EMR resource, such as a cluster or an Amazon EMR Studio. Tags make it easier to associate resources in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters. 
    */
  def addTags(params: AddTagsInput): Request[AddTagsOutput, AWSError] = js.native
  def addTags(
    params: AddTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, scala.Unit]
  ): Request[AddTagsOutput, AWSError] = js.native
  
  /**
    * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent but asynchronous; it does not guarantee that a step will be canceled, even if the request is successfully submitted. When you use Amazon EMR versions 5.28.0 and later, you can cancel steps that are in a PENDING or RUNNING state. In earlier versions of Amazon EMR, you can only cancel steps that are in a PENDING state. 
    */
  def cancelSteps(): Request[CancelStepsOutput, AWSError] = js.native
  def cancelSteps(callback: js.Function2[/* err */ AWSError, /* data */ CancelStepsOutput, scala.Unit]): Request[CancelStepsOutput, AWSError] = js.native
  /**
    * Cancels a pending step or steps in a running cluster. Available only in Amazon EMR versions 4.8.0 and later, excluding version 5.0.0. A maximum of 256 steps are allowed in each CancelSteps request. CancelSteps is idempotent but asynchronous; it does not guarantee that a step will be canceled, even if the request is successfully submitted. When you use Amazon EMR versions 5.28.0 and later, you can cancel steps that are in a PENDING or RUNNING state. In earlier versions of Amazon EMR, you can only cancel steps that are in a PENDING state. 
    */
  def cancelSteps(params: CancelStepsInput): Request[CancelStepsOutput, AWSError] = js.native
  def cancelSteps(
    params: CancelStepsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelStepsOutput, scala.Unit]
  ): Request[CancelStepsOutput, AWSError] = js.native
  
  @JSName("config")
  var config_EMR: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
    */
  def createSecurityConfiguration(): Request[CreateSecurityConfigurationOutput, AWSError] = js.native
  def createSecurityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityConfigurationOutput, scala.Unit]
  ): Request[CreateSecurityConfigurationOutput, AWSError] = js.native
  /**
    * Creates a security configuration, which is stored in the service and can be specified when a cluster is created.
    */
  def createSecurityConfiguration(params: CreateSecurityConfigurationInput): Request[CreateSecurityConfigurationOutput, AWSError] = js.native
  def createSecurityConfiguration(
    params: CreateSecurityConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSecurityConfigurationOutput, scala.Unit]
  ): Request[CreateSecurityConfigurationOutput, AWSError] = js.native
  
  /**
    * Creates a new Amazon EMR Studio.
    */
  def createStudio(): Request[CreateStudioOutput, AWSError] = js.native
  def createStudio(callback: js.Function2[/* err */ AWSError, /* data */ CreateStudioOutput, scala.Unit]): Request[CreateStudioOutput, AWSError] = js.native
  /**
    * Creates a new Amazon EMR Studio.
    */
  def createStudio(params: CreateStudioInput): Request[CreateStudioOutput, AWSError] = js.native
  def createStudio(
    params: CreateStudioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStudioOutput, scala.Unit]
  ): Request[CreateStudioOutput, AWSError] = js.native
  
  /**
    * Maps a user or group to the Amazon EMR Studio specified by StudioId, and applies a session policy to refine Studio permissions for that user or group. Use CreateStudioSessionMapping to assign users to a Studio when you use Amazon Web Services SSO authentication. For instructions on how to assign users to a Studio when you use IAM authentication, see Assign a user or group to your EMR Studio.
    */
  def createStudioSessionMapping(): Request[js.Object, AWSError] = js.native
  def createStudioSessionMapping(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Maps a user or group to the Amazon EMR Studio specified by StudioId, and applies a session policy to refine Studio permissions for that user or group. Use CreateStudioSessionMapping to assign users to a Studio when you use Amazon Web Services SSO authentication. For instructions on how to assign users to a Studio when you use IAM authentication, see Assign a user or group to your EMR Studio.
    */
  def createStudioSessionMapping(params: CreateStudioSessionMappingInput): Request[js.Object, AWSError] = js.native
  def createStudioSessionMapping(
    params: CreateStudioSessionMappingInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a security configuration.
    */
  def deleteSecurityConfiguration(): Request[DeleteSecurityConfigurationOutput, AWSError] = js.native
  def deleteSecurityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityConfigurationOutput, scala.Unit]
  ): Request[DeleteSecurityConfigurationOutput, AWSError] = js.native
  /**
    * Deletes a security configuration.
    */
  def deleteSecurityConfiguration(params: DeleteSecurityConfigurationInput): Request[DeleteSecurityConfigurationOutput, AWSError] = js.native
  def deleteSecurityConfiguration(
    params: DeleteSecurityConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSecurityConfigurationOutput, scala.Unit]
  ): Request[DeleteSecurityConfigurationOutput, AWSError] = js.native
  
  /**
    * Removes an Amazon EMR Studio from the Studio metadata store.
    */
  def deleteStudio(): Request[js.Object, AWSError] = js.native
  def deleteStudio(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes an Amazon EMR Studio from the Studio metadata store.
    */
  def deleteStudio(params: DeleteStudioInput): Request[js.Object, AWSError] = js.native
  def deleteStudio(
    params: DeleteStudioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes a user or group from an Amazon EMR Studio.
    */
  def deleteStudioSessionMapping(): Request[js.Object, AWSError] = js.native
  def deleteStudioSessionMapping(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a user or group from an Amazon EMR Studio.
    */
  def deleteStudioSessionMapping(params: DeleteStudioSessionMappingInput): Request[js.Object, AWSError] = js.native
  def deleteStudioSessionMapping(
    params: DeleteStudioSessionMappingInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.
    */
  def describeCluster(): Request[DescribeClusterOutput, AWSError] = js.native
  def describeCluster(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterOutput, scala.Unit]): Request[DescribeClusterOutput, AWSError] = js.native
  /**
    * Provides cluster-level details including status, hardware and software configuration, VPC settings, and so on.
    */
  def describeCluster(params: DescribeClusterInput): Request[DescribeClusterOutput, AWSError] = js.native
  def describeCluster(
    params: DescribeClusterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterOutput, scala.Unit]
  ): Request[DescribeClusterOutput, AWSError] = js.native
  
  /**
    * This API is no longer supported and will eventually be removed. We recommend you use ListClusters, DescribeCluster, ListSteps, ListInstanceGroups and ListBootstrapActions instead. DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time. Regardless of supplied parameters, only job flows created within the last two months are returned. If no parameters are supplied, then job flows matching either of the following criteria are returned:   Job flows created and completed in the last two weeks    Job flows created within the last two months that are in one of the following states: RUNNING, WAITING, SHUTTING_DOWN, STARTING    Amazon EMR can return a maximum of 512 job flow descriptions.
    */
  def describeJobFlows(): Request[DescribeJobFlowsOutput, AWSError] = js.native
  def describeJobFlows(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobFlowsOutput, scala.Unit]): Request[DescribeJobFlowsOutput, AWSError] = js.native
  /**
    * This API is no longer supported and will eventually be removed. We recommend you use ListClusters, DescribeCluster, ListSteps, ListInstanceGroups and ListBootstrapActions instead. DescribeJobFlows returns a list of job flows that match all of the supplied parameters. The parameters can include a list of job flow IDs, job flow states, and restrictions on job flow creation date and time. Regardless of supplied parameters, only job flows created within the last two months are returned. If no parameters are supplied, then job flows matching either of the following criteria are returned:   Job flows created and completed in the last two weeks    Job flows created within the last two months that are in one of the following states: RUNNING, WAITING, SHUTTING_DOWN, STARTING    Amazon EMR can return a maximum of 512 job flow descriptions.
    */
  def describeJobFlows(params: DescribeJobFlowsInput): Request[DescribeJobFlowsOutput, AWSError] = js.native
  def describeJobFlows(
    params: DescribeJobFlowsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobFlowsOutput, scala.Unit]
  ): Request[DescribeJobFlowsOutput, AWSError] = js.native
  
  /**
    * Provides details of a notebook execution.
    */
  def describeNotebookExecution(): Request[DescribeNotebookExecutionOutput, AWSError] = js.native
  def describeNotebookExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookExecutionOutput, scala.Unit]): Request[DescribeNotebookExecutionOutput, AWSError] = js.native
  /**
    * Provides details of a notebook execution.
    */
  def describeNotebookExecution(params: DescribeNotebookExecutionInput): Request[DescribeNotebookExecutionOutput, AWSError] = js.native
  def describeNotebookExecution(
    params: DescribeNotebookExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNotebookExecutionOutput, scala.Unit]
  ): Request[DescribeNotebookExecutionOutput, AWSError] = js.native
  
  /**
    * Provides EMR release label details, such as releases available the region where the API request is run, and the available applications for a specific EMR release label. Can also list EMR release versions that support a specified version of Spark.
    */
  def describeReleaseLabel(): Request[DescribeReleaseLabelOutput, AWSError] = js.native
  def describeReleaseLabel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReleaseLabelOutput, scala.Unit]): Request[DescribeReleaseLabelOutput, AWSError] = js.native
  /**
    * Provides EMR release label details, such as releases available the region where the API request is run, and the available applications for a specific EMR release label. Can also list EMR release versions that support a specified version of Spark.
    */
  def describeReleaseLabel(params: DescribeReleaseLabelInput): Request[DescribeReleaseLabelOutput, AWSError] = js.native
  def describeReleaseLabel(
    params: DescribeReleaseLabelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReleaseLabelOutput, scala.Unit]
  ): Request[DescribeReleaseLabelOutput, AWSError] = js.native
  
  /**
    * Provides the details of a security configuration by returning the configuration JSON.
    */
  def describeSecurityConfiguration(): Request[DescribeSecurityConfigurationOutput, AWSError] = js.native
  def describeSecurityConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityConfigurationOutput, scala.Unit]
  ): Request[DescribeSecurityConfigurationOutput, AWSError] = js.native
  /**
    * Provides the details of a security configuration by returning the configuration JSON.
    */
  def describeSecurityConfiguration(params: DescribeSecurityConfigurationInput): Request[DescribeSecurityConfigurationOutput, AWSError] = js.native
  def describeSecurityConfiguration(
    params: DescribeSecurityConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSecurityConfigurationOutput, scala.Unit]
  ): Request[DescribeSecurityConfigurationOutput, AWSError] = js.native
  
  /**
    * Provides more detail about the cluster step.
    */
  def describeStep(): Request[DescribeStepOutput, AWSError] = js.native
  def describeStep(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStepOutput, scala.Unit]): Request[DescribeStepOutput, AWSError] = js.native
  /**
    * Provides more detail about the cluster step.
    */
  def describeStep(params: DescribeStepInput): Request[DescribeStepOutput, AWSError] = js.native
  def describeStep(
    params: DescribeStepInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStepOutput, scala.Unit]
  ): Request[DescribeStepOutput, AWSError] = js.native
  
  /**
    * Returns details for the specified Amazon EMR Studio including ID, Name, VPC, Studio access URL, and so on.
    */
  def describeStudio(): Request[DescribeStudioOutput, AWSError] = js.native
  def describeStudio(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStudioOutput, scala.Unit]): Request[DescribeStudioOutput, AWSError] = js.native
  /**
    * Returns details for the specified Amazon EMR Studio including ID, Name, VPC, Studio access URL, and so on.
    */
  def describeStudio(params: DescribeStudioInput): Request[DescribeStudioOutput, AWSError] = js.native
  def describeStudio(
    params: DescribeStudioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStudioOutput, scala.Unit]
  ): Request[DescribeStudioOutput, AWSError] = js.native
  
  /**
    * Returns the auto-termination policy for an Amazon EMR cluster.
    */
  def getAutoTerminationPolicy(): Request[GetAutoTerminationPolicyOutput, AWSError] = js.native
  def getAutoTerminationPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetAutoTerminationPolicyOutput, scala.Unit]): Request[GetAutoTerminationPolicyOutput, AWSError] = js.native
  /**
    * Returns the auto-termination policy for an Amazon EMR cluster.
    */
  def getAutoTerminationPolicy(params: GetAutoTerminationPolicyInput): Request[GetAutoTerminationPolicyOutput, AWSError] = js.native
  def getAutoTerminationPolicy(
    params: GetAutoTerminationPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAutoTerminationPolicyOutput, scala.Unit]
  ): Request[GetAutoTerminationPolicyOutput, AWSError] = js.native
  
  /**
    * Returns the Amazon EMR block public access configuration for your Amazon Web Services account in the current Region. For more information see Configure Block Public Access for Amazon EMR in the Amazon EMR Management Guide.
    */
  def getBlockPublicAccessConfiguration(): Request[GetBlockPublicAccessConfigurationOutput, AWSError] = js.native
  def getBlockPublicAccessConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetBlockPublicAccessConfigurationOutput, scala.Unit]
  ): Request[GetBlockPublicAccessConfigurationOutput, AWSError] = js.native
  /**
    * Returns the Amazon EMR block public access configuration for your Amazon Web Services account in the current Region. For more information see Configure Block Public Access for Amazon EMR in the Amazon EMR Management Guide.
    */
  def getBlockPublicAccessConfiguration(params: GetBlockPublicAccessConfigurationInput): Request[GetBlockPublicAccessConfigurationOutput, AWSError] = js.native
  def getBlockPublicAccessConfiguration(
    params: GetBlockPublicAccessConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBlockPublicAccessConfigurationOutput, scala.Unit]
  ): Request[GetBlockPublicAccessConfigurationOutput, AWSError] = js.native
  
  /**
    * Fetches the attached managed scaling policy for an Amazon EMR cluster. 
    */
  def getManagedScalingPolicy(): Request[GetManagedScalingPolicyOutput, AWSError] = js.native
  def getManagedScalingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetManagedScalingPolicyOutput, scala.Unit]): Request[GetManagedScalingPolicyOutput, AWSError] = js.native
  /**
    * Fetches the attached managed scaling policy for an Amazon EMR cluster. 
    */
  def getManagedScalingPolicy(params: GetManagedScalingPolicyInput): Request[GetManagedScalingPolicyOutput, AWSError] = js.native
  def getManagedScalingPolicy(
    params: GetManagedScalingPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetManagedScalingPolicyOutput, scala.Unit]
  ): Request[GetManagedScalingPolicyOutput, AWSError] = js.native
  
  /**
    * Fetches mapping details for the specified Amazon EMR Studio and identity (user or group).
    */
  def getStudioSessionMapping(): Request[GetStudioSessionMappingOutput, AWSError] = js.native
  def getStudioSessionMapping(callback: js.Function2[/* err */ AWSError, /* data */ GetStudioSessionMappingOutput, scala.Unit]): Request[GetStudioSessionMappingOutput, AWSError] = js.native
  /**
    * Fetches mapping details for the specified Amazon EMR Studio and identity (user or group).
    */
  def getStudioSessionMapping(params: GetStudioSessionMappingInput): Request[GetStudioSessionMappingOutput, AWSError] = js.native
  def getStudioSessionMapping(
    params: GetStudioSessionMappingInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStudioSessionMappingOutput, scala.Unit]
  ): Request[GetStudioSessionMappingOutput, AWSError] = js.native
  
  /**
    * Provides information about the bootstrap actions associated with a cluster.
    */
  def listBootstrapActions(): Request[ListBootstrapActionsOutput, AWSError] = js.native
  def listBootstrapActions(callback: js.Function2[/* err */ AWSError, /* data */ ListBootstrapActionsOutput, scala.Unit]): Request[ListBootstrapActionsOutput, AWSError] = js.native
  /**
    * Provides information about the bootstrap actions associated with a cluster.
    */
  def listBootstrapActions(params: ListBootstrapActionsInput): Request[ListBootstrapActionsOutput, AWSError] = js.native
  def listBootstrapActions(
    params: ListBootstrapActionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBootstrapActionsOutput, scala.Unit]
  ): Request[ListBootstrapActionsOutput, AWSError] = js.native
  
  /**
    * Provides the status of all clusters visible to this Amazon Web Services account. Allows you to filter the list of clusters based on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters in unsorted order per call, but returns a marker to track the paging of the cluster list across multiple ListClusters calls.
    */
  def listClusters(): Request[ListClustersOutput, AWSError] = js.native
  def listClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListClustersOutput, scala.Unit]): Request[ListClustersOutput, AWSError] = js.native
  /**
    * Provides the status of all clusters visible to this Amazon Web Services account. Allows you to filter the list of clusters based on certain criteria; for example, filtering by cluster creation date and time or by status. This call returns a maximum of 50 clusters in unsorted order per call, but returns a marker to track the paging of the cluster list across multiple ListClusters calls.
    */
  def listClusters(params: ListClustersInput): Request[ListClustersOutput, AWSError] = js.native
  def listClusters(
    params: ListClustersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClustersOutput, scala.Unit]
  ): Request[ListClustersOutput, AWSError] = js.native
  
  /**
    * Lists all available details about the instance fleets in a cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  def listInstanceFleets(): Request[ListInstanceFleetsOutput, AWSError] = js.native
  def listInstanceFleets(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceFleetsOutput, scala.Unit]): Request[ListInstanceFleetsOutput, AWSError] = js.native
  /**
    * Lists all available details about the instance fleets in a cluster.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  def listInstanceFleets(params: ListInstanceFleetsInput): Request[ListInstanceFleetsOutput, AWSError] = js.native
  def listInstanceFleets(
    params: ListInstanceFleetsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceFleetsOutput, scala.Unit]
  ): Request[ListInstanceFleetsOutput, AWSError] = js.native
  
  /**
    * Provides all available details about the instance groups in a cluster.
    */
  def listInstanceGroups(): Request[ListInstanceGroupsOutput, AWSError] = js.native
  def listInstanceGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceGroupsOutput, scala.Unit]): Request[ListInstanceGroupsOutput, AWSError] = js.native
  /**
    * Provides all available details about the instance groups in a cluster.
    */
  def listInstanceGroups(params: ListInstanceGroupsInput): Request[ListInstanceGroupsOutput, AWSError] = js.native
  def listInstanceGroups(
    params: ListInstanceGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstanceGroupsOutput, scala.Unit]
  ): Request[ListInstanceGroupsOutput, AWSError] = js.native
  
  /**
    * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
    */
  def listInstances(): Request[ListInstancesOutput, AWSError] = js.native
  def listInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesOutput, scala.Unit]): Request[ListInstancesOutput, AWSError] = js.native
  /**
    * Provides information for all active EC2 instances and EC2 instances terminated in the last 30 days, up to a maximum of 2,000. EC2 instances in any of the following states are considered active: AWAITING_FULFILLMENT, PROVISIONING, BOOTSTRAPPING, RUNNING.
    */
  def listInstances(params: ListInstancesInput): Request[ListInstancesOutput, AWSError] = js.native
  def listInstances(
    params: ListInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInstancesOutput, scala.Unit]
  ): Request[ListInstancesOutput, AWSError] = js.native
  
  /**
    * Provides summaries of all notebook executions. You can filter the list based on multiple criteria such as status, time range, and editor id. Returns a maximum of 50 notebook executions and a marker to track the paging of a longer notebook execution list across multiple ListNotebookExecution calls.
    */
  def listNotebookExecutions(): Request[ListNotebookExecutionsOutput, AWSError] = js.native
  def listNotebookExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookExecutionsOutput, scala.Unit]): Request[ListNotebookExecutionsOutput, AWSError] = js.native
  /**
    * Provides summaries of all notebook executions. You can filter the list based on multiple criteria such as status, time range, and editor id. Returns a maximum of 50 notebook executions and a marker to track the paging of a longer notebook execution list across multiple ListNotebookExecution calls.
    */
  def listNotebookExecutions(params: ListNotebookExecutionsInput): Request[ListNotebookExecutionsOutput, AWSError] = js.native
  def listNotebookExecutions(
    params: ListNotebookExecutionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNotebookExecutionsOutput, scala.Unit]
  ): Request[ListNotebookExecutionsOutput, AWSError] = js.native
  
  /**
    * Retrieves release labels of EMR services in the region where the API is called.
    */
  def listReleaseLabels(): Request[ListReleaseLabelsOutput, AWSError] = js.native
  def listReleaseLabels(callback: js.Function2[/* err */ AWSError, /* data */ ListReleaseLabelsOutput, scala.Unit]): Request[ListReleaseLabelsOutput, AWSError] = js.native
  /**
    * Retrieves release labels of EMR services in the region where the API is called.
    */
  def listReleaseLabels(params: ListReleaseLabelsInput): Request[ListReleaseLabelsOutput, AWSError] = js.native
  def listReleaseLabels(
    params: ListReleaseLabelsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReleaseLabelsOutput, scala.Unit]
  ): Request[ListReleaseLabelsOutput, AWSError] = js.native
  
  /**
    * Lists all the security configurations visible to this account, providing their creation dates and times, and their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListSecurityConfigurations calls.
    */
  def listSecurityConfigurations(): Request[ListSecurityConfigurationsOutput, AWSError] = js.native
  def listSecurityConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityConfigurationsOutput, scala.Unit]
  ): Request[ListSecurityConfigurationsOutput, AWSError] = js.native
  /**
    * Lists all the security configurations visible to this account, providing their creation dates and times, and their names. This call returns a maximum of 50 clusters per call, but returns a marker to track the paging of the cluster list across multiple ListSecurityConfigurations calls.
    */
  def listSecurityConfigurations(params: ListSecurityConfigurationsInput): Request[ListSecurityConfigurationsOutput, AWSError] = js.native
  def listSecurityConfigurations(
    params: ListSecurityConfigurationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSecurityConfigurationsOutput, scala.Unit]
  ): Request[ListSecurityConfigurationsOutput, AWSError] = js.native
  
  /**
    * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request or filter by StepStates. You can specify a maximum of 10 stepIDs. The CLI automatically paginates results to return a list greater than 50 steps. To return more than 50 steps using the CLI, specify a Marker, which is a pagination token that indicates the next set of steps to retrieve.
    */
  def listSteps(): Request[ListStepsOutput, AWSError] = js.native
  def listSteps(callback: js.Function2[/* err */ AWSError, /* data */ ListStepsOutput, scala.Unit]): Request[ListStepsOutput, AWSError] = js.native
  /**
    * Provides a list of steps for the cluster in reverse order unless you specify stepIds with the request or filter by StepStates. You can specify a maximum of 10 stepIDs. The CLI automatically paginates results to return a list greater than 50 steps. To return more than 50 steps using the CLI, specify a Marker, which is a pagination token that indicates the next set of steps to retrieve.
    */
  def listSteps(params: ListStepsInput): Request[ListStepsOutput, AWSError] = js.native
  def listSteps(
    params: ListStepsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStepsOutput, scala.Unit]
  ): Request[ListStepsOutput, AWSError] = js.native
  
  /**
    * Returns a list of all user or group session mappings for the Amazon EMR Studio specified by StudioId.
    */
  def listStudioSessionMappings(): Request[ListStudioSessionMappingsOutput, AWSError] = js.native
  def listStudioSessionMappings(callback: js.Function2[/* err */ AWSError, /* data */ ListStudioSessionMappingsOutput, scala.Unit]): Request[ListStudioSessionMappingsOutput, AWSError] = js.native
  /**
    * Returns a list of all user or group session mappings for the Amazon EMR Studio specified by StudioId.
    */
  def listStudioSessionMappings(params: ListStudioSessionMappingsInput): Request[ListStudioSessionMappingsOutput, AWSError] = js.native
  def listStudioSessionMappings(
    params: ListStudioSessionMappingsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStudioSessionMappingsOutput, scala.Unit]
  ): Request[ListStudioSessionMappingsOutput, AWSError] = js.native
  
  /**
    * Returns a list of all Amazon EMR Studios associated with the Amazon Web Services account. The list includes details such as ID, Studio Access URL, and creation time for each Studio.
    */
  def listStudios(): Request[ListStudiosOutput, AWSError] = js.native
  def listStudios(callback: js.Function2[/* err */ AWSError, /* data */ ListStudiosOutput, scala.Unit]): Request[ListStudiosOutput, AWSError] = js.native
  /**
    * Returns a list of all Amazon EMR Studios associated with the Amazon Web Services account. The list includes details such as ID, Studio Access URL, and creation time for each Studio.
    */
  def listStudios(params: ListStudiosInput): Request[ListStudiosOutput, AWSError] = js.native
  def listStudios(
    params: ListStudiosInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStudiosOutput, scala.Unit]
  ): Request[ListStudiosOutput, AWSError] = js.native
  
  /**
    * Modifies the number of steps that can be executed concurrently for the cluster specified using ClusterID.
    */
  def modifyCluster(): Request[ModifyClusterOutput, AWSError] = js.native
  def modifyCluster(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterOutput, scala.Unit]): Request[ModifyClusterOutput, AWSError] = js.native
  /**
    * Modifies the number of steps that can be executed concurrently for the cluster specified using ClusterID.
    */
  def modifyCluster(params: ModifyClusterInput): Request[ModifyClusterOutput, AWSError] = js.native
  def modifyCluster(
    params: ModifyClusterInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClusterOutput, scala.Unit]
  ): Request[ModifyClusterOutput, AWSError] = js.native
  
  /**
    * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  def modifyInstanceFleet(): Request[js.Object, AWSError] = js.native
  def modifyInstanceFleet(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Modifies the target On-Demand and target Spot capacities for the instance fleet with the specified InstanceFleetID within the cluster specified using ClusterID. The call either succeeds or fails atomically.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  def modifyInstanceFleet(params: ModifyInstanceFleetInput): Request[js.Object, AWSError] = js.native
  def modifyInstanceFleet(
    params: ModifyInstanceFleetInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target instance count for the group and the instance group ID. The call will either succeed or fail atomically.
    */
  def modifyInstanceGroups(): Request[js.Object, AWSError] = js.native
  def modifyInstanceGroups(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * ModifyInstanceGroups modifies the number of nodes and configuration settings of an instance group. The input parameters include the new target instance count for the group and the instance group ID. The call will either succeed or fail atomically.
    */
  def modifyInstanceGroups(params: ModifyInstanceGroupsInput): Request[js.Object, AWSError] = js.native
  def modifyInstanceGroups(
    params: ModifyInstanceGroupsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric.
    */
  def putAutoScalingPolicy(): Request[PutAutoScalingPolicyOutput, AWSError] = js.native
  def putAutoScalingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutAutoScalingPolicyOutput, scala.Unit]): Request[PutAutoScalingPolicyOutput, AWSError] = js.native
  /**
    * Creates or updates an automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric.
    */
  def putAutoScalingPolicy(params: PutAutoScalingPolicyInput): Request[PutAutoScalingPolicyOutput, AWSError] = js.native
  def putAutoScalingPolicy(
    params: PutAutoScalingPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAutoScalingPolicyOutput, scala.Unit]
  ): Request[PutAutoScalingPolicyOutput, AWSError] = js.native
  
  /**
    *  Auto-termination is supported in Amazon EMR versions 5.30.0 and 6.1.0 and later. For more information, see Using an auto-termination policy.  Creates or updates an auto-termination policy for an Amazon EMR cluster. An auto-termination policy defines the amount of idle time in seconds after which a cluster automatically terminates. For alternative cluster termination options, see Control cluster termination.
    */
  def putAutoTerminationPolicy(): Request[PutAutoTerminationPolicyOutput, AWSError] = js.native
  def putAutoTerminationPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutAutoTerminationPolicyOutput, scala.Unit]): Request[PutAutoTerminationPolicyOutput, AWSError] = js.native
  /**
    *  Auto-termination is supported in Amazon EMR versions 5.30.0 and 6.1.0 and later. For more information, see Using an auto-termination policy.  Creates or updates an auto-termination policy for an Amazon EMR cluster. An auto-termination policy defines the amount of idle time in seconds after which a cluster automatically terminates. For alternative cluster termination options, see Control cluster termination.
    */
  def putAutoTerminationPolicy(params: PutAutoTerminationPolicyInput): Request[PutAutoTerminationPolicyOutput, AWSError] = js.native
  def putAutoTerminationPolicy(
    params: PutAutoTerminationPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAutoTerminationPolicyOutput, scala.Unit]
  ): Request[PutAutoTerminationPolicyOutput, AWSError] = js.native
  
  /**
    * Creates or updates an Amazon EMR block public access configuration for your Amazon Web Services account in the current Region. For more information see Configure Block Public Access for Amazon EMR in the Amazon EMR Management Guide.
    */
  def putBlockPublicAccessConfiguration(): Request[PutBlockPublicAccessConfigurationOutput, AWSError] = js.native
  def putBlockPublicAccessConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutBlockPublicAccessConfigurationOutput, scala.Unit]
  ): Request[PutBlockPublicAccessConfigurationOutput, AWSError] = js.native
  /**
    * Creates or updates an Amazon EMR block public access configuration for your Amazon Web Services account in the current Region. For more information see Configure Block Public Access for Amazon EMR in the Amazon EMR Management Guide.
    */
  def putBlockPublicAccessConfiguration(params: PutBlockPublicAccessConfigurationInput): Request[PutBlockPublicAccessConfigurationOutput, AWSError] = js.native
  def putBlockPublicAccessConfiguration(
    params: PutBlockPublicAccessConfigurationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutBlockPublicAccessConfigurationOutput, scala.Unit]
  ): Request[PutBlockPublicAccessConfigurationOutput, AWSError] = js.native
  
  /**
    * Creates or updates a managed scaling policy for an Amazon EMR cluster. The managed scaling policy defines the limits for resources, such as EC2 instances that can be added or terminated from a cluster. The policy only applies to the core and task nodes. The master node cannot be scaled after initial configuration. 
    */
  def putManagedScalingPolicy(): Request[PutManagedScalingPolicyOutput, AWSError] = js.native
  def putManagedScalingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutManagedScalingPolicyOutput, scala.Unit]): Request[PutManagedScalingPolicyOutput, AWSError] = js.native
  /**
    * Creates or updates a managed scaling policy for an Amazon EMR cluster. The managed scaling policy defines the limits for resources, such as EC2 instances that can be added or terminated from a cluster. The policy only applies to the core and task nodes. The master node cannot be scaled after initial configuration. 
    */
  def putManagedScalingPolicy(params: PutManagedScalingPolicyInput): Request[PutManagedScalingPolicyOutput, AWSError] = js.native
  def putManagedScalingPolicy(
    params: PutManagedScalingPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutManagedScalingPolicyOutput, scala.Unit]
  ): Request[PutManagedScalingPolicyOutput, AWSError] = js.native
  
  /**
    * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
    */
  def removeAutoScalingPolicy(): Request[RemoveAutoScalingPolicyOutput, AWSError] = js.native
  def removeAutoScalingPolicy(callback: js.Function2[/* err */ AWSError, /* data */ RemoveAutoScalingPolicyOutput, scala.Unit]): Request[RemoveAutoScalingPolicyOutput, AWSError] = js.native
  /**
    * Removes an automatic scaling policy from a specified instance group within an EMR cluster.
    */
  def removeAutoScalingPolicy(params: RemoveAutoScalingPolicyInput): Request[RemoveAutoScalingPolicyOutput, AWSError] = js.native
  def removeAutoScalingPolicy(
    params: RemoveAutoScalingPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveAutoScalingPolicyOutput, scala.Unit]
  ): Request[RemoveAutoScalingPolicyOutput, AWSError] = js.native
  
  /**
    * Removes an auto-termination policy from an Amazon EMR cluster.
    */
  def removeAutoTerminationPolicy(): Request[RemoveAutoTerminationPolicyOutput, AWSError] = js.native
  def removeAutoTerminationPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveAutoTerminationPolicyOutput, scala.Unit]
  ): Request[RemoveAutoTerminationPolicyOutput, AWSError] = js.native
  /**
    * Removes an auto-termination policy from an Amazon EMR cluster.
    */
  def removeAutoTerminationPolicy(params: RemoveAutoTerminationPolicyInput): Request[RemoveAutoTerminationPolicyOutput, AWSError] = js.native
  def removeAutoTerminationPolicy(
    params: RemoveAutoTerminationPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveAutoTerminationPolicyOutput, scala.Unit]
  ): Request[RemoveAutoTerminationPolicyOutput, AWSError] = js.native
  
  /**
    *  Removes a managed scaling policy from a specified EMR cluster. 
    */
  def removeManagedScalingPolicy(): Request[RemoveManagedScalingPolicyOutput, AWSError] = js.native
  def removeManagedScalingPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveManagedScalingPolicyOutput, scala.Unit]
  ): Request[RemoveManagedScalingPolicyOutput, AWSError] = js.native
  /**
    *  Removes a managed scaling policy from a specified EMR cluster. 
    */
  def removeManagedScalingPolicy(params: RemoveManagedScalingPolicyInput): Request[RemoveManagedScalingPolicyOutput, AWSError] = js.native
  def removeManagedScalingPolicy(
    params: RemoveManagedScalingPolicyInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveManagedScalingPolicyOutput, scala.Unit]
  ): Request[RemoveManagedScalingPolicyOutput, AWSError] = js.native
  
  /**
    * Removes tags from an Amazon EMR resource, such as a cluster or Amazon EMR Studio. Tags make it easier to associate resources in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.  The following example removes the stack tag with value Prod from a cluster:
    */
  def removeTags(): Request[RemoveTagsOutput, AWSError] = js.native
  def removeTags(callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsOutput, scala.Unit]): Request[RemoveTagsOutput, AWSError] = js.native
  /**
    * Removes tags from an Amazon EMR resource, such as a cluster or Amazon EMR Studio. Tags make it easier to associate resources in various ways, such as grouping clusters to track your Amazon EMR resource allocation costs. For more information, see Tag Clusters.  The following example removes the stack tag with value Prod from a cluster:
    */
  def removeTags(params: RemoveTagsInput): Request[RemoveTagsOutput, AWSError] = js.native
  def removeTags(
    params: RemoveTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveTagsOutput, scala.Unit]
  ): Request[RemoveTagsOutput, AWSError] = js.native
  
  /**
    * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the WAITING state rather than shutting down after the steps have completed.  For additional protection, you can set the JobFlowInstancesConfig TerminationProtected parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user intervention, or in the event of a job flow error. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. For long running clusters, we recommend that you periodically store your results.  The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not both. 
    */
  def runJobFlow(): Request[RunJobFlowOutput, AWSError] = js.native
  def runJobFlow(callback: js.Function2[/* err */ AWSError, /* data */ RunJobFlowOutput, scala.Unit]): Request[RunJobFlowOutput, AWSError] = js.native
  /**
    * RunJobFlow creates and starts running a new cluster (job flow). The cluster runs the steps specified. After the steps complete, the cluster stops and the HDFS partition is lost. To prevent loss of data, configure the last step of the job flow to store results in Amazon S3. If the JobFlowInstancesConfig KeepJobFlowAliveWhenNoSteps parameter is set to TRUE, the cluster transitions to the WAITING state rather than shutting down after the steps have completed.  For additional protection, you can set the JobFlowInstancesConfig TerminationProtected parameter to TRUE to lock the cluster and prevent it from being terminated by API call, user intervention, or in the event of a job flow error. A maximum of 256 steps are allowed in each job flow. If your cluster is long-running (such as a Hive data warehouse) or complex, you may require more than 256 steps to process your data. You can bypass the 256-step limitation in various ways, including using the SSH shell to connect to the master node and submitting queries directly to the software running on the master node, such as Hive and Hadoop. For more information on how to do this, see Add More than 256 Steps to a Cluster in the Amazon EMR Management Guide. For long running clusters, we recommend that you periodically store your results.  The instance fleets configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. The RunJobFlow request can contain InstanceFleets parameters or InstanceGroups parameters, but not both. 
    */
  def runJobFlow(params: RunJobFlowInput): Request[RunJobFlowOutput, AWSError] = js.native
  def runJobFlow(
    params: RunJobFlowInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RunJobFlowOutput, scala.Unit]
  ): Request[RunJobFlowOutput, AWSError] = js.native
  
  /**
    * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.  SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that in the event of an error, the instances persist so that you can recover any data stored in their ephemeral instance storage.  To terminate a cluster that has been locked by setting SetTerminationProtection to true, you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to false.   For more information, seeManaging Cluster Termination in the Amazon EMR Management Guide. 
    */
  def setTerminationProtection(): Request[js.Object, AWSError] = js.native
  def setTerminationProtection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * SetTerminationProtection locks a cluster (job flow) so the EC2 instances in the cluster cannot be terminated by user intervention, an API call, or in the event of a job-flow error. The cluster still terminates upon successful completion of the job flow. Calling SetTerminationProtection on a cluster is similar to calling the Amazon EC2 DisableAPITermination API on all EC2 instances in a cluster.  SetTerminationProtection is used to prevent accidental termination of a cluster and to ensure that in the event of an error, the instances persist so that you can recover any data stored in their ephemeral instance storage.  To terminate a cluster that has been locked by setting SetTerminationProtection to true, you must first unlock the job flow by a subsequent call to SetTerminationProtection in which you set the value to false.   For more information, seeManaging Cluster Termination in the Amazon EMR Management Guide. 
    */
  def setTerminationProtection(params: SetTerminationProtectionInput): Request[js.Object, AWSError] = js.native
  def setTerminationProtection(
    params: SetTerminationProtectionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  The SetVisibleToAllUsers parameter is no longer supported. Your cluster may be visible to all users in your account. To restrict cluster access using an IAM policy, see Identity and Access Management for EMR.   Sets the Cluster$VisibleToAllUsers value for an EMR cluster. When true, IAM principals in the Amazon Web Services account can perform EMR cluster actions that their IAM policies allow. When false, only the IAM principal that created the cluster and the Amazon Web Services account root user can perform EMR actions on the cluster, regardless of IAM permissions policies attached to other IAM principals. This action works on running clusters. When you create a cluster, use the RunJobFlowInput$VisibleToAllUsers parameter. For more information, see Understanding the EMR Cluster VisibleToAllUsers Setting in the Amazon EMRManagement Guide.
    */
  def setVisibleToAllUsers(): Request[js.Object, AWSError] = js.native
  def setVisibleToAllUsers(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  The SetVisibleToAllUsers parameter is no longer supported. Your cluster may be visible to all users in your account. To restrict cluster access using an IAM policy, see Identity and Access Management for EMR.   Sets the Cluster$VisibleToAllUsers value for an EMR cluster. When true, IAM principals in the Amazon Web Services account can perform EMR cluster actions that their IAM policies allow. When false, only the IAM principal that created the cluster and the Amazon Web Services account root user can perform EMR actions on the cluster, regardless of IAM permissions policies attached to other IAM principals. This action works on running clusters. When you create a cluster, use the RunJobFlowInput$VisibleToAllUsers parameter. For more information, see Understanding the EMR Cluster VisibleToAllUsers Setting in the Amazon EMRManagement Guide.
    */
  def setVisibleToAllUsers(params: SetVisibleToAllUsersInput): Request[js.Object, AWSError] = js.native
  def setVisibleToAllUsers(
    params: SetVisibleToAllUsersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a notebook execution.
    */
  def startNotebookExecution(): Request[StartNotebookExecutionOutput, AWSError] = js.native
  def startNotebookExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartNotebookExecutionOutput, scala.Unit]): Request[StartNotebookExecutionOutput, AWSError] = js.native
  /**
    * Starts a notebook execution.
    */
  def startNotebookExecution(params: StartNotebookExecutionInput): Request[StartNotebookExecutionOutput, AWSError] = js.native
  def startNotebookExecution(
    params: StartNotebookExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartNotebookExecutionOutput, scala.Unit]
  ): Request[StartNotebookExecutionOutput, AWSError] = js.native
  
  /**
    * Stops a notebook execution.
    */
  def stopNotebookExecution(): Request[js.Object, AWSError] = js.native
  def stopNotebookExecution(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a notebook execution.
    */
  def stopNotebookExecution(params: StopNotebookExecutionInput): Request[js.Object, AWSError] = js.native
  def stopNotebookExecution(
    params: StopNotebookExecutionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created. The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely terminate and release allocated resources, such as Amazon EC2 instances.
    */
  def terminateJobFlows(): Request[js.Object, AWSError] = js.native
  def terminateJobFlows(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * TerminateJobFlows shuts a list of clusters (job flows) down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which the cluster is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the cluster was created. The maximum number of clusters allowed is 10. The call to TerminateJobFlows is asynchronous. Depending on the configuration of the cluster, it may take up to 1-5 minutes for the cluster to completely terminate and release allocated resources, such as Amazon EC2 instances.
    */
  def terminateJobFlows(params: TerminateJobFlowsInput): Request[js.Object, AWSError] = js.native
  def terminateJobFlows(
    params: TerminateJobFlowsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an Amazon EMR Studio configuration, including attributes such as name, description, and subnets.
    */
  def updateStudio(): Request[js.Object, AWSError] = js.native
  def updateStudio(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an Amazon EMR Studio configuration, including attributes such as name, description, and subnets.
    */
  def updateStudio(params: UpdateStudioInput): Request[js.Object, AWSError] = js.native
  def updateStudio(
    params: UpdateStudioInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the session policy attached to the user or group for the specified Amazon EMR Studio.
    */
  def updateStudioSessionMapping(): Request[js.Object, AWSError] = js.native
  def updateStudioSessionMapping(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the session policy attached to the user or group for the specified Amazon EMR Studio.
    */
  def updateStudioSessionMapping(params: UpdateStudioSessionMappingInput): Request[js.Object, AWSError] = js.native
  def updateStudioSessionMapping(
    params: UpdateStudioSessionMappingInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, scala.Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Waits for the clusterRunning state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_clusterRunning(state: clusterRunning): Request[DescribeClusterOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterRunning(
    state: clusterRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterOutput, scala.Unit]
  ): Request[DescribeClusterOutput, AWSError] = js.native
  /**
    * Waits for the clusterRunning state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_clusterRunning(state: clusterRunning, params: DescribeClusterInputwaite): Request[DescribeClusterOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterRunning(
    state: clusterRunning,
    params: DescribeClusterInputwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterOutput, scala.Unit]
  ): Request[DescribeClusterOutput, AWSError] = js.native
  /**
    * Waits for the clusterTerminated state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_clusterTerminated(state: clusterTerminated): Request[DescribeClusterOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterTerminated(
    state: clusterTerminated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterOutput, scala.Unit]
  ): Request[DescribeClusterOutput, AWSError] = js.native
  /**
    * Waits for the clusterTerminated state by periodically calling the underlying EMR.describeClusteroperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_clusterTerminated(state: clusterTerminated, params: DescribeClusterInputwaite): Request[DescribeClusterOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterTerminated(
    state: clusterTerminated,
    params: DescribeClusterInputwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterOutput, scala.Unit]
  ): Request[DescribeClusterOutput, AWSError] = js.native
  /**
    * Waits for the stepComplete state by periodically calling the underlying EMR.describeStepoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_stepComplete(state: stepComplete): Request[DescribeStepOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stepComplete(
    state: stepComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStepOutput, scala.Unit]
  ): Request[DescribeStepOutput, AWSError] = js.native
  /**
    * Waits for the stepComplete state by periodically calling the underlying EMR.describeStepoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_stepComplete(state: stepComplete, params: DescribeStepInputwaiterWa): Request[DescribeStepOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_stepComplete(
    state: stepComplete,
    params: DescribeStepInputwaiterWa,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStepOutput, scala.Unit]
  ): Request[DescribeStepOutput, AWSError] = js.native
}
