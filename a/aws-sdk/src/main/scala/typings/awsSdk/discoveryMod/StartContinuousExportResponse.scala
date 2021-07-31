package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartContinuousExportResponse extends StObject {
  
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
    * A dictionary which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
    */
  var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined
  
  /**
    * The timestamp representing when the continuous export was started.
    */
  var startTime: js.UndefOr[TimeStamp] = js.undefined
}
object StartContinuousExportResponse {
  
  @scala.inline
  def apply(): StartContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartContinuousExportResponse]
  }
  
  @scala.inline
  implicit class StartContinuousExportResponseMutableBuilder[Self <: StartContinuousExportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setExportId(value: ConfigurationsExportId): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    @scala.inline
    def setSchemaStorageConfig(value: SchemaStorageConfig): Self = StObject.set(x, "schemaStorageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaStorageConfigUndefined: Self = StObject.set(x, "schemaStorageConfig", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimeStamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
