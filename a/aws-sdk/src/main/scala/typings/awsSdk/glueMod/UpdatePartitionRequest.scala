package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The new partition object to update the partition to.
    */
  var PartitionInput: typings.awsSdk.glueMod.PartitionInput = js.native
  /**
    * A list of the values defining the partition.
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
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): UpdatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInput = PartitionInput.asInstanceOf[js.Any], PartitionValueList = PartitionValueList.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePartitionRequest]
  }
}

