package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.data
import typings.chromeApps.chromeAppsStrings.explicitFeedback
import typings.chromeApps.chromeAppsStrings.feedback
import typings.chromeApps.chromeAppsStrings.notification
import typings.chromeApps.chromeAppsStrings.periodic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDATA_ extends js.Object {
  var DATA: data
  var EXPLICIT_FEEDBACK: explicitFeedback
  var FEEDBACK: feedback
  var NOTIFICATION: notification
  var PERIODIC: periodic
}

object AnonDATA_ {
  @scala.inline
  def apply(
    DATA: data,
    EXPLICIT_FEEDBACK: explicitFeedback,
    FEEDBACK: feedback,
    NOTIFICATION: notification,
    PERIODIC: periodic
  ): AnonDATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], EXPLICIT_FEEDBACK = EXPLICIT_FEEDBACK.asInstanceOf[js.Any], FEEDBACK = FEEDBACK.asInstanceOf[js.Any], NOTIFICATION = NOTIFICATION.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDATA_]
  }
}

