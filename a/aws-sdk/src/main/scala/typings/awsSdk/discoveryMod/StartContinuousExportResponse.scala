package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartContinuousExportResponse extends js.Object {
  
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
    * A dictionary which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
    */
  var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.native
  
  /**
    * The timestamp representing when the continuous export was started.
    */
  var startTime: js.UndefOr[TimeStamp] = js.native
}
object StartContinuousExportResponse {
  
  @scala.inline
  def apply(): StartContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartContinuousExportResponse]
  }
  
  @scala.inline
  implicit class StartContinuousExportResponseOps[Self <: StartContinuousExportResponse] (val x: Self) extends AnyVal {
    
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
  }
}
