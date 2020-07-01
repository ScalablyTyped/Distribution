package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyManagedPrefixListRequest extends js.Object {
  /**
    * One or more entries to add to the prefix list.
    */
  var AddEntries: js.UndefOr[AddPrefixListEntries] = js.native
  /**
    * The current version of the prefix list.
    */
  var CurrentVersion: js.UndefOr[Long] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId = js.native
  /**
    * A name for the prefix list.
    */
  var PrefixListName: js.UndefOr[String] = js.native
  /**
    * One or more entries to remove from the prefix list.
    */
  var RemoveEntries: js.UndefOr[RemovePrefixListEntries] = js.native
}

object ModifyManagedPrefixListRequest {
  @scala.inline
  def apply(
    PrefixListId: PrefixListResourceId,
    AddEntries: AddPrefixListEntries = null,
    CurrentVersion: js.UndefOr[Long] = js.undefined,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    PrefixListName: String = null,
    RemoveEntries: RemovePrefixListEntries = null
  ): ModifyManagedPrefixListRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any])
    if (AddEntries != null) __obj.updateDynamic("AddEntries")(AddEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentVersion)) __obj.updateDynamic("CurrentVersion")(CurrentVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (PrefixListName != null) __obj.updateDynamic("PrefixListName")(PrefixListName.asInstanceOf[js.Any])
    if (RemoveEntries != null) __obj.updateDynamic("RemoveEntries")(RemoveEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyManagedPrefixListRequest]
  }
}

