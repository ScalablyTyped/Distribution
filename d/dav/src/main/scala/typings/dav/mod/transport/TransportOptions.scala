package typings.dav.mod.transport

import typings.dav.mod.Sandbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportOptions extends js.Object {
  var retry: js.UndefOr[Boolean] = js.native
  /**
    *  request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
}

object TransportOptions {
  @scala.inline
  def apply(): TransportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportOptions]
  }
  @scala.inline
  implicit class TransportOptionsOps[Self <: TransportOptions] (val x: Self) extends AnyVal {
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
    def setRetry(value: Boolean): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setSandbox(value: Sandbox): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
  }
  
}

