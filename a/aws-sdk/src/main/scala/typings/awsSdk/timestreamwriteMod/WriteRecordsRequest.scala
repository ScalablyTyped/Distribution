package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteRecordsRequest extends StObject {
  
  /**
    * A record containing the common measure, dimension, time, and version attributes shared across all the records in the request. The measure and dimension attributes specified will be merged with the measure and dimension attributes in the records object when the data is written into Timestream. Dimensions may not overlap, or a ValidationException will be thrown. In other words, a record must contain dimensions with unique names. 
    */
  var CommonAttributes: js.UndefOr[Record] = js.undefined
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName
  
  /**
    * An array of records containing the unique measure, dimension, time, and version attributes for each time series data point. 
    */
  var Records: typings.awsSdk.timestreamwriteMod.Records
  
  /**
    * The name of the Timestream table.
    */
  var TableName: ResourceName
}
object WriteRecordsRequest {
  
  inline def apply(DatabaseName: ResourceName, Records: Records, TableName: ResourceName): WriteRecordsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRecordsRequest]
  }
  
  extension [Self <: WriteRecordsRequest](x: Self) {
    
    inline def setCommonAttributes(value: Record): Self = StObject.set(x, "CommonAttributes", value.asInstanceOf[js.Any])
    
    inline def setCommonAttributesUndefined: Self = StObject.set(x, "CommonAttributes", js.undefined)
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setRecords(value: Records): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value*))
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
