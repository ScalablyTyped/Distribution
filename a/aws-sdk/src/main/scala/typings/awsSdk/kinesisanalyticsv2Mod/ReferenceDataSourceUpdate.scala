package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceDataSourceUpdate extends js.Object {
  
  /**
    * The ID of the reference data source that is being updated. You can use the DescribeApplication operation to get this value.
    */
  var ReferenceId: Id = js.native
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream. 
    */
  var ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.native
  
  /**
    * Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
    */
  var S3ReferenceDataSourceUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ReferenceDataSourceUpdate] = js.native
  
  /**
    * The in-application table name that is created by this update.
    */
  var TableNameUpdate: js.UndefOr[InAppTableName] = js.native
}
object ReferenceDataSourceUpdate {
  
  @scala.inline
  def apply(ReferenceId: Id): ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal(ReferenceId = ReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSourceUpdate]
  }
  
  @scala.inline
  implicit class ReferenceDataSourceUpdateOps[Self <: ReferenceDataSourceUpdate] (val x: Self) extends AnyVal {
    
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
    def setReferenceId(value: Id): Self = this.set("ReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceSchemaUpdate(value: SourceSchema): Self = this.set("ReferenceSchemaUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceSchemaUpdate: Self = this.set("ReferenceSchemaUpdate", js.undefined)
    
    @scala.inline
    def setS3ReferenceDataSourceUpdate(value: S3ReferenceDataSourceUpdate): Self = this.set("S3ReferenceDataSourceUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ReferenceDataSourceUpdate: Self = this.set("S3ReferenceDataSourceUpdate", js.undefined)
    
    @scala.inline
    def setTableNameUpdate(value: InAppTableName): Self = this.set("TableNameUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableNameUpdate: Self = this.set("TableNameUpdate", js.undefined)
  }
}
