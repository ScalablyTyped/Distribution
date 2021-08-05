package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName
  
  /**
    * The duration for which your time series data must be stored in the memory store and the magnetic store.
    */
  var RetentionProperties: js.UndefOr[typings.awsSdk.timestreamwriteMod.RetentionProperties] = js.undefined
  
  /**
    * The name of the Timestream table.
    */
  var TableName: ResourceName
  
  /**
    *  A list of key-value pairs to label the table. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateTableRequest {
  
  inline def apply(DatabaseName: ResourceName, TableName: ResourceName): CreateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableRequest]
  }
  
  extension [Self <: CreateTableRequest](x: Self) {
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setRetentionProperties(value: RetentionProperties): Self = StObject.set(x, "RetentionProperties", value.asInstanceOf[js.Any])
    
    inline def setRetentionPropertiesUndefined: Self = StObject.set(x, "RetentionProperties", js.undefined)
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
