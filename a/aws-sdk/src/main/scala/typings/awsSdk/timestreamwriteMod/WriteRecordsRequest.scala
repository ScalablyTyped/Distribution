package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteRecordsRequest extends js.Object {
  
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
  implicit class WriteRecordsRequestOps[Self <: WriteRecordsRequest] (val x: Self) extends AnyVal {
    
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
    def setDatabaseName(value: ResourceName): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: Records): Self = this.set("Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: ResourceName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonAttributes(value: Record): Self = this.set("CommonAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAttributes: Self = this.set("CommonAttributes", js.undefined)
  }
}
