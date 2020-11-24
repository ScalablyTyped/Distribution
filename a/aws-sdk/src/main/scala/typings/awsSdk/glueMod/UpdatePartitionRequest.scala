package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePartitionRequest extends js.Object {
  
  /**
    * The ID of the Data Catalog where the partition to be updated resides. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the catalog database in which the table in question resides.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * The new partition object to update the partition to. The Values property can't be changed. If you want to change the partition key values for a partition, delete and recreate the partition.
    */
  var PartitionInput: typings.awsSdk.glueMod.PartitionInput = js.native
  
  /**
    * List of partition key values that define the partition to update.
    */
  var PartitionValueList: BoundedPartitionValueList = js.native
  
  /**
    * The name of the table in which the partition to be updated is located.
    */
  var TableName: NameString = js.native
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
  implicit class UpdatePartitionRequestOps[Self <: UpdatePartitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionInput(value: PartitionInput): Self = this.set("PartitionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValueListVarargs(value: ValueString*): Self = this.set("PartitionValueList", js.Array(value :_*))
    
    @scala.inline
    def setPartitionValueList(value: BoundedPartitionValueList): Self = this.set("PartitionValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
