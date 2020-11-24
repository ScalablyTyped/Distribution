package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableRequest extends js.Object {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName = js.native
  
  /**
    * The retention duration of the memory store and the magnetic store.
    */
  var RetentionProperties: typings.awsSdk.timestreamwriteMod.RetentionProperties = js.native
  
  /**
    * The name of the Timesream table.
    */
  var TableName: ResourceName = js.native
}
object UpdateTableRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName, RetentionProperties: RetentionProperties, TableName: ResourceName): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], RetentionProperties = RetentionProperties.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
  
  @scala.inline
  implicit class UpdateTableRequestOps[Self <: UpdateTableRequest] (val x: Self) extends AnyVal {
    
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
    def setRetentionProperties(value: RetentionProperties): Self = this.set("RetentionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: ResourceName): Self = this.set("TableName", value.asInstanceOf[js.Any])
  }
}
