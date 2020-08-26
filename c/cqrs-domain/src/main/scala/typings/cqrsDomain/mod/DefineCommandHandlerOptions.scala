package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineCommandHandler
@js.native
trait DefineCommandHandlerOptions extends js.Object {
  /**
    * optional, default is file name without extension
    */
  var name: js.UndefOr[String] = js.native
  /**
    * optional, if not defined it will pass the whole command...
    */
  var payload: js.UndefOr[String] = js.native
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.native
}

object DefineCommandHandlerOptions {
  @scala.inline
  def apply(): DefineCommandHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineCommandHandlerOptions]
  }
  @scala.inline
  implicit class DefineCommandHandlerOptionsOps[Self <: DefineCommandHandlerOptions] (val x: Self) extends AnyVal {
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

