package typings.chromeDashApps

import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.data
import typings.chromeDashApps.chromeDashAppsStrings.explicitFeedback
import typings.chromeDashApps.chromeDashAppsStrings.feedback
import typings.chromeDashApps.chromeDashAppsStrings.notification
import typings.chromeDashApps.chromeDashAppsStrings.periodic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DATA extends js.Object {
  var DATA: data
  var EXPLICIT_FEEDBACK: explicitFeedback
  var FEEDBACK: feedback
  var NOTIFICATION: notification
  var PERIODIC: periodic
}

object Anon_DATA {
  @scala.inline
  def apply(
    DATA: data,
    EXPLICIT_FEEDBACK: explicitFeedback,
    FEEDBACK: feedback,
    NOTIFICATION: notification,
    PERIODIC: periodic
  ): Anon_DATA = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], EXPLICIT_FEEDBACK = EXPLICIT_FEEDBACK.asInstanceOf[js.Any], FEEDBACK = FEEDBACK.asInstanceOf[js.Any], NOTIFICATION = NOTIFICATION.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DATA]
  }
}

trait Anon_Data extends js.Object {
  var data: js.Array[integer]
  var id: integer
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Array[integer], id: integer): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

