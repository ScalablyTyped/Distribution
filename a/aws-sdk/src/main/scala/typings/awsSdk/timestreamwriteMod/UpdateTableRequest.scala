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
    * Contains properties to set on the table when enabling magnetic store writes.
    */
  var MagneticStoreWriteProperties: js.UndefOr[typings.awsSdk.timestreamwriteMod.MagneticStoreWriteProperties] = js.undefined
  
  /**
    * The retention duration of the memory store and the magnetic store.
    */
  var RetentionProperties: js.UndefOr[typings.awsSdk.timestreamwriteMod.RetentionProperties] = js.undefined
  
  /**
    * The name of the Timestream table.
    */
  var TableName: ResourceName
}
object UpdateTableRequest {
  
  inline def apply(DatabaseName: ResourceName, TableName: ResourceName): UpdateTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableRequest]
  }
  
  extension [Self <: UpdateTableRequest](x: Self) {
    
    inline def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setMagneticStoreWriteProperties(value: MagneticStoreWriteProperties): Self = StObject.set(x, "MagneticStoreWriteProperties", value.asInstanceOf[js.Any])
    
    inline def setMagneticStoreWritePropertiesUndefined: Self = StObject.set(x, "MagneticStoreWriteProperties", js.undefined)
    
    inline def setRetentionProperties(value: RetentionProperties): Self = StObject.set(x, "RetentionProperties", value.asInstanceOf[js.Any])
    
    inline def setRetentionPropertiesUndefined: Self = StObject.set(x, "RetentionProperties", js.undefined)
    
    inline def setTableName(value: ResourceName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
