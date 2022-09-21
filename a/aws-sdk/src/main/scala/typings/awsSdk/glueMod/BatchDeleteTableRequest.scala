package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteTableRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the table resides. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database in which the tables to delete reside. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString
  
  /**
    * A list of the table to delete.
    */
  var TablesToDelete: BatchDeleteTableNameList
  
  /**
    * The transaction ID at which to delete the table contents.
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
}
object BatchDeleteTableRequest {
  
  inline def apply(DatabaseName: NameString, TablesToDelete: BatchDeleteTableNameList): BatchDeleteTableRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], TablesToDelete = TablesToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableRequest]
  }
  
  extension [Self <: BatchDeleteTableRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setTablesToDelete(value: BatchDeleteTableNameList): Self = StObject.set(x, "TablesToDelete", value.asInstanceOf[js.Any])
    
    inline def setTablesToDeleteVarargs(value: NameString*): Self = StObject.set(x, "TablesToDelete", js.Array(value*))
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
