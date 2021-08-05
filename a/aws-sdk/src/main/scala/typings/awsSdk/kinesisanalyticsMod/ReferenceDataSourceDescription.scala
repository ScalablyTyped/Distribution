package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceDataSourceDescription extends StObject {
  
  /**
    * ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the reference data source to your application using the AddApplicationReferenceDataSource operation.
    */
  var ReferenceId: Id
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var ReferenceSchema: js.UndefOr[SourceSchema] = js.undefined
  
  /**
    * Provides the S3 bucket name, the object key name that contains the reference data. It also provides the Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application reference table.
    */
  var S3ReferenceDataSourceDescription: typings.awsSdk.kinesisanalyticsMod.S3ReferenceDataSourceDescription
  
  /**
    * The in-application table name created by the specific reference data source configuration.
    */
  var TableName: InAppTableName
}
object ReferenceDataSourceDescription {
  
  inline def apply(
    ReferenceId: Id,
    S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription,
    TableName: InAppTableName
  ): ReferenceDataSourceDescription = {
    val __obj = js.Dynamic.literal(ReferenceId = ReferenceId.asInstanceOf[js.Any], S3ReferenceDataSourceDescription = S3ReferenceDataSourceDescription.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSourceDescription]
  }
  
  extension [Self <: ReferenceDataSourceDescription](x: Self) {
    
    inline def setReferenceId(value: Id): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceSchema(value: SourceSchema): Self = StObject.set(x, "ReferenceSchema", value.asInstanceOf[js.Any])
    
    inline def setReferenceSchemaUndefined: Self = StObject.set(x, "ReferenceSchema", js.undefined)
    
    inline def setS3ReferenceDataSourceDescription(value: S3ReferenceDataSourceDescription): Self = StObject.set(x, "S3ReferenceDataSourceDescription", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: InAppTableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
