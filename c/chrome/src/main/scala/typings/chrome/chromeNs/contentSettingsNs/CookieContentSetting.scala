package typings.chrome.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieContentSetting extends ContentSetting {
  def set(details: CookieSetDetails): Unit = js.native
  def set(details: CookieSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

