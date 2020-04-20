package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.data_
import typings.chromeApps.chromeAppsStrings.explicitFeedback
import typings.chromeApps.chromeAppsStrings.feedback_
import typings.chromeApps.chromeAppsStrings.notification_
import typings.chromeApps.chromeAppsStrings.periodic_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDATA_ extends js.Object {
  var DATA: data_
  var EXPLICIT_FEEDBACK: explicitFeedback
  var FEEDBACK: feedback_
  var NOTIFICATION: notification_
  var PERIODIC: periodic_
}

object AnonDATA_ {
  @scala.inline
  def apply(
    DATA: data_,
    EXPLICIT_FEEDBACK: explicitFeedback,
    FEEDBACK: feedback_,
    NOTIFICATION: notification_,
    PERIODIC: periodic_
  ): AnonDATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], EXPLICIT_FEEDBACK = EXPLICIT_FEEDBACK.asInstanceOf[js.Any], FEEDBACK = FEEDBACK.asInstanceOf[js.Any], NOTIFICATION = NOTIFICATION.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDATA_]
  }
}

