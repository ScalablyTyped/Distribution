package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeletePartitionRequest extends js.Object {
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
  implicit class BatchDeletePartitionRequestOps[Self <: BatchDeletePartitionRequest] (val x: Self) extends AnyVal {
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
    def setPartitionsToDeleteVarargs(value: PartitionValueList*): Self = this.set("PartitionsToDelete", js.Array(value :_*))
    @scala.inline
    def setPartitionsToDelete(value: BatchDeletePartitionValueList): Self = this.set("PartitionsToDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

