package typings.consul.mod.Agent.Service

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterOptions extends CommonOptions {
  var address: js.UndefOr[String] = js.native
  var check: js.UndefOr[RegisterCheck] = js.native
  var checks: js.UndefOr[js.Array[RegisterCheck]] = js.native
  var id: js.UndefOr[String] = js.native
  var name: String = js.native
  var port: js.UndefOr[Double] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object RegisterOptions {
  @scala.inline
  def apply(name: String): RegisterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOptions]
  }
  @scala.inline
  implicit class RegisterOptionsOps[Self <: RegisterOptions] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setCheck(value: RegisterCheck): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setChecksVarargs(value: RegisterCheck*): Self = this.set("checks", js.Array(value :_*))
    @scala.inline
    def setChecks(value: js.Array[RegisterCheck]): Self = this.set("checks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecks: Self = this.set("checks", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

