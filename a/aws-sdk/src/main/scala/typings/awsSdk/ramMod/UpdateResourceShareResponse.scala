package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceShareResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * Information about the resource share.
    */
  var resourceShare: js.UndefOr[ResourceShare] = js.native
}

object UpdateResourceShareResponse {
  @scala.inline
  def apply(): UpdateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResourceShareResponse]
  }
  @scala.inline
  implicit class UpdateResourceShareResponseOps[Self <: UpdateResourceShareResponse] (val x: Self) extends AnyVal {
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
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setResourceShare(value: ResourceShare): Self = this.set("resourceShare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShare: Self = this.set("resourceShare", js.undefined)
  }
  
}

