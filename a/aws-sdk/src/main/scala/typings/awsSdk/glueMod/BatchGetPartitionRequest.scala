package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetPartitionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of partition values identifying the partitions to retrieve.
    */
  var PartitionsToGet: BatchGetPartitionValueList = js.native
  
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString = js.native
}
object BatchGetPartitionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, PartitionsToGet: BatchGetPartitionValueList, TableName: NameString): BatchGetPartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionsToGet = PartitionsToGet.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetPartitionRequest]
  }
  
  @scala.inline
  implicit class BatchGetPartitionRequestMutableBuilder[Self <: BatchGetPartitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsToGet(value: BatchGetPartitionValueList): Self = StObject.set(x, "PartitionsToGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsToGetVarargs(value: PartitionValueList*): Self = StObject.set(x, "PartitionsToGet", js.Array(value :_*))
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
