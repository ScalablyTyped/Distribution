package typings.consul.mod.Session

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptions extends CommonOptions {
  var behavior: js.UndefOr[String] = js.native
  var checks: js.UndefOr[js.Array[String]] = js.native
  var lockdelay: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var node: js.UndefOr[String] = js.native
  var ttl: js.UndefOr[String] = js.native
}

object CreateOptions {
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
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
    def setBehavior(value: String): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setChecksVarargs(value: String*): Self = this.set("checks", js.Array(value :_*))
    @scala.inline
    def setChecks(value: js.Array[String]): Self = this.set("checks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecks: Self = this.set("checks", js.undefined)
    @scala.inline
    def setLockdelay(value: String): Self = this.set("lockdelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockdelay: Self = this.set("lockdelay", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNode(value: String): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

