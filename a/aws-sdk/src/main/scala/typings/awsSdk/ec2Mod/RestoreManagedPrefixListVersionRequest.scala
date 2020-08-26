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
  def apply(CurrentVersion: Long, PrefixListId: PrefixListResourceId, PreviousVersion: Long): RestoreManagedPrefixListVersionRequest = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any], PrefixListId = PrefixListId.asInstanceOf[js.Any], PreviousVersion = PreviousVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreManagedPrefixListVersionRequest]
  }
  @scala.inline
  implicit class RestoreManagedPrefixListVersionRequestOps[Self <: RestoreManagedPrefixListVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentVersion(value: Long): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousVersion(value: Long): Self = this.set("PreviousVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

