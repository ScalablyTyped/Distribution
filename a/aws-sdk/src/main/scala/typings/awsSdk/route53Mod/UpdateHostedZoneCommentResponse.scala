package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateHostedZoneCommentResponse extends js.Object {
  /**
    * A complex type that contains the response to the UpdateHostedZoneComment request.
    */
  var HostedZone: typings.awsSdk.route53Mod.HostedZone = js.native
}

object UpdateHostedZoneCommentResponse {
  @scala.inline
  def apply(HostedZone: HostedZone): UpdateHostedZoneCommentResponse = {
    val __obj = js.Dynamic.literal(HostedZone = HostedZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHostedZoneCommentResponse]
  }
  @scala.inline
  implicit class UpdateHostedZoneCommentResponseOps[Self <: UpdateHostedZoneCommentResponse] (val x: Self) extends AnyVal {
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
    def setHostedZone(value: HostedZone): Self = this.set("HostedZone", value.asInstanceOf[js.Any])
  }
  
}

