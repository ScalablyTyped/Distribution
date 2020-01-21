package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    DatabaseName: NameString,
    PartitionInputList: PartitionInputList,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): BatchCreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInputList = PartitionInputList.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreatePartitionRequest]
  }
}

