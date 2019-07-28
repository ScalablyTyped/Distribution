package typings.bugsnagDashJs.typesClientMod

import typings.bugsnagDashJs.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportPayload extends js.Object {
  var apiKey: String
  var events: js.Array[typings.bugsnagDashJs.typesReportMod.default]
  var notifier: Anon_Name
}

object IReportPayload {
  @scala.inline
  def apply(
    apiKey: String,
    events: js.Array[typings.bugsnagDashJs.typesReportMod.default],
    notifier: Anon_Name
  ): IReportPayload = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, events = events, notifier = notifier)
  
    __obj.asInstanceOf[IReportPayload]
  }
}

