package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchVersionsParams extends js.Object {
  var archived: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  var releaseDueDate: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[String] = js.native
}

object PatchVersionsParams {
  @scala.inline
  def apply(name: String): PatchVersionsParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchVersionsParams]
  }
  @scala.inline
  implicit class PatchVersionsParamsOps[Self <: PatchVersionsParams] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setReleaseDueDate(value: String): Self = this.set("releaseDueDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseDueDate: Self = this.set("releaseDueDate", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
  
}

