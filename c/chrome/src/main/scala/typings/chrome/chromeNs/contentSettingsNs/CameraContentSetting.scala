package typings.chrome.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContentSetting extends ContentSetting {
  def set(details: CameraSetDetails): Unit = js.native
  def set(details: CameraSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

