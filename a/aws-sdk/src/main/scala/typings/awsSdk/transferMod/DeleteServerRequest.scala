package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServerRequest extends js.Object {
  /**
    * A unique system-assigned identifier for a file transfer protocol-enabled server instance.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
}

object DeleteServerRequest {
  @scala.inline
  def apply(ServerId: ServerId): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerRequest]
  }
  @scala.inline
  implicit class DeleteServerRequestOps[Self <: DeleteServerRequest] (val x: Self) extends AnyVal {
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
    def setServerId(value: ServerId): Self = this.set("ServerId", value.asInstanceOf[js.Any])
  }
  
}

