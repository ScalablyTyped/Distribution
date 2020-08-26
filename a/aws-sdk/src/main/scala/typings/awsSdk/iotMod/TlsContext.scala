package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TlsContext extends js.Object {
  /**
    * The value of the serverName key in a TLS authorization request.
    */
  var serverName: js.UndefOr[ServerName] = js.native
}

object TlsContext {
  @scala.inline
  def apply(): TlsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsContext]
  }
  @scala.inline
  implicit class TlsContextOps[Self <: TlsContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("serverName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerName: Self = this.set("serverName", js.undefined)
  }
  
}

