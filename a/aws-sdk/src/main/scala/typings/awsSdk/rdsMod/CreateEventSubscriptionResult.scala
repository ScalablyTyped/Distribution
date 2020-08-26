package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventSubscriptionResult extends js.Object {
  var EventSubscription: js.UndefOr[typings.awsSdk.rdsMod.EventSubscription] = js.native
}

object CreateEventSubscriptionResult {
  @scala.inline
  def apply(): CreateEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventSubscriptionResult]
  }
  @scala.inline
  implicit class CreateEventSubscriptionResultOps[Self <: CreateEventSubscriptionResult] (val x: Self) extends AnyVal {
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
    def setEventSubscription(value: EventSubscription): Self = this.set("EventSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSubscription: Self = this.set("EventSubscription", js.undefined)
  }
  
}

