package typings.bugsnagJs.clientMod

import typings.bugsnagJs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReportPayload extends js.Object {
  var apiKey: String = js.native
  var events: js.Array[typings.bugsnagJs.reportMod.default] = js.native
  var notifier: Name = js.native
}

object IReportPayload {
  @scala.inline
  def apply(apiKey: String, events: js.Array[typings.bugsnagJs.reportMod.default], notifier: Name): IReportPayload = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], notifier = notifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportPayload]
  }
  @scala.inline
  implicit class IReportPayloadOps[Self <: IReportPayload] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: typings.bugsnagJs.reportMod.default*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[typings.bugsnagJs.reportMod.default]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifier(value: Name): Self = this.set("notifier", value.asInstanceOf[js.Any])
  }
  
}

