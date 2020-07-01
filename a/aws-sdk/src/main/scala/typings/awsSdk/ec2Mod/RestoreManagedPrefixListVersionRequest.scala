package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreManagedPrefixListVersionRequest extends js.Object {
  /**
    * The current version number for the prefix list.
    */
  var CurrentVersion: Long = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId = js.native
  /**
    * The version to restore.
    */
  var PreviousVersion: Long = js.native
}

object RestoreManagedPrefixListVersionRequest {
  @scala.inline
  def apply(
    CurrentVersion: Long,
    PrefixListId: PrefixListResourceId,
    PreviousVersion: Long,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): RestoreManagedPrefixListVersionRequest = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any], PrefixListId = PrefixListId.asInstanceOf[js.Any], PreviousVersion = PreviousVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreManagedPrefixListVersionRequest]
  }
}

