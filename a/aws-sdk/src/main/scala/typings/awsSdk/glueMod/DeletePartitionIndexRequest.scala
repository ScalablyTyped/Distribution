package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePartitionIndexRequest extends StObject {
  
  /**
    * The catalog ID where the table resides.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * Specifies the name of a database from which you want to delete a partition index.
    */
  var DatabaseName: NameString
  
  /**
    * The name of the partition index to be deleted.
    */
  var IndexName: NameString
  
  /**
    * Specifies the name of a table from which you want to delete a partition index.
    */
  var TableName: NameString
}
object DeletePartitionIndexRequest {
  
  inline def apply(DatabaseName: NameString, IndexName: NameString, TableName: NameString): DeletePartitionIndexRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], IndexName = IndexName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePartitionIndexRequest]
  }
  
  extension [Self <: DeletePartitionIndexRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: NameString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
