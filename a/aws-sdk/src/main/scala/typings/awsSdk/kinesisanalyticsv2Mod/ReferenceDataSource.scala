package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceDataSource extends js.Object {
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var ReferenceSchema: SourceSchema = js.native
  
  /**
    * Identifies the S3 bucket and object that contains the reference data. A Kinesis Data Analytics application loads reference data only once. If the data changes, you call the UpdateApplication operation to trigger reloading of data into your application. 
    */
  var S3ReferenceDataSource: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ReferenceDataSource] = js.native
  
  /**
    * The name of the in-application table to create.
    */
  var TableName: InAppTableName = js.native
}
object ReferenceDataSource {
  
  @scala.inline
  def apply(ReferenceSchema: SourceSchema, TableName: InAppTableName): ReferenceDataSource = {
    val __obj = js.Dynamic.literal(ReferenceSchema = ReferenceSchema.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSource]
  }
  
  @scala.inline
  implicit class ReferenceDataSourceOps[Self <: ReferenceDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReferenceSchema(value: SourceSchema): Self = this.set("ReferenceSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: InAppTableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ReferenceDataSource(value: S3ReferenceDataSource): Self = this.set("S3ReferenceDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ReferenceDataSource: Self = this.set("S3ReferenceDataSource", js.undefined)
  }
}
