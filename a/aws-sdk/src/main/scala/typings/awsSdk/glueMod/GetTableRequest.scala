package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTableRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  
  /**
    * The name of the table for which to retrieve the definition. For Hive compatibility, this name is entirely lowercase.
    */
  var Name: NameString
  
  /**
    * The time as of when to read the table contents. If not set, the most recent transaction commit time will be used. Cannot be specified along with TransactionId.
    */
  var QueryAsOfTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The transaction ID at which to read the table contents. 
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
}
object GetTableRequest {
  
  inline def apply(DatabaseName: NameString, Name: NameString): GetTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableRequest]
  }
  
  extension [Self <: GetTableRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQueryAsOfTime(value: js.Date): Self = StObject.set(x, "QueryAsOfTime", value.asInstanceOf[js.Any])
    
    inline def setQueryAsOfTimeUndefined: Self = StObject.set(x, "QueryAsOfTime", js.undefined)
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
