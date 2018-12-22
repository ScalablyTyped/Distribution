package typings
package chromeLib.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieContentSetting extends ContentSetting {
  def set(details: CookieSetDetails): scala.Unit = js.native
  def set(details: CookieSetDetails, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

