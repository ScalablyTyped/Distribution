package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePartnerEventSourceResponse extends js.Object {
  /**
    * The ARN of the partner event source.
    */
  var EventSourceArn: js.UndefOr[String] = js.native
}

object CreatePartnerEventSourceResponse {
  @scala.inline
  def apply(): CreatePartnerEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePartnerEventSourceResponse]
  }
  @scala.inline
  implicit class CreatePartnerEventSourceResponseOps[Self <: CreatePartnerEventSourceResponse] (val x: Self) extends AnyVal {
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
    def setEventSourceArn(value: String): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSourceArn: Self = this.set("EventSourceArn", js.undefined)
  }
  
}

