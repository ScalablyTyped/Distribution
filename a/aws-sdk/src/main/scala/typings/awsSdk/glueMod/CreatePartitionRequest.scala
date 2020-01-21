package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePartitionRequest extends js.Object {
  /**
    * The AWS account ID of the catalog in which the partition is to be created.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The name of the metadata database in which the partition is to be created.
    */
  var DatabaseName: NameString = js.native
  /**
    * A PartitionInput structure defining the partition to be created.
    */
  var PartitionInput: typings.awsSdk.glueMod.PartitionInput = js.native
  /**
    * The name of the metadata table in which the partition is to be created.
    */
  var TableName: NameString = js.native
}

object CreatePartitionRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    PartitionInput: PartitionInput,
    TableName: NameString,
    CatalogId: CatalogIdString = null
  ): CreatePartitionRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionInput = PartitionInput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartitionRequest]
  }
}

