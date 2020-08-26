package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupExportResult extends js.Object {
  /**
    * The error.
    */
  var error: js.UndefOr[ResourceManagementErrorWithDetails] = js.native
  /**
    * The template content.
    */
  var template: js.UndefOr[js.Any] = js.native
}

object ResourceGroupExportResult {
  @scala.inline
  def apply(): ResourceGroupExportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupExportResult]
  }
  @scala.inline
  implicit class ResourceGroupExportResultOps[Self <: ResourceGroupExportResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: ResourceManagementErrorWithDetails): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setTemplate(value: js.Any): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

