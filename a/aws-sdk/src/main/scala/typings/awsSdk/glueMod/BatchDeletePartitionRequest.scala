package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeletePartitionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partition to be deleted resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of PartitionInput structures that define the partitions to be deleted.
    */
  var PartitionsToDelete: BatchDeletePartitionValueList = js.native
  
  /**
    * The name of the table that contains the partitions to be deleted.
    */
  var TableName: NameString = js.native
}
object BatchDeletePartitionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, PartitionsToDelete: BatchDeletePartitionValueList, TableName: NameString): BatchDeletePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionsToDelete = PartitionsToDelete.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePartitionRequest]
  }
  
  @scala.inline
  implicit class BatchDeletePartitionRequestMutableBuilder[Self <: BatchDeletePartitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsToDelete(value: BatchDeletePartitionValueList): Self = StObject.set(x, "PartitionsToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsToDeleteVarargs(value: PartitionValueList*): Self = StObject.set(x, "PartitionsToDelete", js.Array(value :_*))
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
