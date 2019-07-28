package typings.chrome.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupsContentSetting extends ContentSetting {
  def set(details: PopupsSetDetails): Unit = js.native
  def set(details: PopupsSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

