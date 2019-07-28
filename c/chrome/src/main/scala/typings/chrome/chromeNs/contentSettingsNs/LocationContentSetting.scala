package typings.chrome.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationContentSetting extends ContentSetting {
  def set(details: LocationSetDetails): Unit = js.native
  def set(details: LocationSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

