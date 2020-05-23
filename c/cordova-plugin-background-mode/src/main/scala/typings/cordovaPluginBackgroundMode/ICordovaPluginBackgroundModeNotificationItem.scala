package typings.cordovaPluginBackgroundMode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICordovaPluginBackgroundModeNotificationItem extends js.Object {
  /**
    * Handles if app is coming to foreground when tapping on the notification
    */
  var resume: js.UndefOr[Boolean] = js.undefined
  /**
    * Handles if there is a notification when background is activated
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * The body of the notification displayed in background mode
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * The ticker of the notification displayed in background mode
    */
  var ticker: js.UndefOr[String] = js.undefined
  /**
    * The title of the notification displayed in background mode
    */
  var title: js.UndefOr[String] = js.undefined
}

object ICordovaPluginBackgroundModeNotificationItem {
  @scala.inline
  def apply(
    resume: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    ticker: String = null,
    title: String = null
  ): ICordovaPluginBackgroundModeNotificationItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resume)) __obj.updateDynamic("resume")(resume.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (ticker != null) __obj.updateDynamic("ticker")(ticker.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICordovaPluginBackgroundModeNotificationItem]
  }
}

