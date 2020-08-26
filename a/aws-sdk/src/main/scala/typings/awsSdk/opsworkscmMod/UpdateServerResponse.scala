package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerResponse extends js.Object {
  /**
    * Contains the response to a UpdateServer request. 
    */
  var Server: js.UndefOr[typings.awsSdk.opsworkscmMod.Server] = js.native
}

object UpdateServerResponse {
  @scala.inline
  def apply(): UpdateServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServerResponse]
  }
  @scala.inline
  implicit class UpdateServerResponseOps[Self <: UpdateServerResponse] (val x: Self) extends AnyVal {
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
    def setServer(value: Server): Self = this.set("Server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("Server", js.undefined)
  }
  
}

