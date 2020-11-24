package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreatePartitionRequest extends js.Object {
  
  /**
    * The ID of the catalog in which the partition is to be created. Currently, this should be the AWS account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The name of the metadata database in which the partition is to be created.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of PartitionInput structures that define the partitions to be created.
    */
  var PartitionInputList: typings.awsSdk.glueMod.PartitionInputList = js.native
  
  /**
    * The name of the metadata table in which the partition is to be created.
    */
  var TableName: NameString = js.native
}
object BatchCreatePartitionRequest {
  
  @scala.inline
  def apply(DatabaseName: NameString, PartitionInputList: PartitionInputList, TableName: NameString): BatchCreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInputList = PartitionInputList.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreatePartitionRequest]
  }
  
  @scala.inline
  implicit class BatchCreatePartitionRequestOps[Self <: BatchCreatePartitionRequest] (val x: Self) extends AnyVal {
    
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
    def setPartitionInputListVarargs(value: PartitionInput*): Self = this.set("PartitionInputList", js.Array(value :_*))
    
    @scala.inline
    def setPartitionInputList(value: PartitionInputList): Self = this.set("PartitionInputList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
