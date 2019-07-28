package typings.chrome.chromeNs.contentSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicrophoneContentSetting extends ContentSetting {
  def set(details: MicrophoneSetDetails): Unit = js.native
  def set(details: MicrophoneSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

