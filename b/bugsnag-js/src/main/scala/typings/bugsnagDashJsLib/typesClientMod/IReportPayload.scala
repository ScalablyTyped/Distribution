package typings
package bugsnagDashJsLib.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReportPayload extends js.Object {
  var apiKey: java.lang.String
  var events: js.Array[bugsnagDashJsLib.typesReportMod.default]
  var notifier: bugsnagDashJsLib.Anon_Name
}

object IReportPayload {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    events: js.Array[bugsnagDashJsLib.typesReportMod.default],
    notifier: bugsnagDashJsLib.Anon_Name
  ): IReportPayload = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, events = events, notifier = notifier)
  
    __obj.asInstanceOf[IReportPayload]
  }
}

