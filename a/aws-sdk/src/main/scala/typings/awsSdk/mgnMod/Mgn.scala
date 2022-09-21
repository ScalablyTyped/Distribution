package typings.awsSdk.mgnMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mgn extends Service {
  
  /**
    * Allows the user to set the SourceServer.LifeCycle.state property for specific Source Server IDs to one of the following: READY_FOR_TEST or READY_FOR_CUTOVER. This command only works if the Source Server is already launchable (dataReplicationInfo.lagDuration is not null.)
    */
  def changeServerLifeCycleState(): Request[SourceServer, AWSError] = js.native
  def changeServerLifeCycleState(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Allows the user to set the SourceServer.LifeCycle.state property for specific Source Server IDs to one of the following: READY_FOR_TEST or READY_FOR_CUTOVER. This command only works if the Source Server is already launchable (dataReplicationInfo.lagDuration is not null.)
    */
  def changeServerLifeCycleState(params: ChangeServerLifeCycleStateRequest): Request[SourceServer, AWSError] = js.native
  def changeServerLifeCycleState(
    params: ChangeServerLifeCycleStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
  
  @JSName("config")
  var config_Mgn: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def createLaunchConfigurationTemplate(): Request[LaunchConfigurationTemplate, AWSError] = js.native
  def createLaunchConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfigurationTemplate, Unit]): Request[LaunchConfigurationTemplate, AWSError] = js.native
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def createLaunchConfigurationTemplate(params: CreateLaunchConfigurationTemplateRequest): Request[LaunchConfigurationTemplate, AWSError] = js.native
  def createLaunchConfigurationTemplate(
    params: CreateLaunchConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfigurationTemplate, Unit]
  ): Request[LaunchConfigurationTemplate, AWSError] = js.native
  
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def createReplicationConfigurationTemplate(): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  def createReplicationConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfigurationTemplate, Unit]): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def createReplicationConfigurationTemplate(params: CreateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  def createReplicationConfigurationTemplate(
    params: CreateReplicationConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfigurationTemplate, Unit]
  ): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  
  /**
    * Deletes a single Job by ID.
    */
  def deleteJob(): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]): Request[DeleteJobResponse, AWSError] = js.native
  /**
    * Deletes a single Job by ID.
    */
  def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]
  ): Request[DeleteJobResponse, AWSError] = js.native
  
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def deleteLaunchConfigurationTemplate(): Request[DeleteLaunchConfigurationTemplateResponse, AWSError] = js.native
  def deleteLaunchConfigurationTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchConfigurationTemplateResponse, Unit]
  ): Request[DeleteLaunchConfigurationTemplateResponse, AWSError] = js.native
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def deleteLaunchConfigurationTemplate(params: DeleteLaunchConfigurationTemplateRequest): Request[DeleteLaunchConfigurationTemplateResponse, AWSError] = js.native
  def deleteLaunchConfigurationTemplate(
    params: DeleteLaunchConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLaunchConfigurationTemplateResponse, Unit]
  ): Request[DeleteLaunchConfigurationTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a single Replication Configuration Template by ID
    */
  def deleteReplicationConfigurationTemplate(): Request[DeleteReplicationConfigurationTemplateResponse, AWSError] = js.native
  def deleteReplicationConfigurationTemplate(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationConfigurationTemplateResponse, Unit]
  ): Request[DeleteReplicationConfigurationTemplateResponse, AWSError] = js.native
  /**
    * Deletes a single Replication Configuration Template by ID
    */
  def deleteReplicationConfigurationTemplate(params: DeleteReplicationConfigurationTemplateRequest): Request[DeleteReplicationConfigurationTemplateResponse, AWSError] = js.native
  def deleteReplicationConfigurationTemplate(
    params: DeleteReplicationConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationConfigurationTemplateResponse, Unit]
  ): Request[DeleteReplicationConfigurationTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a single source server by ID.
    */
  def deleteSourceServer(): Request[DeleteSourceServerResponse, AWSError] = js.native
  def deleteSourceServer(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceServerResponse, Unit]): Request[DeleteSourceServerResponse, AWSError] = js.native
  /**
    * Deletes a single source server by ID.
    */
  def deleteSourceServer(params: DeleteSourceServerRequest): Request[DeleteSourceServerResponse, AWSError] = js.native
  def deleteSourceServer(
    params: DeleteSourceServerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSourceServerResponse, Unit]
  ): Request[DeleteSourceServerResponse, AWSError] = js.native
  
  /**
    * Deletes a given vCenter client by ID.
    */
  def deleteVcenterClient(): Request[js.Object, AWSError] = js.native
  def deleteVcenterClient(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a given vCenter client by ID.
    */
  def deleteVcenterClient(params: DeleteVcenterClientRequest): Request[js.Object, AWSError] = js.native
  def deleteVcenterClient(
    params: DeleteVcenterClientRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves detailed job log items with paging.
    */
  def describeJobLogItems(): Request[DescribeJobLogItemsResponse, AWSError] = js.native
  def describeJobLogItems(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobLogItemsResponse, Unit]): Request[DescribeJobLogItemsResponse, AWSError] = js.native
  /**
    * Retrieves detailed job log items with paging.
    */
  def describeJobLogItems(params: DescribeJobLogItemsRequest): Request[DescribeJobLogItemsResponse, AWSError] = js.native
  def describeJobLogItems(
    params: DescribeJobLogItemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobLogItemsResponse, Unit]
  ): Request[DescribeJobLogItemsResponse, AWSError] = js.native
  
  /**
    * Returns a list of Jobs. Use the JobsID and fromDate and toData filters to limit which jobs are returned. The response is sorted by creationDataTime - latest date first. Jobs are normally created by the StartTest, StartCutover, and TerminateTargetInstances APIs. Jobs are also created by DiagnosticLaunch and TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant support tickets.
    */
  def describeJobs(): Request[DescribeJobsResponse, AWSError] = js.native
  def describeJobs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobsResponse, Unit]): Request[DescribeJobsResponse, AWSError] = js.native
  /**
    * Returns a list of Jobs. Use the JobsID and fromDate and toData filters to limit which jobs are returned. The response is sorted by creationDataTime - latest date first. Jobs are normally created by the StartTest, StartCutover, and TerminateTargetInstances APIs. Jobs are also created by DiagnosticLaunch and TerminateDiagnosticInstances, which are APIs available only to *Support* and only used in response to relevant support tickets.
    */
  def describeJobs(params: DescribeJobsRequest): Request[DescribeJobsResponse, AWSError] = js.native
  def describeJobs(
    params: DescribeJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobsResponse, Unit]
  ): Request[DescribeJobsResponse, AWSError] = js.native
  
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def describeLaunchConfigurationTemplates(): Request[DescribeLaunchConfigurationTemplatesResponse, AWSError] = js.native
  def describeLaunchConfigurationTemplates(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLaunchConfigurationTemplatesResponse, Unit]
  ): Request[DescribeLaunchConfigurationTemplatesResponse, AWSError] = js.native
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def describeLaunchConfigurationTemplates(params: DescribeLaunchConfigurationTemplatesRequest): Request[DescribeLaunchConfigurationTemplatesResponse, AWSError] = js.native
  def describeLaunchConfigurationTemplates(
    params: DescribeLaunchConfigurationTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLaunchConfigurationTemplatesResponse, Unit]
  ): Request[DescribeLaunchConfigurationTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
    */
  def describeReplicationConfigurationTemplates(): Request[DescribeReplicationConfigurationTemplatesResponse, AWSError] = js.native
  def describeReplicationConfigurationTemplates(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationConfigurationTemplatesResponse, 
      Unit
    ]
  ): Request[DescribeReplicationConfigurationTemplatesResponse, AWSError] = js.native
  /**
    * Lists all ReplicationConfigurationTemplates, filtered by Source Server IDs.
    */
  def describeReplicationConfigurationTemplates(params: DescribeReplicationConfigurationTemplatesRequest): Request[DescribeReplicationConfigurationTemplatesResponse, AWSError] = js.native
  def describeReplicationConfigurationTemplates(
    params: DescribeReplicationConfigurationTemplatesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeReplicationConfigurationTemplatesResponse, 
      Unit
    ]
  ): Request[DescribeReplicationConfigurationTemplatesResponse, AWSError] = js.native
  
  /**
    * Retrieves all SourceServers or multiple SourceServers by ID.
    */
  def describeSourceServers(): Request[DescribeSourceServersResponse, AWSError] = js.native
  def describeSourceServers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSourceServersResponse, Unit]): Request[DescribeSourceServersResponse, AWSError] = js.native
  /**
    * Retrieves all SourceServers or multiple SourceServers by ID.
    */
  def describeSourceServers(params: DescribeSourceServersRequest): Request[DescribeSourceServersResponse, AWSError] = js.native
  def describeSourceServers(
    params: DescribeSourceServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSourceServersResponse, Unit]
  ): Request[DescribeSourceServersResponse, AWSError] = js.native
  
  /**
    * Returns a list of the installed vCenter clients.
    */
  def describeVcenterClients(): Request[DescribeVcenterClientsResponse, AWSError] = js.native
  def describeVcenterClients(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVcenterClientsResponse, Unit]): Request[DescribeVcenterClientsResponse, AWSError] = js.native
  /**
    * Returns a list of the installed vCenter clients.
    */
  def describeVcenterClients(params: DescribeVcenterClientsRequest): Request[DescribeVcenterClientsResponse, AWSError] = js.native
  def describeVcenterClients(
    params: DescribeVcenterClientsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVcenterClientsResponse, Unit]
  ): Request[DescribeVcenterClientsResponse, AWSError] = js.native
  
  /**
    * Disconnects specific Source Servers from Application Migration Service. Data replication is stopped immediately. All AWS resources created by Application Migration Service for enabling the replication of these source servers will be terminated / deleted within 90 minutes. Launched Test or Cutover instances will NOT be terminated. If the agent on the source server has not been prevented from communicating with the Application Migration Service service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
    */
  def disconnectFromService(): Request[SourceServer, AWSError] = js.native
  def disconnectFromService(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Disconnects specific Source Servers from Application Migration Service. Data replication is stopped immediately. All AWS resources created by Application Migration Service for enabling the replication of these source servers will be terminated / deleted within 90 minutes. Launched Test or Cutover instances will NOT be terminated. If the agent on the source server has not been prevented from communicating with the Application Migration Service service, then it will receive a command to uninstall itself (within approximately 10 minutes). The following properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be set to DISCONNECTED; The totalStorageBytes property for each of dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
    */
  def disconnectFromService(params: DisconnectFromServiceRequest): Request[SourceServer, AWSError] = js.native
  def disconnectFromService(
    params: DisconnectFromServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
  
  /**
    * Finalizes the cutover immediately for specific Source Servers. All AWS resources created by Application Migration Service for enabling the replication of these source servers will be terminated / deleted within 90 minutes. Launched Test or Cutover instances will NOT be terminated. The AWS Replication Agent will receive a command to uninstall itself (within 10 minutes). The following properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be changed to DISCONNECTED; The SourceServer.lifeCycle.state will be changed to CUTOVER; The totalStorageBytes property fo each of dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
    */
  def finalizeCutover(): Request[SourceServer, AWSError] = js.native
  def finalizeCutover(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Finalizes the cutover immediately for specific Source Servers. All AWS resources created by Application Migration Service for enabling the replication of these source servers will be terminated / deleted within 90 minutes. Launched Test or Cutover instances will NOT be terminated. The AWS Replication Agent will receive a command to uninstall itself (within 10 minutes). The following properties of the SourceServer will be changed immediately: dataReplicationInfo.dataReplicationState will be changed to DISCONNECTED; The SourceServer.lifeCycle.state will be changed to CUTOVER; The totalStorageBytes property fo each of dataReplicationInfo.replicatedDisks will be set to zero; dataReplicationInfo.lagDuration and dataReplicationInfo.lagDuration will be nullified.
    */
  def finalizeCutover(params: FinalizeCutoverRequest): Request[SourceServer, AWSError] = js.native
  def finalizeCutover(
    params: FinalizeCutoverRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
  
  /**
    * Lists all LaunchConfigurations available, filtered by Source Server IDs.
    */
  def getLaunchConfiguration(): Request[LaunchConfiguration, AWSError] = js.native
  def getLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfiguration, Unit]): Request[LaunchConfiguration, AWSError] = js.native
  /**
    * Lists all LaunchConfigurations available, filtered by Source Server IDs.
    */
  def getLaunchConfiguration(params: GetLaunchConfigurationRequest): Request[LaunchConfiguration, AWSError] = js.native
  def getLaunchConfiguration(
    params: GetLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfiguration, Unit]
  ): Request[LaunchConfiguration, AWSError] = js.native
  
  /**
    * Lists all ReplicationConfigurations, filtered by Source Server ID.
    */
  def getReplicationConfiguration(): Request[ReplicationConfiguration, AWSError] = js.native
  def getReplicationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfiguration, Unit]): Request[ReplicationConfiguration, AWSError] = js.native
  /**
    * Lists all ReplicationConfigurations, filtered by Source Server ID.
    */
  def getReplicationConfiguration(params: GetReplicationConfigurationRequest): Request[ReplicationConfiguration, AWSError] = js.native
  def getReplicationConfiguration(
    params: GetReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfiguration, Unit]
  ): Request[ReplicationConfiguration, AWSError] = js.native
  
  /**
    * Initialize Application Migration Service.
    */
  def initializeService(): Request[InitializeServiceResponse, AWSError] = js.native
  def initializeService(callback: js.Function2[/* err */ AWSError, /* data */ InitializeServiceResponse, Unit]): Request[InitializeServiceResponse, AWSError] = js.native
  /**
    * Initialize Application Migration Service.
    */
  def initializeService(params: InitializeServiceRequest): Request[InitializeServiceResponse, AWSError] = js.native
  def initializeService(
    params: InitializeServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitializeServiceResponse, Unit]
  ): Request[InitializeServiceResponse, AWSError] = js.native
  
  /**
    * List all tags for your Application Migration Service resources.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List all tags for your Application Migration Service resources.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Archives specific Source Servers by setting the SourceServer.isArchived property to true for specified SourceServers by ID. This command only works for SourceServers with a lifecycle. state which equals DISCONNECTED or CUTOVER.
    */
  def markAsArchived(): Request[SourceServer, AWSError] = js.native
  def markAsArchived(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Archives specific Source Servers by setting the SourceServer.isArchived property to true for specified SourceServers by ID. This command only works for SourceServers with a lifecycle. state which equals DISCONNECTED or CUTOVER.
    */
  def markAsArchived(params: MarkAsArchivedRequest): Request[SourceServer, AWSError] = js.native
  def markAsArchived(
    params: MarkAsArchivedRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
  
  /**
    * Causes the data replication initiation sequence to begin immediately upon next Handshake for specified SourceServer IDs, regardless of when the previous initiation started. This command will not work if the SourceServer is not stalled or is in a DISCONNECTED or STOPPED state.
    */
  def retryDataReplication(): Request[SourceServer, AWSError] = js.native
  def retryDataReplication(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Causes the data replication initiation sequence to begin immediately upon next Handshake for specified SourceServer IDs, regardless of when the previous initiation started. This command will not work if the SourceServer is not stalled or is in a DISCONNECTED or STOPPED state.
    */
  def retryDataReplication(params: RetryDataReplicationRequest): Request[SourceServer, AWSError] = js.native
  def retryDataReplication(
    params: RetryDataReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
  
  /**
    * Launches a Cutover Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property is StartCutover and changes the SourceServer.lifeCycle.state property to CUTTING_OVER.
    */
  def startCutover(): Request[StartCutoverResponse, AWSError] = js.native
  def startCutover(callback: js.Function2[/* err */ AWSError, /* data */ StartCutoverResponse, Unit]): Request[StartCutoverResponse, AWSError] = js.native
  /**
    * Launches a Cutover Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property is StartCutover and changes the SourceServer.lifeCycle.state property to CUTTING_OVER.
    */
  def startCutover(params: StartCutoverRequest): Request[StartCutoverResponse, AWSError] = js.native
  def startCutover(
    params: StartCutoverRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCutoverResponse, Unit]
  ): Request[StartCutoverResponse, AWSError] = js.native
  
  /**
    * Starts replication for SNAPSHOT_SHIPPING agents.
    */
  def startReplication(): Request[SourceServer, AWSError] = js.native
  def startReplication(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Starts replication for SNAPSHOT_SHIPPING agents.
    */
  def startReplication(params: StartReplicationRequest): Request[SourceServer, AWSError] = js.native
  def startReplication(
    params: StartReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
  
  /**
    * Launches a Test Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property is StartTest and changes the SourceServer.lifeCycle.state property to TESTING.
    */
  def startTest(): Request[StartTestResponse, AWSError] = js.native
  def startTest(callback: js.Function2[/* err */ AWSError, /* data */ StartTestResponse, Unit]): Request[StartTestResponse, AWSError] = js.native
  /**
    * Launches a Test Instance for specific Source Servers. This command starts a LAUNCH job whose initiatedBy property is StartTest and changes the SourceServer.lifeCycle.state property to TESTING.
    */
  def startTest(params: StartTestRequest): Request[StartTestResponse, AWSError] = js.native
  def startTest(
    params: StartTestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTestResponse, Unit]
  ): Request[StartTestResponse, AWSError] = js.native
  
  /**
    * Adds or overwrites only the specified tags for the specified Application Migration Service resource or resources. When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of 50 tags. Each tag consists of a key and optional value.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or overwrites only the specified tags for the specified Application Migration Service resource or resources. When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of 50 tags. Each tag consists of a key and optional value.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a job that terminates specific launched EC2 Test and Cutover instances. This command will not work for any Source Server with a lifecycle.state of TESTING, CUTTING_OVER, or CUTOVER.
    */
  def terminateTargetInstances(): Request[TerminateTargetInstancesResponse, AWSError] = js.native
  def terminateTargetInstances(callback: js.Function2[/* err */ AWSError, /* data */ TerminateTargetInstancesResponse, Unit]): Request[TerminateTargetInstancesResponse, AWSError] = js.native
  /**
    * Starts a job that terminates specific launched EC2 Test and Cutover instances. This command will not work for any Source Server with a lifecycle.state of TESTING, CUTTING_OVER, or CUTOVER.
    */
  def terminateTargetInstances(params: TerminateTargetInstancesRequest): Request[TerminateTargetInstancesResponse, AWSError] = js.native
  def terminateTargetInstances(
    params: TerminateTargetInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateTargetInstancesResponse, Unit]
  ): Request[TerminateTargetInstancesResponse, AWSError] = js.native
  
  /**
    * Deletes the specified set of tags from the specified set of Application Migration Service resources.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified set of tags from the specified set of Application Migration Service resources.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates multiple LaunchConfigurations by Source Server ID.
    */
  def updateLaunchConfiguration(): Request[LaunchConfiguration, AWSError] = js.native
  def updateLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfiguration, Unit]): Request[LaunchConfiguration, AWSError] = js.native
  /**
    * Updates multiple LaunchConfigurations by Source Server ID.
    */
  def updateLaunchConfiguration(params: UpdateLaunchConfigurationRequest): Request[LaunchConfiguration, AWSError] = js.native
  def updateLaunchConfiguration(
    params: UpdateLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfiguration, Unit]
  ): Request[LaunchConfiguration, AWSError] = js.native
  
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def updateLaunchConfigurationTemplate(): Request[LaunchConfigurationTemplate, AWSError] = js.native
  def updateLaunchConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfigurationTemplate, Unit]): Request[LaunchConfigurationTemplate, AWSError] = js.native
  /**
    * Creates a new ReplicationConfigurationTemplate.
    */
  def updateLaunchConfigurationTemplate(params: UpdateLaunchConfigurationTemplateRequest): Request[LaunchConfigurationTemplate, AWSError] = js.native
  def updateLaunchConfigurationTemplate(
    params: UpdateLaunchConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchConfigurationTemplate, Unit]
  ): Request[LaunchConfigurationTemplate, AWSError] = js.native
  
  /**
    * Allows you to update multiple ReplicationConfigurations by Source Server ID.
    */
  def updateReplicationConfiguration(): Request[ReplicationConfiguration, AWSError] = js.native
  def updateReplicationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfiguration, Unit]): Request[ReplicationConfiguration, AWSError] = js.native
  /**
    * Allows you to update multiple ReplicationConfigurations by Source Server ID.
    */
  def updateReplicationConfiguration(params: UpdateReplicationConfigurationRequest): Request[ReplicationConfiguration, AWSError] = js.native
  def updateReplicationConfiguration(
    params: UpdateReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfiguration, Unit]
  ): Request[ReplicationConfiguration, AWSError] = js.native
  
  /**
    * Updates multiple ReplicationConfigurationTemplates by ID.
    */
  def updateReplicationConfigurationTemplate(): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  def updateReplicationConfigurationTemplate(callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfigurationTemplate, Unit]): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  /**
    * Updates multiple ReplicationConfigurationTemplates by ID.
    */
  def updateReplicationConfigurationTemplate(params: UpdateReplicationConfigurationTemplateRequest): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  def updateReplicationConfigurationTemplate(
    params: UpdateReplicationConfigurationTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReplicationConfigurationTemplate, Unit]
  ): Request[ReplicationConfigurationTemplate, AWSError] = js.native
  
  /**
    * Allows you to change between the AGENT_BASED replication type and the SNAPSHOT_SHIPPING replication type.
    */
  def updateSourceServerReplicationType(): Request[SourceServer, AWSError] = js.native
  def updateSourceServerReplicationType(callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]): Request[SourceServer, AWSError] = js.native
  /**
    * Allows you to change between the AGENT_BASED replication type and the SNAPSHOT_SHIPPING replication type.
    */
  def updateSourceServerReplicationType(params: UpdateSourceServerReplicationTypeRequest): Request[SourceServer, AWSError] = js.native
  def updateSourceServerReplicationType(
    params: UpdateSourceServerReplicationTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SourceServer, Unit]
  ): Request[SourceServer, AWSError] = js.native
}
