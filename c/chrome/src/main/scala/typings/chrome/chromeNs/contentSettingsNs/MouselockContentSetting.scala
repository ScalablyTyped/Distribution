package typings.chrome.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouselockContentSetting extends ContentSetting {
  def set(details: MouselockSetDetails): Unit = js.native
  def set(details: MouselockSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

