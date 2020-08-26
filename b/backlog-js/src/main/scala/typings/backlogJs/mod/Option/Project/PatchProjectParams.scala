package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchProjectParams extends js.Object {
  var archived: js.UndefOr[Boolean] = js.native
  var chartEnabled: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var projectLeaderCanEditProjectLeader: js.UndefOr[Boolean] = js.native
  var subtaskingEnabled: js.UndefOr[Boolean] = js.native
  var textFormattingRule: js.UndefOr[TextFormattingRule] = js.native
}

object PatchProjectParams {
  @scala.inline
  def apply(): PatchProjectParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchProjectParams]
  }
  @scala.inline
  implicit class PatchProjectParamsOps[Self <: PatchProjectParams] (val x: Self) extends AnyVal {
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
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setChartEnabled(value: Boolean): Self = this.set("chartEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartEnabled: Self = this.set("chartEnabled", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProjectLeaderCanEditProjectLeader(value: Boolean): Self = this.set("projectLeaderCanEditProjectLeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectLeaderCanEditProjectLeader: Self = this.set("projectLeaderCanEditProjectLeader", js.undefined)
    @scala.inline
    def setSubtaskingEnabled(value: Boolean): Self = this.set("subtaskingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtaskingEnabled: Self = this.set("subtaskingEnabled", js.undefined)
    @scala.inline
    def setTextFormattingRule(value: TextFormattingRule): Self = this.set("textFormattingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFormattingRule: Self = this.set("textFormattingRule", js.undefined)
  }
  
}

