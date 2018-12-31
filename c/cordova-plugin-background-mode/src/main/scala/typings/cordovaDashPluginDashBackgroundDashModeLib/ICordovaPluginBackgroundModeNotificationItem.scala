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

