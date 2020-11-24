package typings.awsSdk.smsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMS extends Service {
  
  @JSName("config")
  var config_SMS: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates an application. An application consists of one or more server groups. Each server group contain one or more servers.
    */
  def createApp(): Request[CreateAppResponse, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]): Request[CreateAppResponse, AWSError] = js.native
  /**
    * Creates an application. An application consists of one or more server groups. Each server group contain one or more servers.
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResponse, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResponse, Unit]
  ): Request[CreateAppResponse, AWSError] = js.native
  
  /**
    * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to AWS. Each replication run creates an Amazon Machine Image (AMI).
    */
  def createReplicationJob(): Request[CreateReplicationJobResponse, AWSError] = js.native
  def createReplicationJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationJobResponse, Unit]): Request[CreateReplicationJobResponse, AWSError] = js.native
  /**
    * Creates a replication job. The replication job schedules periodic replication runs to replicate your server to AWS. Each replication run creates an Amazon Machine Image (AMI).
    */
  def createReplicationJob(params: CreateReplicationJobRequest): Request[CreateReplicationJobResponse, AWSError] = js.native
  def createReplicationJob(
    params: CreateReplicationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReplicationJobResponse, Unit]
  ): Request[CreateReplicationJobResponse, AWSError] = js.native
  
  /**
    * Deletes the specified application. Optionally deletes the launched stack associated with the application and all AWS SMS replication jobs for servers in the application.
    */
  def deleteApp(): Request[DeleteAppResponse, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResponse, Unit]): Request[DeleteAppResponse, AWSError] = js.native
  /**
    * Deletes the specified application. Optionally deletes the launched stack associated with the application and all AWS SMS replication jobs for servers in the application.
    */
  def deleteApp(params: DeleteAppRequest): Request[DeleteAppResponse, AWSError] = js.native
  def deleteApp(
    params: DeleteAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppResponse, Unit]
  ): Request[DeleteAppResponse, AWSError] = js.native
  
  /**
    * Deletes the launch configuration for the specified application.
    */
  def deleteAppLaunchConfiguration(): Request[DeleteAppLaunchConfigurationResponse, AWSError] = js.native
  def deleteAppLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppLaunchConfigurationResponse, Unit]): Request[DeleteAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the launch configuration for the specified application.
    */
  def deleteAppLaunchConfiguration(params: DeleteAppLaunchConfigurationRequest): Request[DeleteAppLaunchConfigurationResponse, AWSError] = js.native
  def deleteAppLaunchConfiguration(
    params: DeleteAppLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppLaunchConfigurationResponse, Unit]
  ): Request[DeleteAppLaunchConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes the replication configuration for the specified application.
    */
  def deleteAppReplicationConfiguration(): Request[DeleteAppReplicationConfigurationResponse, AWSError] = js.native
  def deleteAppReplicationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppReplicationConfigurationResponse, Unit]
  ): Request[DeleteAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the replication configuration for the specified application.
    */
  def deleteAppReplicationConfiguration(params: DeleteAppReplicationConfigurationRequest): Request[DeleteAppReplicationConfigurationResponse, AWSError] = js.native
  def deleteAppReplicationConfiguration(
    params: DeleteAppReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppReplicationConfigurationResponse, Unit]
  ): Request[DeleteAppReplicationConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes the validation configuration for the specified application.
    */
  def deleteAppValidationConfiguration(): Request[DeleteAppValidationConfigurationResponse, AWSError] = js.native
  def deleteAppValidationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppValidationConfigurationResponse, Unit]
  ): Request[DeleteAppValidationConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the validation configuration for the specified application.
    */
  def deleteAppValidationConfiguration(params: DeleteAppValidationConfigurationRequest): Request[DeleteAppValidationConfigurationResponse, AWSError] = js.native
  def deleteAppValidationConfiguration(
    params: DeleteAppValidationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAppValidationConfigurationResponse, Unit]
  ): Request[DeleteAppValidationConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes the specified replication job. After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
    */
  def deleteReplicationJob(): Request[DeleteReplicationJobResponse, AWSError] = js.native
  def deleteReplicationJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationJobResponse, Unit]): Request[DeleteReplicationJobResponse, AWSError] = js.native
  /**
    * Deletes the specified replication job. After you delete a replication job, there are no further replication runs. AWS deletes the contents of the Amazon S3 bucket used to store AWS SMS artifacts. The AMIs created by the replication runs are not deleted.
    */
  def deleteReplicationJob(params: DeleteReplicationJobRequest): Request[DeleteReplicationJobResponse, AWSError] = js.native
  def deleteReplicationJob(
    params: DeleteReplicationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteReplicationJobResponse, Unit]
  ): Request[DeleteReplicationJobResponse, AWSError] = js.native
  
  /**
    * Deletes all servers from your server catalog.
    */
  def deleteServerCatalog(): Request[DeleteServerCatalogResponse, AWSError] = js.native
  def deleteServerCatalog(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServerCatalogResponse, Unit]): Request[DeleteServerCatalogResponse, AWSError] = js.native
  /**
    * Deletes all servers from your server catalog.
    */
  def deleteServerCatalog(params: DeleteServerCatalogRequest): Request[DeleteServerCatalogResponse, AWSError] = js.native
  def deleteServerCatalog(
    params: DeleteServerCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServerCatalogResponse, Unit]
  ): Request[DeleteServerCatalogResponse, AWSError] = js.native
  
  /**
    * Disassociates the specified connector from AWS SMS. After you disassociate a connector, it is no longer available to support replication jobs.
    */
  def disassociateConnector(): Request[DisassociateConnectorResponse, AWSError] = js.native
  def disassociateConnector(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateConnectorResponse, Unit]): Request[DisassociateConnectorResponse, AWSError] = js.native
  /**
    * Disassociates the specified connector from AWS SMS. After you disassociate a connector, it is no longer available to support replication jobs.
    */
  def disassociateConnector(params: DisassociateConnectorRequest): Request[DisassociateConnectorResponse, AWSError] = js.native
  def disassociateConnector(
    params: DisassociateConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateConnectorResponse, Unit]
  ): Request[DisassociateConnectorResponse, AWSError] = js.native
  
  /**
    * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateChangeSet(): Request[GenerateChangeSetResponse, AWSError] = js.native
  def generateChangeSet(callback: js.Function2[/* err */ AWSError, /* data */ GenerateChangeSetResponse, Unit]): Request[GenerateChangeSetResponse, AWSError] = js.native
  /**
    * Generates a target change set for a currently launched stack and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateChangeSet(params: GenerateChangeSetRequest): Request[GenerateChangeSetResponse, AWSError] = js.native
  def generateChangeSet(
    params: GenerateChangeSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateChangeSetResponse, Unit]
  ): Request[GenerateChangeSetResponse, AWSError] = js.native
  
  /**
    * Generates an AWS CloudFormation template based on the current launch configuration and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateTemplate(): Request[GenerateTemplateResponse, AWSError] = js.native
  def generateTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GenerateTemplateResponse, Unit]): Request[GenerateTemplateResponse, AWSError] = js.native
  /**
    * Generates an AWS CloudFormation template based on the current launch configuration and writes it to an Amazon S3 object in the customer’s Amazon S3 bucket.
    */
  def generateTemplate(params: GenerateTemplateRequest): Request[GenerateTemplateResponse, AWSError] = js.native
  def generateTemplate(
    params: GenerateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GenerateTemplateResponse, Unit]
  ): Request[GenerateTemplateResponse, AWSError] = js.native
  
  /**
    * Retrieve information about the specified application.
    */
  def getApp(): Request[GetAppResponse, AWSError] = js.native
  def getApp(callback: js.Function2[/* err */ AWSError, /* data */ GetAppResponse, Unit]): Request[GetAppResponse, AWSError] = js.native
  /**
    * Retrieve information about the specified application.
    */
  def getApp(params: GetAppRequest): Request[GetAppResponse, AWSError] = js.native
  def getApp(params: GetAppRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetAppResponse, Unit]): Request[GetAppResponse, AWSError] = js.native
  
  /**
    * Retrieves the application launch configuration associated with the specified application.
    */
  def getAppLaunchConfiguration(): Request[GetAppLaunchConfigurationResponse, AWSError] = js.native
  def getAppLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetAppLaunchConfigurationResponse, Unit]): Request[GetAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the application launch configuration associated with the specified application.
    */
  def getAppLaunchConfiguration(params: GetAppLaunchConfigurationRequest): Request[GetAppLaunchConfigurationResponse, AWSError] = js.native
  def getAppLaunchConfiguration(
    params: GetAppLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppLaunchConfigurationResponse, Unit]
  ): Request[GetAppLaunchConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves the application replication configuration associated with the specified application.
    */
  def getAppReplicationConfiguration(): Request[GetAppReplicationConfigurationResponse, AWSError] = js.native
  def getAppReplicationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppReplicationConfigurationResponse, Unit]
  ): Request[GetAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the application replication configuration associated with the specified application.
    */
  def getAppReplicationConfiguration(params: GetAppReplicationConfigurationRequest): Request[GetAppReplicationConfigurationResponse, AWSError] = js.native
  def getAppReplicationConfiguration(
    params: GetAppReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppReplicationConfigurationResponse, Unit]
  ): Request[GetAppReplicationConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a configuration for validating an application.
    */
  def getAppValidationConfiguration(): Request[GetAppValidationConfigurationResponse, AWSError] = js.native
  def getAppValidationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetAppValidationConfigurationResponse, Unit]): Request[GetAppValidationConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves information about a configuration for validating an application.
    */
  def getAppValidationConfiguration(params: GetAppValidationConfigurationRequest): Request[GetAppValidationConfigurationResponse, AWSError] = js.native
  def getAppValidationConfiguration(
    params: GetAppValidationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppValidationConfigurationResponse, Unit]
  ): Request[GetAppValidationConfigurationResponse, AWSError] = js.native
  
  /**
    * Retrieves output from validating an application.
    */
  def getAppValidationOutput(): Request[GetAppValidationOutputResponse, AWSError] = js.native
  def getAppValidationOutput(callback: js.Function2[/* err */ AWSError, /* data */ GetAppValidationOutputResponse, Unit]): Request[GetAppValidationOutputResponse, AWSError] = js.native
  /**
    * Retrieves output from validating an application.
    */
  def getAppValidationOutput(params: GetAppValidationOutputRequest): Request[GetAppValidationOutputResponse, AWSError] = js.native
  def getAppValidationOutput(
    params: GetAppValidationOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppValidationOutputResponse, Unit]
  ): Request[GetAppValidationOutputResponse, AWSError] = js.native
  
  /**
    * Describes the connectors registered with the AWS SMS.
    */
  def getConnectors(): Request[GetConnectorsResponse, AWSError] = js.native
  def getConnectors(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectorsResponse, Unit]): Request[GetConnectorsResponse, AWSError] = js.native
  /**
    * Describes the connectors registered with the AWS SMS.
    */
  def getConnectors(params: GetConnectorsRequest): Request[GetConnectorsResponse, AWSError] = js.native
  def getConnectors(
    params: GetConnectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectorsResponse, Unit]
  ): Request[GetConnectorsResponse, AWSError] = js.native
  
  /**
    * Describes the specified replication job or all of your replication jobs.
    */
  def getReplicationJobs(): Request[GetReplicationJobsResponse, AWSError] = js.native
  def getReplicationJobs(callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationJobsResponse, Unit]): Request[GetReplicationJobsResponse, AWSError] = js.native
  /**
    * Describes the specified replication job or all of your replication jobs.
    */
  def getReplicationJobs(params: GetReplicationJobsRequest): Request[GetReplicationJobsResponse, AWSError] = js.native
  def getReplicationJobs(
    params: GetReplicationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationJobsResponse, Unit]
  ): Request[GetReplicationJobsResponse, AWSError] = js.native
  
  /**
    * Describes the replication runs for the specified replication job.
    */
  def getReplicationRuns(): Request[GetReplicationRunsResponse, AWSError] = js.native
  def getReplicationRuns(callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationRunsResponse, Unit]): Request[GetReplicationRunsResponse, AWSError] = js.native
  /**
    * Describes the replication runs for the specified replication job.
    */
  def getReplicationRuns(params: GetReplicationRunsRequest): Request[GetReplicationRunsResponse, AWSError] = js.native
  def getReplicationRuns(
    params: GetReplicationRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReplicationRunsResponse, Unit]
  ): Request[GetReplicationRunsResponse, AWSError] = js.native
  
  /**
    * Describes the servers in your server catalog. Before you can describe your servers, you must import them using ImportServerCatalog.
    */
  def getServers(): Request[GetServersResponse, AWSError] = js.native
  def getServers(callback: js.Function2[/* err */ AWSError, /* data */ GetServersResponse, Unit]): Request[GetServersResponse, AWSError] = js.native
  /**
    * Describes the servers in your server catalog. Before you can describe your servers, you must import them using ImportServerCatalog.
    */
  def getServers(params: GetServersRequest): Request[GetServersResponse, AWSError] = js.native
  def getServers(
    params: GetServersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetServersResponse, Unit]
  ): Request[GetServersResponse, AWSError] = js.native
  
  /**
    * Allows application import from AWS Migration Hub.
    */
  def importAppCatalog(): Request[ImportAppCatalogResponse, AWSError] = js.native
  def importAppCatalog(callback: js.Function2[/* err */ AWSError, /* data */ ImportAppCatalogResponse, Unit]): Request[ImportAppCatalogResponse, AWSError] = js.native
  /**
    * Allows application import from AWS Migration Hub.
    */
  def importAppCatalog(params: ImportAppCatalogRequest): Request[ImportAppCatalogResponse, AWSError] = js.native
  def importAppCatalog(
    params: ImportAppCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportAppCatalogResponse, Unit]
  ): Request[ImportAppCatalogResponse, AWSError] = js.native
  
  /**
    * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers to import. This call returns immediately, but might take additional time to retrieve all the servers.
    */
  def importServerCatalog(): Request[ImportServerCatalogResponse, AWSError] = js.native
  def importServerCatalog(callback: js.Function2[/* err */ AWSError, /* data */ ImportServerCatalogResponse, Unit]): Request[ImportServerCatalogResponse, AWSError] = js.native
  /**
    * Gathers a complete list of on-premises servers. Connectors must be installed and monitoring all servers to import. This call returns immediately, but might take additional time to retrieve all the servers.
    */
  def importServerCatalog(params: ImportServerCatalogRequest): Request[ImportServerCatalogResponse, AWSError] = js.native
  def importServerCatalog(
    params: ImportServerCatalogRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportServerCatalogResponse, Unit]
  ): Request[ImportServerCatalogResponse, AWSError] = js.native
  
  /**
    * Launches the specified application as a stack in AWS CloudFormation.
    */
  def launchApp(): Request[LaunchAppResponse, AWSError] = js.native
  def launchApp(callback: js.Function2[/* err */ AWSError, /* data */ LaunchAppResponse, Unit]): Request[LaunchAppResponse, AWSError] = js.native
  /**
    * Launches the specified application as a stack in AWS CloudFormation.
    */
  def launchApp(params: LaunchAppRequest): Request[LaunchAppResponse, AWSError] = js.native
  def launchApp(
    params: LaunchAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LaunchAppResponse, Unit]
  ): Request[LaunchAppResponse, AWSError] = js.native
  
  /**
    * Retrieves summaries for all applications.
    */
  def listApps(): Request[ListAppsResponse, AWSError] = js.native
  def listApps(callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResponse, Unit]): Request[ListAppsResponse, AWSError] = js.native
  /**
    * Retrieves summaries for all applications.
    */
  def listApps(params: ListAppsRequest): Request[ListAppsResponse, AWSError] = js.native
  def listApps(
    params: ListAppsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppsResponse, Unit]
  ): Request[ListAppsResponse, AWSError] = js.native
  
  /**
    * Provides information to AWS SMS about whether application validation is successful.
    */
  def notifyAppValidationOutput(): Request[NotifyAppValidationOutputResponse, AWSError] = js.native
  def notifyAppValidationOutput(callback: js.Function2[/* err */ AWSError, /* data */ NotifyAppValidationOutputResponse, Unit]): Request[NotifyAppValidationOutputResponse, AWSError] = js.native
  /**
    * Provides information to AWS SMS about whether application validation is successful.
    */
  def notifyAppValidationOutput(params: NotifyAppValidationOutputRequest): Request[NotifyAppValidationOutputResponse, AWSError] = js.native
  def notifyAppValidationOutput(
    params: NotifyAppValidationOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ NotifyAppValidationOutputResponse, Unit]
  ): Request[NotifyAppValidationOutputResponse, AWSError] = js.native
  
  /**
    * Creates or updates the launch configuration for the specified application.
    */
  def putAppLaunchConfiguration(): Request[PutAppLaunchConfigurationResponse, AWSError] = js.native
  def putAppLaunchConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutAppLaunchConfigurationResponse, Unit]): Request[PutAppLaunchConfigurationResponse, AWSError] = js.native
  /**
    * Creates or updates the launch configuration for the specified application.
    */
  def putAppLaunchConfiguration(params: PutAppLaunchConfigurationRequest): Request[PutAppLaunchConfigurationResponse, AWSError] = js.native
  def putAppLaunchConfiguration(
    params: PutAppLaunchConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppLaunchConfigurationResponse, Unit]
  ): Request[PutAppLaunchConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates or updates the replication configuration for the specified application.
    */
  def putAppReplicationConfiguration(): Request[PutAppReplicationConfigurationResponse, AWSError] = js.native
  def putAppReplicationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppReplicationConfigurationResponse, Unit]
  ): Request[PutAppReplicationConfigurationResponse, AWSError] = js.native
  /**
    * Creates or updates the replication configuration for the specified application.
    */
  def putAppReplicationConfiguration(params: PutAppReplicationConfigurationRequest): Request[PutAppReplicationConfigurationResponse, AWSError] = js.native
  def putAppReplicationConfiguration(
    params: PutAppReplicationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppReplicationConfigurationResponse, Unit]
  ): Request[PutAppReplicationConfigurationResponse, AWSError] = js.native
  
  /**
    * Creates or updates a validation configuration for the specified application.
    */
  def putAppValidationConfiguration(): Request[PutAppValidationConfigurationResponse, AWSError] = js.native
  def putAppValidationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutAppValidationConfigurationResponse, Unit]): Request[PutAppValidationConfigurationResponse, AWSError] = js.native
  /**
    * Creates or updates a validation configuration for the specified application.
    */
  def putAppValidationConfiguration(params: PutAppValidationConfigurationRequest): Request[PutAppValidationConfigurationResponse, AWSError] = js.native
  def putAppValidationConfiguration(
    params: PutAppValidationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAppValidationConfigurationResponse, Unit]
  ): Request[PutAppValidationConfigurationResponse, AWSError] = js.native
  
  /**
    * Starts replicating the specified application by creating replication jobs for each server in the application.
    */
  def startAppReplication(): Request[StartAppReplicationResponse, AWSError] = js.native
  def startAppReplication(callback: js.Function2[/* err */ AWSError, /* data */ StartAppReplicationResponse, Unit]): Request[StartAppReplicationResponse, AWSError] = js.native
  /**
    * Starts replicating the specified application by creating replication jobs for each server in the application.
    */
  def startAppReplication(params: StartAppReplicationRequest): Request[StartAppReplicationResponse, AWSError] = js.native
  def startAppReplication(
    params: StartAppReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartAppReplicationResponse, Unit]
  ): Request[StartAppReplicationResponse, AWSError] = js.native
  
  /**
    * Starts an on-demand replication run for the specified application.
    */
  def startOnDemandAppReplication(): Request[StartOnDemandAppReplicationResponse, AWSError] = js.native
  def startOnDemandAppReplication(callback: js.Function2[/* err */ AWSError, /* data */ StartOnDemandAppReplicationResponse, Unit]): Request[StartOnDemandAppReplicationResponse, AWSError] = js.native
  /**
    * Starts an on-demand replication run for the specified application.
    */
  def startOnDemandAppReplication(params: StartOnDemandAppReplicationRequest): Request[StartOnDemandAppReplicationResponse, AWSError] = js.native
  def startOnDemandAppReplication(
    params: StartOnDemandAppReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOnDemandAppReplicationResponse, Unit]
  ): Request[StartOnDemandAppReplicationResponse, AWSError] = js.native
  
  /**
    * Starts an on-demand replication run for the specified replication job. This replication run starts immediately. This replication run is in addition to the ones already scheduled. There is a limit on the number of on-demand replications runs that you can request in a 24-hour period.
    */
  def startOnDemandReplicationRun(): Request[StartOnDemandReplicationRunResponse, AWSError] = js.native
  def startOnDemandReplicationRun(callback: js.Function2[/* err */ AWSError, /* data */ StartOnDemandReplicationRunResponse, Unit]): Request[StartOnDemandReplicationRunResponse, AWSError] = js.native
  /**
    * Starts an on-demand replication run for the specified replication job. This replication run starts immediately. This replication run is in addition to the ones already scheduled. There is a limit on the number of on-demand replications runs that you can request in a 24-hour period.
    */
  def startOnDemandReplicationRun(params: StartOnDemandReplicationRunRequest): Request[StartOnDemandReplicationRunResponse, AWSError] = js.native
  def startOnDemandReplicationRun(
    params: StartOnDemandReplicationRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartOnDemandReplicationRunResponse, Unit]
  ): Request[StartOnDemandReplicationRunResponse, AWSError] = js.native
  
  /**
    * Stops replicating the specified application by deleting the replication job for each server in the application.
    */
  def stopAppReplication(): Request[StopAppReplicationResponse, AWSError] = js.native
  def stopAppReplication(callback: js.Function2[/* err */ AWSError, /* data */ StopAppReplicationResponse, Unit]): Request[StopAppReplicationResponse, AWSError] = js.native
  /**
    * Stops replicating the specified application by deleting the replication job for each server in the application.
    */
  def stopAppReplication(params: StopAppReplicationRequest): Request[StopAppReplicationResponse, AWSError] = js.native
  def stopAppReplication(
    params: StopAppReplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopAppReplicationResponse, Unit]
  ): Request[StopAppReplicationResponse, AWSError] = js.native
  
  /**
    * Terminates the stack for the specified application.
    */
  def terminateApp(): Request[TerminateAppResponse, AWSError] = js.native
  def terminateApp(callback: js.Function2[/* err */ AWSError, /* data */ TerminateAppResponse, Unit]): Request[TerminateAppResponse, AWSError] = js.native
  /**
    * Terminates the stack for the specified application.
    */
  def terminateApp(params: TerminateAppRequest): Request[TerminateAppResponse, AWSError] = js.native
  def terminateApp(
    params: TerminateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateAppResponse, Unit]
  ): Request[TerminateAppResponse, AWSError] = js.native
  
  /**
    * Updates the specified application.
    */
  def updateApp(): Request[UpdateAppResponse, AWSError] = js.native
  def updateApp(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResponse, Unit]): Request[UpdateAppResponse, AWSError] = js.native
  /**
    * Updates the specified application.
    */
  def updateApp(params: UpdateAppRequest): Request[UpdateAppResponse, AWSError] = js.native
  def updateApp(
    params: UpdateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAppResponse, Unit]
  ): Request[UpdateAppResponse, AWSError] = js.native
  
  /**
    * Updates the specified settings for the specified replication job.
    */
  def updateReplicationJob(): Request[UpdateReplicationJobResponse, AWSError] = js.native
  def updateReplicationJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReplicationJobResponse, Unit]): Request[UpdateReplicationJobResponse, AWSError] = js.native
  /**
    * Updates the specified settings for the specified replication job.
    */
  def updateReplicationJob(params: UpdateReplicationJobRequest): Request[UpdateReplicationJobResponse, AWSError] = js.native
  def updateReplicationJob(
    params: UpdateReplicationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReplicationJobResponse, Unit]
  ): Request[UpdateReplicationJobResponse, AWSError] = js.native
}
