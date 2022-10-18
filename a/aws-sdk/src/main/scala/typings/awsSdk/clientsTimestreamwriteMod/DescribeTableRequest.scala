package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName
  
  /**
    * The name of the Timestream table.
    */
  var TableName: ResourceName
}
object DescribeTableRequest {
  
  inline def apply(DatabaseName: ResourceName, TableName: ResourceName): DescribeTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableRequest]
  }
  
  extension [Self <: DescribeTableRequest](x: Self) {
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
