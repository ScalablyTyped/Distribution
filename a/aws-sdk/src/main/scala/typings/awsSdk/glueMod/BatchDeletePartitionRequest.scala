package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeletePartitionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partition to be deleted resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString
  
  /**
    * A list of PartitionInput structures that define the partitions to be deleted.
    */
  var PartitionsToDelete: BatchDeletePartitionValueList
  
  /**
    * The name of the table that contains the partitions to be deleted.
    */
  var TableName: NameString
}
object BatchDeletePartitionRequest {
  
  inline def apply(DatabaseName: NameString, PartitionsToDelete: BatchDeletePartitionValueList, TableName: NameString): BatchDeletePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionsToDelete = PartitionsToDelete.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePartitionRequest]
  }
  
  extension [Self <: BatchDeletePartitionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setPartitionsToDelete(value: BatchDeletePartitionValueList): Self = StObject.set(x, "PartitionsToDelete", value.asInstanceOf[js.Any])
    
    inline def setPartitionsToDeleteVarargs(value: PartitionValueList*): Self = StObject.set(x, "PartitionsToDelete", js.Array(value :_*))
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
