package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSendOptions extends js.Object {
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  /**
    * relative url for request.
    */
  var url: js.UndefOr[String] = js.native
}

object ClientSendOptions {
  @scala.inline
  def apply(): ClientSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSendOptions]
  }
  @scala.inline
  implicit class ClientSendOptionsOps[Self <: ClientSendOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

