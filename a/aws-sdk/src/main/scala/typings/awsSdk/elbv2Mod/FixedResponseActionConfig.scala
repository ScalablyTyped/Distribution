package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedResponseActionConfig extends js.Object {
  /**
    * The content type. Valid Values: text/plain | text/css | text/html | application/javascript | application/json
    */
  var ContentType: js.UndefOr[FixedResponseActionContentType] = js.native
  /**
    * The message.
    */
  var MessageBody: js.UndefOr[FixedResponseActionMessage] = js.native
  /**
    * The HTTP response code (2XX, 4XX, or 5XX).
    */
  var StatusCode: FixedResponseActionStatusCode = js.native
}

object FixedResponseActionConfig {
  @scala.inline
  def apply(StatusCode: FixedResponseActionStatusCode): FixedResponseActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedResponseActionConfig]
  }
  @scala.inline
  implicit class FixedResponseActionConfigOps[Self <: FixedResponseActionConfig] (val x: Self) extends AnyVal {
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
    def setStatusCode(value: FixedResponseActionStatusCode): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: FixedResponseActionContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setMessageBody(value: FixedResponseActionMessage): Self = this.set("MessageBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageBody: Self = this.set("MessageBody", js.undefined)
  }
  
}

