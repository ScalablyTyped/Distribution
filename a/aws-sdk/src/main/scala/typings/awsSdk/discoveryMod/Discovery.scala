package typings.awsSdk.discoveryMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Discovery extends Service {
  
  /**
    * Associates one or more configuration items with an application.
    */
  def associateConfigurationItemsToApplication(): Request[AssociateConfigurationItemsToApplicationResponse, AWSError] = js.native
  def associateConfigurationItemsToApplication(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateConfigurationItemsToApplicationResponse, 
      Unit
    ]
  ): Request[AssociateConfigurationItemsToApplicationResponse, AWSError] = js.native
  /**
    * Associates one or more configuration items with an application.
    */
  def associateConfigurationItemsToApplication(params: AssociateConfigurationItemsToApplicationRequest): Request[AssociateConfigurationItemsToApplicationResponse, AWSError] = js.native
  def associateConfigurationItemsToApplication(
    params: AssociateConfigurationItemsToApplicationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateConfigurationItemsToApplicationResponse, 
      Unit
    ]
  ): Request[AssociateConfigurationItemsToApplicationResponse, AWSError] = js.native
  
  /**
    * Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records that can identify servers or applications.  Amazon Web Services Application Discovery Service has built-in matching logic that will identify when discovered servers match existing entries that you've previously discovered, the information for the already-existing discovered server is updated. When you delete an import task that contains records that were used to match, the information in those matched records that comes from the deleted records will also be deleted.
    */
  def batchDeleteImportData(): Request[BatchDeleteImportDataResponse, AWSError] = js.native
  def batchDeleteImportData(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteImportDataResponse, Unit]): Request[BatchDeleteImportDataResponse, AWSError] = js.native
  /**
    * Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records that can identify servers or applications.  Amazon Web Services Application Discovery Service has built-in matching logic that will identify when discovered servers match existing entries that you've previously discovered, the information for the already-existing discovered server is updated. When you delete an import task that contains records that were used to match, the information in those matched records that comes from the deleted records will also be deleted.
    */
  def batchDeleteImportData(params: BatchDeleteImportDataRequest): Request[BatchDeleteImportDataResponse, AWSError] = js.native
  def batchDeleteImportData(
    params: BatchDeleteImportDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteImportDataResponse, Unit]
  ): Request[BatchDeleteImportDataResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Discovery: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an application with the given name and description.
    */
  def createApplication(): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Creates an application with the given name and description.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]
  ): Request[CreateApplicationResponse, AWSError] = js.native
  
  /**
    * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API accepts a list of multiple configuration items.  Do not store sensitive information (like personal data) in tags. 
    */
  def createTags(): Request[CreateTagsResponse, AWSError] = js.native
  def createTags(callback: js.Function2[/* err */ AWSError, /* data */ CreateTagsResponse, Unit]): Request[CreateTagsResponse, AWSError] = js.native
  /**
    * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API accepts a list of multiple configuration items.  Do not store sensitive information (like personal data) in tags. 
    */
  def createTags(params: CreateTagsRequest): Request[CreateTagsResponse, AWSError] = js.native
  def createTags(
    params: CreateTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTagsResponse, Unit]
  ): Request[CreateTagsResponse, AWSError] = js.native
  
  /**
    * Deletes a list of applications and their associations with configuration items.
    */
  def deleteApplications(): Request[DeleteApplicationsResponse, AWSError] = js.native
  def deleteApplications(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationsResponse, Unit]): Request[DeleteApplicationsResponse, AWSError] = js.native
  /**
    * Deletes a list of applications and their associations with configuration items.
    */
  def deleteApplications(params: DeleteApplicationsRequest): Request[DeleteApplicationsResponse, AWSError] = js.native
  def deleteApplications(
    params: DeleteApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationsResponse, Unit]
  ): Request[DeleteApplicationsResponse, AWSError] = js.native
  
  /**
    * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple configuration items.
    */
  def deleteTags(): Request[DeleteTagsResponse, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsResponse, Unit]): Request[DeleteTagsResponse, AWSError] = js.native
  /**
    * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple configuration items.
    */
  def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResponse, AWSError] = js.native
  def deleteTags(
    params: DeleteTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsResponse, Unit]
  ): Request[DeleteTagsResponse, AWSError] = js.native
  
  /**
    * Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user account can be listed if you call DescribeAgents as is without passing any parameters.
    */
  def describeAgents(): Request[DescribeAgentsResponse, AWSError] = js.native
  def describeAgents(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentsResponse, Unit]): Request[DescribeAgentsResponse, AWSError] = js.native
  /**
    * Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user account can be listed if you call DescribeAgents as is without passing any parameters.
    */
  def describeAgents(params: DescribeAgentsRequest): Request[DescribeAgentsResponse, AWSError] = js.native
  def describeAgents(
    params: DescribeAgentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentsResponse, Unit]
  ): Request[DescribeAgentsResponse, AWSError] = js.native
  
  /**
    * Retrieves attributes for a list of configuration item IDs.  All of the supplied IDs must be for the same asset type from one of the following:   server   application   process   connection   Output fields are specific to the asset type specified. For example, the output for a server configuration item includes a list of attributes about the server, such as host name, operating system, number of network cards, etc. For a complete list of outputs for each asset type, see Using the DescribeConfigurations Action in the Amazon Web Services Application Discovery Service User Guide. 
    */
  def describeConfigurations(): Request[DescribeConfigurationsResponse, AWSError] = js.native
  def describeConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationsResponse, Unit]): Request[DescribeConfigurationsResponse, AWSError] = js.native
  /**
    * Retrieves attributes for a list of configuration item IDs.  All of the supplied IDs must be for the same asset type from one of the following:   server   application   process   connection   Output fields are specific to the asset type specified. For example, the output for a server configuration item includes a list of attributes about the server, such as host name, operating system, number of network cards, etc. For a complete list of outputs for each asset type, see Using the DescribeConfigurations Action in the Amazon Web Services Application Discovery Service User Guide. 
    */
  def describeConfigurations(params: DescribeConfigurationsRequest): Request[DescribeConfigurationsResponse, AWSError] = js.native
  def describeConfigurations(
    params: DescribeConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationsResponse, Unit]
  ): Request[DescribeConfigurationsResponse, AWSError] = js.native
  
  /**
    * Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you call DescribeContinuousExports as is without passing any parameters.
    */
  def describeContinuousExports(): Request[DescribeContinuousExportsResponse, AWSError] = js.native
  def describeContinuousExports(callback: js.Function2[/* err */ AWSError, /* data */ DescribeContinuousExportsResponse, Unit]): Request[DescribeContinuousExportsResponse, AWSError] = js.native
  /**
    * Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you call DescribeContinuousExports as is without passing any parameters.
    */
  def describeContinuousExports(params: DescribeContinuousExportsRequest): Request[DescribeContinuousExportsResponse, AWSError] = js.native
  def describeContinuousExports(
    params: DescribeContinuousExportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContinuousExportsResponse, Unit]
  ): Request[DescribeContinuousExportsResponse, AWSError] = js.native
  
  /**
    *  DescribeExportConfigurations is deprecated. Use DescribeExportTasks, instead.
    */
  def describeExportConfigurations(): Request[DescribeExportConfigurationsResponse, AWSError] = js.native
  def describeExportConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportConfigurationsResponse, Unit]): Request[DescribeExportConfigurationsResponse, AWSError] = js.native
  /**
    *  DescribeExportConfigurations is deprecated. Use DescribeExportTasks, instead.
    */
  def describeExportConfigurations(params: DescribeExportConfigurationsRequest): Request[DescribeExportConfigurationsResponse, AWSError] = js.native
  def describeExportConfigurations(
    params: DescribeExportConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportConfigurationsResponse, Unit]
  ): Request[DescribeExportConfigurationsResponse, AWSError] = js.native
  
  /**
    * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
    */
  def describeExportTasks(): Request[DescribeExportTasksResponse, AWSError] = js.native
  def describeExportTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResponse, Unit]): Request[DescribeExportTasksResponse, AWSError] = js.native
  /**
    * Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.
    */
  def describeExportTasks(params: DescribeExportTasksRequest): Request[DescribeExportTasksResponse, AWSError] = js.native
  def describeExportTasks(
    params: DescribeExportTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportTasksResponse, Unit]
  ): Request[DescribeExportTasksResponse, AWSError] = js.native
  
  /**
    * Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object URL for the import file, and more.
    */
  def describeImportTasks(): Request[DescribeImportTasksResponse, AWSError] = js.native
  def describeImportTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImportTasksResponse, Unit]): Request[DescribeImportTasksResponse, AWSError] = js.native
  /**
    * Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object URL for the import file, and more.
    */
  def describeImportTasks(params: DescribeImportTasksRequest): Request[DescribeImportTasksResponse, AWSError] = js.native
  def describeImportTasks(
    params: DescribeImportTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImportTasksResponse, Unit]
  ): Request[DescribeImportTasksResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value, passed to the optional parameter filters. There are three valid tag filter names:   tagKey   tagValue   configurationId   Also, all configuration items associated with your user account that have tags can be listed if you call DescribeTags as is without passing any parameters.
    */
  def describeTags(): Request[DescribeTagsResponse, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResponse, Unit]): Request[DescribeTagsResponse, AWSError] = js.native
  /**
    * Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value, passed to the optional parameter filters. There are three valid tag filter names:   tagKey   tagValue   configurationId   Also, all configuration items associated with your user account that have tags can be listed if you call DescribeTags as is without passing any parameters.
    */
  def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResponse, AWSError] = js.native
  def describeTags(
    params: DescribeTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResponse, Unit]
  ): Request[DescribeTagsResponse, AWSError] = js.native
  
  /**
    * Disassociates one or more configuration items from an application.
    */
  def disassociateConfigurationItemsFromApplication(): Request[DisassociateConfigurationItemsFromApplicationResponse, AWSError] = js.native
  def disassociateConfigurationItemsFromApplication(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateConfigurationItemsFromApplicationResponse, 
      Unit
    ]
  ): Request[DisassociateConfigurationItemsFromApplicationResponse, AWSError] = js.native
  /**
    * Disassociates one or more configuration items from an application.
    */
  def disassociateConfigurationItemsFromApplication(params: DisassociateConfigurationItemsFromApplicationRequest): Request[DisassociateConfigurationItemsFromApplicationResponse, AWSError] = js.native
  def disassociateConfigurationItemsFromApplication(
    params: DisassociateConfigurationItemsFromApplicationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateConfigurationItemsFromApplicationResponse, 
      Unit
    ]
  ): Request[DisassociateConfigurationItemsFromApplicationResponse, AWSError] = js.native
  
  /**
    * Deprecated. Use StartExportTask instead. Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system performance. This API returns an export ID that you can query using the DescribeExportConfigurations API. The system imposes a limit of two configuration exports in six hours.
    */
  def exportConfigurations(): Request[ExportConfigurationsResponse, AWSError] = js.native
  def exportConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ExportConfigurationsResponse, Unit]): Request[ExportConfigurationsResponse, AWSError] = js.native
  
  /**
    * Retrieves a short summary of discovered assets. This API operation takes no request parameters and is called as is at the command prompt as shown in the example.
    */
  def getDiscoverySummary(): Request[GetDiscoverySummaryResponse, AWSError] = js.native
  def getDiscoverySummary(callback: js.Function2[/* err */ AWSError, /* data */ GetDiscoverySummaryResponse, Unit]): Request[GetDiscoverySummaryResponse, AWSError] = js.native
  /**
    * Retrieves a short summary of discovered assets. This API operation takes no request parameters and is called as is at the command prompt as shown in the example.
    */
  def getDiscoverySummary(params: GetDiscoverySummaryRequest): Request[GetDiscoverySummaryResponse, AWSError] = js.native
  def getDiscoverySummary(
    params: GetDiscoverySummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDiscoverySummaryResponse, Unit]
  ): Request[GetDiscoverySummaryResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of configuration items as specified by the value passed to the required parameter configurationType. Optional filtering may be applied to refine search results.
    */
  def listConfigurations(): Request[ListConfigurationsResponse, AWSError] = js.native
  def listConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationsResponse, Unit]): Request[ListConfigurationsResponse, AWSError] = js.native
  /**
    * Retrieves a list of configuration items as specified by the value passed to the required parameter configurationType. Optional filtering may be applied to refine search results.
    */
  def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse, AWSError] = js.native
  def listConfigurations(
    params: ListConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationsResponse, Unit]
  ): Request[ListConfigurationsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of servers that are one network hop away from a specified server.
    */
  def listServerNeighbors(): Request[ListServerNeighborsResponse, AWSError] = js.native
  def listServerNeighbors(callback: js.Function2[/* err */ AWSError, /* data */ ListServerNeighborsResponse, Unit]): Request[ListServerNeighborsResponse, AWSError] = js.native
  /**
    * Retrieves a list of servers that are one network hop away from a specified server.
    */
  def listServerNeighbors(params: ListServerNeighborsRequest): Request[ListServerNeighborsResponse, AWSError] = js.native
  def listServerNeighbors(
    params: ListServerNeighborsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServerNeighborsResponse, Unit]
  ): Request[ListServerNeighborsResponse, AWSError] = js.native
  
  /**
    * Start the continuous flow of agent's discovered data into Amazon Athena.
    */
  def startContinuousExport(): Request[StartContinuousExportResponse, AWSError] = js.native
  def startContinuousExport(callback: js.Function2[/* err */ AWSError, /* data */ StartContinuousExportResponse, Unit]): Request[StartContinuousExportResponse, AWSError] = js.native
  /**
    * Start the continuous flow of agent's discovered data into Amazon Athena.
    */
  def startContinuousExport(params: StartContinuousExportRequest): Request[StartContinuousExportResponse, AWSError] = js.native
  def startContinuousExport(
    params: StartContinuousExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartContinuousExportResponse, Unit]
  ): Request[StartContinuousExportResponse, AWSError] = js.native
  
  /**
    * Instructs the specified agents or connectors to start collecting data.
    */
  def startDataCollectionByAgentIds(): Request[StartDataCollectionByAgentIdsResponse, AWSError] = js.native
  def startDataCollectionByAgentIds(callback: js.Function2[/* err */ AWSError, /* data */ StartDataCollectionByAgentIdsResponse, Unit]): Request[StartDataCollectionByAgentIdsResponse, AWSError] = js.native
  /**
    * Instructs the specified agents or connectors to start collecting data.
    */
  def startDataCollectionByAgentIds(params: StartDataCollectionByAgentIdsRequest): Request[StartDataCollectionByAgentIdsResponse, AWSError] = js.native
  def startDataCollectionByAgentIds(
    params: StartDataCollectionByAgentIdsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDataCollectionByAgentIdsResponse, Unit]
  ): Request[StartDataCollectionByAgentIdsResponse, AWSError] = js.native
  
  /**
    *  Begins the export of discovered data to an S3 bucket.  If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by the identified Application Discovery Agent, including network, process, and performance details. A time range for exported agent data may be set by using startTime and endTime. Export of detailed agent data is limited to five concurrently running exports.   If you do not include an agentIds filter, summary data is exported that includes both Amazon Web Services Agentless Discovery Connector data and summary data from Amazon Web Services Discovery Agents. Export of summary data is limited to two exports per day. 
    */
  def startExportTask(): Request[StartExportTaskResponse, AWSError] = js.native
  def startExportTask(callback: js.Function2[/* err */ AWSError, /* data */ StartExportTaskResponse, Unit]): Request[StartExportTaskResponse, AWSError] = js.native
  /**
    *  Begins the export of discovered data to an S3 bucket.  If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by the identified Application Discovery Agent, including network, process, and performance details. A time range for exported agent data may be set by using startTime and endTime. Export of detailed agent data is limited to five concurrently running exports.   If you do not include an agentIds filter, summary data is exported that includes both Amazon Web Services Agentless Discovery Connector data and summary data from Amazon Web Services Discovery Agents. Export of summary data is limited to two exports per day. 
    */
  def startExportTask(params: StartExportTaskRequest): Request[StartExportTaskResponse, AWSError] = js.native
  def startExportTask(
    params: StartExportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartExportTaskResponse, Unit]
  ): Request[StartExportTaskResponse, AWSError] = js.native
  
  /**
    * Starts an import task, which allows you to import details of your on-premises environment directly into Amazon Web Services Migration Hub without having to use the Application Discovery Service (ADS) tools such as the Discovery Connector or Discovery Agent. This gives you the option to perform migration assessment and planning directly from your imported data, including the ability to group your devices as applications and track their migration status. To start an import request, do this:   Download the specially formatted comma separated value (CSV) import template, which you can find here: https://s3.us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv.   Fill out the template with your server and application data.   Upload your import file to an Amazon S3 bucket, and make a note of it's Object URL. Your import file must be in the CSV format.   Use the console or the StartImportTask command with the Amazon Web Services CLI or one of the Amazon Web Services SDKs to import the records from your file.   For more information, including step-by-step procedures, see Migration Hub Import in the Amazon Web Services Application Discovery Service User Guide.  There are limits to the number of import tasks you can create (and delete) in an Amazon Web Services account. For more information, see Amazon Web Services Application Discovery Service Limits in the Amazon Web Services Application Discovery Service User Guide. 
    */
  def startImportTask(): Request[StartImportTaskResponse, AWSError] = js.native
  def startImportTask(callback: js.Function2[/* err */ AWSError, /* data */ StartImportTaskResponse, Unit]): Request[StartImportTaskResponse, AWSError] = js.native
  /**
    * Starts an import task, which allows you to import details of your on-premises environment directly into Amazon Web Services Migration Hub without having to use the Application Discovery Service (ADS) tools such as the Discovery Connector or Discovery Agent. This gives you the option to perform migration assessment and planning directly from your imported data, including the ability to group your devices as applications and track their migration status. To start an import request, do this:   Download the specially formatted comma separated value (CSV) import template, which you can find here: https://s3.us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv.   Fill out the template with your server and application data.   Upload your import file to an Amazon S3 bucket, and make a note of it's Object URL. Your import file must be in the CSV format.   Use the console or the StartImportTask command with the Amazon Web Services CLI or one of the Amazon Web Services SDKs to import the records from your file.   For more information, including step-by-step procedures, see Migration Hub Import in the Amazon Web Services Application Discovery Service User Guide.  There are limits to the number of import tasks you can create (and delete) in an Amazon Web Services account. For more information, see Amazon Web Services Application Discovery Service Limits in the Amazon Web Services Application Discovery Service User Guide. 
    */
  def startImportTask(params: StartImportTaskRequest): Request[StartImportTaskResponse, AWSError] = js.native
  def startImportTask(
    params: StartImportTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImportTaskResponse, Unit]
  ): Request[StartImportTaskResponse, AWSError] = js.native
  
  /**
    * Stop the continuous flow of agent's discovered data into Amazon Athena.
    */
  def stopContinuousExport(): Request[StopContinuousExportResponse, AWSError] = js.native
  def stopContinuousExport(callback: js.Function2[/* err */ AWSError, /* data */ StopContinuousExportResponse, Unit]): Request[StopContinuousExportResponse, AWSError] = js.native
  /**
    * Stop the continuous flow of agent's discovered data into Amazon Athena.
    */
  def stopContinuousExport(params: StopContinuousExportRequest): Request[StopContinuousExportResponse, AWSError] = js.native
  def stopContinuousExport(
    params: StopContinuousExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopContinuousExportResponse, Unit]
  ): Request[StopContinuousExportResponse, AWSError] = js.native
  
  /**
    * Instructs the specified agents or connectors to stop collecting data.
    */
  def stopDataCollectionByAgentIds(): Request[StopDataCollectionByAgentIdsResponse, AWSError] = js.native
  def stopDataCollectionByAgentIds(callback: js.Function2[/* err */ AWSError, /* data */ StopDataCollectionByAgentIdsResponse, Unit]): Request[StopDataCollectionByAgentIdsResponse, AWSError] = js.native
  /**
    * Instructs the specified agents or connectors to stop collecting data.
    */
  def stopDataCollectionByAgentIds(params: StopDataCollectionByAgentIdsRequest): Request[StopDataCollectionByAgentIdsResponse, AWSError] = js.native
  def stopDataCollectionByAgentIds(
    params: StopDataCollectionByAgentIdsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDataCollectionByAgentIdsResponse, Unit]
  ): Request[StopDataCollectionByAgentIdsResponse, AWSError] = js.native
  
  /**
    * Updates metadata about an application.
    */
  def updateApplication(): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]): Request[UpdateApplicationResponse, AWSError] = js.native
  /**
    * Updates metadata about an application.
    */
  def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]
  ): Request[UpdateApplicationResponse, AWSError] = js.native
}
