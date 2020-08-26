package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConnectivityInfoResponse extends js.Object {
  /**
    * A message about the connectivity info update request.
    */
  var Message: js.UndefOr[string] = js.native
  /**
    * The new version of the connectivity info.
    */
  var Version: js.UndefOr[string] = js.native
}

object UpdateConnectivityInfoResponse {
  @scala.inline
  def apply(): UpdateConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectivityInfoResponse]
  }
  @scala.inline
  implicit class UpdateConnectivityInfoResponseOps[Self <: UpdateConnectivityInfoResponse] (val x: Self) extends AnyVal {
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
    def setMessage(value: string): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setVersion(value: string): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

