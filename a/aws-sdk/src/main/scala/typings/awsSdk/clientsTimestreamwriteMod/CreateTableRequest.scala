package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceCreateAPIName
  
  /**
    * Contains properties to set on the table when enabling magnetic store writes.
    */
  var MagneticStoreWriteProperties: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.MagneticStoreWriteProperties] = js.undefined
  
  /**
    * The duration for which your time series data must be stored in the memory store and the magnetic store.
    */
  var RetentionProperties: js.UndefOr[typings.awsSdk.clientsTimestreamwriteMod.RetentionProperties] = js.undefined
  
  /**
    * The name of the Timestream table.
    */
  var TableName: ResourceCreateAPIName
  
  /**
    *  A list of key-value pairs to label the table. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateTableRequest {
  
  inline def apply(DatabaseName: ResourceCreateAPIName, TableName: ResourceCreateAPIName): CreateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableRequest]
  }
  
  extension [Self <: CreateTableRequest](x: Self) {
    
    inline def setDatabaseName(value: ResourceCreateAPIName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setMagneticStoreWriteProperties(value: MagneticStoreWriteProperties): Self = StObject.set(x, "MagneticStoreWriteProperties", value.asInstanceOf[js.Any])
    
    inline def setMagneticStoreWritePropertiesUndefined: Self = StObject.set(x, "MagneticStoreWriteProperties", js.undefined)
    
    inline def setRetentionProperties(value: RetentionProperties): Self = StObject.set(x, "RetentionProperties", value.asInstanceOf[js.Any])
    
    inline def setRetentionPropertiesUndefined: Self = StObject.set(x, "RetentionProperties", js.undefined)
    
    inline def setTableName(value: ResourceCreateAPIName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
