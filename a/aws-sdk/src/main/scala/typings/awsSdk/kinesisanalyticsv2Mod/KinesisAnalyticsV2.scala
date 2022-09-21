package typings.awsSdk.kinesisanalyticsv2Mod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisAnalyticsV2 extends Service {
  
  /**
    * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
    */
  def addApplicationCloudWatchLoggingOption(): Request[AddApplicationCloudWatchLoggingOptionResponse, AWSError] = js.native
  def addApplicationCloudWatchLoggingOption(
    callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationCloudWatchLoggingOptionResponse, Unit]
  ): Request[AddApplicationCloudWatchLoggingOptionResponse, AWSError] = js.native
  /**
    * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
    */
  def addApplicationCloudWatchLoggingOption(params: AddApplicationCloudWatchLoggingOptionRequest): Request[AddApplicationCloudWatchLoggingOptionResponse, AWSError] = js.native
  def addApplicationCloudWatchLoggingOption(
    params: AddApplicationCloudWatchLoggingOptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationCloudWatchLoggingOptionResponse, Unit]
  ): Request[AddApplicationCloudWatchLoggingOptionResponse, AWSError] = js.native
  
  /**
    *  Adds a streaming source to your SQL-based Kinesis Data Analytics application.  You can add a streaming source when you create an application, or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. 
    */
  def addApplicationInput(): Request[AddApplicationInputResponse, AWSError] = js.native
  def addApplicationInput(callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationInputResponse, Unit]): Request[AddApplicationInputResponse, AWSError] = js.native
  /**
    *  Adds a streaming source to your SQL-based Kinesis Data Analytics application.  You can add a streaming source when you create an application, or you can use this operation to add a streaming source after you create an application. For more information, see CreateApplication. Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version. 
    */
  def addApplicationInput(params: AddApplicationInputRequest): Request[AddApplicationInputResponse, AWSError] = js.native
  def addApplicationInput(
    params: AddApplicationInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationInputResponse, Unit]
  ): Request[AddApplicationInputResponse, AWSError] = js.native
  
  /**
    * Adds an InputProcessingConfiguration to a SQL-based Kinesis Data Analytics application. An input processor pre-processes records on the input stream before the application's SQL code executes. Currently, the only input processor available is Amazon Lambda.
    */
  def addApplicationInputProcessingConfiguration(): Request[AddApplicationInputProcessingConfigurationResponse, AWSError] = js.native
  def addApplicationInputProcessingConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AddApplicationInputProcessingConfigurationResponse, 
      Unit
    ]
  ): Request[AddApplicationInputProcessingConfigurationResponse, AWSError] = js.native
  /**
    * Adds an InputProcessingConfiguration to a SQL-based Kinesis Data Analytics application. An input processor pre-processes records on the input stream before the application's SQL code executes. Currently, the only input processor available is Amazon Lambda.
    */
  def addApplicationInputProcessingConfiguration(params: AddApplicationInputProcessingConfigurationRequest): Request[AddApplicationInputProcessingConfigurationResponse, AWSError] = js.native
  def addApplicationInputProcessingConfiguration(
    params: AddApplicationInputProcessingConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AddApplicationInputProcessingConfigurationResponse, 
      Unit
    ]
  ): Request[AddApplicationInputProcessingConfigurationResponse, AWSError] = js.native
  
  /**
    * Adds an external destination to your SQL-based Kinesis Data Analytics application. If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an Amazon Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors.   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.
    */
  def addApplicationOutput(): Request[AddApplicationOutputResponse, AWSError] = js.native
  def addApplicationOutput(callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationOutputResponse, Unit]): Request[AddApplicationOutputResponse, AWSError] = js.native
  /**
    * Adds an external destination to your SQL-based Kinesis Data Analytics application. If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an Amazon Lambda function), you add the relevant configuration to your application using this operation. You can configure one or more outputs for your application. Each output configuration maps an in-application stream and an external destination.  You can use one of the output configurations to deliver data from your in-application error stream to an external destination so that you can analyze the errors.   Any configuration update, including adding a streaming source using this operation, results in a new version of the application. You can use the DescribeApplication operation to find the current application version.
    */
  def addApplicationOutput(params: AddApplicationOutputRequest): Request[AddApplicationOutputResponse, AWSError] = js.native
  def addApplicationOutput(
    params: AddApplicationOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationOutputResponse, Unit]
  ): Request[AddApplicationOutputResponse, AWSError] = js.native
  
  /**
    * Adds a reference data source to an existing SQL-based Kinesis Data Analytics application. Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in an Amazon S3 object maps to columns in the resulting in-application table.
    */
  def addApplicationReferenceDataSource(): Request[AddApplicationReferenceDataSourceResponse, AWSError] = js.native
  def addApplicationReferenceDataSource(
    callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationReferenceDataSourceResponse, Unit]
  ): Request[AddApplicationReferenceDataSourceResponse, AWSError] = js.native
  /**
    * Adds a reference data source to an existing SQL-based Kinesis Data Analytics application. Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table within your application. In the request, you provide the source (S3 bucket name and object key name), name of the in-application table to create, and the necessary mapping information that describes how data in an Amazon S3 object maps to columns in the resulting in-application table.
    */
  def addApplicationReferenceDataSource(params: AddApplicationReferenceDataSourceRequest): Request[AddApplicationReferenceDataSourceResponse, AWSError] = js.native
  def addApplicationReferenceDataSource(
    params: AddApplicationReferenceDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationReferenceDataSourceResponse, Unit]
  ): Request[AddApplicationReferenceDataSourceResponse, AWSError] = js.native
  
  /**
    * Adds a Virtual Private Cloud (VPC) configuration to the application. Applications can use VPCs to store and access resources securely. Note the following about VPC configurations for Kinesis Data Analytics applications:   VPC configurations are not supported for SQL applications.   When a VPC is added to a Kinesis Data Analytics application, the application can no longer be accessed from the Internet directly. To enable Internet access to the application, add an Internet gateway to your VPC.  
    */
  def addApplicationVpcConfiguration(): Request[AddApplicationVpcConfigurationResponse, AWSError] = js.native
  def addApplicationVpcConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationVpcConfigurationResponse, Unit]
  ): Request[AddApplicationVpcConfigurationResponse, AWSError] = js.native
  /**
    * Adds a Virtual Private Cloud (VPC) configuration to the application. Applications can use VPCs to store and access resources securely. Note the following about VPC configurations for Kinesis Data Analytics applications:   VPC configurations are not supported for SQL applications.   When a VPC is added to a Kinesis Data Analytics application, the application can no longer be accessed from the Internet directly. To enable Internet access to the application, add an Internet gateway to your VPC.  
    */
  def addApplicationVpcConfiguration(params: AddApplicationVpcConfigurationRequest): Request[AddApplicationVpcConfigurationResponse, AWSError] = js.native
  def addApplicationVpcConfiguration(
    params: AddApplicationVpcConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddApplicationVpcConfigurationResponse, Unit]
  ): Request[AddApplicationVpcConfigurationResponse, AWSError] = js.native
  
  @JSName("config")
  var config_KinesisAnalyticsV2: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics application, see Creating an Application.
    */
  def createApplication(): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Creates a Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics application, see Creating an Application.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]
  ): Request[CreateApplicationResponse, AWSError] = js.native
  
  /**
    * Creates and returns a URL that you can use to connect to an application's extension. Currently, the only available extension is the Apache Flink dashboard. The IAM role or user used to call this API defines the permissions to access the extension. After the presigned URL is created, no additional permission is required to access this URL. IAM authorization policies for this API are also enforced for every HTTP request that attempts to connect to the extension.  You control the amount of time that the URL will be valid using the SessionExpirationDurationInSeconds parameter. If you do not provide this parameter, the returned URL is valid for twelve hours.  The URL that you get from a call to CreateApplicationPresignedUrl must be used within 3 minutes to be valid. If you first try to use the URL after the 3-minute limit expires, the service returns an HTTP 403 Forbidden error. 
    */
  def createApplicationPresignedUrl(): Request[CreateApplicationPresignedUrlResponse, AWSError] = js.native
  def createApplicationPresignedUrl(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationPresignedUrlResponse, Unit]): Request[CreateApplicationPresignedUrlResponse, AWSError] = js.native
  /**
    * Creates and returns a URL that you can use to connect to an application's extension. Currently, the only available extension is the Apache Flink dashboard. The IAM role or user used to call this API defines the permissions to access the extension. After the presigned URL is created, no additional permission is required to access this URL. IAM authorization policies for this API are also enforced for every HTTP request that attempts to connect to the extension.  You control the amount of time that the URL will be valid using the SessionExpirationDurationInSeconds parameter. If you do not provide this parameter, the returned URL is valid for twelve hours.  The URL that you get from a call to CreateApplicationPresignedUrl must be used within 3 minutes to be valid. If you first try to use the URL after the 3-minute limit expires, the service returns an HTTP 403 Forbidden error. 
    */
  def createApplicationPresignedUrl(params: CreateApplicationPresignedUrlRequest): Request[CreateApplicationPresignedUrlResponse, AWSError] = js.native
  def createApplicationPresignedUrl(
    params: CreateApplicationPresignedUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationPresignedUrlResponse, Unit]
  ): Request[CreateApplicationPresignedUrlResponse, AWSError] = js.native
  
  /**
    * Creates a snapshot of the application's state data.
    */
  def createApplicationSnapshot(): Request[CreateApplicationSnapshotResponse, AWSError] = js.native
  def createApplicationSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationSnapshotResponse, Unit]): Request[CreateApplicationSnapshotResponse, AWSError] = js.native
  /**
    * Creates a snapshot of the application's state data.
    */
  def createApplicationSnapshot(params: CreateApplicationSnapshotRequest): Request[CreateApplicationSnapshotResponse, AWSError] = js.native
  def createApplicationSnapshot(
    params: CreateApplicationSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationSnapshotResponse, Unit]
  ): Request[CreateApplicationSnapshotResponse, AWSError] = js.native
  
  /**
    * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the application.
    */
  def deleteApplication(): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]): Request[DeleteApplicationResponse, AWSError] = js.native
  /**
    * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the application.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]
  ): Request[DeleteApplicationResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon CloudWatch log stream from an Kinesis Data Analytics application. 
    */
  def deleteApplicationCloudWatchLoggingOption(): Request[DeleteApplicationCloudWatchLoggingOptionResponse, AWSError] = js.native
  def deleteApplicationCloudWatchLoggingOption(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteApplicationCloudWatchLoggingOptionResponse, 
      Unit
    ]
  ): Request[DeleteApplicationCloudWatchLoggingOptionResponse, AWSError] = js.native
  /**
    * Deletes an Amazon CloudWatch log stream from an Kinesis Data Analytics application. 
    */
  def deleteApplicationCloudWatchLoggingOption(params: DeleteApplicationCloudWatchLoggingOptionRequest): Request[DeleteApplicationCloudWatchLoggingOptionResponse, AWSError] = js.native
  def deleteApplicationCloudWatchLoggingOption(
    params: DeleteApplicationCloudWatchLoggingOptionRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteApplicationCloudWatchLoggingOptionResponse, 
      Unit
    ]
  ): Request[DeleteApplicationCloudWatchLoggingOptionResponse, AWSError] = js.native
  
  /**
    * Deletes an InputProcessingConfiguration from an input.
    */
  def deleteApplicationInputProcessingConfiguration(): Request[DeleteApplicationInputProcessingConfigurationResponse, AWSError] = js.native
  def deleteApplicationInputProcessingConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteApplicationInputProcessingConfigurationResponse, 
      Unit
    ]
  ): Request[DeleteApplicationInputProcessingConfigurationResponse, AWSError] = js.native
  /**
    * Deletes an InputProcessingConfiguration from an input.
    */
  def deleteApplicationInputProcessingConfiguration(params: DeleteApplicationInputProcessingConfigurationRequest): Request[DeleteApplicationInputProcessingConfigurationResponse, AWSError] = js.native
  def deleteApplicationInputProcessingConfiguration(
    params: DeleteApplicationInputProcessingConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DeleteApplicationInputProcessingConfigurationResponse, 
      Unit
    ]
  ): Request[DeleteApplicationInputProcessingConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes the output destination configuration from your SQL-based Kinesis Data Analytics application's configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to the external output destination.
    */
  def deleteApplicationOutput(): Request[DeleteApplicationOutputResponse, AWSError] = js.native
  def deleteApplicationOutput(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationOutputResponse, Unit]): Request[DeleteApplicationOutputResponse, AWSError] = js.native
  /**
    * Deletes the output destination configuration from your SQL-based Kinesis Data Analytics application's configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to the external output destination.
    */
  def deleteApplicationOutput(params: DeleteApplicationOutputRequest): Request[DeleteApplicationOutputResponse, AWSError] = js.native
  def deleteApplicationOutput(
    params: DeleteApplicationOutputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationOutputResponse, Unit]
  ): Request[DeleteApplicationOutputResponse, AWSError] = js.native
  
  /**
    * Deletes a reference data source configuration from the specified SQL-based Kinesis Data Analytics application's configuration. If the application is running, Kinesis Data Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation. 
    */
  def deleteApplicationReferenceDataSource(): Request[DeleteApplicationReferenceDataSourceResponse, AWSError] = js.native
  def deleteApplicationReferenceDataSource(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationReferenceDataSourceResponse, Unit]
  ): Request[DeleteApplicationReferenceDataSourceResponse, AWSError] = js.native
  /**
    * Deletes a reference data source configuration from the specified SQL-based Kinesis Data Analytics application's configuration. If the application is running, Kinesis Data Analytics immediately removes the in-application table that you created using the AddApplicationReferenceDataSource operation. 
    */
  def deleteApplicationReferenceDataSource(params: DeleteApplicationReferenceDataSourceRequest): Request[DeleteApplicationReferenceDataSourceResponse, AWSError] = js.native
  def deleteApplicationReferenceDataSource(
    params: DeleteApplicationReferenceDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationReferenceDataSourceResponse, Unit]
  ): Request[DeleteApplicationReferenceDataSourceResponse, AWSError] = js.native
  
  /**
    * Deletes a snapshot of application state.
    */
  def deleteApplicationSnapshot(): Request[DeleteApplicationSnapshotResponse, AWSError] = js.native
  def deleteApplicationSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationSnapshotResponse, Unit]): Request[DeleteApplicationSnapshotResponse, AWSError] = js.native
  /**
    * Deletes a snapshot of application state.
    */
  def deleteApplicationSnapshot(params: DeleteApplicationSnapshotRequest): Request[DeleteApplicationSnapshotResponse, AWSError] = js.native
  def deleteApplicationSnapshot(
    params: DeleteApplicationSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationSnapshotResponse, Unit]
  ): Request[DeleteApplicationSnapshotResponse, AWSError] = js.native
  
  /**
    * Removes a VPC configuration from a Kinesis Data Analytics application.
    */
  def deleteApplicationVpcConfiguration(): Request[DeleteApplicationVpcConfigurationResponse, AWSError] = js.native
  def deleteApplicationVpcConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationVpcConfigurationResponse, Unit]
  ): Request[DeleteApplicationVpcConfigurationResponse, AWSError] = js.native
  /**
    * Removes a VPC configuration from a Kinesis Data Analytics application.
    */
  def deleteApplicationVpcConfiguration(params: DeleteApplicationVpcConfigurationRequest): Request[DeleteApplicationVpcConfigurationResponse, AWSError] = js.native
  def deleteApplicationVpcConfiguration(
    params: DeleteApplicationVpcConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationVpcConfigurationResponse, Unit]
  ): Request[DeleteApplicationVpcConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns information about a specific Kinesis Data Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation.
    */
  def describeApplication(): Request[DescribeApplicationResponse, AWSError] = js.native
  def describeApplication(callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationResponse, Unit]): Request[DescribeApplicationResponse, AWSError] = js.native
  /**
    * Returns information about a specific Kinesis Data Analytics application. If you want to retrieve a list of all applications in your account, use the ListApplications operation.
    */
  def describeApplication(params: DescribeApplicationRequest): Request[DescribeApplicationResponse, AWSError] = js.native
  def describeApplication(
    params: DescribeApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationResponse, Unit]
  ): Request[DescribeApplicationResponse, AWSError] = js.native
  
  /**
    * Returns information about a snapshot of application state data.
    */
  def describeApplicationSnapshot(): Request[DescribeApplicationSnapshotResponse, AWSError] = js.native
  def describeApplicationSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationSnapshotResponse, Unit]): Request[DescribeApplicationSnapshotResponse, AWSError] = js.native
  /**
    * Returns information about a snapshot of application state data.
    */
  def describeApplicationSnapshot(params: DescribeApplicationSnapshotRequest): Request[DescribeApplicationSnapshotResponse, AWSError] = js.native
  def describeApplicationSnapshot(
    params: DescribeApplicationSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationSnapshotResponse, Unit]
  ): Request[DescribeApplicationSnapshotResponse, AWSError] = js.native
  
  /**
    * Provides a detailed description of a specified version of the application. To see a list of all the versions of an application, invoke the ListApplicationVersions operation.  This operation is supported only for Amazon Kinesis Data Analytics for Apache Flink. 
    */
  def describeApplicationVersion(): Request[DescribeApplicationVersionResponse, AWSError] = js.native
  def describeApplicationVersion(callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationVersionResponse, Unit]): Request[DescribeApplicationVersionResponse, AWSError] = js.native
  /**
    * Provides a detailed description of a specified version of the application. To see a list of all the versions of an application, invoke the ListApplicationVersions operation.  This operation is supported only for Amazon Kinesis Data Analytics for Apache Flink. 
    */
  def describeApplicationVersion(params: DescribeApplicationVersionRequest): Request[DescribeApplicationVersionResponse, AWSError] = js.native
  def describeApplicationVersion(
    params: DescribeApplicationVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeApplicationVersionResponse, Unit]
  ): Request[DescribeApplicationVersionResponse, AWSError] = js.native
  
  /**
    * Infers a schema for a SQL-based Kinesis Data Analytics application by evaluating sample records on the specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. When you create an application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show it in the console user interface. 
    */
  def discoverInputSchema(): Request[DiscoverInputSchemaResponse, AWSError] = js.native
  def discoverInputSchema(callback: js.Function2[/* err */ AWSError, /* data */ DiscoverInputSchemaResponse, Unit]): Request[DiscoverInputSchemaResponse, AWSError] = js.native
  /**
    * Infers a schema for a SQL-based Kinesis Data Analytics application by evaluating sample records on the specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In the response, the operation returns the inferred schema and also the sample records that the operation used to infer the schema.  You can use the inferred schema when configuring a streaming source for your application. When you create an application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show it in the console user interface. 
    */
  def discoverInputSchema(params: DiscoverInputSchemaRequest): Request[DiscoverInputSchemaResponse, AWSError] = js.native
  def discoverInputSchema(
    params: DiscoverInputSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DiscoverInputSchemaResponse, Unit]
  ): Request[DiscoverInputSchemaResponse, AWSError] = js.native
  
  /**
    * Lists information about the current application snapshots.
    */
  def listApplicationSnapshots(): Request[ListApplicationSnapshotsResponse, AWSError] = js.native
  def listApplicationSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationSnapshotsResponse, Unit]): Request[ListApplicationSnapshotsResponse, AWSError] = js.native
  /**
    * Lists information about the current application snapshots.
    */
  def listApplicationSnapshots(params: ListApplicationSnapshotsRequest): Request[ListApplicationSnapshotsResponse, AWSError] = js.native
  def listApplicationSnapshots(
    params: ListApplicationSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationSnapshotsResponse, Unit]
  ): Request[ListApplicationSnapshotsResponse, AWSError] = js.native
  
  /**
    * Lists all the versions for the specified application, including versions that were rolled back. The response also includes a summary of the configuration associated with each version. To get the complete description of a specific application version, invoke the DescribeApplicationVersion operation.  This operation is supported only for Amazon Kinesis Data Analytics for Apache Flink. 
    */
  def listApplicationVersions(): Request[ListApplicationVersionsResponse, AWSError] = js.native
  def listApplicationVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationVersionsResponse, Unit]): Request[ListApplicationVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions for the specified application, including versions that were rolled back. The response also includes a summary of the configuration associated with each version. To get the complete description of a specific application version, invoke the DescribeApplicationVersion operation.  This operation is supported only for Amazon Kinesis Data Analytics for Apache Flink. 
    */
  def listApplicationVersions(params: ListApplicationVersionsRequest): Request[ListApplicationVersionsResponse, AWSError] = js.native
  def listApplicationVersions(
    params: ListApplicationVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationVersionsResponse, Unit]
  ): Request[ListApplicationVersionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of Kinesis Data Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status.  If you want detailed information about a specific application, use DescribeApplication.
    */
  def listApplications(): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]): Request[ListApplicationsResponse, AWSError] = js.native
  /**
    * Returns a list of Kinesis Data Analytics applications in your account. For each application, the response includes the application name, Amazon Resource Name (ARN), and status.  If you want detailed information about a specific application, use DescribeApplication.
    */
  def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]
  ): Request[ListApplicationsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of key-value tags assigned to the application. For more information, see Using Tagging.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Retrieves the list of key-value tags assigned to the application. For more information, see Using Tagging.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Reverts the application to the previous running version. You can roll back an application if you suspect it is stuck in a transient status.  You can roll back an application only if it is in the UPDATING or AUTOSCALING status. When you rollback an application, it loads state data from the last successful snapshot. If the application has no snapshots, Kinesis Data Analytics rejects the rollback request. This action is not supported for Kinesis Data Analytics for SQL applications.
    */
  def rollbackApplication(): Request[RollbackApplicationResponse, AWSError] = js.native
  def rollbackApplication(callback: js.Function2[/* err */ AWSError, /* data */ RollbackApplicationResponse, Unit]): Request[RollbackApplicationResponse, AWSError] = js.native
  /**
    * Reverts the application to the previous running version. You can roll back an application if you suspect it is stuck in a transient status.  You can roll back an application only if it is in the UPDATING or AUTOSCALING status. When you rollback an application, it loads state data from the last successful snapshot. If the application has no snapshots, Kinesis Data Analytics rejects the rollback request. This action is not supported for Kinesis Data Analytics for SQL applications.
    */
  def rollbackApplication(params: RollbackApplicationRequest): Request[RollbackApplicationResponse, AWSError] = js.native
  def rollbackApplication(
    params: RollbackApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RollbackApplicationResponse, Unit]
  ): Request[RollbackApplicationResponse, AWSError] = js.native
  
  /**
    * Starts the specified Kinesis Data Analytics application. After creating an application, you must exclusively call this operation to start your application.
    */
  def startApplication(): Request[StartApplicationResponse, AWSError] = js.native
  def startApplication(callback: js.Function2[/* err */ AWSError, /* data */ StartApplicationResponse, Unit]): Request[StartApplicationResponse, AWSError] = js.native
  /**
    * Starts the specified Kinesis Data Analytics application. After creating an application, you must exclusively call this operation to start your application.
    */
  def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse, AWSError] = js.native
  def startApplication(
    params: StartApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartApplicationResponse, Unit]
  ): Request[StartApplicationResponse, AWSError] = js.native
  
  /**
    * Stops the application from processing data. You can stop an application only if it is in the running status, unless you set the Force parameter to true. You can use the DescribeApplication operation to find the application status.  Kinesis Data Analytics takes a snapshot when the application is stopped, unless Force is set to true.
    */
  def stopApplication(): Request[StopApplicationResponse, AWSError] = js.native
  def stopApplication(callback: js.Function2[/* err */ AWSError, /* data */ StopApplicationResponse, Unit]): Request[StopApplicationResponse, AWSError] = js.native
  /**
    * Stops the application from processing data. You can stop an application only if it is in the running status, unless you set the Force parameter to true. You can use the DescribeApplication operation to find the application status.  Kinesis Data Analytics takes a snapshot when the application is stopped, unless Force is set to true.
    */
  def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse, AWSError] = js.native
  def stopApplication(
    params: StopApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopApplicationResponse, Unit]
  ): Request[StopApplicationResponse, AWSError] = js.native
  
  /**
    * Adds one or more key-value tags to a Kinesis Data Analytics application. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see Using Tagging.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more key-value tags to a Kinesis Data Analytics application. Note that the maximum number of application tags includes system tags. The maximum number of user-defined application tags is 50. For more information, see Using Tagging.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes one or more tags from a Kinesis Data Analytics application. For more information, see Using Tagging.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a Kinesis Data Analytics application. For more information, see Using Tagging.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an existing Kinesis Data Analytics application. Using this operation, you can update application code, input configuration, and output configuration.  Kinesis Data Analytics updates the ApplicationVersionId each time you update your application.   You cannot update the RuntimeEnvironment of an existing application. If you need to update an application's RuntimeEnvironment, you must delete the application and create it again. 
    */
  def updateApplication(): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]): Request[UpdateApplicationResponse, AWSError] = js.native
  /**
    * Updates an existing Kinesis Data Analytics application. Using this operation, you can update application code, input configuration, and output configuration.  Kinesis Data Analytics updates the ApplicationVersionId each time you update your application.   You cannot update the RuntimeEnvironment of an existing application. If you need to update an application's RuntimeEnvironment, you must delete the application and create it again. 
    */
  def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]
  ): Request[UpdateApplicationResponse, AWSError] = js.native
  
  /**
    * Updates the maintenance configuration of the Kinesis Data Analytics application.  You can invoke this operation on an application that is in one of the two following states: READY or RUNNING. If you invoke it when the application is in a state other than these two states, it throws a ResourceInUseException. The service makes use of the updated configuration the next time it schedules maintenance for the application. If you invoke this operation after the service schedules maintenance, the service will apply the configuration update the next time it schedules maintenance for the application. This means that you might not see the maintenance configuration update applied to the maintenance process that follows a successful invocation of this operation, but to the following maintenance process instead. To see the current maintenance configuration of your application, invoke the DescribeApplication operation. For information about application maintenance, see Kinesis Data Analytics for Apache Flink Maintenance.  This operation is supported only for Amazon Kinesis Data Analytics for Apache Flink. 
    */
  def updateApplicationMaintenanceConfiguration(): Request[UpdateApplicationMaintenanceConfigurationResponse, AWSError] = js.native
  def updateApplicationMaintenanceConfiguration(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateApplicationMaintenanceConfigurationResponse, 
      Unit
    ]
  ): Request[UpdateApplicationMaintenanceConfigurationResponse, AWSError] = js.native
  /**
    * Updates the maintenance configuration of the Kinesis Data Analytics application.  You can invoke this operation on an application that is in one of the two following states: READY or RUNNING. If you invoke it when the application is in a state other than these two states, it throws a ResourceInUseException. The service makes use of the updated configuration the next time it schedules maintenance for the application. If you invoke this operation after the service schedules maintenance, the service will apply the configuration update the next time it schedules maintenance for the application. This means that you might not see the maintenance configuration update applied to the maintenance process that follows a successful invocation of this operation, but to the following maintenance process instead. To see the current maintenance configuration of your application, invoke the DescribeApplication operation. For information about application maintenance, see Kinesis Data Analytics for Apache Flink Maintenance.  This operation is supported only for Amazon Kinesis Data Analytics for Apache Flink. 
    */
  def updateApplicationMaintenanceConfiguration(params: UpdateApplicationMaintenanceConfigurationRequest): Request[UpdateApplicationMaintenanceConfigurationResponse, AWSError] = js.native
  def updateApplicationMaintenanceConfiguration(
    params: UpdateApplicationMaintenanceConfigurationRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ UpdateApplicationMaintenanceConfigurationResponse, 
      Unit
    ]
  ): Request[UpdateApplicationMaintenanceConfigurationResponse, AWSError] = js.native
}
