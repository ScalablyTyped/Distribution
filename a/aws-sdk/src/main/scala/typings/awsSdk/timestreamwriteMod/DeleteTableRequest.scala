package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTableRequest extends StObject {
  
  /**
    * The name of the database where the Timestream database is to be deleted.
    */
  var DatabaseName: ResourceName
  
  /**
    * The name of the Timestream table to be deleted.
    */
  var TableName: ResourceName
}
object DeleteTableRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName, TableName: ResourceName): DeleteTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableRequest]
  }
  
  @scala.inline
  implicit class DeleteTableRequestMutableBuilder[Self <: DeleteTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
