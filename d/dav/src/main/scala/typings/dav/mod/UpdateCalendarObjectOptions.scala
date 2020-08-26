package typings.dav.mod

import typings.dav.mod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCalendarObjectOptions extends js.Object {
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}

object UpdateCalendarObjectOptions {
  @scala.inline
  def apply(): UpdateCalendarObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCalendarObjectOptions]
  }
  @scala.inline
  implicit class UpdateCalendarObjectOptionsOps[Self <: UpdateCalendarObjectOptions] (val x: Self) extends AnyVal {
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
    def setSandbox(value: Sandbox): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setXhr(value: Transport): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

