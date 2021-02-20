package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceDataSource extends StObject {
  
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
  implicit class ReferenceDataSourceMutableBuilder[Self <: ReferenceDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceSchema(value: SourceSchema): Self = StObject.set(x, "ReferenceSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ReferenceDataSource(value: S3ReferenceDataSource): Self = StObject.set(x, "S3ReferenceDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ReferenceDataSourceUndefined: Self = StObject.set(x, "S3ReferenceDataSource", js.undefined)
    
    @scala.inline
    def setTableName(value: InAppTableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
