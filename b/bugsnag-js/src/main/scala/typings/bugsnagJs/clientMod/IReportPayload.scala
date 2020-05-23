package typings.bugsnagJs.clientMod

import typings.bugsnagJs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportPayload extends js.Object {
  var apiKey: String
  var events: js.Array[typings.bugsnagJs.reportMod.default]
  var notifier: Name
}

object IReportPayload {
  @scala.inline
  def apply(apiKey: String, events: js.Array[typings.bugsnagJs.reportMod.default], notifier: Name): IReportPayload = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], notifier = notifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportPayload]
  }
}

