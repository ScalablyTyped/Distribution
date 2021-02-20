package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteRecordsRequest extends StObject {
  
  /**
    * A record containing the common measure and dimension attributes shared across all the records in the request. The measure and dimension attributes specified in here will be merged with the measure and dimension attributes in the records object when the data is written into Timestream. 
    */
  var CommonAttributes: js.UndefOr[Record] = js.native
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName = js.native
  
  /**
    * An array of records containing the unique dimension and measure attributes for each time series data point. 
    */
  var Records: typings.awsSdk.timestreamwriteMod.Records = js.native
  
  /**
    * The name of the Timesream table.
    */
  var TableName: ResourceName = js.native
}
object WriteRecordsRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName, Records: Records, TableName: ResourceName): WriteRecordsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRecordsRequest]
  }
  
  @scala.inline
  implicit class WriteRecordsRequestMutableBuilder[Self <: WriteRecordsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonAttributes(value: Record): Self = StObject.set(x, "CommonAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonAttributesUndefined: Self = StObject.set(x, "CommonAttributes", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecords(value: Records): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value :_*))
    
    @scala.inline
    def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
