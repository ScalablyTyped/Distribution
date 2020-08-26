package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitTaskStateChangeResponse extends js.Object {
  /**
    * Acknowledgement of the state change.
    */
  var acknowledgment: js.UndefOr[String] = js.native
}

object SubmitTaskStateChangeResponse {
  @scala.inline
  def apply(): SubmitTaskStateChangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitTaskStateChangeResponse]
  }
  @scala.inline
  implicit class SubmitTaskStateChangeResponseOps[Self <: SubmitTaskStateChangeResponse] (val x: Self) extends AnyVal {
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
    def setAcknowledgment(value: String): Self = this.set("acknowledgment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcknowledgment: Self = this.set("acknowledgment", js.undefined)
  }
  
}

