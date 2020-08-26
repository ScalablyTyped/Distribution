package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProjectsParams extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
  var archived: js.UndefOr[Boolean] = js.native
}

object GetProjectsParams {
  @scala.inline
  def apply(): GetProjectsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProjectsParams]
  }
  @scala.inline
  implicit class GetProjectsParamsOps[Self <: GetProjectsParams] (val x: Self) extends AnyVal {
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
  }
  
}

