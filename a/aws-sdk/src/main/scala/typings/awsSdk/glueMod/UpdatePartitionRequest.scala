package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePartitionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString
  
  /**
    * The new partition object to update the partition to. The Values property can't be changed. If you want to change the partition key values for a partition, delete and recreate the partition.
    */
  var PartitionInput: typings.awsSdk.glueMod.PartitionInput
  
  /**
    * List of partition key values that define the partition to update.
    */
  var PartitionValueList: BoundedPartitionValueList
  
  /**
    * The name of the table in which the partition to be updated is located.
    */
  var TableName: NameString
}
object UpdatePartitionRequest {
  
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionInput: PartitionInput,
    PartitionValueList: BoundedPartitionValueList,
    TableName: NameString
  ): UpdatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInput = PartitionInput.asInstanceOf[js.Any], PartitionValueList = PartitionValueList.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePartitionRequest]
  }
  
  @scala.inline
  implicit class UpdatePartitionRequestMutableBuilder[Self <: UpdatePartitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionInput(value: PartitionInput): Self = StObject.set(x, "PartitionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValueList(value: BoundedPartitionValueList): Self = StObject.set(x, "PartitionValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValueListVarargs(value: ValueString*): Self = StObject.set(x, "PartitionValueList", js.Array(value :_*))
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
