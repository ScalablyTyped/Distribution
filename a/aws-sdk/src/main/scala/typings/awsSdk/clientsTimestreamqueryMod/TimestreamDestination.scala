package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestreamDestination extends StObject {
  
  /**
    * Timestream database name. 
    */
  var DatabaseName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Timestream table name. 
    */
  var TableName: js.UndefOr[ResourceName] = js.undefined
}
object TimestreamDestination {
  
  inline def apply(): TimestreamDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestreamDestination]
  }
  
  extension [Self <: TimestreamDestination](x: Self) {
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
