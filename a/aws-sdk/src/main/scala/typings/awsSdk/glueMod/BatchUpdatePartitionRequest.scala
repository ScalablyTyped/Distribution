package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdatePartitionRequest extends StObject {
  
  /**
    * The ID of the catalog in which the partition is to be updated. Currently, this should be the AWS account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the metadata database in which the partition is to be updated.
    */
  var DatabaseName: NameString
  
  /**
    * A list of up to 100 BatchUpdatePartitionRequestEntry objects to update.
    */
  var Entries: BatchUpdatePartitionRequestEntryList
  
  /**
    * The name of the metadata table in which the partition is to be updated.
    */
  var TableName: NameString
}
object BatchUpdatePartitionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, Entries: BatchUpdatePartitionRequestEntryList, TableName: NameString): BatchUpdatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePartitionRequest]
  }
  
  @scala.inline
  implicit class BatchUpdatePartitionRequestMutableBuilder[Self <: BatchUpdatePartitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: BatchUpdatePartitionRequestEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: BatchUpdatePartitionRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
