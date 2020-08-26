package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerEvent extends js.Object {
  /**
    * The time when the event occurred. 
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon S3 URL of the event's log file.
    */
  var LogUrl: js.UndefOr[String] = js.native
  /**
    * A human-readable informational or status message.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The name of the server on or for which the event occurred. 
    */
  var ServerName: js.UndefOr[String] = js.native
}

object ServerEvent {
  @scala.inline
  def apply(): ServerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerEvent]
  }
  @scala.inline
  implicit class ServerEventOps[Self <: ServerEvent] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setLogUrl(value: String): Self = this.set("LogUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogUrl: Self = this.set("LogUrl", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
  }
  
}

