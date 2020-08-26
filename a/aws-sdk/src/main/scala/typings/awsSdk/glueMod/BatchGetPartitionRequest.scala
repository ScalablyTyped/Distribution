package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetPartitionRequest extends js.Object {
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
  implicit class BatchGetPartitionRequestOps[Self <: BatchGetPartitionRequest] (val x: Self) extends AnyVal {
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
    def setPartitionsToGetVarargs(value: PartitionValueList*): Self = this.set("PartitionsToGet", js.Array(value :_*))
    @scala.inline
    def setPartitionsToGet(value: BatchGetPartitionValueList): Self = this.set("PartitionsToGet", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
  
}

