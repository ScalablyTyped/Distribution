package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName
  
  /**
    * The retention duration of the memory store and the magnetic store.
    */
  var RetentionProperties: typings.awsSdk.timestreamwriteMod.RetentionProperties
  
  /**
    * The name of the Timesream table.
    */
  var TableName: ResourceName
}
object UpdateTableRequest {
  
  inline def apply(DatabaseName: ResourceName, RetentionProperties: RetentionProperties, TableName: ResourceName): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], RetentionProperties = RetentionProperties.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
  
  extension [Self <: UpdateTableRequest](x: Self) {
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setRetentionProperties(value: RetentionProperties): Self = StObject.set(x, "RetentionProperties", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
