package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousExportDescription extends js.Object {
  
  /**
    * The type of data collector used to gather this data (currently only offered for AGENT).
    */
  var dataSource: js.UndefOr[DataSource] = js.native
  
  /**
    * The unique ID assigned to this export.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.native
  
  /**
    * The name of the s3 bucket where the export data parquet files are stored.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  
  /**
    * An object which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
    */
  var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.native
  
  /**
    * The timestamp representing when the continuous export was started.
    */
  var startTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * Describes the status of the export. Can be one of the following values:   START_IN_PROGRESS - setting up resources to start continuous export.   START_FAILED - an error occurred setting up continuous export. To recover, call start-continuous-export again.   ACTIVE - data is being exported to the customer bucket.   ERROR - an error occurred during export. To fix the issue, call stop-continuous-export and start-continuous-export.   STOP_IN_PROGRESS - stopping the export.   STOP_FAILED - an error occurred stopping the export. To recover, call stop-continuous-export again.   INACTIVE - the continuous export has been stopped. Data is no longer being exported to the customer bucket.  
    */
  var status: js.UndefOr[ContinuousExportStatus] = js.native
  
  /**
    * Contains information about any errors that have occurred. This data type can have the following values:   ACCESS_DENIED - You don’t have permission to start Data Exploration in Amazon Athena. Contact your AWS administrator for help. For more information, see Setting Up AWS Application Discovery Service in the Application Discovery Service User Guide.   DELIVERY_STREAM_LIMIT_FAILURE - You reached the limit for Amazon Kinesis Data Firehose delivery streams. Reduce the number of streams or request a limit increase and try again. For more information, see Kinesis Data Streams Limits in the Amazon Kinesis Data Streams Developer Guide.   FIREHOSE_ROLE_MISSING - The Data Exploration feature is in an error state because your IAM User is missing the AWSApplicationDiscoveryServiceFirehose role. Turn on Data Exploration in Amazon Athena and try again. For more information, see Step 3: Provide Application Discovery Service Access to Non-Administrator Users by Attaching Policies in the Application Discovery Service User Guide.   FIREHOSE_STREAM_DOES_NOT_EXIST - The Data Exploration feature is in an error state because your IAM User is missing one or more of the Kinesis data delivery streams.   INTERNAL_FAILURE - The Data Exploration feature is in an error state because of an internal failure. Try again later. If this problem persists, contact AWS Support.   S3_BUCKET_LIMIT_FAILURE - You reached the limit for Amazon S3 buckets. Reduce the number of Amazon S3 buckets or request a limit increase and try again. For more information, see Bucket Restrictions and Limitations in the Amazon Simple Storage Service Developer Guide.   S3_NOT_SIGNED_UP - Your account is not signed up for the Amazon S3 service. You must sign up before you can use Amazon S3. You can sign up at the following URL: https://aws.amazon.com/s3.  
    */
  var statusDetail: js.UndefOr[StringMax255] = js.native
  
  /**
    * The timestamp that represents when this continuous export was stopped.
    */
  var stopTime: js.UndefOr[TimeStamp] = js.native
}
object ContinuousExportDescription {
  
  @scala.inline
  def apply(): ContinuousExportDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinuousExportDescription]
  }
  
  @scala.inline
  implicit class ContinuousExportDescriptionOps[Self <: ContinuousExportDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setExportId(value: ConfigurationsExportId): Self = this.set("exportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportId: Self = this.set("exportId", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("s3Bucket", js.undefined)
    
    @scala.inline
    def setSchemaStorageConfig(value: SchemaStorageConfig): Self = this.set("schemaStorageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaStorageConfig: Self = this.set("schemaStorageConfig", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimeStamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ContinuousExportStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusDetail(value: StringMax255): Self = this.set("statusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetail: Self = this.set("statusDetail", js.undefined)
    
    @scala.inline
    def setStopTime(value: TimeStamp): Self = this.set("stopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTime: Self = this.set("stopTime", js.undefined)
  }
}
