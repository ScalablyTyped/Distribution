package typings.chrome.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenContentSetting extends ContentSetting {
  def set(details: FullscreenSetDetails): Unit = js.native
  def set(details: FullscreenSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

