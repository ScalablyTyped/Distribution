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
  def apply(
    DatabaseName: NameString,
    PartitionsToDelete: BatchDeletePartitionValueList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): BatchDeletePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionsToDelete = PartitionsToDelete.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeletePartitionRequest]
  }
}

