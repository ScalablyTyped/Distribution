package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLaunchTemplateVersionsResult extends js.Object {
  /**
    * Information about the launch template versions that were successfully deleted.
    */
  var SuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseSuccessSet] = js.native
  /**
    * Information about the launch template versions that could not be deleted.
    */
  var UnsuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseErrorSet] = js.native
}

object DeleteLaunchTemplateVersionsResult {
  @scala.inline
  def apply(
    SuccessfullyDeletedLaunchTemplateVersions: DeleteLaunchTemplateVersionsResponseSuccessSet = null,
    UnsuccessfullyDeletedLaunchTemplateVersions: DeleteLaunchTemplateVersionsResponseErrorSet = null
  ): DeleteLaunchTemplateVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (SuccessfullyDeletedLaunchTemplateVersions != null) __obj.updateDynamic("SuccessfullyDeletedLaunchTemplateVersions")(SuccessfullyDeletedLaunchTemplateVersions.asInstanceOf[js.Any])
    if (UnsuccessfullyDeletedLaunchTemplateVersions != null) __obj.updateDynamic("UnsuccessfullyDeletedLaunchTemplateVersions")(UnsuccessfullyDeletedLaunchTemplateVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResult]
  }
}

