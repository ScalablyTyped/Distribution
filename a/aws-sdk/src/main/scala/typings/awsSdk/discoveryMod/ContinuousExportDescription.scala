package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousExportDescription extends StObject {
  
  /**
    * The type of data collector used to gather this data (currently only offered for AGENT).
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  
  /**
    * The unique ID assigned to this export.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
  
  /**
    * The name of the s3 bucket where the export data parquet files are stored.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * An object which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
    */
  var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined
  
  /**
    * The timestamp representing when the continuous export was started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Describes the status of the export. Can be one of the following values:   START_IN_PROGRESS - setting up resources to start continuous export.   START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export again.   ACTIVE - data is being exported to the customer bucket.   ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and start-continuous-export.   STOP_IN_PROGRESS - stopping the export.   STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.   INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer bucket.  
    */
  var status: js.UndefOr[ContinuousExportStatus] = js.undefined
  
  /**
    * Contains information about any errors that have occurred. This data type can have the following values:   ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your Amazon Web Services administrator for help. For more information, see Setting Up Amazon Web Services Application Discovery Service in the Application Discovery Service User Guide.   DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams. Reduce the number of streams or request a limit increase and try again. For more information, see Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide.   FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing the AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again. For more information, see Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies in the Application Discovery Service User Guide.   FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User is missing one or more of the Kinesis data delivery streams.   INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try again later. If this problem persists, contact Amazon Web Services Support.   LAKE_FORMATION_ACCESS_DENIED - You don't have sufficient lake formation permissions to start continuous export. For more information, see  Upgrading Amazon Web Services Glue Data Permissions to the Amazon Web Services Lake Formation Model  in the Amazon Web Services Lake Formation Developer Guide.  You can use one of the following two ways to resolve this issue.   If you don’t want to use the Lake Formation permission model, you can change the default Data Catalog settings to use only Amazon Web Services Identity and Access Management (IAM) access control for new databases. For more information, see Change Data Catalog Settings in the Lake Formation Developer Guide.   You can give the service-linked IAM roles AWSServiceRoleForApplicationDiscoveryServiceContinuousExport and AWSApplicationDiscoveryServiceFirehose the required Lake Formation permissions. For more information, see  Granting Database Permissions in the Lake Formation Developer Guide.    AWSServiceRoleForApplicationDiscoveryServiceContinuousExport - Grant database creator permissions, which gives the role database creation ability and implicit permissions for any created tables. For more information, see  Implicit Lake Formation Permissions  in the Lake Formation Developer Guide.   AWSApplicationDiscoveryServiceFirehose - Grant describe permissions for all tables in the database.       S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of S3 buckets or request a limit increase and try again. For more information, see Bucket Restrictions and Limitations in the Amazon Simple Storage Service Developer Guide.   S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you can use Amazon S3. You can sign up at the following URL: https://aws.amazon.com/s3.  
    */
  var statusDetail: js.UndefOr[StringMax255] = js.undefined
  
  /**
    * The timestamp that represents when this continuous export was stopped.
    */
  var stopTime: js.UndefOr[js.Date] = js.undefined
}
object ContinuousExportDescription {
  
  inline def apply(): ContinuousExportDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinuousExportDescription]
  }
  
  extension [Self <: ContinuousExportDescription](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setExportId(value: ConfigurationsExportId): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setSchemaStorageConfig(value: SchemaStorageConfig): Self = StObject.set(x, "schemaStorageConfig", value.asInstanceOf[js.Any])
    
    inline def setSchemaStorageConfigUndefined: Self = StObject.set(x, "schemaStorageConfig", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: ContinuousExportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetail(value: StringMax255): Self = StObject.set(x, "statusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "statusDetail", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
  }
}
