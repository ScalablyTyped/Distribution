package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineCommand
@js.native
trait DefineCommandOptions extends js.Object {
  var existing: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var payload: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
}

object DefineCommandOptions {
  @scala.inline
  def apply(): DefineCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineCommandOptions]
  }
  @scala.inline
  implicit class DefineCommandOptionsOps[Self <: DefineCommandOptions] (val x: Self) extends AnyVal {
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
    def setExisting(value: Boolean): Self = this.set("existing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExisting: Self = this.set("existing", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

