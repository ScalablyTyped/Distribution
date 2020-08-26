package typings.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExposeOptions extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var since: js.UndefOr[Double] = js.native
  var toClassOnly: js.UndefOr[Boolean] = js.native
  var toPlainOnly: js.UndefOr[Boolean] = js.native
  var until: js.UndefOr[Double] = js.native
}

object ExposeOptions {
  @scala.inline
  def apply(): ExposeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExposeOptions]
  }
  @scala.inline
  implicit class ExposeOptionsOps[Self <: ExposeOptions] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSince(value: Double): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    @scala.inline
    def setToClassOnly(value: Boolean): Self = this.set("toClassOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToClassOnly: Self = this.set("toClassOnly", js.undefined)
    @scala.inline
    def setToPlainOnly(value: Boolean): Self = this.set("toPlainOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToPlainOnly: Self = this.set("toPlainOnly", js.undefined)
    @scala.inline
    def setUntil(value: Double): Self = this.set("until", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
  }
  
}

