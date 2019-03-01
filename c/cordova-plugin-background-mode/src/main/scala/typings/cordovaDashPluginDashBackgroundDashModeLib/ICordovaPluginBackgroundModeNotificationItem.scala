package typings
package cordovaDashPluginDashBackgroundDashModeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICordovaPluginBackgroundModeNotificationItem extends js.Object {
  /**
    * Handles if app is coming to foreground when tapping on the notification
    */
  var resume: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Handles if there is a notification when background is activated
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The body of the notification displayed in background mode
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ticker of the notification displayed in background mode
    */
  var ticker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the notification displayed in background mode
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ICordovaPluginBackgroundModeNotificationItem {
  @scala.inline
  def apply(
    resume: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    ticker: java.lang.String = null,
    title: java.lang.String = null
  ): ICordovaPluginBackgroundModeNotificationItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resume)) __obj.updateDynamic("resume")(resume)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (text != null) __obj.updateDynamic("text")(text)
    if (ticker != null) __obj.updateDynamic("ticker")(ticker)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ICordovaPluginBackgroundModeNotificationItem]
  }
}

