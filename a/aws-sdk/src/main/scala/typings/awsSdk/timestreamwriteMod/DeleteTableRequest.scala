package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTableRequest extends js.Object {
  
  /**
    * The name of the database where the Timestream database is to be deleted.
    */
  var DatabaseName: ResourceName = js.native
  
  /**
    * The name of the Timestream table to be deleted.
    */
  var TableName: ResourceName = js.native
}
object DeleteTableRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName, TableName: ResourceName): DeleteTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableRequest]
  }
  
  @scala.inline
  implicit class DeleteTableRequestOps[Self <: DeleteTableRequest] (val x: Self) extends AnyVal {
    
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
    def setTableName(value: ResourceName): Self = this.set("TableName", value.asInstanceOf[js.Any])
  }
}
