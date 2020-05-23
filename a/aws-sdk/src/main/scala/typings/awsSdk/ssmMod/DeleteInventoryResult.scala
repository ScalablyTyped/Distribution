package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInventoryResult extends js.Object {
  /**
    * Every DeleteInventory action is assigned a unique ID. This option returns a unique ID. You can use this ID to query the status of a delete operation. This option is useful for ensuring that a delete operation has completed before you begin other actions. 
    */
  var DeletionId: js.UndefOr[InventoryDeletionId] = js.native
  /**
    * A summary of the delete operation. For more information about this summary, see Deleting custom inventory in the AWS Systems Manager User Guide.
    */
  var DeletionSummary: js.UndefOr[InventoryDeletionSummary] = js.native
  /**
    * The name of the inventory data type specified in the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.native
}

object DeleteInventoryResult {
  @scala.inline
  def apply(
    DeletionId: InventoryDeletionId = null,
    DeletionSummary: InventoryDeletionSummary = null,
    TypeName: InventoryItemTypeName = null
  ): DeleteInventoryResult = {
    val __obj = js.Dynamic.literal()
    if (DeletionId != null) __obj.updateDynamic("DeletionId")(DeletionId.asInstanceOf[js.Any])
    if (DeletionSummary != null) __obj.updateDynamic("DeletionSummary")(DeletionSummary.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInventoryResult]
  }
}

