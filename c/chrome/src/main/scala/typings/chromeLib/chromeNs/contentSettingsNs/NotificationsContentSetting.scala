package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsContentSetting extends ContentSetting {
  def set(details: NotificationsSetDetails): scala.Unit = js.native
  def set(details: NotificationsSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

