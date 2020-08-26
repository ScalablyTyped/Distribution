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
  def apply(): DeleteLaunchTemplateVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResult]
  }
  @scala.inline
  implicit class DeleteLaunchTemplateVersionsResultOps[Self <: DeleteLaunchTemplateVersionsResult] (val x: Self) extends AnyVal {
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
    def setSuccessfullyDeletedLaunchTemplateVersionsVarargs(value: DeleteLaunchTemplateVersionsResponseSuccessItem*): Self = this.set("SuccessfullyDeletedLaunchTemplateVersions", js.Array(value :_*))
    @scala.inline
    def setSuccessfullyDeletedLaunchTemplateVersions(value: DeleteLaunchTemplateVersionsResponseSuccessSet): Self = this.set("SuccessfullyDeletedLaunchTemplateVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfullyDeletedLaunchTemplateVersions: Self = this.set("SuccessfullyDeletedLaunchTemplateVersions", js.undefined)
    @scala.inline
    def setUnsuccessfullyDeletedLaunchTemplateVersionsVarargs(value: DeleteLaunchTemplateVersionsResponseErrorItem*): Self = this.set("UnsuccessfullyDeletedLaunchTemplateVersions", js.Array(value :_*))
    @scala.inline
    def setUnsuccessfullyDeletedLaunchTemplateVersions(value: DeleteLaunchTemplateVersionsResponseErrorSet): Self = this.set("UnsuccessfullyDeletedLaunchTemplateVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsuccessfullyDeletedLaunchTemplateVersions: Self = this.set("UnsuccessfullyDeletedLaunchTemplateVersions", js.undefined)
  }
  
}

